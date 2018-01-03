package com.trimetis.user;

import com.trimetis.user.controller.UserController;
import com.trimetis.user.dto.UserDTO;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserControllerIntegrationTest {

    @Autowired
    private UserController userController;

    @Test
    public final void saveUser() {
        String name = "Name1";
        String password = "Password1";
        String hashedPassword = "b9efd0093bc77cd96e6f86db09321ffe5cb4ffa7634df89df586379fe6276cc8";
        UserDTO userDTO = new UserDTO(name, password);

        UserDTO dto = userController.save(userDTO);

        assertNotNull(dto);
        assertNotNull(dto.getName());
        assertNotNull(dto.getPassword());
        assertEquals(dto.getPassword(), hashedPassword);
    }

}
