package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pojo.ResultInfo;
import pojo.User;
import service.UserService;

import javax.annotation.Resource;

@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("/login")
    @ResponseBody
    public ResultInfo login(@RequestBody User user) {
        // 数据库调用
        User checkedUser = userService.login(user);
        if (checkedUser != null) {
            return new ResultInfo(1, "登录成功");
        } else {
            return new ResultInfo(0, "用户名或密码错误");
        }
    }
}
