package service;
import oshi.SystemInfo;
import oshi.hardware.CentralProcessor;
import org.springframework.stereotype.Service;
@Service
public class CpuService {
    private final CentralProcessor processor;
    private long[] prevTicks;

    public CpuService() {
        SystemInfo si = new SystemInfo();
        processor = si.getHardware().getProcessor();
        prevTicks = processor.getSystemCpuLoadTicks();
    }

    public double getCpuUsage() {
        double load = processor.getSystemCpuLoadBetweenTicks(prevTicks) * 100;
        prevTicks = processor.getSystemCpuLoadTicks();
        return load;
    }
}
