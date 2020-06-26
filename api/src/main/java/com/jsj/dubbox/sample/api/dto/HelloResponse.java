package com.jsj.dubbox.sample.api.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author jiangshenjie
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
public class HelloResponse implements Serializable {
    private String message;
}
