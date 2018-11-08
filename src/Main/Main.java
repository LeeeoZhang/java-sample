package Main;

import Lesson2.File;

public class Main {
    public static void main(String[] args) {
        File fileA = new File("res/test.txt");
        System.out.print(fileA.readToString());
    }
}
