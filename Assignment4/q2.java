import java.util.*;

class Employee{
    String name;
    int age;

    public Employee(String name, int age){
        this.age = age;
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    
    public String toString(){
        return "Employee [name=" + name", age = " + age + "]";
    }
}

class InvalidAgeException extends Exception{
    public InvalidAgeException(String str){
        super(Str);
    }
}

public class q2{
    public static void main(String[] args) throws InvalidAgeException{
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of employees : ");
        int n = scan.nextInt();

        ArrayList<Employee> el = new ArrayList<>();
        System.out.println("Enter the data for employees");
        for(int i=0; i<n; i++){
            System.out.println(i + "Name : ");
            String name = scan.nextLine();
            System.out.println(i + "Age : ");
            int age = scan.nextInt();
            
            Employee e = new Employee(name, age);
            el.add(e);
            scan.nextLine();
        }

        for(Employee e : el){
            if(e.getAge() < 18){
                throw new InvalidAgeException("Employee's age should not be greater than 18");
            }else{
                System.out.println(e);
            }
        }
    }
}