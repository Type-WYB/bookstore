package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import pojo.Customer;
import serviceimpl.CustomerServiceImpl;

import javax.annotation.Resource;


@Controller
public class IndexController {
    @Resource
    private CustomerServiceImpl customerServiceImpl;


}