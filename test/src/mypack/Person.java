package mypack;

import java.util.*;

public class Person {
    static Scanner sc = new Scanner(System.in);
    protected String id;
    public String phone;
    public Name name;
    public Address address;
    List<Course> coursesList = new ArrayList<>();

    public Person(String id, Name name, String phone, Address address) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void addCourse(Course course) {
        this.coursesList.add(course);
    }
    
    @Override
    public String toString() {
        return "Person [id=" + id + ", phone=" + phone + ", name=" + name + ", address=" + address + "]";
    }

    
}
