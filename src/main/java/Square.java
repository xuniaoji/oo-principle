public class Square extends Rectangle {

    public Square(int length) {
        super(length, length);
    }

    public int getLength() {
        return super.getHeight();
    }

    public void setLength(int length) throws Exception {
        super.setWidth(length);
        super.setHeight(length);
    }

    @Override
    public int getArea() {
        return super.getArea();
    }
}
