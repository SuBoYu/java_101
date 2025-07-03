public class Person {
    private String name;
    private int age;
    private int weight;
    private int height;

    public Person(String name, int age) {
        this.age = age;
        this.name = name;
        this.weight = 0;
        this.height = 0;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void growOlder() {
        if (this.age < 30) {
            this.age = this.age + 1;
        }
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

}