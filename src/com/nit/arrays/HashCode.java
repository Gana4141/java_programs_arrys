package com.nit.arrays;
import java.util.Objects;
public class HashCode 
{
    private int id;
    private String name;
    public HashCode(int id, String name)
    {
        this.id = id;
        this.name = name;
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public boolean equals(Object obj) 
    {

        if (this == obj)
            return true;

        if (obj == null || getClass() != obj.getClass())
            return false;

        HashCode student = (HashCode) obj;

        return id == student.id &&
               Objects.equals(name, student.name);
    }

    public static void main(String[] args)
    {

        HashCode student1 = new HashCode(1, "Alice");
        HashCode student2 = new HashCode(2, "Bob");
        HashCode student3 = new HashCode(1, "Alice");

        
        System.out.println("student1.equals(student2): " + student1.equals(student2));

        System.out.println("student1.equals(student3): " + student1.equals(student3));
        System.out.println("HashCode of student1: "+ student1.hashCode());
        System.out.println("HashCode of student2: "+ student2.hashCode());
        System.out.println("HashCode of student3: "+ student3.hashCode());
    }
}