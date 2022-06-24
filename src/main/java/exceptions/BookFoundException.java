package exceptions;
import model.Book;

public class BookFoundException extends  Exception{
    public BookFoundException(String message){
        super(message);
    }
}