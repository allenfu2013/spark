package org.allen.scala.lesson4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static scala.collection.JavaConversions.asJavaCollection;

public class App {
    public List<Author> loadAuthors() {
        return new ArrayList<Author>(asJavaCollection(Author.loadAuthors()));
    }

    public void sortAuthors(List<Author> authors) {
        Collections.sort(authors);
    }

    public void displaySortedAuthors() {
        List<Author> authors = loadAuthors();
        sortAuthors(authors);
        for (Author author : authors) {
            System.out.println(author.lastName() + ", " + author.firstName());
        }
    }

    public static void main(String[] args) {
        App app = new App();
        app.displaySortedAuthors();
    }
}
