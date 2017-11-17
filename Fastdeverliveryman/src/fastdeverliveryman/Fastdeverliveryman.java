package fastdeverliveryman;

import java.io.Serializable;

public class Fastdeverliveryman implements Serializable {

    private static int nextNumber = 1001;
    private int number;
    private String name;

    public Fastdeverliveryman(int number) {
        this.number = number;

    }

    public Fastdeverliveryman(String name) {
        this.name = name;
        this.number = nextNumber++;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getNextNumber() {
        return nextNumber;
    }

    public static void setNextNumber(int nextNumber) {

        Fastdeverliveryman.nextNumber = nextNumber;

    }

}
