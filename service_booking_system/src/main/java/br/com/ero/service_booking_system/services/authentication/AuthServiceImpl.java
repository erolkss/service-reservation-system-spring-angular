package br.com.ero.service_booking_system.services.authentication;

import br.com.ero.service_booking_system.dto.SignupRequestDTO;
import br.com.ero.service_booking_system.dto.UserDto;
import br.com.ero.service_booking_system.entities.User;
import br.com.ero.service_booking_system.enums.UserRole;
import br.com.ero.service_booking_system.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDto signupClient(SignupRequestDTO signupRequestDTO) {
        User user = new User();

        user.setName(signupRequestDTO.getName());
        user.setLastName(signupRequestDTO.getLastName());
        user.setEmail(signupRequestDTO.getEmail());
        user.setPhone(signupRequestDTO.getPhone());
        user.setPassword(signupRequestDTO.getPassword());

        user.setRole(UserRole.CLIENT);

        return userRepository.save(user).getDto();
    }
}