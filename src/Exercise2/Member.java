package Exercise2;

public class Member {
 private String name;
 private int age;
 private double salary;
 

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}

public void display() {
	System.out.println("Member name: "+ name);
	System.out.println("Member age: "+ age);
	System.out.println("Member salary: "+ salary);

}

 
 
}
