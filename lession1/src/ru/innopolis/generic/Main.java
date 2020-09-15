package ru.innopolis.generic;

import ru.innopolis.ser.Child;
import ru.innopolis.ser.Person;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        final Person person = new Child("6",
                21,
                false,
                "netu",
                501.1);
        write(person, new File("person.txt"));
        System.out.println(read(new File("person.txt")));
    }

    private static Person read(File file) {
        try (ObjectInputStream os = new ObjectInputStream(
                new FileInputStream(file))) {
            return (Person) os.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("((((", e);
        }
    }

    private static void write(Person person, File file) {
        try (ObjectOutputStream os = new ObjectOutputStream(
                new FileOutputStream(file))) {
            os.writeObject(person);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

