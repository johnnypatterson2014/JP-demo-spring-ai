package com.calamansi.demo.springai.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.calamansi.demo.springai.service.AIService;

@RestController
@RequestMapping("/api/ai")
public class AIController {

    private final AIService aiService;

    public AIController(AIService aiService) {
        this.aiService = aiService;
    }

    @GetMapping("/chat")
    public ResponseEntity<String> chat(@RequestParam(value = "message", defaultValue = "Who I am?") String message) {
        return ResponseEntity.ok(aiService.chat(message));
    }

}
