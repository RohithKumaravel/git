/*class Main{
    public static void main(String[] args){
        for(int i=0;i<=5;i++){
            System.out.println(i +" Hello");
        }
    }
}*/

/*import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int a = sc.nextInt();

        if (a == 0) {
            System.out.println("Zero");
        } else if (a % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}*/

/*import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;

        for (int i = 0; i <= a; i++) {
            sum += i;
        }
        System.out.println("The sum is: " + sum);
    }
}*/

/*import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = sc.nextInt();
        int rev = 0;

        while (a != 0) {
            int rem = a % 10;
            rev = rev * 10 + rem;
            a = a / 10;
        }
        System.out.println("Reversed number: " + rev);
    }
}
*/


/*import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int size = sc.nextInt();

        int[] a = new int[size];
        System.out.println("Enter the numbers:");
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Array in reverse order:");
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        int largest = a[0];
        for (int i = 1; i < size; i++) {
            if (a[i] > largest) {
                largest = a[i];
            }
        }
        System.out.println("Largest number is: " + largest);
    }
}*/

/*import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int size = sc.nextInt();

        int[] a = new int[size];
        System.out.println("Enter the numbers:");
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }

        int min = a[0];
        int max = a[0];
        for (int i = 0; i < size; i++) {
            if (a[i] > max) {
                max = a[i];
            }
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}*/


/*class Main {
    public static void main(String[] args) {
        int a[] = {2, 4, 3, 6, 1, 5};
        int firstmax = Integer.MIN_VALUE;
        int secmax = Integer.MIN_VALUE;

        for (int num : a) {
            if (num > firstmax) {
                secmax = firstmax;
                firstmax = num;
            } else if (num > secmax && num != firstmax) {
                secmax = num;
            }
        }

        if (secmax == Integer.MIN_VALUE) {
            System.out.println("No second max exists");
        } else {
            System.out.println("First max: " + firstmax);
            System.out.println("Second max: " + secmax);
        }
    }
}*/

/*class Main {
    public static void main(String[] args) {
        int a[] = {5, 4, 1, 6, 2, 7};
        int firstmin = Integer.MAX_VALUE;
        int secmin = Integer.MAX_VALUE;

        for (int i : a) {
            if (i < firstmin) {
                secmin = firstmin;
                firstmin = i;
            } else if (i < secmin && i != firstmin) {
                secmin = i;
            }
        }

        if (secmin == Integer.MAX_VALUE) {
            System.out.println("No second minimum found");
        } else {
            System.out.println("First min: " + firstmin);
            System.out.println("Second min: " + secmin);
        }
    }
}*/


/*class Main{
    public static void main(String[] args){
        int a[]={1,5,7,-1,5};
        int target=6;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]+a[j]==target){
                    System.out.println("("+a[i]+") + ("+a[j]+")");
                    break;
                }
            }
        }
    }
}*/

/*import java.util.*;
class Main{
    public static void main(String[] args){
        int a[]={-2,1,-3,4,-1,2,1,-5,4};
        int currentsum=0;
        int maxsum=a[0];
        
        for(int i=0;i<a.length;i++){
            currentsum=Math.max(a[i],currentsum+a[i]);
            maxsum = Math.max(maxsum,currentsum);
        }
        System.out.println("Max sub arrays are :"+maxsum);
    }
}*/


//-------------------------

/*class Main{
    public static void main(String[] args){
        String a="Rohith";
        for(int i=a.length()-1;i>=0;i--){
            System.out.print(a.charAt(i));
        }
    }
}*/

/*import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        Boolean pall=true;
        
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)!=a.charAt(a.length()-1-i)){
                pall=false;
                break;
            }
        }
        if (pall){
            System.out.print("pall");
        }
        else{
            System.out.print("Not a Pall");
        }
    }
}*/

/*import java.util.*;
class Main{
    public static void main(String[] args){
        String a="Rohith";
        StringBuilder rev=new StringBuilder(a).reverse();
        System.out.print(a.toString());
    }
}*/

/*import java.util.*;
class Main{
    public static void main(String[] args){
        String str="Rohith";
        String vow="AEIOUaeiou";
        int vowcount=0;
        int constcount=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(vow.indexOf(ch)!=-1){
                vowcount++;
            }
            else{
                constcount++;
            }
        }
        System.out.println("vow count: "+vowcount);
        System.out.println("constant count: "+constcount);
    }
}*/

/*import java.util.*;
class Main{
    public static void main(String[] args){
        String a="listen";
        String b="silent";
            
        if(a.length()!=b.length()){
            System.out.println("is not an anagram");
            return;
        }
        char[] arr1=a.toCharArray();
        char[] arr2=b.toCharArray();
            
        Arrays.sort(arr1);
        Arrays.sort(arr2);
            
        if(Arrays.equals(arr1,arr2)){
            System.out.println("Aanagaram");
        }
        else{
            System.out.println("Not an anagram");
        }
            
    }
}*/

