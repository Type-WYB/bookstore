package serviceimpl;

import mapper.UserMapper;
import org.springframework.stereotype.Service;
import pojo.User;
import service.UserService;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public User login(User user) {
        return userMapper.login(user);
    }
}
