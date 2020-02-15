package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;
import pojo.Product;
import pojo.ResultInfo;
import service.ProductService;
import serviceimpl.ProductServiceImpl;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 王益波
 * @version 1.0
 * @date 2020/2/7 16:51
 */
@Controller
@RequestMapping(value = "/product/*")
public class ProductController {

    @Resource
    ProductServiceImpl productServiceImpl;

    @RequestMapping("/homeProduct")
    @ResponseBody
    ResultInfo homeProduct(){
        return new ResultInfo(1,"首页书籍信息","home.html",productServiceImpl.getHomeProduct());
    }

    @RequestMapping("/getBook")
    @ResponseBody
    ResultInfo getBook(@RequestParam String id){
        return new ResultInfo(1,"书籍详细信息","book-detail.html",productServiceImpl.getProduct(Integer.parseInt(id)));
    }
}
