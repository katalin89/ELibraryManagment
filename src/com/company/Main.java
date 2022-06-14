package com.company;

import model.Book;

public class Main {

    public static void main(String[] args) {
	Book book=new Book(1,1,"Alchimist","Paulo Coelho",70,"2000.01.21");
        Book book2=new Book(1,1,"Alchimist","Paulo Coelho",80,"2000.01.21");
        System.out.println(book.compareTo(book2));

    }
}
