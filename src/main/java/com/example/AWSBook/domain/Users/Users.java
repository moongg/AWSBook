package com.example.AWSBook.domain.Users;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "MEMBER")
public class Users {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    private UUID uuid;

    @Column(name = "USERID")
    private String userId;

    @Column(name = "PASSWD")
    private String password;

    @Builder
    public Users(UUID uuid, String userId, String password) {
        this.uuid = uuid;
        this.userId = userId;
        this.password = password;
    }
}
