package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pojo.Customer;
import pojo.ResultInfo;
import service.CustomerService;

import javax.annotation.Resource;
import javax.naming.event.NamingListener;
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

    /**
     * 获取用户登录成功的用户信息
     *
     * @param session session对象
     * @return 返回查询结果
     */
    @RequestMapping("/getSession")
    @ResponseBody
    public ResultInfo getSession(HttpSession session) {
        Object customer = session.getAttribute("customer");
        if (customer != null) {
            return new ResultInfo(1, "获取登录成功的用户信息", "home.html", (Customer) session.getAttribute("customer"));
        }else {
            return new ResultInfo(0,"用户未登录","login.html");
        }
    }

    @RequestMapping("/logout")
    @ResponseBody
    public ResultInfo logout(HttpSession session) {
        Customer customer = (Customer) session.getAttribute("customer");
        // 判断用户是否有效
        if (customer != null) {
            session.removeAttribute("customer");
            return new ResultInfo(1, "注销成功", "first.html");
        } else {
            return new ResultInfo(0, "注销失败", "home.html");
        }
    }
}
