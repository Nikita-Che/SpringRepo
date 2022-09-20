package aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
    @Value("война и мир")
    private String name;

    @Value("Достоевский")
    private String author;

    public String getAuthor() {
        return author;
    }

    public int getYearOfPublic() {
        return yearOfPublic;
    }

    @Value("1984")
    private int yearOfPublic;

    public String getName() {
        return name;
    }
}
