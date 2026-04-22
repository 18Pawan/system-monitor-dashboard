package com.system.monitor.controller;

import com.system.monitor.service.CpuService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SystemController {

    private final CpuService cpuService;

    public SystemController(CpuService cpuService) {
        this.cpuService = cpuService;
    }

    @GetMapping("/cpu")
    public double getCpu() {
        return cpuService.getCpuUsage();
    }

    @GetMapping("/memory")
    public double getMemory() {
        return cpuService.getMemoryUsage();
    }
}