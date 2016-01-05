import org.junit.*;
import static org.junit.Assert.*;

public class AppTest {

  @Test
  public void numberToWord_forOneDigitNumber_seven() {
    App app = new App();
    assertEquals("seven", app.numberToWord(7));
  }
}
