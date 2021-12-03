package com.learning.stream;

import com.learning.stream.forumuser.Forum;
import com.learning.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.time.Period;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {

//        PoemBeautifier poemBeautifier = new PoemBeautifier();
//
//        poemBeautifier.beautify("Sample text", String::toUpperCase);
//        poemBeautifier.beautify("Sample text", n -> "ABC " + n);
//        poemBeautifier.beautify("Sample text", n -> "" + n + " ABC");
//        poemBeautifier.beautify("Sample text", String::toLowerCase);
//        poemBeautifier.beautify("Sample text", n -> n.replace('s', 'S'));

        /* stream, filter, map, collect */
//        People.getList().stream()
//               .map(s -> s.toUpperCase())
//                .forEach(System.out::println);
//
//        People.getList().stream()
//                .map(String::toUpperCase)
//                .forEach(System.out::println);
//
//        People.getList().stream()
//                .filter(s -> s.length() > 11)
//                .forEach(System.out::println);
//
//        People.getList().stream()
//                .map(String::toUpperCase)
//                .filter(s -> s.length() > 11)
//                .map(s -> s.substring(0,s.indexOf(' ') + 2) + ".")
//                .filter(s -> s.substring(0,1).equals("M"))
//                .forEach(System.out::println);

//        BookDirectory bookDirectory = new BookDirectory();
//        bookDirectory.getList().stream()
//                .filter(book -> book.getYearOfPublication() > 2005)
//                .forEach(System.out::println);

//        BookDirectory bookDirectory = new BookDirectory();
//        List<Book> theResultListOfBook = bookDirectory.getList().stream()
//                .filter(book -> book.getYearOfPublication() > 2005)
//                .collect(Collectors.toList());
//
//        System.out.println("# elements: " + theResultListOfBook.size());
//        theResultListOfBook.stream()
//                .forEach(System.out::println);

//        BookDirectory bookDirectory = new BookDirectory();
//
//        Map<String, Book> theResultOfBooks = bookDirectory.getList().stream()
//                .filter(book -> book.getYearOfPublication() > 2005)
//                .collect(Collectors.toMap(Book::getSignature, book -> book));
//
//        System.out.println("# elements: " + theResultOfBooks.size());
//        theResultOfBooks.entrySet().stream()
//                .map(entry -> entry.getKey() + ": " + entry.getValue())
//                .forEach(System.out::println);

//        BookDirectory bookDirectory = new BookDirectory();
//        String theResultStringOfBooks = bookDirectory.getList().stream()
//                .filter(book -> book.getYearOfPublication() > 2005)
//                .map(Book::toString)
//                .collect(Collectors.joining(",\n", "<<", ">>"));
//
//        System.out.println(theResultStringOfBooks);

        Forum forum = new Forum();
        Map<Integer, ForumUser> userForumUserMap = forum.getUserList().stream()
                .filter(user -> user.getSex() == 'M')
                .filter(user -> (Period.between(user.getDateOfBirth(), LocalDate.now())).getYears() >= 20)
                .filter(user -> user.getPostPublished() > 0)
                .collect(Collectors.toMap(ForumUser::getUserId, ForumUser -> ForumUser));

        System.out.println("Size of the filtered forum: " + userForumUserMap.size());
        userForumUserMap.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}
