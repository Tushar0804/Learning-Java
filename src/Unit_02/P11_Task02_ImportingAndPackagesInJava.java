package Unit_02;

/*
 * A java package is a group of similar types of classes, interfaces and sub-packages.
 * Package in java can be categorized in two form
 * - Built-in package (lang, awt, javax, swing, net, io, util, sql)
 * - user-defined package.
 * Package also helps to avoid class name collision.
 * It helps us to maintain access protection in Java.
 * Packages are named in reverse order of domain names.
 * - unit01.javaproject.com ---> "com.javaproject. unit01"
 * - import java.util.vector;           // import the Vector class from util package
 * - import java.util.*;                // import all the classes from util package
 *
 * Static Import:
 * - Static import is a feature introduced in Java programming language (versions 5 and above)
 * - that allows members (fields and methods) defined in a class as public static,
 *   to be used in Java code without specifying the class in which the field is defined
 */

import static java.lang.System.*;
import Unit_01.SampleClass1;
import static java.lang.Math.*;


public class P11_Task02_ImportingAndPackagesInJava
{
    public static void main(String[] args)
    {
        out.println("Welcome to package");

        out.println("Square root of 4: " + sqrt(4));

        System.out.println("2 ^ 3: " + pow(2, 3));
        System.out.println("Absolute value of -10.5: " + abs(-10.5));

        SampleClass1 obj = new SampleClass1();
        System.out.println("SampleClass a = " + obj.a);
    }
}
