import org.junit.*;
import static org.junit.Assert.*;

public class AppTest {

  @Test
  public void numberToWord_forOneDigitNumber_seven() {
    App app = new App();
    assertEquals("seven", app.numberToWord(7));
  }

  @Test
  public void numberToWord_forTwoDigitNumber_fortytwo() {
    App app = new App();
    assertEquals("forty-two", app.numberToWord(42));
  }
  
}
