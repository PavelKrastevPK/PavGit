package basics.integrationtesting;

public class Transfer extends Balance {

    protected void transferMoney(int[] data, int enterValueToTransfer) {
        int transaction = (totalBalance(data)-enterValueToTransfer);
        System.out.println("You have transferred: "+enterValueToTransfer+" Euro"
                + "\nYour remaining balance is: "+transaction+" Euro");
    }
}
