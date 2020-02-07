package serviceimpl;

import mapper.CustomerMapper;
import org.springframework.stereotype.Service;
import pojo.Customer;
import service.CustomerService;

import javax.annotation.Resource;


@Service
public class CustomerServiceImpl implements CustomerService {
    @Resource
    private CustomerMapper customerMapper;

    @Override
    public Customer getCustomerById(int id) {
        return customerMapper.selectById(id);
    }

    @Override
    public boolean login(String name, String pwd) {
        Customer c= customerMapper.isMatch(name,pwd);
        if(c!=null)
        return true;
        else
        return false;
    }


}
