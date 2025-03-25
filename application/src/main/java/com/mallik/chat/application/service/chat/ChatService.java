package com.mallik.chat.application.service.chat;

import com.mallik.chat.application.service.chat.dto.ChatMessage;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ChatService {

    public List<ChatMessage> getChats(String userId1, String userId2){
        return new ArrayList<>();
    };

    public void sendMessage(ChatMessage m){
    };
}
