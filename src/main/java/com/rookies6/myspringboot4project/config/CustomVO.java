package com.rookies6.myspringboot4project.config;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder //CustomVO.builder() 사용가능.
@Getter
@ToString
public class CustomVO {
    private String mode;
    private double rate;
}