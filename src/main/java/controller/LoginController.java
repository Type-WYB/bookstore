package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;
import pojo.Customer;
import serviceimpl.CustomerServiceImpl;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;


@Controller
@RequestMapping(value = "/login/*")
public class LoginController {
    @Resource
    private CustomerServiceImpl customerServiceImpl;

    @RequestMapping(value = "/login",method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    @ResponseBody
    ModelAndView login(@RequestBody Map<String, String> map, HttpSession session){
        boolean is=customerServiceImpl.login(map.get("customername"),map.get("password"));
        if(is) session.setAttribute("name",map.get("customername"));
        Map<String, Boolean> valid = new HashMap<>();
        valid.put("valid", is);
        return new ModelAndView(new MappingJackson2JsonView(), valid);
    }

    @RequestMapping(value = "/getsession",method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    @ResponseBody
    ModelAndView getsession(HttpSession session){
        Object o=session.getAttribute("name");
        Map<String, String> name = new HashMap<>();
        if(o==null)
        name.put("name", "");
        else
         name.put("name",o.toString());
        return new ModelAndView(new MappingJackson2JsonView(), name);
    }

    @RequestMapping(value = "/exit",method = RequestMethod.GET)
    String exit(HttpSession session){
      session.invalidate();
        return "home";
    }
}

