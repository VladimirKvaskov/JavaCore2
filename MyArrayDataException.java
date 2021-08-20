package TwoLesson2;

public class MyArrayDataException extends NumberFormatException {
    public int i;
    public int t;

    public MyArrayDataException( int i, int t) {
        super();
        this.i = i+1;
        this.t = t+1;
    }
    public MyArrayDataException(String message, int i, int t) {
        super(message);
        this.i = i+1;
        this.t = t+1;
    }
}
