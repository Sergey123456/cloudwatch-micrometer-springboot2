package org.ses.metrics.chassis.metrics;

import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicInteger;

@Service
public class TestSchedule {

    private final AtomicInteger value;

    TestSchedule(MeterRegistry meterRegistry) {
        value = meterRegistry.gauge("val.current", new AtomicInteger(0));
    }

    @Scheduled(fixedDelay = 5000)
    void sendMetric() {
        System.out.println("Hello world!");
        value.set(5);
    }
}