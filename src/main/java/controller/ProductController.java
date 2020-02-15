package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
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

//    @RequestMapping(value = "/homeProduct",method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
//    @ResponseBody
//    List<Product> homeProduct(){
//        return productServiceImpl.getHomeProduct();
//    }
    @RequestMapping("/homeProduct")
    @ResponseBody
    ResultInfo homeProduct(){
        return new ResultInfo(1,"首页书籍信息","home.html",productServiceImpl.getHomeProduct());
    }
}
