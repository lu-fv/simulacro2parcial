import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Person implements Serializable {
    private String _id;
   // private boolean isActive;
    private String balance;
    private String eyeColor;
    private String name;
    private String gender;
    private List<Tags> tags;

    private List<friends> friendsList = new ArrayList<>();
    public Person() {
    }

    public Person(String _id, String balance, String eyeColor, String name, String gender, List<Tags> tags, List<friends> friendsList) {
        this._id = _id;
        this.balance = balance;
        this.eyeColor = eyeColor;
        this.name = name;
        this.gender = gender;
        this.tags = tags;
        this.friendsList = friendsList;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

  /*  public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }*/

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<Tags> getTags() {
        return tags;
    }

    public void setTags(List<Tags> tags) {
        this.tags = tags;
    }

    public List<friends> getFriends() {
        return friendsList;
    }

    public void setFriends(List<friends> friendsList) {
        this.friendsList = friendsList;
    }

    @Override
    public String toString() {
        return "Person" +"\n" +
                "_id='" + _id + '\'' +
                ", balance='" + balance + '\'' +
                ", eyeColor='" + eyeColor + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", tags=" + tags +
                ", friendsList=" + friendsList +
                '}' +"\n";
    }


}
