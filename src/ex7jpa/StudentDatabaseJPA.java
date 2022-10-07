/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex7jpa;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author grammii
 */
public class StudentDatabaseJPA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Student student1 = new Student(1,"grammii",3.14);
        Student student2 = new Student(2,"jimmy",2.98);
        Student student3 = new Student(3,"jeannie",1.43);
        Student student4 = new Student(4,"jame",4.00);
        
        //update name by object name
        updateName(student1, "jamie");
        //update gpa by object name
        updateGpa(student1, 4.00);
        
        //update name by ID
        updateNameByID(2,"Jump");
        
        
        List<Student> stuList = StudentTable.findAllStudent();
        printAllstudent(stuList);
    }
}
