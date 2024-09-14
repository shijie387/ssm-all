package com.atshijie.component9;



public class BeanLifeCycle {
    private String name;

    public void work(){
        System.out.println(name+" is working");
    }

    public BeanLifeCycle() {
        System.out.println("BeanLifeCycle no argus constructor");
    }
    public BeanLifeCycle(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "BeanLifeCycle{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("setname method");
        this.name = name;
    }

    public void initBeanLifeCycle() {
        System.out.println("initBeanLifeCycle method");
    }
    public void destroyBeanLifeCycle() {
        System.out.println("destroyBeanLifeCycle method");
    }
}
