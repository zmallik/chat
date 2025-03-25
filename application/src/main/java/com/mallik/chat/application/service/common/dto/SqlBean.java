package com.mallik.chat.application.service.common.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode()
public class SqlBean {
    private String id;
    private long createdTime;
    private long modifiesTime;
    private boolean deleted;
}
