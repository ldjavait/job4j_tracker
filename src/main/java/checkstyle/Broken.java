package checkstyle;

public class Broken {
    public static final String VALUE = "";
    private final int sizeOfEmpty = 10;
    private String name;
    private String surname;

    Broken() {
    }

    public void echo() {
    }

    public void media(Object obj) {
        if (obj != null) {
            System.out.println(obj);
        }
    }

    public void method(int a, int b, int c, int d, int e, int f, int g) {
    }
}
