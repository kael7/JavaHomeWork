package java2hw2;

public class Main {
    private static int maxLength = 4;

    public static void main(String[] args) {
        String[][] str = {
                {"11", "12", "13", "14"},
                {"21", "22", "23", "24"},
                {"31", "32", "33", "34"},
                {"41", "42", "43", "44"}
        };

        System.out.printf("checkArraySize: %s\n", checkArraySize(str));
        System.out.printf("checkArrayNumber: %s\n", checkArrayNumber(str));
        System.out.printf("sumArray: %s\n", sumArray(str));
    }

    public static boolean checkArraySize(String[][] str) throws MyArraySizeException {
        for (int i = 0; i < str.length; i++) {
            if (i >= maxLength || str[i].length != maxLength) {
                throw new MyArraySizeException(str);
            }
        }
        return true;
    }

    public static boolean checkArrayNumber(String[][] str) throws MyArrayDataException {
        if(checkArraySize(str)){
            for (int i = 0; i < str.length; i++) {
                for (int j = 0; j < str.length; j++) {
                    for (int k = 0; k < str[i][j].length(); k++) {
                        if (!Character.isDigit(str[i][j].charAt(k))) {
                            System.out.printf("Error: %s; %d*%d\n", str[i][j], i, j);
                            throw new MyArrayDataException(str);
                        }
                    }
                }
            }
        }
        return true;
    }

    public static int sumArray(String[][] str) {
        int sum = 0;
        if (checkArraySize(str) && checkArrayNumber(str)) {
            for (int i = 0; i < str.length; i++) {
                for (int j = 0; j < str.length; j++) {
                    sum += Integer.parseInt(str[i][j]);
                }
            }
        }
        return sum;
    }
}
