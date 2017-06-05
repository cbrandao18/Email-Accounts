import java.util.HashMap;
import java.util.Map;

/**
 * Created by Christie on 6/5/2017.
 */
public final class EmailAccount1 implements EmailAccount {

    /*
     * Private members
     */
    private Map<String, Integer> nameCount = new HashMap<>();
    private String firstName;
    private String lastName;
    private int dotNum;

    /*
     * Constructor
     */
    public EmailAccount1(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        if (this.nameCount.containsKey(lastName)){
            int dotNum = this.nameCount.get(lastName);
            dotNum++;
            this.dotNum = dotNum;
            this.nameCount.replace(lastName, dotNum);
        } else {
            this.nameCount.put(lastName, 1);
            this.dotNum = 1;
        }
    }

    /*
     * Methods
     */
    @Override
    public String name(){
        return this.firstName + " " + this.lastName;
    }

    @Override
    public String emailAddress() {
        return this.lastName + "." + this.dotNum + "@osu.edu";
    }

    @Override
    public String toString(){
        return "Name: " + this.firstName + " " + this.lastName + ", Email: " + this.lastName + "." + this.dotNum + "@osu.edu";
    }
}
