/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package statik;

/**
 *
 * @author user
 */
public class Statik {
    public int counter = 0;
    public Test ()
    {counter += 1;
}
public int getCounter()
{return counter;
}
public void addCounter()
{counter +=1;
}
public static void fungsiStatic()
{
    System.out.println("ini fungsi static");
}
public void fungsiNonStatik()
{
    System.out.println("ini fungsi biasa");
}
}
public class StatikDemo {
     public static void main(String[] args)}
     {
        Statik obj1 = new Statik();
        Statik obj2 = new Statik();
        Statik obj3 = new Statik();
        obj1.addCounter();
        System.out.println("Counter milik obj1 = " + obj1.getCounter());
        System.out.println("Counter milik obj2 = " + obj2.getCounter());
        System.out.println("Counter milik obj3 = " + obj3.getCounter());
        System.out.println("Counter milik class = " + Statik.Counter);
        Statik.fungsiStatic();
        Statik obj = new Statik();
        obj.fungsiNonStatik();
    }
}
