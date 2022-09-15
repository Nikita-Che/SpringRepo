package aop;

import aop.aspects.AbstractLibrary;
import org.springframework.stereotype.Component;

@Component

public class UniLibrary extends AbstractLibrary {


    public void getBook (Book book){
        System.out.println("мы берем книгу из UniLibrary " + book.getName());
    }

    public void returnBook() {
        System.out.println("возвращаем книгу в UniLibrary ");
    }

    public void getMagazine (){
        System.out.println("мы берем журнал из UniLibrary ");
    }
}

