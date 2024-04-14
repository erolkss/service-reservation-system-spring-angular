package br.com.ero.service_booking_system.services.authentication;

import br.com.ero.service_booking_system.dto.SignupRequestDTO;
import br.com.ero.service_booking_system.dto.UserDto;

public interface AuthService {

    UserDto signupClient(SignupRequestDTO signupRequestDTO);
    Boolean presentByEmail(String email);
    UserDto signupCompany(SignupRequestDTO signupRequestDTO);
}
