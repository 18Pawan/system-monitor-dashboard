package com.system.monitor.service;

import oshi.SystemInfo;
import oshi.hardware.CentralProcessor;
import oshi.hardware.GlobalMemory;
import org.springframework.stereotype.Service;

@Service
public class CpuService {

    private final CentralProcessor processor;
    private final GlobalMemory memory;
    private long[] prevTicks;

    public CpuService() {
        SystemInfo si = new SystemInfo();
        processor = si.getHardware().getProcessor();
        memory = si.getHardware().getMemory();
        prevTicks = processor.getSystemCpuLoadTicks();
    }

    public double getCpuUsage() {
        double load = processor.getSystemCpuLoadBetweenTicks(prevTicks) * 100;
        prevTicks = processor.getSystemCpuLoadTicks();
        return load;
    }

    public double getMemoryUsage() {
        long total = memory.getTotal();
        long available = memory.getAvailable();
        return ((total - available) * 100.0) / total;
    }
}