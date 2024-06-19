import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class People {

    private String pathname;

    List<Person> personList = new ArrayList<>();
    List<String> male = new ArrayList<>();
    List<String> female = new ArrayList<>();
    HashMap<String, String> personMap = new HashMap<>();

    public People(String pathname) {
        this.pathname = pathname;
    }

    private void LevantarJson() {
        try {
            ObjectMapper mapper = new ObjectMapper();
            personList = mapper.readValue(new File(this.pathname), new TypeReference<List<Person>>() {
            });
        } catch (StreamReadException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Person> GetAlist() {
        this.LevantarJson();
        return personList;
    }

    public void ShowJson() {
        System.out.println(personList);
    }

    public void ListGender() {

        try {
            for (Person p : personList) {
                if (p.getGender().trim().equals("male".trim())) {
                    male.add(p.getName());
                } else {
                    female.add(p.getName());
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void ShowListGender() {
        System.out.println("MALE" + male);
        System.out.println("FEMALE" + female);
    }
    public void ListFriends() {

        for ( Person p : personList){
            personMap.put(p.getName(), p.getEyeColor());
        }
    }
    public void ShowFriends(){


            System.out.println(personMap);

    }
}
