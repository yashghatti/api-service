package dev.yashghatti.api.scheduled;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
@EnableScheduling
@Slf4j
public class TestScheduler {

    @Scheduled(fixedRate = 3000)
    public void test(){
        log.info("Scheduled task invoked");
    }

}
