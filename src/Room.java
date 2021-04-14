public class Room {
    private String nameRoom;
    private Person people;
    private int day;
    private int price;
    private String typeOfRoom;

    public Room() {
    }

    public Room(String nameRoom, Person people, int day, int price, String typeOfRoom) {
        this.nameRoom = nameRoom;
        this.people = people;
        this.day = day;
        this.price = price;
        this.typeOfRoom = typeOfRoom;
    }
    public Room(String nameRoom, int day, int price, String typeOfRoom) {
        this.nameRoom = nameRoom;
        this.day = day;
        this.price = price;
        this.typeOfRoom = typeOfRoom;
    }

    public String getNameRoom() {
        return nameRoom;
    }

    public void setNameRoom(String nameRoom) {
        this.nameRoom = nameRoom;
    }

    public Person getPeople() {
        return people;
    }

    public void setPeople(Person people) {
        this.people = people;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTypeOfRoom() {
        return typeOfRoom;
    }

    public void setTypeOfRoom(String typeOfRoom) {
        this.typeOfRoom = typeOfRoom;
    }

    @Override
    public String toString() {
        return "Room{" +
                "nameRoom='" + nameRoom + '\'' +
                ", people=" + people +
                ", day=" + day +
                ", price=" + price +
                ", typeOfRoom='" + typeOfRoom + '\'' +
                '}';
    }
}
