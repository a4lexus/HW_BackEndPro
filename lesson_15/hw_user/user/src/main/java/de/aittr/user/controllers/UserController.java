package de.aittr.user.controllers;

import de.aittr.user.dto.UserRequestDto;
import de.aittr.user.dto.UserResponseDto;
import de.aittr.user.exception.UserCreateException;
import de.aittr.user.mapper.UserMapper;

import de.aittr.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/users")
@CrossOrigin
@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserMapper mapper;
    private final UserService service;

    @GetMapping
    public ResponseEntity<List<UserResponseDto>> getAll(@RequestParam (name = "sort", defaultValue = "") String sortType){
        if (sortType.equals("name")){
            return ResponseEntity.status(HttpStatus.OK).body(service.getAllUsersOrderedByName());
        } else if (sortType.equals("email")) {
            return ResponseEntity.status(HttpStatus.OK).body(service.getAllUsersOrderedByEmail());
        }
        return ResponseEntity.status(HttpStatus.OK).body(service.getAllUsers());
    }

    @PostMapping
    public  ResponseEntity<UserResponseDto> addUser(@RequestBody UserRequestDto dto){
        try {
            UserResponseDto userResponseDto = service.addUser(dto);
            return ResponseEntity.status(HttpStatus.CREATED).body(userResponseDto);
        }catch (UserCreateException e){
            return ResponseEntity.internalServerError().build();
        }
    }

}
