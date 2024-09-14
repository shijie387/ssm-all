package com.atguigu.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.Serializable;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class Person implements Serializable {
    private String username;
    private Integer password;
    private Integer[] hobby;
}
