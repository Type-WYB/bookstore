package serviceimpl;

import mapper.CustomerMapper;
import mapper.ProductMapper;
import org.springframework.stereotype.Service;
import pojo.CartItem;
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
        for (Product p:list
             ) {
            p.setImage("images/home/book/"+p.getImage());
        }
        if(list.size()>10){
           return list.subList(0,9);
        }else return list;
    }

    @Override
    public Product getProById(int id) {
        Product p= productMapper.getProductById(id);
        if(p!=null) p.setUnitcost(-1);
        return p;
    }

}
