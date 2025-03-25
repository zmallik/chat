package com.mallik.chat.application.service.user.dto;

import com.mallik.chat.application.service.common.dto.SqlBean;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "users")
public class User extends SqlBean {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String gender;
    @Column(name = "dateBirth")
    private Long dateBirth;
    @Column(name = "lastLoggedIn")
    private Long lastLoggedIn;
    @Column(name = "userOnline")
    private Boolean userOnline;
}
