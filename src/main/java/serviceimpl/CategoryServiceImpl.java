package serviceimpl;

import mapper.CategoryMapper;
import org.springframework.stereotype.Service;
import pojo.Category;
import service.CategoryService;

import javax.annotation.Resource;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Resource
    private CategoryMapper categoryMapper;

    @Override
    public Category selectByName(String name) {
        return  categoryMapper.selectByName(name);
    }
}
