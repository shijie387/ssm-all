package com.atguigu.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Product  implements Serializable {
    private Integer pid;
    private String pname;
    private Integer price;
    private Integer sales;
    private Integer stock;
}
