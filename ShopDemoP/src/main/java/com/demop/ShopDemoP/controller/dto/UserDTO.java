package com.demop.ShopDemoP.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class UserDTO {
    private Integer id; //Because of size of the project, Integer was used instead of Long.
    private String email;
    private String name;

}
