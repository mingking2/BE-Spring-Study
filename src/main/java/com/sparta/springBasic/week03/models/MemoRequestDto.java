package com.sparta.springBasic.week03.models;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class MemoRequestDto {
    private String username;
    private String contents;

}
