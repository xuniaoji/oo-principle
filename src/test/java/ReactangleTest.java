import org.junit.Test;



import static org.junit.Assert.assertEquals;

public class ReactangleTest {
    @Test
    public void shouldReturn200WhenExecuteSettingWidth200AndExcuteGetWidthGivenWidth100(){
        RectangleTDD rectangle = new RectangleTDD(100);
        rectangle.setWidth(200);
        assertEquals(200,rectangle.getWidth());
    }
}
