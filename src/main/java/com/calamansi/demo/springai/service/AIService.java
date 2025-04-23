package com.calamansi.demo.springai.service;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

@Service
public class AIService {

    private final ChatClient chatClient;

    public AIService(ChatClient chatClient) {
        this.chatClient = chatClient;
    }

    public String chat(String message) {
        return chatClient.prompt(message).call().content();
    }
}
