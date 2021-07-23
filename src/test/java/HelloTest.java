import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloTest {
    @Test
    public void case01(){
        // Arrange
        Hello hello = new Hello();
        String name = "Ton";
        // Act
        String actualresult = hello.sawadee(name);
        // Assert
        assertEquals("Hello Ton",actualresult);
    }
}