package basics.integrationtesting;

public class Test {
    public static void main(String[] args) {
        Database database = new Database();
        database.intDatabase();
        Transfer transfer = new Transfer();
        transfer.transferMoney(database.numbers(),12);
    }
}
