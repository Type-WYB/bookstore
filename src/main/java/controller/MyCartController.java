package controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import org.json.JSONObject;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;
import pojo.CartItem;
import pojo.Msg;
import pojo.Product;
import serviceimpl.CartItemServiceImpl;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 王益波
 * @version 1.0
 * @date 2020/2/14 16:30
 */
@Controller
@RequestMapping(value = "/MyCart/*")
public class MyCartController {

    @Resource
    CartItemServiceImpl cartItemServiceImple;

    @RequestMapping(value = "/add",method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    @ResponseBody
    Msg add(@RequestBody String jsonObjectstring, HttpSession session){
        JSONObject jsonObject=new JSONObject(jsonObjectstring);
        int qty =jsonObject.getInt("qty");
        JSONObject product=jsonObject.getJSONObject("book");

        Msg msg=new Msg(true,"");
        Object o=session.getAttribute("id");
        if(o==null) {msg.setIs(false);msg.setCode(1);msg.setMsg("你未登录"); return msg;}
        CartItem cartItem=new CartItem();
        cartItem.setCustomerid((int)o);
        cartItem.setProudectid(product.getInt("id"));
        cartItem.setProdectname(product.getString("name"));
        cartItem.setListprice(product.getDouble("listprice"));
        cartItem.setQty(qty);
        cartItemServiceImple.add(cartItem);
        msg.setIs(true);
        return msg;
    }


}
