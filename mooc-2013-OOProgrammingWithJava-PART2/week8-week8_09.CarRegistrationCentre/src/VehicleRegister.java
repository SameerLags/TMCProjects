import java.util.HashMap;
import java.util.ArrayList;

public class VehicleRegister {
    private HashMap<RegistrationPlate, String> register;

    public VehicleRegister() {
        this.register = new HashMap<RegistrationPlate, String>();
    }

    public boolean add(RegistrationPlate plate, String owner) {
        if (this.register.get(plate) == null) {
            this.register.put(plate, owner);
            return true;
        }
        return false;
    }

    public String get(RegistrationPlate plate) {
        return this.register.get(plate);
    }

    public boolean delete(RegistrationPlate plate) {
        if (this.register.remove(plate) == null) {
            return false;
        }
        return true;
    }

    public void printRegistrationPlates() {
        for (RegistrationPlate plate:register.keySet()) {
            System.out.println(plate);
        }
    }

    public void printOwners() {
        ArrayList<String> owners= new ArrayList<String>();
        for (RegistrationPlate plate:register.keySet()) {
            String owner = register.get(plate);
            if (!owners.contains(owner)) {
                owners.add(owner);
            }
        }
        for (String owner:owners)
            System.out.println(owner);
    }
}