/*import java.util.*;
class Main{
    public static void main(String[] args){
        String str="abcde";
        boolean ans=true;
        for(char i: str.toCharArray()){
            if(!Character.isDigit(i)){
                ans=false;
                break;
            }
        }
        if(ans==true){
            System.out.println("All characters are digits");
        }
        else{
            System.out.println("Contains non-digit characters");
        }
    }
}*/

/*class Main{
    public static void main(String[] args){
        try{
            int a=10,b=0;
            int result=a/b;
            System.out.println("Result "+ result );
        }
        catch(ArithmeticException e){
            System.out.println("error not allowed");
        }
        finally{
            System.out.println("bye bye");
        }
    }
}*/

/*class Main{
    public static void main(String[] args){
        try{
            String str=null;
            System.out.println(str.length());
        }
        catch(NullPointerException e){
            System.out.println("Text Not found");
        }
    }
}*/

/*class Main{
    public static void main(String[] args){
        try{
            String str="Rohith";
            int num=Integer.parseInt(str);
            System.out.println("num: "+ num);
        }
        catch(NumberFormatException e){
            System.out.println("Error Output!!"+ e);
        }
        finally{
            System.out.println("Thankyou!!");
        }
    }
}*/

/*class Main{
    public static void main(String[] args){
        try{
            int age=-10;
            if(age<0){
                throw new IllegalArgumentException("Age cant be negative");
            }
            System.out.println("Age is: "+age);
        }
        catch (IllegalArgumentException e){
            System.out.println("caught exception: "+e.getMessage());
        }
    }
}*/

/*class Main{
    static int divide(int a,int b){
        return a/b;
    }
    public static void main(String[] args){
        try{
            int result= divide(10,0);
            System.out.println("Result: "+result);
        }
        catch( ArithmeticException e){
            System.out.println("Caught exception: "+e.getMessage());
        }
        finally{
            System.out.println("Thankyou!");
        }
    }
}*/

/*import java.util.*;
class Main{
    static void validateage(int age) throws IllegalArgumentException{
        if(age<0){
            throw new IllegalArgumentException("Age cant be validated!");
        }else{
            System.out.println("Age Vlidated: "+age);
        }
    }
    public static void main(String[] args){
        //Scanner sc=new Scanner(System.in);
        //System.out.println("enter age: ");
        //int age =sc.nextInt();

        try{
            validateage(10);
        }
        catch(IllegalArgumentException e){
            System.out.println("Catch Exception: "+e.getMessage());
        }
    }
}*/


/*import java.util.*;
class InvalidAgeException extends Exception{
    public InvalidAgeException(String message){
        super(message);
    }
}
public class Main{
    static void validateage(int age) throws InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException("Age must be above 18");
        }
        else{
            System.out.println("Age validated");
        }
    }
    public static void main(String[] args){
        try{
            validateage(20);
        }
        catch(InvalidAgeException e){
            System.out.println("Age exception caughted: "+e.getMessage());
        }
        finally{
            System.out.println("Thankyou!!");
        }
    }
}*/

/*class bankaccount{
    private double balance;

    bankaccount(double initialbalance){
        balance=initialbalance;
    }

    public double getbalance(){
        return balance;
    }

    public void deposite(double amount){
        balance+=amount;
    }

    public void withdraw(double amount){
        if(balance>=amount){
            balance-=amount;
        }
        else{
            System.out.println("Not sufficient balance");
        }
    }
}
class Main{
    public static void main(String[] args){
        bankaccount obj=new bankaccount(1000);
        obj.deposite(4000);
        obj.withdraw(1000);
        System.out.println("Balance: "+obj.getbalance());
    }
}*/

/*interface Printable {
    void print();
}

interface Scannable {
    void scan();
}

class MultiFunctionMachine implements Printable, Scannable {
    public void print() {
        System.out.println("Printing document...");
    }

    public void scan() {
        System.out.println("Scanning document...");
    }

    public static void main(String[] args) {
        MultiFunctionMachine m = new MultiFunctionMachine();
        m.print();
        m.scan();
    }
}*/


/*class bankaccount{
    private double balance;

    //constructor
    bankaccount(double initialbalance){
        balance=initialbalance;
    }

    //balance check
    public double getbalance(){
        return balance;
    }

    //deposite
    public void deposite(double amount){
        balance+=amount;
    }

    //withdrw
    public void withdraw(double amount){
        if(balance>=amount){
            balance-=amount;
        }
        else{
            System.out.println("Insuddicient balance");
        }
    }
}
class savingsaccount extends bankaccount{
    private double ir;
    savingsaccount(double initialbalance,double ir){
        super(initialbalance);
        this.ir=ir;
    }
    public void addir(){
        double interest=getbalance()*ir/100;
        deposite(interest);
    }
}
class Main{
    public static void main(String[] args){
        savingsaccount sa=new savingsaccount(100,5);
        sa.deposite(500);
        sa.addir();
        System.out.println("Final Balance: "+sa.getbalance());
    }
}*/

