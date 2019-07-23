import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class ReactangleTest {
    @Test
    public void shouldReturn200WhenExecuteSettingWidth200AndExcuteGetWidthGivenWidth100() {
        Rectangle rectangle = new Rectangle(100, 0);
        try {
            rectangle.setWidth(200);
        } catch (Exception e) {}
        assertEquals(200, rectangle.getWidth());
    }

    @Test
    public void shouldThrowErrorWhenExecuteSettingWidthMinus200AndExcuteGetWidthGivenWidth100() {
        Rectangle rectangle = new Rectangle(100, 0);
        try {
            rectangle.setWidth(-200);
        } catch (Exception e) {
            assertEquals("invalid number", e.getMessage());
        }
    }

    @Test
    public void shouldReturn0WhenExecuteSettingWidth0AndExcuteGetWidthGivenWidth100() {
        Rectangle rectangle = new Rectangle(100, 0);
        try {
            rectangle.setWidth(0);
        } catch (Exception e) {}
        assertEquals(0, rectangle.getWidth());
    }

    @Test
    public void shouldReturn100WhenExecuteSettingHeight100AndExcuteGetHeightGivenHeight50() {
        Rectangle rectangle = new Rectangle(0, 50);
        try {
            rectangle.setHeight(100);
        } catch (Exception e) {}
        assertEquals(100, rectangle.getHeight());
    }

    @Test
    public void shouldThrowErrorWhenExecuteSettingHeightMinus200AndExcuteGetHeightGivenHeight100() {
        Rectangle rectangle = new Rectangle(0, 100);
        try {
            rectangle.setHeight(-200);
        } catch (Exception e) {
            assertEquals("invalid number", e.getMessage());
        }
    }

    @Test
    public void shouldReturn0WhenExecuteSettingHeight0AndExcuteGetHeightGivenHeight100() {
        Rectangle rectangle = new Rectangle(0, 100);
        try {
            rectangle.setHeight(0);
        } catch (Exception e) {}
        assertEquals(0, rectangle.getHeight());
    }

    @Test
    public void shouldReturn5000WhenExecuteGetAreaAndGivenWidth100Height50() {
        Rectangle rectangle = new Rectangle(100, 50);
        try {
            assertEquals(5000, rectangle.getArea());
        } catch (Exception e) {}
    }


}
