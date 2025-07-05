public class Person {
    private String name;
    private int age;
    private int weight;
    private int height;

    public Person(String name) {
        this(name, 0);
    }

    public Person(String name, int age) {
        this.age = age;
        this.name = name;
        this.weight = 0;
        this.height = 0;
    }

    public void printPerson() {
        System.out.println(this.name + " is " + this.age + " years old");
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWeight() {
        return this.weight;
    }

    public void growOlder() {
        this.age = this.age + 1;
    }

    public void growOlder(int years) {
        this.age = this.age + years;
    }

    public boolean isAdult() {
        if (this.age < 18) {
            return false;
        }
        return true;
    }

    public void setHeight(int newHeight) {
        this.height = newHeight;
    }

    public void setWeight(int newWeight) {
        this.weight = newWeight;
    }

    public double bodyMassIndex() {
        double heightDivByHundred = this.height / 100.0;
        return this.weight / (heightDivByHundred * heightDivByHundred);
    }

    @Override
    public String toString() {
        return this.name + ", age " + this.age + " years";
    }

    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }

        if (!(compared instanceof Person)) {
            return false;
        }

        Person comparedPerson = (Person) compared;

        if (this.name.equals(comparedPerson.name) &&
                this.age == comparedPerson.age &&
                this.weight == comparedPerson.weight &&
                this.height == comparedPerson.height) {
            return true;
        }
        return false;
    }
}