package by.kunavich.task6.data.dao;

import by.kunavich.task6.model.Book;

import java.util.ArrayList;
import java.util.List;

public class BookDAO implements Dao<Book>{

    private List<Book> books = new ArrayList<>();

    @Override
    public Book get(int id) {
        return books.get(id);
    }

    @Override
    public List getAll() {
        return books;
    }

    @Override
    public void save(Book book) {
        books.add(book);

    }

    @Override
    public void update(Book book, String[] params) {

        
    }

    @Override
    public void delete(Book book) {
        books.remove(book);

    }
}
