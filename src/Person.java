public class Person {
    private String name;
    private int apples;
    public Person(String name, int apples) {
        this.name=name;
        this.apples=apples;
    }

    public String getName() {
        return name;
    }
    public int getApples() {
        return apples;
    }
    public int countDifference(Person person) {
        return  this.apples-person.getApples();
    }
}

