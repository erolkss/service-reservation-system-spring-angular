package br.com.ero.service_booking_system.dto;

import br.com.ero.service_booking_system.enums.UserRole;
import lombok.Data;


@Data
public class UserDto {

    private Long id;
    private String email;
    private String password;
    private String name;
    private String lastName;
    private String phone;
    private UserRole role;
}
