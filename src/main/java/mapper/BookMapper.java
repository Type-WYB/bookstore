package mapper;

import pojo.Book;

import java.util.List;


public interface BookMapper {
    public Book getAlluserByBid(int bid);
    public List<Book> getAllBook();
}
