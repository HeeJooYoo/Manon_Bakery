package com.shj.manonbakery.controller;

import com.shj.manonbakery.service.GuidePageService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/*
controller를 테스트하기 위한 클래스
가짜로 객체를 만들어 controller 단위 테스트 하기 용이
Mock 기능을 사용하기 위해 Mockito(MockMvc) 객체 주입
MockBean을 사용하여 가짜 Bean으로 등록
 */

@WebMvcTest(GuidePageController.class)
class GuidePageControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private GuidePageService guidePageService;

    @DisplayName("가이드 오른쪽 페이지 이동")
    @Test
    @WithMockUser(roles = "USER")
    void testRight() throws Exception {
        mockMvc.perform(get("/right"))
                .andExpect(status().isOk());
    }
}