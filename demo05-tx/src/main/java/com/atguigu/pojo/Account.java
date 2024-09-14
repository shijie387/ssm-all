package com.atguigu.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Account implements Serializable {
    private Integer aid;
    private String username;
    private String password;
    private Integer balance;
}
