/**
 * Program to exercise EmailAccount functionality
 *
 * Created by Christie on 6/5/2017.
 */
public final class EmailAccountMain {

    public static void main (String[] args){
        EmailAccount myAccount = new EmailAccount1("Christie", "Brandao");

        System.out.println(myAccount.name());
        System.out.println(myAccount.emailAddress());
        System.out.println(myAccount);
    }
}
