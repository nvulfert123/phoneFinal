import java.util.HashMap;

public class PhoneBook {
    public int add(Integer phoneNumber, String name){
        HashMap<Integer, String> phoneNumbers = new HashMap<>();
        if (phoneNumbers.containsKey(name)) {
            return (-1);
        } else {
            phoneNumbers.put(phoneNumber, name);
            System.out.println(phoneNumbers.size());
            return phoneNumbers.size();
        }
    }
}
