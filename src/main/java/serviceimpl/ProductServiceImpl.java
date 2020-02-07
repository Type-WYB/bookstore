package serviceimpl;

import mapper.ProductMapper;
import org.springframework.stereotype.Service;
import service.ProductService;

import javax.annotation.Resource;

@Service
public class ProductServiceImpl implements ProductService {
    @Resource
    private ProductMapper productMapper;
}
