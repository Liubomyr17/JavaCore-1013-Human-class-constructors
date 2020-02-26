package com.company;

/*

1013 Human class constructors
Write a Human class with 6 fields.
Create and implement 10 different constructors for it.
Every constructor should make sense.

Requirements:
1. The program should not read data from the keyboard.
2. The class Human must have 6 fields.
3. All fields of the Human class must be private.
4. There must be 10 constructors in the Human class.
5. All constructors of the Human class must be public.

 */

import java.io.*;
import java.lang.reflect.Array;
import java.net.URISyntaxException;
import java.nio.file.FileSystemException;
import java.nio.file.attribute.AclFileAttributeView;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.*;


public class Main {
    public static void main(String[] args) throws Exception {
    }
    public static class Human {
        private static String name;
        private static String profession;
        private static int age;
        private static int sex;
        private static Human mama;
        private static Human papa;

        public Human(String name, int age, int sex) {  }
        public Human(String name, int age, int sex, String profession) {}
        public Human(String name, int age, String profession) {}
        public Human(String name, int sex) {}
        public Human(int age, int sex) {}
        public Human(int age, int sex, String profession) {}
        public Human(String name, int age, int sex, Human mama, Human papa) {}
        public Human(String name, Human mama) {}
        public Human(String name, int age, Human mama) {}
        public Human(String name, String profession, Human mama) {}
    }
}




















