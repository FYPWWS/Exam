package ie.gmit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class testEmployee
{
    Employee employee1 = new Employee();
    Employee employee2 = new Employee();

    @BeforeEach
    void intiEmployee()
    {
        employee1.setName("Bobby");
        //employee1.setNumb(12345);

    }
    @Test
    void testName()
    {
        if(employee1.getName() == null)
        {
            throw new IllegalArgumentException("Entrer your name");
        }
        else
        {
            if(employee1.getName().length() < 5)
            {
                throw new IllegalArgumentException("Name too short");
            }
        }
    }
//    @Test
//    void testNumber()
//    {
//
//    }
//
//    @Test
//    void testLenName()
//    {
//        boolean flg  = true;
//       int len = employee1.getName().length();
//       if(len<5)
//       {
//           flg = false;
//       }
//       Exception e = Assertions.assertThrows(IllegalArgumentException.class, ()->{employee1.setName("Bob");});
//       Assertions.assertEquals("Error", exception.getmessage(e));
//    }
}
