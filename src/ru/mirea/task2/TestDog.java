package ru.mirea.task2;

public class TestDog {
    private static Dog[] dogKennel = new Dog[10];
    private static int countDog = 0;

    public static void addDog(String name, int age)
    {
        dogKennel[countDog] = new Dog(name, age);
        countDog++;
    }

    public static void main(String[] args) {
        addDog("Дюша", 5);
        addDog("Тузик", 2);
        addDog("Дуня", 7);

        for (int i = 1; i <= 3; i++) {
            System.out.println(dogKennel[i - 1]);
        }
        System.out.println("Перевод на 'человеческий' у Дуни = " + dogKennel[2].ageConverter());
    }
}
