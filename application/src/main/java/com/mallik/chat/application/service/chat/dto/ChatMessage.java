package com.mallik.chat.application.service.chat.dto;

import com.mallik.chat.application.service.common.dto.SqlBean;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChatMessage extends SqlBean {
    private String message;
    private String fromUserId;
    private String toUserId;
}
