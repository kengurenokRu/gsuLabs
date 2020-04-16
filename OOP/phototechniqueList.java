package OOP;

import java.util.Arrays;

public class phototechniqueList {
    private phototechnique[] items = new phototechnique[100];
    private int count = 0;

    public void createPhototechnique() {
        phototechniqueFabric fb = new phototechniqueFabric();
        items[count] = fb.createPhototechnique();
        count++;
    }

    public void deletePhototechnique(int number) {
        for (int i = number - 1; i < count - 1; i++) {
            items[i] = items[i + 1];
        }
        count--;

    }

    public void printAll() {
        for (int i = 0; i < count; i++) {
            System.out.println(items[i].toString());
        }
    }

    public void printItem(int number) {
        System.out.println(items[number-1].toString());
    }
}

