import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.*;

public class MyRangeTest {
    @Test
    @DisplayName("ข้อมูล [1,5] นั้นจะขึ้นต้นด้วย [ (include) และเลขตัวแรกคือ 1 ผลคือ 1")
    public void startNumberWithInclude() {
        MyRange myRange = new MyRange("[1,5]");
        int result = myRange.getStart();
        assertEquals(1, result);
    }
    @Test
    @DisplayName("ข้อมูล (1,5] นั้นจะขึ้นต้นด้วย ( (include) และเลขตัวแรกคือ 1 ผลคือ 2")
    public void startNumberWithExclude() {
        MyRange myRange = new MyRange("[1,5]");
        int result = myRange.getStart();
        assertEquals(1, result);
    }
    @Test
    @DisplayName("ข้อมูล [1,5] นั้นจะขึ้นต้นด้วย [ (include) ผลคือ true")
    public void startWithInclude() {
        MyRange myRange = new MyRange("[1,5]");
        boolean result = myRange.isStartWithInclude();
        assertTrue(result);
    }
    @Test
    @DisplayName("ข้อมูล (1,5] นั้นจะขึ้นต้นด้วย [ (Exclude) ผลคือ false")
    public void startWithExclude() {
        MyRange myRange = new MyRange("(1,5]");
        boolean result = myRange.isStartWithInclude();
        assertFalse(result);
    }
    @Test
    @DisplayName("ข้อมูล [1,5] นั้นจะลงท้ายด้วย ) (include) ผลคือ true")
    public void endWithInclude() {
        MyRange myRange = new MyRange("[1,5]");
        boolean result = myRange.isEndWithInclude();
        assertTrue(result);
    }
    @Test
    @DisplayName("ข้อมูล [1,5) นั้นจะลงท้ายด้วย ) (Exclude) ผลคือ false")
    public void endWithExclude() {
        MyRange myRange = new MyRange("[1,5)");
        boolean result = myRange.isEndWithInclude();
        assertFalse(result);
    }
    @Test
    @DisplayName("ข้อมูล [1,5] นั้นจะลงท้ายด้วย [ (include) และเลขตัวสุดท้ายคือ 5 ผลคือ 5")
    public void endNumberWithInclude() {
        MyRange myRange = new MyRange("[1,5]");
        int result = myRange.getEnd();
        assertEquals(5, result);
    }
    @Test
    @DisplayName("ข้อมูล [1,5) นั้นจะลงท้ายด้วย ) (exclude) และเลขตัวสุดท้ายคือ 5 ผลคือ 4")
    public void endNumberWithExclude() {
        MyRange myRange = new MyRange("[1,5)");
        int result = myRange.getEnd();
        assertEquals(4, result);
    }
    @Test
    public void case01(){
        MyRange myRange = new MyRange("[1,5]");
        String result = myRange.getResult();
        assertEquals("1,2,3,4,5",result);
    }
}
