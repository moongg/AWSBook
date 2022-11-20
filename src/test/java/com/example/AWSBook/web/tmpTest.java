package com.example.AWSBook.web;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@AutoConfigureMockMvc
class tmpTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testUserIntroduction() throws Exception {
        String name = "qwertyu";
        String amount = "987656789";

        mockMvc.perform(get("/hello/dto")
                        .param("name", name)
                        .param("amount", amount))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.name").value(name))
                .andExpect(MockMvcResultMatchers.jsonPath("$.amount").value(amount))
                .andDo(print());

        /*  body에 json 보내는 방법으로 처리
        String content = "{\"name\": \"홍길동\", \"amount\": 9877}";
        mockMvc.perform(get("/hello/dto")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(content))
                .andExpect(status().isOk())
                .andExpect(content().string("안녕하세요. 저의 이름은 Ted입니다. 저의 취미는 만들기입니다."))
                .andDo(print());
*/
    }
}
