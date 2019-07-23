import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SquareTest {

    @Test
    public void shouldReturn200WhenExecuteSettingLength200AndExcuteGetLengthGivenLength100() {
        Square square = new Square(100);
        try {
            square.setLength(200);
            assertEquals(200, square.getLength());
        } catch (Exception e) {}
    }

}
