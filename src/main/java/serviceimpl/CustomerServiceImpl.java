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
    public Customer login(Customer customer) {
        return customerMapper.login(customer);
    }

    @Override
    public boolean register(Customer customer) {
        return customerMapper.register(customer);
    }

}
