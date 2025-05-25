package employeeserialization;
  import java.io.*;
public class Employee implements Serializable{
    private String name;
    private int id;
    private String depart;
    public Employee(String name,int id,String depart){
        this.name=name;
        this.id=id;
        this.depart=depart;
    }
   @Override
    public String toString(){
        return "Name : " + name + "\nId : " + id + "\nDepartment: " + depart;
    }    
}
 
