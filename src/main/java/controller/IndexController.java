package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import pojo.User;
import serviceimpl.BookServiceImpl;

import javax.annotation.Resource;


@Controller
public class IndexController {
   @Resource
    private BookServiceImpl bookServiceImpl;
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public ModelAndView user(ModelMap modelMap)
    {
        modelMap.addAttribute("Book",bookServiceImpl.getAllBook());
        ModelAndView user=new ModelAndView("login");
        User user1=new User();
        user1.setName("user");
        user1.setPassword("password");
        user1.setUid(1234);
        modelMap.addAttribute("user",user1);
        return user;
    }
}
