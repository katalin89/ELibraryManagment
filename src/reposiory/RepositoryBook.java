package reposiory;


import exceptions.BookFoundException;
import exceptions.BookNotFoundException;
import model.Book;
import reposiory.Repository;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class RepositoryBook extends Repository {

    private String insertTo;

    public RepositoryBook() {
        super();
    }

    public void insertBook(Book book) {


        String insertTo = "";

        insertTo += " insert into book(student_id,name,author,price,date)  values (";
        insertTo += String.format(" %d, '%s','%s',%d,'%s'", book.getStudentId(), book.getName(), book.getAuthor(), book.getPrice(), book.getDate());
        insertTo += ")";
        executeStatement(insertTo);

    }


    public void stergeBookById(int id) {

        String text = String.format("delete from book where id= %d ", id);
        executeStatement(text);
    }

    public void updatePrice(int id, int price) {

        String update = "";
        update += String.format("update book set price='%s'", price);
        update += String.format("where id=%d", id);
        executeStatement(update);


    }


    public void deleteNume(String nume) {
        String delete = "";
        delete += String.format(" delete from book where name = '%s'", nume);
        executeStatement(delete);
    }

    private ResultSet allBook() {
        executeStatement("select * from book");
        try {
            return statement.getResultSet();
        } catch (Exception e) {
            System.out.println("Nu s-a executat schita");
            return null;
        }
    }

    //dupa nume
    private ResultSet findBoonName(String name) {
        executeStatement(String.format("select * from book where name='%s'", name));
        try {
            return statement.getResultSet();
        } catch (Exception e) {
            System.out.println("Nu s-a executat schita");
            return null;
        }
    }

    public Book findBooks(String name) throws BookFoundException {
        ResultSet set = findBoonName(name);
        List<Book> books = new ArrayList<>();
        try {
            while (set.next()) {

                books.add(new Book(set.getInt(1), set.getInt(2), set.getString(3), set.getString(4), set.getInt(5), set.getString(6)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (books.size() != 0) {
            throw new BookFoundException("Cartea exista deja");
        }
        return books.get(0);
    }

    //Nu s-a gasit cartea
    private ResultSet findBook(int id) {
        executeStatement(String.format("select * from book where id=%d", id));
        try {
            return statement.getResultSet();
        } catch (Exception e) {
            System.out.println("Nu s-a executat schita");
            return null;
        }
    }

    //nu s-a gasit
    public Book findBooks(int id) throws BookNotFoundException {
        ResultSet set = findBook(id);
        List<Book> books = new ArrayList<>();
        try {
            while (set.next()) {

                books.add(new Book(set.getInt(1), set.getInt(2), set.getString(3), set.getString(4), set.getInt(5), set.getString(6)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (books.isEmpty()) {

            throw new BookNotFoundException("Nu exista cartea");
        }
        return books.get(0);
    }


    public List<Book> allBooks() {
        ResultSet set = allBook();
        List<Book> books = new ArrayList<>();
        try {
            while (set.next()) {
                books.add(new Book(set.getInt(1), set.getInt(2), set.getString(3), set.getString(4), set.getInt(5), set.getString(6)));
            }
        } catch (Exception e) {
            System.out.println("Nu sa creat lista");
        }
        return books;

    }

}
