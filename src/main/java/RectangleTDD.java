public class RectangleTDD {
    int width;

    public RectangleTDD(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) throws Exception {
        if (width<0) {
            throw new Exception("invalid number");
        }
        this.width = width;
    }
}
