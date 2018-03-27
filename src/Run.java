public class Run {
    public static void main(String[] args) {
    Person vasia = new Person("Vasia", 5);
    Person peter = new Person("Peter", 5);
    vasia.countDifference(peter);
    }
    public static int countDifferenceBetweenPersons(Person p1, Person p2) {
        return p1.getApples()-p2.getApples();
    }
}
