
package artshop_305;
import java.util.ArrayList;
public class Administrator {
    private String userName= "kadog";
    private String password= "1234";
    private String name= "Khadejah";
    static ArrayList<Item> items;

//CONSREUCTOR
//    public Administrator(String userName, String password, String name) {
//        this.userName = userName;
//        this.password = password;
//        this.name = name;
//    }

//SETTERS AND GETTERS
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
