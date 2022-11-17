//public class java_advance {
//    //Enumeration in java (what is never cheng )
//    public enum colour{
//        RED("red"),GREEN("green"),BLUE("blue");
//        private String value;
//        colour(String value){
//            this.value=value;
//        }
//        public String getValue(){
//            return value;
//        }
//    }
//    public static void main(String[] args) {
//
//        colour c1 = colour.RED;
//        System.out.println("colour name is \n"+c1.name());
//        System.out.println("colur value is \n "+c1.getValue());
//
//        for (colour colour : colour.values()){
//            System.out.println("the value is \n"+colour.name());
//        }
//    }
//}


////Annotation in java()
//import java.lang.annotation.ElementType;
//import java.lang.annotation.Retention;
//import java.lang.annotation.RetentionPolicy;
//import java.lang.annotation.Target;
//import java.lang.reflect.Method;
//
//public class myclass{
//    //@markerAnnotation(value = 1)
//    public void sayhello() {
//        System.out.println("my custom annotation");
//    }
//
//    public static void main(String[] args) throws Exception{
//        myclass h = new myclass();
//        Method methodVal = h.getClass().getMethod("sayhello");
//        markerAnnotation markerAnnotation = methodVal.getAnnotation(markerAnnotation.class);
//        System.out.println("Value is : "+ markerAnnotation.value());
//    }
//
//    @Retention(RetentionPolicy.RUNTIME)
//    @Target({ElementType.TYPE_USE, ElementType.TYPE})
//    public static @interface markerAnnotation {
//        int value();
//    }
//}


////Serialization in java(This is used for the input the file into the server or a file and desinilize from the file or server)
//
//import jdk.jshell.spi.ExecutionControl;
//
//import java.io.*;
//
//class student implements Serializable{
//
//    private static final long serialVertionUID = 1L;
//
//    private String name;
//    private int age;
//    private String address;
//
//    //transient int x;
//
//    public student(String name , int age , String address){
//        this.name=name;
//        this.age = age;
//        this.address = address;
//    }
//    public void setName(String name){
//        this.name =name;
//    }
//    public void setAge(int age){
//        this.age=age;
//    }
//    public void setAddress(String address){
//        this.address=address;
//    }
//
//    public String getName(){
//        return name;
//    }
//    public int getAge(){
//        return age;
//    }
//    public String getAddress(){
//        return address;
//    }
//
//
////    public void setX(int x){
////        this.x=x;
////    }
////    public int getX(){
////        return x;
////    }
//
//    @Override
//    public String toString(){
//        return ("Student name is "+this.getName()+"Age is "+this.getAge()+
//                "Address is "+this.getAddress());
//    }
//
//}
//public class SerDeserDemo {
//    public static void main(String[] args) {
//        student student =new student("Nana",25,"23 East , India");
//
//        String filename ="C:\\java_codes\\test.txt";
//        FileOutputStream fileOut = null;
//        ObjectOutputStream objout = null;
//
//        //serialization
//        try {
//            fileOut = new FileOutputStream(filename);
//            objout = new ObjectOutputStream(fileOut);
//            objout.writeObject(student);
//            objout.close();
//            fileOut.close();
//            System.out.println("Object has been serialized: \n"+student);
//        }catch (IOException ex){
//            System.out.println("IOExeception is caught");
//        }
//
//        //deserialization
//        FileInputStream fileIn= null;
//        ObjectInputStream objIn = null;
//
//        try {
//            fileIn = new FileInputStream(filename);
//            objIn = new ObjectInputStream(fileIn);
//
//            student object = (student) objIn.readObject();
//            System.out.println("Object has deserrialized: \n"+object);
//
//            objIn.close();
//            fileIn.close();
//        }catch (IOException ex){
//            System.out.println("IOException is caught");
//        }catch (ClassNotFoundException ex){
//            System.out.println("ClassNotFoundException"+ "is caught");
//        }
//
//
//    }
//}


////Concurrency and threads
//class Thread1 extends Thread{
//    @Override
//    public void run(){
//        try {
//            System.out.println("Thread 1 is running ");
//        }catch (Exception e){
//            System.out.println("Exception raised"+e);
//        }
//    }
//}
//class Thread2 implements Runnable{
//    public void run(){
//        try {
//            System.out.println("Thread 2 is running ");
//        }catch (Exception e){
//            System.out.println("Exception is caught");
//        }
//    }
//}
//
//class  ThreadingDemo{
//    public static void main(String[] args) {
//        int n= 10;
//        for (int i =0;i<n;i++){
//            Thread1 t1 =new Thread1();
//            t1.start();
//
//            Thread t2 = new Thread((new Thread2()));
//            t2.start();
//        }
//    }
//}


