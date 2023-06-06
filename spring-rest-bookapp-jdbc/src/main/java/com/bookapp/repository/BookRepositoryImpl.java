package com.bookapp.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bookapp.exceptions.BookNotFoundException;
import com.bookapp.model.Book;
@Repository
public class BookRepositoryImpl implements IBookRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void addBook(Book book) {
	String sql="insert into book (title,bookId,author,price,category)values(?,BOOKSEQ.nextval,?,?,?)";	
	Object[] bookArray	= {book.getTitle(),book.getAuthor(),book.getPrice(),book.getCategory()};
	jdbcTemplate.update(sql,bookArray);
	
	}

	@Override
	public void updateBook(int bookId, double price) {
	String sql="Update book set price=? where bookId=?";
	jdbcTemplate.update(sql, price,bookId);
		
	}

	@Override
	public void deleteBook(int bookId) {
		String sql="delete from book where bookId=?";
				jdbcTemplate.update(sql,bookId);
		
	}

	@Override
	public List<Book> findAll() {
		String sql="select * from book";
//		RowMapper<Book> mapper=new BookMapper();
	return 	jdbcTemplate.query(sql,new BookMapper());
	}

	@Override
	public Book findById(int bookId) {
		String sql="select * from book where bookId=?";
//		goto row mapper n copy (rs,rownum)comes from rowmapper object
		return jdbcTemplate.queryForObject(sql,(rs,rownum)->{
			Book book=new Book();
			book.setTitle(rs.getString("title"));
			book.setBookId(rs.getInt("bookId"));
			book.setAuthor(rs.getString("author"));
			book.setCategory(rs.getString("category"));
			book.setPrice(rs.getDouble("price"));
			return book;
			},bookId);
		
	}

	@Override
	public List<Book> findByCategory(String category) {
		String sql="select * from book where category=?";
		return jdbcTemplate.query(sql,(rs,rownum)->{
			Book book=new Book();
			book.setTitle(rs.getString("title"));
			book.setBookId(rs.getInt("bookId"));
			book.setAuthor(rs.getString("author"));
			book.setCategory(rs.getString("category"));
			book.setPrice(rs.getDouble("price"));
			return book;
			},category);
			}

	@Override
	public List<Book> findByPriceLessThan(double nprice) {
		String sql="select * from book where price<?";
		return jdbcTemplate.query(sql,new BookMapper(),nprice);
	}

	@Override
	public List<Book> findByTitleContaining(String title,String category) {
		String sql="select * from book where category=? and  title like ? ";
		return jdbcTemplate.query(sql,new BookMapper(),category,"%"+title+"%") ;
	}

	@Override
	public List<Book> findByAuthorStarting(String author) {
		String sql="select * from book where author like ?";
		return jdbcTemplate.query(sql,new BookMapper(),author+"%");
	}


}
