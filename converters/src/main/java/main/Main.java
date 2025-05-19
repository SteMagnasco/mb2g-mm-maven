package main;

import dto.User;
import guru.springframework.domain.UserCommand;
import mapper.UserMapper;

public class Main {
    public static void main(String[] args) {
        User user = new User("zio","pera","ziopera@gmail.com");
        UserCommand userCommand = UserMapper.INSTANCE.userToUserCommand(user);
        System.out.println(user);
        System.out.println(userCommand);
        UserCommand userCommand1 = new UserCommand();
        userCommand1.setFirstName("cane");
        userCommand1.setLastName("gatto");
        userCommand1.setEmail("canegatto@gmail.com");
        User user1 = UserMapper.INSTANCE.userCommandToUser(userCommand1);
        System.out.println(userCommand1);
        System.out.println(user1);
    }
}
