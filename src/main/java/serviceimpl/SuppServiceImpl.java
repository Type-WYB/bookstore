package serviceimpl;

import mapper.SuppMapper;
import org.springframework.stereotype.Service;
import service.SuppService;

import javax.annotation.Resource;

@Service
public class SuppServiceImpl implements SuppService {
    @Resource
    private SuppMapper suppMapper;
}
