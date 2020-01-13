package serviceimpl;

import mapper.BookMapper;
import mapper.CustomerMapper;
import org.springframework.stereotype.Service;
import pojo.Book;
import pojo.Customer;
import service.BookService;
import service.CustomerService;

import javax.annotation.Resource;
import java.util.List;


@Service
public class CustomerServiceImpl implements CustomerService {
    @Resource
    private CustomerMapper customerMapper;

    @Override
    public Customer getCustomerById(int id) {
        return customerMapper.selectById(id);
    }
}
