package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import pojo.CartItem;
import pojo.Customer;
import pojo.ResultInfo;
import serviceimpl.CartItemServiceImpl;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/cartItem")
public class CartItemController {
    @Resource
    CartItemServiceImpl cartItemServiceImpl;

    @RequestMapping("/addCartItem")
    @ResponseBody
    public ResultInfo addCartItem(@RequestBody Map<String, String> map, HttpSession session) {
        // 获取当前登录用户的信息
        Customer customer = (Customer) session.getAttribute("customer");
        // 获取前台提供的要添加的购物车记录信息
        String productId = map.get("product_id");
        String productName = map.get("product_name");
        String productPrice = map.get("product_price");
        String buyCount = map.get("buy_count");
        // 将要添加的购物车记录信息封装到实体类对象中
        CartItem cartItem = new CartItem(customer.getId(), Integer.parseInt(productId), productName, Double.parseDouble(productPrice), Integer.parseInt(buyCount));
        // 调用添加方法
        boolean b = cartItemServiceImpl.addCartItem(cartItem);
        if (b) {
            return new ResultInfo(1, "成功添加该商品到购物车中", "cart.html");
        } else {
            return new ResultInfo(0, "失败添加该商品到购物车中", "cart.html");
        }
    }

    @RequestMapping("/getCartItems")
    @ResponseBody
    public ResultInfo getCartItems(HttpSession session) {
        // 获取当前登录用户的信息
        Customer customer = (Customer) session.getAttribute("customer");
        if (customer != null) {
            // 执行查询
            List<CartItem> cartItems = cartItemServiceImpl.selectByCustomerId(customer.getId());
            return new ResultInfo(1, "查询购物车商品记录成功", "cart.html", cartItems);
        } else {
            return new ResultInfo(0, "查询购物车商品记录失败", "login.html");
        }
    }

    @RequestMapping("/deleteCartItem")
    @ResponseBody
    public ResultInfo deleteCartItem(@RequestParam String id){
        boolean b = cartItemServiceImpl.deleteCartItem(Integer.parseInt(id));
        if(b){
            return new ResultInfo(1,"删除商品成功","cart.html");
        }else {
            return new ResultInfo(0,"删除商品失败","cart.html");
        }
    }
}
