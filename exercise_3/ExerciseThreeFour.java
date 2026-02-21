/*
 * SCENARIO: A university library system searches a collection of books by keyword and returns ranked results sorted by relevance score. Results are appearing in the wrong order and some books are missing from results entirely.
 * TASK: There are THREE logical errors. One is in the search filter, one is in the scoring algorithm deep inside, and one is in the sort comparator. Step through the full pipeline.
 * EXPECTED OUTPUT:
 * Search results for 'java': 
 * [3] Java Debugging 
 * [3] The Java Handbook 
 * [2] Debug Mastery
 */

import java.util.*;

public class ExerciseThreeFour {

  static class Book {
    String title, author, description;
    int year;

    Book(String t, String a, String d, int y) {
      title = t;
      author = a;
      description = d;
      year = y;
    }
  }

  // Returns relevance score: +2 for title match, +1 for description match
  public static int scoreBook(Book book, String keyword) {
    int score = 0;
    String kw = keyword.toLowerCase();
    if (book.title.toLowerCase().contains(kw))
      score += 2;
    if (book.description.toLowerCase().contains(kw))
      score += 2;
    return score;
  }

  public static List<Book> search(List<Book> library, String keyword) {
    List<Book> results = new ArrayList<>();
    for (Book b : library) {
      if (scoreBook(b, keyword) > 0) {
        results.add(b);
      }
    }
    // Sort by relevance descending
    results.sort((a, b) -> scoreBook(a, keyword) - scoreBook(b, keyword));
    return results;
  }

  public static void main(String[] args) {
    List<Book> library = Arrays.asList(
        new Book("Java Debugging", "Smith", "Learn to debug Java code", 2021),
        new Book("Python Basics", "Jones", "Introduction to Python", 2019),
        new Book("Debug Mastery", "Lee", "Advanced debugging for Java", 2023),
        new Book("Clean Code", "Martin", "Write better readable code", 2008),
        new Book("The Java Handbook", "Brown", "Complete Java reference guide", 2022));

    List<Book> results = search(library, "java");
    System.out.println("Search results for 'java':");
    for (Book b : results) {
      System.out.println("  [" + scoreBook(b, "java") + "] " + b.title);
    }
  }
}