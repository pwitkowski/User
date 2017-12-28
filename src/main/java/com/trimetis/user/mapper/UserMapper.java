package com.trimetis.user.mapper;

import com.trimetis.user.dto.UserDTO;
import com.trimetis.user.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
     
    UserDTO toDTO(User user);

    User toEntity(UserDTO dto);
    
}
