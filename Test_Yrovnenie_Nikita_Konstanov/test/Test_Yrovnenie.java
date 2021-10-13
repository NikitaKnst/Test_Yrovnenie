
import Yrovnenie.YrovnenieA_B_C;
import static java.lang.Double.NaN;
import org.junit.After; 
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
public class Test_Yrovnenie {
    //private Calculator obj;
    //@BeforeClass
 public Test_Yrovnenie() {
     //public void RunT(){
       //  obj=new Calculator
         
     
 }
  //////////////////Проверяем при  дискриминанте с +36//////////////////
 @Test
 public void Yrovnenie_a_b_c(){ 
 //создаем объект класса
 YrovnenieA_B_C obj=new YrovnenieA_B_C();
//вызываем метод класса celsiusFarengeit() с конкретными //параметрами
 double b=6;
 double a=1;
 double c=0;
 double d=obj.Yrovnenie_a_b_c(b * b - 4 * a * c);
 double x1=obj.Yrovnenie_a_b_c((-b+Math.sqrt(d))/(2*a));
 double x2=obj.Yrovnenie_a_b_c((-b-Math.sqrt(d))/2*a);
//если ответ окажется не равный заданному, то метод //Assert.fail
 //if (tulemus!=8) Assert.fail();
   Assert.assertEquals(d, 36, 0.0001);
   Assert.assertEquals(x1, 0, 0.0001);
   Assert.assertEquals(x2, -6, 0.0001);
 }
   //////////////////Проверяем при  дискриминанте с 0//////////////////
 @Test
 public void Yrovnenie_a_b_c_Test2(){ 
 //создаем объект класса
 YrovnenieA_B_C obj=new YrovnenieA_B_C();
//вызываем метод класса celsiusFarengeit() с конкретными //параметрами
 double b=0;
 double a=0;
 double c=0;
 double d=obj.Yrovnenie_a_b_c(b * b - 4 * a * c);
 double x1=obj.Yrovnenie_a_b_c((-b+Math.sqrt(d))/(2*a));
 double x2=obj.Yrovnenie_a_b_c((-b-Math.sqrt(d))/2*a);
//если ответ окажется не равный заданному, то метод //Assert.fail
 //if (tulemus!=8) Assert.fail();
   Assert.assertEquals(d, 0, 0.0001);
   Assert.assertEquals(x1, NaN, 0.0001);
   Assert.assertEquals(x2, 0, 0.0001);
 }
   //////////////////Проверяем при  дискриминанте с +36//////////////////

  @Test
 public void Yrovnenie_a_b_c_Test3(){ 
 //создаем объект класса
 YrovnenieA_B_C obj=new YrovnenieA_B_C();
//вызываем метод класса celsiusFarengeit() с конкретными //параметрами
 double b=0;
 double a=1;
 double c=1;
 double d=obj.Yrovnenie_a_b_c(b * b - 4 * a * c);
 double x1=obj.Yrovnenie_a_b_c((-b+Math.sqrt(d))/(2*a));
 double x2=obj.Yrovnenie_a_b_c((-b-Math.sqrt(d))/2*a);
//если ответ окажется не равный заданному, то метод //Assert.fail
 //if (tulemus!=8) Assert.fail();
   Assert.assertEquals(d, -4, 0.0001);
   Assert.assertEquals(x1, NaN, 0.0001);
   Assert.assertEquals(x2, NaN, 0.0001);
 }
 /////////Ещё тесты на всякий случай/////////
 
 
 @Test
 public void Yrovnenie_a_b_c_TestForMe(){ 
 //создаем объект класса
 YrovnenieA_B_C obj=new YrovnenieA_B_C();
//вызываем метод класса celsiusFarengeit() с конкретными //параметрами
 double b=0;
 double a=7;
 double c=5;
 double d=obj.Yrovnenie_a_b_c(b * b - 4 * a * c);
 double x1=obj.Yrovnenie_a_b_c((-b+Math.sqrt(d))/(2*a));
 double x2=obj.Yrovnenie_a_b_c((-b-Math.sqrt(d))/2*a);
//если ответ окажется не равный заданному, то метод //Assert.fail
 //if (tulemus!=8) Assert.fail();
   Assert.assertEquals(d, -140, 0.0001);
   Assert.assertEquals(x1, NaN, 0.0001);
   Assert.assertEquals(x2, NaN, 0.0001);
   
 }
@Test
 public void Yrovnenie_a_b_c_TestForMe2(){ 
 //создаем объект класса
 YrovnenieA_B_C obj=new YrovnenieA_B_C();
//вызываем метод класса celsiusFarengeit() с конкретными //параметрами
 double b=1;
 double a=1.3;
 double c=2;
 double d=obj.Yrovnenie_a_b_c(b * b - 4 * a * c);
 double x1=obj.Yrovnenie_a_b_c((-b+Math.sqrt(d))/(2*a));
 double x2=obj.Yrovnenie_a_b_c((-b-Math.sqrt(d))/2*a);
//если ответ окажется не равный заданному, то метод //Assert.fail
 //if (tulemus!=8) Assert.fail();
   Assert.assertEquals(d, -9.4, 0.0001);
   Assert.assertEquals(x1, NaN, 0.0001);
   Assert.assertEquals(x2, NaN, 0.0001);
    }
 @Test
 public void Yrovnenie_a_b_c_TestForMe3(){ 
 //создаем объект класса
 YrovnenieA_B_C obj=new YrovnenieA_B_C();
//вызываем метод класса celsiusFarengeit() с конкретными //параметрами
 double b=-5;
 double a=-1;
 double c=-8;
 double d=obj.Yrovnenie_a_b_c(b * b - 4 * a * c);
 double x1=obj.Yrovnenie_a_b_c((-b+Math.sqrt(d))/(2*a));
 double x2=obj.Yrovnenie_a_b_c((-b-Math.sqrt(d))/2*a);
//если ответ окажется не равный заданному, то метод //Assert.fail
 //if (tulemus!=8) Assert.fail();
   Assert.assertEquals(d, -7, 0.0001);
   Assert.assertEquals(x1, NaN, 0.0001);
   Assert.assertEquals(x2, NaN, 0.0001);
    }
}
 