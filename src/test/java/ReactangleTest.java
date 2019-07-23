import org.junit.Test;



import static org.junit.Assert.assertEquals;

public class ReactangleTest {
    @Test
    public void shouldReturn200WhenExecuteSettingWidth200AndExcuteGetWidthGivenWidth100(){
        RectangleTDD rectangle = new RectangleTDD(100);
        try {
            rectangle.setWidth(200);
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertEquals(200,rectangle.getWidth());
    }

    @Test
    public void shouldThrowErrorWhenExecuteSettingWidthMinus200AndExcuteGetWidthGivenWidth100(){
        RectangleTDD rectangle = new RectangleTDD(100);
        try {
            rectangle.setWidth(-200);
        } catch (Exception e) {
            e.printStackTrace();
            assertEquals("invalid number",e.getMessage());
        }
    }

    @Test
    public void should0WhenExecuteSettingWidth0AndExcuteGetWidthGivenWidth100(){
        RectangleTDD rectangle = new RectangleTDD(100);
        try {
            rectangle.setWidth(0);
        } catch (Exception e) {
            e.printStackTrace();
            assertEquals(0,rectangle.getWidth());
        }
    }
}
