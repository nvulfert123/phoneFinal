import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PhoneBookTest {
    private PhoneBook phoneBook;
    @BeforeEach
    void setUp(){
        phoneBook = new PhoneBook();
    }
    @Test
    void phoneBookAddTest1(){
        int a = phoneBook.add(999, "Nikita");
        Assertions.assertEquals(0, 1);
    }

}
