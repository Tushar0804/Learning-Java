package extra;

import java.io.*;
class Demo implements java.io.Serializable
{
    public int a;
    public String b;
    public Demo(int a, String b)
    {
        this.a = a;
        this.b = b;
    }
}
class Program29
{
    public static void main(String[] args)
    {
        System.out.println("*********************************************");
        System.out.println("Demonstrating a object serilaization and object de serialization");
        System.out.println("**********************************************");
        Demo object = new Demo(1, "All The Bright Places");
        String filename = "file.ser";
        try
        {
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(object);
            out.close();
            file.close();
            System.out.println("Object has been serialized");
        }
        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }
        Demo object1 = null;
        try
        {
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);
            object1 = (Demo)in.readObject();
            in.close();
            file.close();
            System.out.println("Object has been deserialized ");
            System.out.println("a = " + object1.a);
            System.out.println("b = " + object1.b);
        }
        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }
        catch(ClassNotFoundException ex)
        {
            System.out.println("ClassNotFoundException is caught");
        }
        System.out.println("---------------------------------------------------");
        System.out.println("CODE BY : RASHMI , 20012531 , Roll no. 45");
        System.out.println("---------------------------------------------------");
    }
}
