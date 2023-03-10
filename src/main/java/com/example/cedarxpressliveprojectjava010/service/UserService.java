package com.example.cedarxpressliveprojectjava010.service;

import com.example.cedarxpressliveprojectjava010.dto.AddressDto;
import com.example.cedarxpressliveprojectjava010.dto.EditUserDetailsDto;
import com.example.cedarxpressliveprojectjava010.dto.RegistrationDto;
import com.example.cedarxpressliveprojectjava010.dto.UpdatePasswordDto;
import com.example.cedarxpressliveprojectjava010.entity.Address;
import org.springframework.http.ResponseEntity;

public interface UserService {
    ResponseEntity<RegistrationDto> registerUser(RegistrationDto registrationDto);
    ResponseEntity<String> updatePassword(UpdatePasswordDto updatePasswordDto);
    void editUserDetails(EditUserDetailsDto editUserDetailsDto);
}
