import java.util.HashMap;

public class PhoneBook {
    HashMap<Integer, String> phoneNumbers = new HashMap<>();
    public int add(Integer phoneNumber, String name){
        if (phoneNumbers.containsKey(name)) {
            return (-1);
        } else {
            phoneNumbers.put(phoneNumber, name);
            System.out.println(phoneNumbers.size());
            return phoneNumbers.size();
        }
    }
    public String findByNumber(Integer phoneNumber) {
        if (phoneNumbers.containsKey(phoneNumber)) {
            return (phoneNumbers.get(phoneNumber));
        } else {
            return null;
        }
    }
}
