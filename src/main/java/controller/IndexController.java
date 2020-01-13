package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import pojo.Customer;
import pojo.User;
import serviceimpl.BookServiceImpl;
import serviceimpl.CustomerServiceImpl;

import javax.annotation.Resource;


@Controller
public class IndexController {
   @Resource
    private BookServiceImpl bookServiceImpl;
    @Resource
    private CustomerServiceImpl customerServiceImpl;
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public ModelAndView user(ModelMap modelMap)
    {
        Customer c=customerServiceImpl.getCustomerById(1);
        modelMap.addAttribute("c",c);
        ModelAndView user=new ModelAndView("login");
        User user1=new User();
        user1.setName("user");
        user1.setPassword("password");
        user1.setUid(1234);
        modelMap.addAttribute("user",user1);

        return user;
    }

}
