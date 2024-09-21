package com.kodilla.stream;

import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;


import java.time.LocalDate;
import java.time.Period;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {
        Forum theForum = new Forum();
        Map<Integer, ForumUser> resultMapOfUsers = theForum.getList().stream()
                .filter(user -> user.getGender() == 'M')
                .filter(user -> Period.between(user.getBirthday(), LocalDate.now()).getYears() >= 20)
                .filter(user -> user.getNumberOfPosts() > 0)
                .collect(Collectors.toMap(ForumUser::getUserId, user -> user));

        resultMapOfUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}

//STARE STREAMMAIN
//ExpressionExecutor expressionExecutor = new ExpressionExecutor();
//
//        System.out.println("Calculating expressions with lambdas");
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);
//
//        System.out.println("Calculating expressions with method references");
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);
//
//PoemBeautifier poemBeautifier = new PoemBeautifier();
//
//        System.out.println("Sample Text");
//        poemBeautifier.beautify("Sample Text", text -> "ABC" + text + "ABC");
//        poemBeautifier.beautify("Sample Text", String::toUpperCase);
//        poemBeautifier.beautify("Sample Text", String::toLowerCase);
//        poemBeautifier.beautify("Sample Text", text -> text + text);
//
//        System.out.println("Using Stream to generate even numbers from 1 to 20");
//        NumbersGenerator.generateEven(20);


//package com.kodilla.stream;
//
//import com.kodilla.stream.person.People;
//
//public class StreamMain {
//
//    public static void main(String[] args) {
//        People.getList().stream()
//                .map(String::toUpperCase)                             // [1]
//                .filter(s -> s.length() > 11)                         // [2]
//                .map(s -> s.substring(0, s.indexOf(' ') + 2) + ".")   // [3]
//                .filter(s -> s.substring(0, 1).equals("M"))           // [4]
//                .forEach(System.out::println);                        // [5]
//    }
//}


//package com.kodilla.stream;
//
//import com.kodilla.stream.book.BookDirectory;
//
//public class StreamMain {
//
//    public static void main(String[] args) {
//        BookDirectory theBookDirectory = new BookDirectory();
//        theBookDirectory.getList().stream()
//                .filter(book -> book.getYearOfPublication() > 2005)
//                .forEach(System.out::println);
//    }
//}
