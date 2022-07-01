package com.jojoldu.book.springboot.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter // 선언된 필드의 get 메소드 생성
@RequiredArgsConstructor // final이 없는 필드는 생성자 포함 x
public class HelloResponseDto {
    private final String name;
    private final int amount;
}
