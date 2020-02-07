package service;

import pojo.Customer;

import java.util.List;


public interface CustomerService {
    public Customer getCustomerById(int id);
    public boolean login(String name,String pwd);
}
