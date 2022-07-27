package dev.yashghatti.api.controller;

import dev.yashghatti.api.model.TriggerResponse;
import dev.yashghatti.api.service.LockingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/switch")
@RestController
public class LockingController {

    @Autowired
    private LockingService lockingService;

    @PostMapping("/lock")
    public ResponseEntity<TriggerResponse> triggerLock(@RequestParam("authCode") String authCode) {
        return ResponseEntity.ok(lockingService.triggerLock(authCode));
    }

    @PostMapping("/unlock")
    public ResponseEntity<TriggerResponse> triggerUnlock(@RequestParam("authCode") String authCode) {
        return ResponseEntity.ok(lockingService.triggerUnlock(authCode));
    }

    @GetMapping("/state")
    public ResponseEntity<TriggerResponse> getState() {
        return ResponseEntity.ok(lockingService.getState());
    }

}
