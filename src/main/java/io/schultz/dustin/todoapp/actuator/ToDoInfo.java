package io.schultz.dustin.todoapp.actuator;

import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

/**
 * Created by charea on 09.04.20
 */
@Component
public class ToDoInfo implements InfoContributor {

    @Override
    public void contribute(Info.Builder builder) {
        builder.withDetail("projectName", "to do app")
                .withDetail("version", "1.1.2")
                .build();
    }
}
