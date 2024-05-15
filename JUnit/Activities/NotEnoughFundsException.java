public class NotEnoughFundsException extends Exception {

    public NotEnoughFundsException(Integer amount, Integer balance) {
        System.out.println("Exception!! Not enough fund in your account ");
        System.out.println("Balance is: "+balance);
    }
}
