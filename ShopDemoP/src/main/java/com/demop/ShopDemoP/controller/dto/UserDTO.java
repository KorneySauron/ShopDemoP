package com.demop.ShopDemoP.controller.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserDTO {
    private Integer id; //Because of size of the project, Integer was used instead of Long.
    private String email;
    private String Name;

}
