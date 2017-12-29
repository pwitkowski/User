package com.trimetis.user.service;

import com.trimetis.user.dto.UserDTO;
import com.trimetis.user.entity.User;
import com.trimetis.user.mapper.UserMapper;
import com.trimetis.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.encoding.ShaPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserMapper userMapper;
    
    @Autowired
    private ShaPasswordEncoder shaPasswordEncoder;

    @Override
    public UserDTO save(String name, String password) {
        User user = new User();
        user.setName(name);
        user.setPassword(shaPasswordEncoder.encodePassword(name + password, null));
        user = userRepository.save(user);
        
        return userMapper.toDTO(user);
    }

    @Override
    public UserDTO save(UserDTO userDTO) {
        return save(userDTO.getName(), userDTO.getPassword());
    }
    
}
