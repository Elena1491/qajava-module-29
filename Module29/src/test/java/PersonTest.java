
import  org.example.Person;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.testng.Assert.*;

public class PersonTest {

    public void currentTime() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now =  LocalDateTime.now();
        System.out.println(dtf.format(now));
    }
    @BeforeClass
    void BeforeClass(){
        System.out.println("Before Class");
        currentTime();
    }

    @Test(testName = "isYangUser", description = "Еще мал 12")
    public void isYangUser() {
        boolean result = Person.isTeenager(12);
        assertFalse(result, "Тест - isYangUser.Еще мал 12");
    }

    @Test(testName = "isStartTeenagerUser", description = "Отлично - подросток 13")
    public void isStartTeenagerUser() {
        boolean result = Person.isTeenager(13);
        assertTrue(result, "Тест - isStartTeenagerUser.Отлично - подросток 13");
    }

    @Test(testName = "isTeenagerUser", description = "Отлично - подросток 15")
    public void isTeenagerUser() {
        boolean result = Person.isTeenager(15);
        assertTrue(result, "Тест - isTeenagerUser.Отлично - подросток 15");
    }

    @Test(testName = "isFinishUser", description = "Отлично - подросток 19")
    public void isFinishUser() {
        boolean result = Person.isTeenager(19);
        assertTrue(result, "Тест - isFinishUser.Отлично - подросток 19");
    }

    @Test(testName = "isOldUser", description = "Уже большой 20")
    public void isOldUser() {
        boolean result = Person.isTeenager(20);
        assertFalse(result, "Тест - isOldUser.Уже большой 20");
    }
    @AfterClass
    void AfterClass(){
        System.out.println("After Class");
        currentTime();
    }
}
