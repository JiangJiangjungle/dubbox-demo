package com.jsj.dubbox.sample.api.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author jiangshenjie
 */
@ToString
@NoArgsConstructor
@Getter
@Setter
public class HelloRequest implements Serializable {
    private String name;
}
