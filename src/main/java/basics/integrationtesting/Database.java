package basics.integrationtesting;

public class Database {
    protected void intDatabase() {
        int[] a = numbers();
        for (int i = 0; i < a.length; i++) ;
    }

    protected static int[] numbers() {
        int[] arr = {7, 3, 2, 8};
        return arr;
    }
}