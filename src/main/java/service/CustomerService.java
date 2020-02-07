package service;

import pojo.Customer;

import java.util.List;


public interface CustomerService {
    /**
     * 用户登录
     * @param customer 登录客户对象
     * @return 返回查询结果
     */
    Customer login(Customer customer);

    /**
     * 用户注册
     * @param customer 注册客户对象
     * @return 如果注册成功则返回true，否则返回false
     */
    boolean register(Customer customer);
}
