package com.example.AWSBook.web.dto.users;

import com.example.AWSBook.domain.Users.Users;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Getter
@NoArgsConstructor
public class everonSignInDto {
    private String userId;
    private String password;
    private UUID uuid;

    @Builder
    public everonSignInDto(String userId, String password, UUID uuid) {
        this.userId = userId;
        this.uuid = uuid;
        this.password=password;
    }

    public Users toEntity() {
        return Users.builder()
                .uuid(uuid)
                .userId(userId)
                .password(password)
                .build();
    }
}
