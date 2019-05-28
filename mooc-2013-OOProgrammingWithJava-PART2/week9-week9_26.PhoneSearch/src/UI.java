import java.util.*;

public class UI {
    private Scanner reader;
    private Phonebook phonebook;

    public void add() {
        System.out.println("whose number: ");
        String name = reader.nextLine();
        System.out.println("number: ");
        String number = reader.nextLine();
        phonebook.add(name, number);
    }

    public void search() {
        System.out.println("whose number: ");
        String name = reader.nextLine();
        Set<String> result = phonebook.search(name);
        printPhone(result);
    }

    public void searchByNumber() {
        System.out.println("number: ");
        String number = reader.nextLine();
        String name = phonebook.searchByNumber(number);
        if (name == null) {
            System.out.println(" not found");
        } else {
            System.out.println(" " + name);
        }
    }

    public void setAddress() {
        System.out.println("whose address: ");
        String name = reader.nextLine();
        System.out.println("street: ");
        String street = reader.nextLine();
        System.out.println("city: ");
        String city = reader.nextLine();
        phonebook.setAddress(name, street, city);
    }

    public void getInfo() {
        System.out.println("whose information: ");
        String name = reader.nextLine();
        Set<String> result = phonebook.search(name);
        String address = phonebook.getAddress(name);

        if(address.equals("") && result == null) {
            System.out.println("  not found");
        } else {
            printAddress(address);
            printPhone(result);
        }
    }

    public void removeInfo() {
        System.out.println("whose information: ");
        String name = reader.nextLine();
        phonebook.removeInfo(name);
    }

    public void filteredSearch() {
        System.out.println("keyword (if empty, all listed): ");
        String keyword = reader.nextLine();
        List<Person> matched = phonebook.filteredSearch(keyword);
        if (matched.size() == 0) {
            System.out.println(" keyword not found");
        } else {
            for (Person p : matched) {
                String address = p.getAddress();
                Set<String> result = p.getPhone();

                System.out.println(" " + p.getName());
                printAddress(address);
                printPhone(result);
            }
        }
    }

    public void printPhone(Set<String> phone) {
        if (phone == null) {
            System.out.println("  phone number not found");
        } else {
            for (String s : phone) {
                System.out.println(" " + s);
            }
        }
    }

    public void printAddress(String address) {
        if (address.equals("")) {
            System.out.println("  address unknown");
        } else {
            System.out.println("  address: " + address);
        }
    }

    public void start(Scanner reader) {
        this.reader = reader;
        phonebook = new Phonebook();

        while (true) {
            String menu = "phone search\n" + "available operations:\n" + " 1 add a number\n" +
                    " 2 search for a number\n" + " 3 search for a person by phone number\n" +
                    " 4 add an address\n" + " 5 search for personal information\n" +
                    " 6 delete personal information\n" + " 7 filtered listing\n" + " x quit";
            System.out.println(menu);
            String command = reader.nextLine();

            if(command.equals("x")) break;
            switch (Integer.parseInt(command)) {
                case 1: add();
                        break;
                case 2: search();
                        break;
                case 3: searchByNumber();
                        break;
                case 4: setAddress();
                        break;
                case 5: getInfo();
                        break;
                case 6: removeInfo();
                        break;
                case 7: filteredSearch();
                        break;
            }
        }
    }
}