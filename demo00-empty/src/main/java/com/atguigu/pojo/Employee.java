package com.atguigu.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Employee implements Serializable {
    private Integer  eid;
    private String  ename;
    private Double  salary;
    private Double  commissionPct;
    private Date birthday;
    private String  gender;
    private String  tel;
    private String  email;
    private String  address;
    private String  workPlace;
    private Date  hiredate;
    private Integer  jobId;
    private Integer  mid;
    private Integer  did;
}
