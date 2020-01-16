package controller;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import service.UserService;

import javax.annotation.Resource;

@Controller
public class UserController {

    @Resource
    private UserService userService;

}
