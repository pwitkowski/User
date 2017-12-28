package com.trimetis.user.service;

import com.trimetis.user.dto.UserDTO;

public interface UserService {
    
    UserDTO save(String name, String password);
    
}
