package com.example.AWSBook.web.dto;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class HelloResponseDtoTest {
    @Test
    public void 롬복기능테스트(){
        String name = "홍길동";
        int amount = 9876;

        HelloResponseDto dto = new HelloResponseDto(name, amount);
        
        assertEquals(name, dto.getName());
        assertEquals(amount, dto.getAmount());
    }
}
