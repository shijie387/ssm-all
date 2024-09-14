package com.atshijie.cmponent;


import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class ConditionA  implements Condition {

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return true;
        }catch (Exception e){
        }
        // 如果项目导入MySQL驱动,则实例化bill
        // 项目中没有导入MySQL驱动,就不实例化bill
        return false;
    }
}
