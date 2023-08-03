import static org.junit.jupiter.api.Assertions.assertEquals;

import codefinity.Child;
import org.junit.jupiter.api.Test;

public class ChildTest {

    @Test
    public void testMethodOverride() {
        Child child = new Child();
        String result = child.method();
        assertEquals("This is the overrided method!", result);
    }

    @Test
    public void testMethodOverload() {
        Child child = new Child();
        String result = child.method(5);
        assertEquals("This is the overloaded method with int parameter: 5", result);
    }
}
