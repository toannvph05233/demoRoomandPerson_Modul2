import java.util.Scanner;

public class Manager {
    private Person[] arrPerson = new Person[0];
    private Room[] arrRoom = new Room[0];

    public Person[] createPerson() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên :");
        String name = scanner.nextLine();
        System.out.println("Nhập ngày sinh :");
        String date = scanner.nextLine();
        System.out.println("Nhập Chứng minh thư :");
        String id = scanner.nextLine();

        Person[] newPerson = new Person[arrPerson.length + 1];
        for (int i = 0; i < arrPerson.length; i++) {
            newPerson[i] = arrPerson[i];
        }
        newPerson[newPerson.length - 1] = new Person(name, date, id);
        return newPerson;


    }

    public Room[] createRoom() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên phòng:");
        String name = scanner.nextLine();
        System.out.println("Nhập ngày thuê phòng :");
        int day = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập giá phòng :");
        int price = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập kiểu phòng:");
        String type = scanner.nextLine();

        Room[] newRoom = new Room[arrRoom.length + 1];
        for (int i = 0; i < arrRoom.length; i++) {
            newRoom[i] = arrRoom[i];
        }
        newRoom[newRoom.length - 1] = new Room(name, day, price, type);
        return newRoom;

    }

    public Room fillRoomByName(String name) {
        for (Room r : arrRoom) {
            if (r.getNameRoom().equals(name)) {
                return r;
            }
        }
        return null;
    }

    public Person fillPersonByName(String name) {
        for (Person p : arrPerson) {
            if (p.getName().equals(name)) {
                return p;
            }
        }
        return null;
    }

    public void showRoom() {
        for (Room r : arrRoom) {
            System.out.println(r);
        }
    }

    public int menuShow() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Thêm Người");
        System.out.println("2. Thêm Phòng");
        System.out.println("3. Thuê Phòng");
        System.out.println("4. Show Phòng");
        System.out.println("5. Exit");

        int choose = Integer.parseInt(scanner.nextLine());
        return choose;
    }

    public static void main(String[] args) {
        Manager manager = new Manager();
        Scanner scanner = new Scanner(System.in);
        do {
            int choose = manager.menuShow();
            switch (choose) {
                case 1:
                    manager.arrPerson = manager.createPerson();
                    break;
                case 2:
                    manager.arrRoom = manager.createRoom();
                    break;
                case 3:
                    System.out.println("Nhập tên phòng cần thuê :");
                    Room room = manager.fillRoomByName(scanner.nextLine());
                    if (room != null) {
                        System.out.println("Nhập tên người muốn thuê :");
                        Person person = manager.fillPersonByName(scanner.nextLine());

                        room.setPeople(person);
                    } else {
                        System.out.println("phòng không tồn tại");
                    }
                    break;
                case 4:
                    manager.showRoom();
                    break;
                case 5:
                    return;
            }
        } while (true);
    }
}
