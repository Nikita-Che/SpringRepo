package aop.aspects;

import org.springframework.stereotype.Component;

@Component
public class SchoolLibrary extends AbstractLibrary {
//    @Override
    public void getBook() {
        System.out.println("мы берем книгу из SchoolLibrary");
    }
}
