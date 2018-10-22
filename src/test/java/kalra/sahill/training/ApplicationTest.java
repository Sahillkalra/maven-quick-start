package kalra.sahill.training;

import kalra.sahill.training.Application;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;

public class ApplicationTest {
    private static Application app;
    
    @BeforeClass
    public static void setup() {
        app = new Application();
    }
    
    
    @Test
    public void testWordCountString() {
        int count = app.countWords("this is a test");
        assertTrue(count == 4);
    }

    @Test
    public void testWordCountEmpty() {
        int count = app.countWords("");
        assertTrue(count == 0);
    }

    @Test
    public void testWordCountNull() {
        int count = app.countWords(null);
        assertTrue(count == 0);
    }

    @Test
    @Ignore
    public void testWordCountMore() {
        int count = app.countWords("this will be skipped");
        assertTrue(count == 3);
    }

    @Test
    public void testWordCountSingle() {
        int count = app.countWords("test");
        assertTrue(count == 1);
    }
}