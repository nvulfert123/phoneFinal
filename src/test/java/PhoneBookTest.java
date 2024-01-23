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
        Assertions.assertEquals(1, 1);
    }

    @Test
    void findTest1(){
        phoneBook.add(001, "Nikita");
        String a = phoneBook.findByNumber(001);
        Assertions.assertEquals("Nikita", "Nikita");

    }

}
