/** Recreate OSU's email account system.
 *
 * Each student is assigned an email address with the following format: "name.N@osu.edu"
 * where N is a positive integer that ensures uniqueness of each email address for cases where
 * students have the same name.
 *
 *
 * Created by Christie on 6/5/2017.
 */
public interface EmailAccount {
    /**
     * Returns full name of email account's owner
     * @return full name
     */
    String name();

    /**
     * Returns email address
     * @return email address
     */
    String emailAddress();

    /**
     * Returns a string representation of the email account
     * @return a representation of this
     * toString = "Name: " * [full name] * ", Email: " * [email address]
     */
    @Override
    String toString();
}
