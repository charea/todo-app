package io.schultz.dustin.todoapp.health;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.boot.actuate.health.Status;
import org.springframework.stereotype.Component;

/**
 * Created by charea on 09.04.20
 */
@Component
public class MaxMemoryHealthIndicator implements HealthIndicator {
    @Override
    public Health health() {
        boolean invalid = Runtime.getRuntime().maxMemory() < (100 * 1024 * 1024);
        Status status = invalid ? Status.DOWN : Status.UP;
        return Health.status(status).build();
    }
}
