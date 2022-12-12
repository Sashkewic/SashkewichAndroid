package dog;

public class Main {
    public static void main(String[] args) {
        Dog sheepdog = new Dog("Валерон", 17.0); // создали взрослую собаку
        System.out.println(sheepdog);
        sheepdog.vote(); // дали команду собаке "Гав-гав!"

        Puppy sheepdogPuppy = new Puppy("Филя", 1.5); // создали щенка собаки
        System.out.println(sheepdogPuppy);
        sheepdogPuppy.puppyVote(); // дали команду щенка "Гав-гав!"
    }
}
