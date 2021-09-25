package lesson10;

import java.util.*;

public class PhoneDirectory {

    private final Map<String, ArrayList<String>> PD = new HashMap<>();

    public void add(String surname, String phoneNumber) {
        if (PD.containsKey(surname)){
             PD.get(surname).add(phoneNumber);
        } else {
            PD.put(surname, new ArrayList<>(Arrays.asList(phoneNumber)));
        }

    }

    public List<String> get(String surname) {
       return PD.get(surname);
    }
}
