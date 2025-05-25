 
package employeeserialization;

import java.io.*;

public class EmployeeSerialization {
 
    public static void main(String[] args) {
//          Employee e1=new Employee("Almas Adrees Khan",1,"Director");
//          Employee e2=new Employee("Kanwal Adrees Khan",2,"CEO");
//          Employee e3=new Employee("Pakeeza Adrees Khan",3,"Manager");
//          Employee e4=new Employee("Areeba Adrees Khan",4,"Incharge");
//          Employee e5=new Employee("Amaima Adrees Khan",5,"Chairwomen");
//        try{
//            FileOutputStream fileOut=new FileOutputStream("Employee.ser");
//            ObjectOutputStream obj=new ObjectOutputStream(fileOut);
//             obj.writeObject(e1);
//             obj.writeObject(e2);
//             obj.writeObject(e3);
//             obj.writeObject(e4);
//             obj.writeObject(e5);
//            obj.close();
//            fileOut.close();
//             System.out.println("Object has been serialized!");
//         }catch(Exception e){
//            e.printStackTrace();
//         }
       Employee p1=null;
        Employee p2=null;
         Employee p3=null;
        Employee p4=null;
         Employee p5=null;
         try{
             FileInputStream fileIn=new FileInputStream("Employee.ser");
             ObjectInputStream obj=new ObjectInputStream(fileIn);
            p1=(Employee)obj.readObject();
           p2=(Employee)obj.readObject();
            p3=(Employee)obj.readObject();
              p4=(Employee)obj.readObject();
             p5=(Employee)obj.readObject();
             obj.close();
             fileIn.close();
            System.out.println("Objects have been Deserialized!");
               System.out.println(p1.toString());
                System.out.println(p2.toString());
               System.out.println(p3.toString());
                System.out.println(p4.toString());
               System.out.println(p5.toString());
       }catch(Exception e){
            e.printStackTrace();
         }
     }
    
    }
    
 
