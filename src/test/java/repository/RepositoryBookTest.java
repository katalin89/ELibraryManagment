package repository;

import model.Book;
import org.junit.jupiter.api.Test;

import java.util.List;

class RepositoryBookTest  {
    @Test
    public  void insert() {
        RepositoryBook repositoryBook = new RepositoryBook();

        Book book = new Book(1, 1, "Informatica", "Dana Lica", 150, "1999.01.21");
        repositoryBook.insertBook(book);

    }
        @Test
        public void stergeById(){
            RepositoryBook repositoryBook = new RepositoryBook();
           repositoryBook.stergeBookById(1);

        }



        @Test
        public void updatePrice () {
            RepositoryBook repositoryBook = new RepositoryBook();
            repositoryBook.updatePrice(1, 19990);
        }

        public void deleteNume () {
            RepositoryBook repositoryBook = new RepositoryBook();
            repositoryBook.deleteNume("ceva");
        }

        @Test
        public void listBook () {
            RepositoryBook repositoryBook = new RepositoryBook();
            List<Book> books = repositoryBook.allBooks();
            for (Book b : books) {
                System.out.println(b.toString());
            }
        }


    }