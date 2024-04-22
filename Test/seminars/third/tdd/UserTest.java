package seminars.third.tdd;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserTest {

    @Test
    void userCreation(){
        User user = new User("user0", "pass0", false);
        assertTrue(user.authenticate("user0", "pass0"));
    }

    @Test
    void userCreationFailed() {
        User user = new User("user0", "pass0", false);
        assertFalse(user.authenticate("user0", "pass0"));
    }

    @Test
    void userRepository() {
        UserRepository userRepository = new UserRepository();
        User userNA = new User("user0", "pass0", false);
        userRepository.addUser(userNA);
        assertFalse(userRepository.findByName(userNA.name));
    }

    @Test
    void userRepositoryNA() {
        UserRepository userRepository = new UserRepository();
        User userNA = new User("user0", "pass0", false);
        userRepository.addUser(userNA);
        assertFalse(userRepository.findByName(userNA.name));
    }
}