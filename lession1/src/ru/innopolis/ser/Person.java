package ru.innopolis.ser;

import java.io.*;

public class Person implements Externalizable {
    private static final long serialVersionUID = 1254L;

    String age;
    transient int name;
    boolean bootSize;
    String children;

    public Person() {
        this.age = "netu";
        this.name = 10;
        this.bootSize = true;
        children = "est'";
    }

    public Person(String age,
                  int name,
                  boolean bootSize, String children) {
        this.age = age;
        this.name = name;
        this.bootSize = bootSize;
        this.children = children;
    }

    public String getAge() {
        return age;
    }

    public int getName() {
        return name;
    }

    public boolean isBootSize() {
        return bootSize;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age='" + age + '\'' +
                ", name=" + name +
                ", bootSize=" + bootSize +
                ", children='" + children + '\'' +
                '}';
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(this);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        final Person person = (Person) in.readObject();
        this.name = person.name;
        this.children = person.children;
        this.bootSize = person.bootSize;
        this.age = person.age;
    }
}
