package com.example.serviceapi.dto;

import lombok.*;

/**
 * @Author liuyunkai
 * @Date 2019/10/30 0030
 * @Description
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class User {
    private String name;
    private Integer age;
}
