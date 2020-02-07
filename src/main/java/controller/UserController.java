package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pojo.Customer;
import pojo.ResultInfo;
import service.CustomerService;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
@RequestMapping("/customer")
public class UserController {
    @Resource
    private CustomerService customerService;

    /**
     * 用户登录
     *
     * @param map     前台请求参数集合
     * @param session session
     * @return 返回结果信息
     */
    @RequestMapping("/login")
    @ResponseBody
    public ResultInfo login(@RequestBody Map<String, String> map, HttpSession session) {
        // 数据库调用
        Customer customer = new Customer(map.get("name"), map.get("password"));
        Customer checkedUser = customerService.login(customer);
        if (checkedUser != null) {
            // 登录成功将用户数据保存到session，密码这里明文显示
            session.setAttribute("customer", checkedUser);
            return new ResultInfo(1, "登录成功", "", "");
        } else {
            return new ResultInfo(0, "用户名或密码错误", "", "");
        }
    }

    /**
     * 用户注册
     *
     * @param map 前台请求参数集合
     * @return 返回结果信息
     */
    @RequestMapping("/register")
    @ResponseBody
    public ResultInfo register(@RequestBody Map<String, String> map) {
        // 注册
        Customer customer = new Customer(map.get("name"), map.get("password"), map.get("email"));
        boolean b = customerService.register(customer);
        if (b) {
            return new ResultInfo(1, "注册成功", "", "");
        } else {
            return new ResultInfo(0, "注册失败", "", "");
        }
    }
}
