package com.atshijie.component45;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cat {
    private String name;
    private Integer age;
    private Mouse mouse;
}
