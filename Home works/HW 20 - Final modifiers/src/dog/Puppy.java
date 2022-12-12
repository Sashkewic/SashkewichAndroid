package dog;

public class Puppy extends Dog{

    public Puppy(String name, double weight) {
        super(name, weight); //
    }

    public void puppyVote() {
        System.out.println("Гав-гав!" + "\n");
    }

    @Override
    public String toString() {
        return "Имя щенка: " + this.name + "\n" +
                "Вес щенка: " + this.weight;
    }
}
