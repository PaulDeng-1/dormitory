package com.pauldeng.vo;

import lombok.Data;

@Data
public class ResultVO<T> {
    private Integer code;
    private T data;
}
