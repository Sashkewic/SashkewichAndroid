public class Main {
    public static void main(String[] args) {
        // Урок 14. toString, введение в Наследование.
        Person myPerson = new Person();
        myPerson.setName("Alexander");
        myPerson.setAge(24);
        myPerson.setWeight(71.0);
        myPerson.isAlive();
        myPerson.setCountryFrom("Kyrgyzstan");
        myPerson.setSex("Male");
        myPerson.setHeight("184 см");

        System.out.println(myPerson.toString());
    }
}