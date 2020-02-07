package serviceimpl;

import mapper.CategoryMapper;
import org.springframework.stereotype.Service;
import service.CategoryService;

import javax.annotation.Resource;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Resource
    private CategoryMapper categoryMapper;
}
