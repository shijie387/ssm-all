package com.atshijie.config;

import com.atshijie.cmponent.Cat;
import com.atshijie.cmponent.ConditionA;
import com.atshijie.cmponent.Mouse;
import com.atshijie.cmponent.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;

public class ConfigA {
    @Bean(value = "bill")
    @Conditional(ConditionA.class)
    public User getBill(){
        return new User("bill");
    }



    @Bean(value = "mouse")
    public Mouse getMouse(){
        return new Mouse("jerry",10);
    }

    @Bean(value = "cat",initMethod = "initCat" ,destroyMethod = "destroyCat")
    public Cat getCat(Mouse mouse/*参数名字必须是某个@Bean方法的id*/){
        //return new Cat("Tom",10,getMouse());
        return new Cat("Tom",10,mouse);
    }

}
