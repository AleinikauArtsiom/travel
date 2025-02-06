package com.example.travelpet.api.dto.update;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDtoUpdate {

    private Long userId;
    private String givenName;
    private String familyName;

}
