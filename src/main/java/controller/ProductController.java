package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import pojo.Category;
import pojo.ResultInfo;
import serviceimpl.CategoryServiceImpl;
import serviceimpl.ProductServiceImpl;

import javax.annotation.Resource;

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
    @Resource
    CategoryServiceImpl categoryServiceImpl;

    @RequestMapping("/homeProduct")
    @ResponseBody
    ResultInfo homeProduct() {
        return new ResultInfo(1, "首页书籍信息", "home.html", productServiceImpl.getHomeProduct());
    }

    @RequestMapping("/getBook")
    @ResponseBody
    ResultInfo getBook(@RequestParam String id) {
        return new ResultInfo(1, "书籍详细信息", "book-detail.html", productServiceImpl.getProduct(Integer.parseInt(id)));
    }

    @RequestMapping("/getProductByCategory")
    @ResponseBody
    ResultInfo getProductByCategory(@RequestParam String type) {
        Category category = categoryServiceImpl.selectByName(type);
        return new ResultInfo(1, "通过商品分类查询商品信息", "book_type.html", productServiceImpl.selectByCategoryId(category.getId()));
    }
}
