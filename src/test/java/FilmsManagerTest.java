import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilmsManagerTest {
    @Test
    public void shouldAddThreeMovie() {
        FilmsManager manager = new FilmsManager();
        manager.addFilm("Movie1");
        manager.addFilm("Movie2");
        manager.addFilm("Movie3");
        String[] actual = manager.findAll();
        String[] expected = {"Movie1", "Movie2", "Movie3" };
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddOneMovie() {
        FilmsManager manager = new FilmsManager();
        manager.addFilm("Movie1");
        String[] actual = manager.findAll();
        String[] expected = {"Movie1" };
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddZeroMovie() {
        FilmsManager manager = new FilmsManager();
        String[] actual = manager.findAll();
        String[] expected = {};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddThreeMoviePrev() {
        FilmsManager manager = new FilmsManager();
        manager.addFilm("Movie1");
        manager.addFilm("Movie2");
        manager.addFilm("Movie3");
        String[] actual = manager.findLast();
        String[] expected = {"Movie3", "Movie2", "Movie1" };
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddFiveMoviePrevAndLimitFive() {
        FilmsManager manager = new FilmsManager(5);
        manager.addFilm("Movie1");
        manager.addFilm("Movie2");
        manager.addFilm("Movie3");
        manager.addFilm("Movie4");
        manager.addFilm("Movie5");
        String[] actual = manager.findLast();
        String[] expected = {"Movie5", "Movie4", "Movie3", "Movie2", "Movie1" };
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldAddFiveMoviePrevButLimitThree() {
        FilmsManager manager = new FilmsManager(3);
        manager.addFilm("Movie1");
        manager.addFilm("Movie2");
        manager.addFilm("Movie3");
        manager.addFilm("Movie4");
        manager.addFilm("Movie5");
        String[] actual = manager.findLast();
        String[] expected = {"Movie5", "Movie4", "Movie3" };
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldAddThreeMoviePrevButLimitFive() {
        FilmsManager manager = new FilmsManager(5);
        manager.addFilm("Movie1");
        manager.addFilm("Movie2");
        manager.addFilm("Movie3");
        String[] actual = manager.findLast();
        String[] expected = {"Movie3", "Movie2", "Movie1"};
        Assertions.assertArrayEquals(expected, actual);
    }
        @Test
    public void shouldAddThreeFromFiveMoviePrev() {
        FilmsManager manager = new FilmsManager(3);
        manager.addFilm("Movie1");
        manager.addFilm("Movie2");
        manager.addFilm("Movie3");
        manager.addFilm("Movie4");
        manager.addFilm("Movie5");
        String[] actual = manager.findLast();
        String[] expected = {"Movie5", "Movie4", "Movie3"};
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldAddZeroMoviePrev() {
        FilmsManager manager = new FilmsManager();
        String[] actual = manager.findLast();
        String[] expected = {};
        Assertions.assertArrayEquals(expected, actual);
    }

}