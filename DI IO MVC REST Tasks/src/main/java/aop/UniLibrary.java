package aop;

import org.springframework.stereotype.Component;

@Component

public class UniLibrary extends AbstractLibrary {

    public void getBook() {
        System.out.println("мы берем книгу из UniLibrary ");
        System.out.println("___________________________________");
    }
    public void addBook(String person_name, Book book) {
        System.out.println("мы добавляем книгу из UniLibrary ");
        System.out.println("___________________________________");
    }

    public void returnBook() {
        System.out.println("возвращаем книгу в UniLibrary ");
        System.out.println("___________________________________");
    }

    public void addMagazine() {
        System.out.println("мы добавляем журнал из UniLibrary ");
        System.out.println("___________________________________");
    }

    public void getMagazine() {
        System.out.println("мы берем журнал из UniLibrary ");
        System.out.println("___________________________________");
    }

    public void returnMagazine() {
        System.out.println("мы возвращаем журнал из UniLibrary ");
        System.out.println("___________________________________");
    }
}