/*class calculator{
    public int add(int a,int b){
        return a+b;
    }
    public int add(int a,int b,int c){
        return a+b+c;
    }
    public double add(double a,double b){
        return a+b;
    }
}
class Main{
    public static void main(String[] args){
        calculator c =new calculator();
        System.out.println(c.add(2.5,3.0));
        System.out.println(c.add(3,4,5));
        System.out.println(c.add(4,5));
    }
}*/


/*class Student{
    public int marks(int a,int b){
        return a+b;
    }
    public int marks(int a){
        return a+50;
    }
}
class Students_data extends Student{
    public int marks(int a,int b){
        return a*b;
    }
}
class Main{
    public static void main(String[] args){
        Students_data sd =new Students_data();
        System.out.println("marks: "+ sd.marks(10,20));
        System.out.println("marks: "+ sd.marks(49));
    }
}*/

/*abstract class shapes{
    abstract void draw();

    public void info(){
        System.out.println("This is a shape");
    }
}
class circle extends shapes{
    public void draw(){
        System.out.println("Circle is drawing");
    }
}
class rectangle extends shapes{
    public void draw(){
        System.out.println("Rectangle is drawing");
    }
}
class Main{
    public static void main(String[] args){
        circle c1 =new circle();
        rectangle r1=new rectangle();

        c1.draw();
        c1.info();
        r1.draw();
        r1.info();
    }
}*/

/*interface  animal{
    void sound();
}
class dog implements animal{
    public void sound(){
        System.out.println("dog barks");
    }
}
class cat implements animal{
    public void sound(){
        System.out.println("cat meows");
    }
}
class Main{
    public static void main(String[] args){
        animal a1=new dog();
        animal a2=new cat();

        a1.sound();
        a2.sound();
    }
}*/

/*import java.util.*;
class Main{
    public static void main(String[] args){
        ArrayList<String> name = new ArrayList<>();
        name.add("Rohith");
        name.add("Ajay");
        name.add("seetha");
        name.add("Rohith");

        System.out.println("Original list: "+name);

        HashSet nodup =new HashSet<>(name);
        System.out.println("no dup order: "+nodup);
    }
}*/

/*import java.util.*;
class Main{
    public static void main(String[] args){
        HashSet<Integer> num = new HashSet<>();

        num.add(100);
        num.add(200);
        num.add(300);
        num.add(100);
        num.add(400);

        int search=100;
        if(num.contains(search)){
            System.out.println("Found");
        }
        else{
            System.out.println("Not found");
        }

        System.out.println(num);
    }
}*/

/*import java.util.*;
class Main{
    public static void main(String[] args){
        String str="apple banana orange apple banana";
        String[] words = str.split(" ");

        HashMap<String,Integer> freq= new HashMap<>();

        for(String w:words){
            freq.put(w,freq.getOrDefault(w,0)+1);
        }
        System.out.println("Frequencies : "+freq);
    }
}*/

/*import java.util.*;
class Main{
    public static void main(String[]args){
        TreeMap<String,Integer> scores=new TreeMap<>();
        scores.put("Charlie",95);
        scores.put("Rohith",99);
        scores.put("Ajay",100);
        scores.put("Seetha",98);

        System.out.println("Scores "+scores);

    }
}*/

/*import java.util.*;
class Main{
    public static void main(String[] args){
        Queue <String> task = new LinkedList<>();
        
        task.add("Task1");
        task.add("task2");
        task.add("task3");

        while(!task.isEmpty()){
            System.out.println("Processing: "+task.poll());
        }
    }
}*/

/*import java.util.*;
class Main{
    public static void main(String[] args){
        String str="Rohih is a associate in Cogniant";
        String[] words=str.split(" ");

        Map<String,Integer> freq=new HashMap<>();

        for(String i;words){
            freq.put(i,freq.getOrDefault(i,0)+1);
        }
        
        String mostfreq=null;
        int maxcount=0;

        for(String j:freq){
            System.out.println(j);
        }
    }
}*/


/*import java.util.*;
class Main{
    public static void main(String[] args){
        ArrayList<Integer> num =new ArrayList<>();

        for(int i=0;i<5;i++){
            num.add(i);
        }
        num.stream()

        .filter(n->n%2==0)
        .map(n->n*n)
        .forEach(System.out::println);
    }
}*/

/*import java.util.*;
class Main{
    public static void main(String[] args){

        List<String> names =Arrays.asList("Rohith","Kumar","Aanad","Ajay");

        names.stream()
             .filter(name -> name.startsWith("R"))
             .map(String::toUpperCase)
             .forEach(System.out::println);
    }
}*/

/*import java.util.*;
class Main{
    public static void main(String[] args){
    List <Integer> nums = Arrays.asList(1,2,3,4,5,6);

    nums.stream();
    
    int sum=nums.stream().reduce(0,Integer::sum);

    System.out.println("Total ="+sum);
    }
}*/

/*import java.util.*;
class Main{
    public static void main(String[] args){
        List<String> words= Arrays.asList("apple","orange","grape");

        List<Integer> len = words.stream()
        .map(String::len)
        .collect(Collectors.toList());

        System.out.println(len);
    }
}*/




















