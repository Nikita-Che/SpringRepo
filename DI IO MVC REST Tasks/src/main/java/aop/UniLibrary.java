package aop;

import org.springframework.stereotype.Component;

@Component

public class UniLibrary extends AbstractLibrary {

    public void getBook() {
        System.out.println("мы берем книгу из UniLibrary ");
    }
    public void addBook() {
        System.out.println("мы добавляем книгу из UniLibrary ");
    }

    public void returnBook() {
        System.out.println("возвращаем книгу в UniLibrary ");
    }

    public void addMagazine() {
        System.out.println("мы добавляем журнал из UniLibrary ");
    }

    public void getMagazine() {
        System.out.println("мы берем журнал из UniLibrary ");
    }

    public void returnMagazine() {
        System.out.println("мы возвращаем журнал из UniLibrary ");
    }
}

