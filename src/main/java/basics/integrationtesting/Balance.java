package basics.integrationtesting;

import java.util.Arrays;

public class Balance {
    protected int totalBalance(int[] data) {
        int total = (Arrays.stream(data).sum());
        System.out.println("Your total balance is: " + Arrays.stream(data).sum() + " Euro");
        return total;
    }
}


