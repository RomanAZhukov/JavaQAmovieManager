
package ru.netology.movie;


        import org.junit.jupiter.api.Assertions;

        import org.junit.jupiter.api.Test;


public class MoviesTest {

    @Test
    public void testAdd() {
        MoviesManager manager = new MoviesManager();
        manager.add("one");
        manager.add("two");
        manager.add("three");
        manager.add("four");
        manager.add("five");
        manager.add("six");
        manager.add("seven");
        manager.add("eight");
        manager.add("nine");
        manager.add("ten");
        String[] expected = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);


    }

    @Test
    public void testFindLast() {
        MoviesManager manager = new MoviesManager();
        manager.add("one");
        manager.add("two");
        manager.add("three");
        manager.add("four");
        manager.add("five");
        manager.add("six");
        manager.add("seven");
        manager.add("eight");
        manager.add("nine");
        manager.add("ten");

        String[] expected = {"ten", "nine", "eight", "seven", "six", "five", "four", "three", "two", "one"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);


    }

    @Test
    public void testFindLastOverLimit() {
        MoviesManager manager = new MoviesManager(12);
        manager.add("under zero");
        manager.add("zero");
        manager.add("one");
        manager.add("two");
        manager.add("three");
        manager.add("four");
        manager.add("five");
        manager.add("six");
        manager.add("seven");
        manager.add("eight");
        manager.add("nine");
        manager.add("ten");


        String[] expected = {"ten", "nine", "eight", "seven", "six", "five", "four", "three", "two", "one", "zero", "under zero"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);


    }

    @Test
    public void testFindLastUnderLimit() {
        MoviesManager manager = new MoviesManager(5);

        manager.add("one");
        manager.add("two");
        manager.add("three");
        manager.add("four");
        manager.add("five");
        manager.add("six");
        manager.add("seven");
        manager.add("eight");
        manager.add("nine");
        manager.add("ten");


        String[] expected = {"ten", "nine", "eight", "seven", "six"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}