package serviceimpl;

import mapper.CustomerMapper;
import mapper.ProductMapper;
import org.springframework.stereotype.Service;
import pojo.Product;
import service.ProductService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 王益波
 * @version 1.0
 * @date 2020/2/7 17:05
 */
@Service
public class ProductServiceImpl implements ProductService {
    @Resource
    private ProductMapper productMapper;


    @Override
    public List<Product> getHomeProduct() {
        List<Product> list= productMapper.getAllProduct();
        if(list.size()>10){
           return null;
        }else return list;
    }
}
