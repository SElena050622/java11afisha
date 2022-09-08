package ru.netology.afisha;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AfishaTest {

    @Test
    public void shouldAfishaAll() {
        Afisha afisha = new Afisha();

        afisha.add("Film 1");
        afisha.add("Film 2");
        afisha.add("Film 3");
        afisha.add("Film 4");
        afisha.add("Film 5");
        afisha.add("Film 6");
        afisha.add("Film 7");
        afisha.add("Film 8");
        afisha.add("Film 9");
        afisha.add("Film 10");

        String[] expected = { "Film 1", "Film 2", "Film 3", "Film 4", "Film 5", "Film 6", "Film 7", "Film 8", "Film 9", "Film 10" };
        String[] actual = afisha.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void shouldAfisha10Last() {
        Afisha afisha = new Afisha();

        afisha.add("Film 1");
        afisha.add("Film 2");
        afisha.add("Film 3");
        afisha.add("Film 4");
        afisha.add("Film 5");
        afisha.add("Film 6");
        afisha.add("Film 7");
        afisha.add("Film 8");
        afisha.add("Film 9");
        afisha.add("Film 10");

        String[] expected = { "Film 10", "Film 9", "Film 8", "Film 7", "Film 6", "Film 5", "Film 4", "Film 3", "Film 2", "Film 1" };
        String[] actual = afisha.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAfisha11() {
        Afisha afisha = new Afisha();

        afisha.add("Film 1");
        afisha.add("Film 2");
        afisha.add("Film 3");
        afisha.add("Film 4");
        afisha.add("Film 5");
        afisha.add("Film 6");
        afisha.add("Film 7");
        afisha.add("Film 8");
        afisha.add("Film 9");
        afisha.add("Film 10");
        afisha.add("Film 11");

        String[] expected = { "Film 11", "Film 10", "Film 9", "Film 8", "Film 7", "Film 6", "Film 5", "Film 4", "Film 3", "Film 2" };
        String[] actual = afisha.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAfisha6Last() {
        Afisha afisha = new Afisha();

        afisha.add("Film 5");
        afisha.add("Film 6");
        afisha.add("Film 7");
        afisha.add("Film 8");
        afisha.add("Film 9");
        afisha.add("Film 10");

        String[] expected = { "Film 10", "Film 9", "Film 8", "Film 7", "Film 6", "Film 5" };
        String[] actual = afisha.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAfishaNot() {
        Afisha afisha = new Afisha();

        String[] expected = {  };
        String[] actual = afisha.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }


}
