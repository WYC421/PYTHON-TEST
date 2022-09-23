package com.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TestU {
    private Integer no;
    private String name;
    private String pwd;
    private Integer age;
    private String sex;
    private String phone;
    private Integer role;
}
