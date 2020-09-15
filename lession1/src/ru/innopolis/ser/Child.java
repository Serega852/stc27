package ru.innopolis.ser;

import java.io.*;

public class Child extends Person implements Externalizable {
    private Double classRoom;

    public Child() {
    }

    public Child(String age,
                 int name,
                 boolean bootSize,
                 String children,
                 Double classRoom) {
        super(age, name, bootSize, children);
        this.classRoom = classRoom;
    }

    public Double getClassRoom() {
        return classRoom;
    }

    @Override
    public String toString() {
        return "Child{" +
                "classRoom=" + classRoom +
                "} " + super.toString();
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        System.out.println("write");
        System.out.println(this);
        out.writeDouble(this.classRoom);
        out.writeUTF("wow");
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        System.out.println("read");
        this.classRoom = in.readDouble();
        super.age = in.readUTF();
    }
}
