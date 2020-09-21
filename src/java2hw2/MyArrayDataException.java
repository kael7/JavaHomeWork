package java2hw2;

public class MyArrayDataException extends IllegalArgumentException{
    private String[][] value;

    public MyArrayDataException(String[][] value) {
        this.value = value;
    }

    public MyArrayDataException(String s, String[][] value) {
        super(s);
        this.value = value;
    }

    public String[][] getValue() {
        return value;
    }
}
