package com.qf.thymeleaf.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: WangXi
 * @Date: 2019/6/4
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Teacher {

    private Integer id;

    private String name;

    private Integer age;
}
