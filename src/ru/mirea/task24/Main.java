package ru.mirea.task24;

import ru.mirea.task24.Chair;
import ru.mirea.task24.ChairType;
import ru.mirea.task24.Client;
import ru.mirea.task24.FactoryChairs;

public class Main {
    public static void main(String[] args) {
        // Factory
        FactoryChairs myFactory = new FactoryChairs();
        // Chairs
        Chair victorian = myFactory.createChair(ChairType.VICTORIAN, "Black", 12);
        Chair multifunctional = myFactory.createChair(ChairType.MULTIFUNCTIONAL, "Gray", 10);
        Chair magic = myFactory.createChair(ChairType.MAGIC, "Purple", 17);
        // Client
        Client client = new Client("Alexey", 47);
        client.sit(multifunctional);
        client.sit(magic);
        client.sit(victorian);
    }
}
