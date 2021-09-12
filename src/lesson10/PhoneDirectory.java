package lesson10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneDirectory {

    private final Map<String, List<String>> PD = new HashMap<>();
    List<String> phoneNumbers = new ArrayList<>();

    public void add(String surname, String phoneNumber) {
        if (PD.containsKey(surname)){
            phoneNumbers = PD.get(surname);
        } else {
            phoneNumbers = new ArrayList<>();
        }
        phoneNumbers.add(phoneNumber);
        PD.put(surname, phoneNumbers);
    }

    public List<String> get(String surname) {
       return PD.get(surname);
    }
}
