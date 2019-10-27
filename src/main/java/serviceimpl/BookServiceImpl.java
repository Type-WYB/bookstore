package serviceimpl;

import mapper.BookMapper;
import org.springframework.stereotype.Service;
import pojo.Book;
import service.BookService;

import javax.annotation.Resource;
import java.util.List;


@Service
public class BookServiceImpl implements BookService {
    @Resource
    private BookMapper bookMapper;
    @Override
    public List<Book> getAllBook() {
        return bookMapper.getAllBook();
    }
}
