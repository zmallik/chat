package com.mallik.chat.application.service.common.dto;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode()
@MappedSuperclass
public class SqlBean {
    @Column(name = "createdTime")
    private Long createdTime;
    @Column(name = "modifiedTime")
    private Long modifiedTime;
    @Column(name = "deleted")
    private Boolean deleted;
}