////Autoboxing and Unboxing
//public class Autoboxing_unboxing {
//    public static void main(String[] args) {
//        int a = 12;
//        //Autoboxing
//        Integer b = Integer.valueOf(a);
//        System.out.println(b);
//        //Unboxing
//        int c = b;
//        System.out.println(b);
//        char d = 'n';
//        //Autoboxing
//        Character e = Character.valueOf(d);
//        System.out.println(e);
//        //unboxing
//        char f = e;
//        System.out.println(e);
//
//    }
//}



//I/O Streams in java

//import java.io.*;



////class ByteStreamExample{// This read byte by byte in java
////    public static void main(String[] args) throws IOException {
////        FileInputStream inputStream = null;
////        FileOutputStream outputStream = null;
////        try {
////            inputStream = new FileInputStream("C:\\java_codes\\txt_files\\Source.txt");
////            outputStream = new FileOutputStream("C:\\java_codes\\txt_files\\Desti.txt");
////            //read a byte at a time ,if reached end of the file , returns -1
////
////            int content;
////            while ((content = inputStream.read()) != -1) {
////                outputStream.write((byte) content);
////
////            }
////        } finally {
////            if (inputStream!= null){
////                inputStream.close();
////            }
////            if (outputStream!= null){
////                outputStream.close();
////            }
////        }
////    }
////}
//class CharacterStreamDemo{ // This read Char by char from the  file
//    public static void main(String[] args) throws IOException {
//        FileReader fileReader = null;
//        FileWriter fileWriter = null;
//        try {
//            fileReader = new FileReader("C:\\java_codes\\txt_files\\Source.txt");
//            fileWriter = new FileWriter("C:\\java_codes\\txt_files\\desti.txt");
//
//            //Reading Source file and writing content to target file character by character.
//            int content;
//            while ((content= fileReader.read())!=-1){
//                fileWriter.append((char) content);
//            }
//        }finally {
//            if(fileReader!=null) {
//                fileReader.close();
//            }
//            if (fileWriter!= null){
//                    fileWriter.close();
//            }
//        }
//    }
//}


//JDBC in Java
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//public class JDBCDEMO{
//    public static void main(String[] args) throws SQLException {
//    // Creating the connection
//        String url = "jdbc:sqlserver://localhost/demo";
//        Connection conn = null;
//
//        String name = "Nana";
//        int roll = 12;
//        int age = 18;
//
//        String sql = "insert into student(name , roll , age )" +"values('"+name+"', "+roll+" , "+age+")";
//        try {
//            conn = DriverManager.getConnection(url,"localhost","6294");
//            Statement st = conn.createStatement();
//            int m = st.executeUpdate(sql);//this is user for any insertion and deletion
//            if(m==1){
//                System.out.println("inserted Successfully" + sql);
//            }
//            else {
//                System.out.println("Insertion Failed");
//            }
//        }catch (Exception e){
//            System.out.println("Exception catch :" + e);
//        }finally {
//            conn.close();
//        }
//
//    }
//}

//generics in java

//public class SingleGenericHolder<T>{//you write as complex code in this modulo
//    T obj;
//    SingleGenericHolder(T obj){
//        this.obj =obj;
//    }
//    public T getObj(){
//        return this.obj;
//    }
//
//    public static void main(String[] args) {
//        SingleGenericHolder<Integer> iobj = new SingleGenericHolder<>(18);
//        System.out.println(iobj.getObj());
//        SingleGenericHolder<String> sobj = new SingleGenericHolder<>("Nana");
//        System.out.println(sobj.getObj());
//    }
//}
//
//public class DualgenricMethod<T , U>{
//    T obj1;
//    U obj2;
//
//    DualgenricMethod(T obj1 , U obj2){
//        this.obj1 = obj1;
//        this.obj2 = obj2;
//    }
//    public void display(){
//        System.out.println(this.obj1);
//        System.out.println(this.obj2);
//    }
//    public static void main(String[] args){
//        DualgenricMethod<Integer,String> b = new DualgenricMethod<>(12,"Nana");
//        b.display();
//    }
//}

//String handling in java

import java.util.Arrays;

public class StringHandling{
    public static void main(String[] args) {
        String str1 = "Ram is a Footballer";
        String str2 = "at age 19";
        System.out.println(str1.length());
        String result = str1.concat(str2);
        String a = String.format("My name is "+ " %s and my age is %d","nana",12);
        System.out.println(a);
        System.out.println(str1.charAt(3));
        if (str1.equals(str2)){
            System.out.println("both Are same");
        }else{
            System.out.println(" both are not same");
        }
        System.out.println(str1.indexOf('i'));
        System.out.println(str1.replace('R', 'S'));

        String[] arr=str1.split(" ");
        Arrays.asList(arr).forEach(s-> System.out.println(s));
        String newstr = str1.substring(0,3);
        System.out.println(newstr);
    }
}