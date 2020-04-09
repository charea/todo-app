package io.schultz.dustin.todoapp.actuator;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

/**
 * Created by charea on 09.04.20
 */
@Component
public class ToDoHealthIndicator implements HealthIndicator {


    @Override
    public Health health() {
        return Health.down().withDetail("123",400).build();
    }
}
