package com.atshijie.cmponent;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Cat {
    private String name;
    private Integer age;
    private Mouse mouse;

    public void initCat(){
        System.out.println("cat 初始化");
    }

    public void destroyCat(){
        System.out.println("cat 销毁");
    }




}
