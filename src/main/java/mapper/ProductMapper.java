package mapper;

import pojo.Book;

import java.util.List;


public interface ProductMapper {
    public Book getAlluserByBid(int bid);
    public List<Book> getAllBook();
}
