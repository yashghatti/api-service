package dev.yashghatti.api.service;

import dev.yashghatti.api.model.SwitchState;
import dev.yashghatti.api.model.TriggerResponse;
import org.springframework.stereotype.Service;

@Service
public class LockingService {

    public TriggerResponse triggerLock(String authCode) {
        return TriggerResponse.builder()
                .resultingState(SwitchState.OFF)
                .build();
    }

    public TriggerResponse triggerUnlock(String authCode) {
        return TriggerResponse.builder()
                .resultingState(SwitchState.ON)
                .build();
    }

    public TriggerResponse getState() {
        return TriggerResponse.builder()
                .resultingState(SwitchState.ERROR)
                .message("Blah blah")
                .build();
    }

}
