package ru.mirea.task2;

public class Shape {
    private String name;
    private int number;

    public Shape(String name,int number) {
        this.name = name;
        this.number=number;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                ", number=" + number +
                '}';
    }
}
