import com.sun.source.tree.Tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
        int bufint;
        //Задание 1
       System.out.println("Zadanie 1");

        String bufstr;
        List<String> List1 = new ArrayList<>(10);
        System.out.println(List1.size());
        for (int i=0;i<10;i++
             ) {
            bufstr = reader.readLine();
            List1.add(bufstr);
            //System.out.println("Got");
        }


        for(int j=0;j<15;j++) {
            List1.add(0, List1.get(List1.size() - 1));
            List1.remove(List1.size() - 1);
            System.out.println(List1);
        }

        System.out.println("//////////////////");

        for (int j=0; j<5 ;j++){
            List1.remove(List1.size()-1);
        }
        for (int j=0;j<5;j++){
            List1.add(List1.size(),reader.readLine());
        }

        int u=0;
        System.out.println(List1);
        for (String i:List1
        ) {
            System.out.println(List1.get(u));
            u++;
        }
// Задание 2
       System.out.println("Zadanie 2");

        List<Integer> ListTest1 = new ArrayList<>();

        for (int i=0;i<100000;i++
        ) {
            bufint = i;
            ListTest1.add(bufint);
            //System.out.println("Got");
        }

        long start = System.currentTimeMillis();

        for(int i=0;i<100000;i++) {
            ListTest1.add(i,i+1);
            ListTest1.remove(List1.size() - 1);
        }

        for(int i=0;i<100000;i++) {
            ListTest1.get(i);
        }

        for(int i=0;i<100000;i++) {
            ListTest1.set(i,i+2);
        }

        for(int i=0;i<100000;i++) {
            ListTest1.remove(0);
        }

        long finish = System.currentTimeMillis();

        System.out.println(finish-start);

        /////////////////////////////////////////////
        List<Integer> ListTest2 = new LinkedList<>();

        for (int i=0;i<100000;i++
        ) {
            bufint = i;
            ListTest2.add(bufint);
            //System.out.println("Got");
        }

        start = System.currentTimeMillis();

        for(int i=0;i<100000;i++) {
            ListTest2.add(i,i+1);
            ListTest2.remove(List1.size() - 1);
        }

        for(int i=0;i<100000;i++) {
            ListTest2.get(i);
        }

        for(int i=0;i<100000;i++) {
            ListTest2.set(i,i+2);
        }

        for(int i=0;i<100000;i++) {
            ListTest2.remove(0);
        }

        finish = System.currentTimeMillis();

        System.out.println(finish-start);
        //////////////Zadanie 3//////////////////
       System.out.println("Zadanie 3");
        List<Integer> List21 = new ArrayList<>();
        List<Integer> List22 = new ArrayList<>();

        for (int i=0;i<15;i++
        ) {
            bufint = i;
            List21.add(bufint);
            //System.out.println("Got");
        }

        for (int i=0;i<15;i++
        ) {
            bufint = i;
            List22.add(bufint);
            //System.out.println("Got");
        }

        boolean b = List21.equals(List22);
        System.out.println(b);

        for (int i=0;i<15;i++
        ) {
            boolean c = List21.get(i).equals(List22.get(i));
            System.out.println(c);
        }

        List<User> UserList = new ArrayList<>();
        UserList.add(new User("Kostya","MadSeer",19));
        UserList.add(new User("Vadim","FinnAndJake",19));
        UserList.add(new User("Olga","OlyAsh214",20));

        System.out.println("////////////////////////////////////////");

        System.out.println(UserList.contains(new User("Kostya","MadSeer",19)));
        UserList.remove(new User("Kostya","MadSeer",19));
        System.out.println(UserList.contains(new User("Kostya","MadSeer",19)));

        System.out.println("//////////////");

        List<User> UserList2 = new ArrayList<>();
        UserList2.add(new User("Vadim","FinnAndJake",19));
        UserList2.add(new User("Olga","OlyAsh214",20));

        System.out.println(b=UserList.equals(UserList2));

        ////////////////Zadanie 4/////////////////
        System.out.println("Zadanie 4");
        HashSet<String> Hash = new HashSet<String>();
        Hash.add("Кутько");
        Hash.add("Бек");
        Hash.add("Шевченко");
        Hash.add("Беспалько");
        Hash.add("Яковлев");
        Hash.add("Лабунский");
        Hash.add("Самойлик");
        HashSet<String> Hash2 = new HashSet<String>();


        for (String j:Hash
             ) {
            System.out.println(j);
        }

        for (String j:Hash
             ) {
            char firstbukva;
            firstbukva = j.charAt(0);
            if(firstbukva=='У'||firstbukva=='Е'||firstbukva=='А'||
                    firstbukva=='О'||firstbukva=='Э'||firstbukva=='Я'||
                    firstbukva=='И'||firstbukva=='Ю'){
            }else {Hash2.add(j);};
        }

        System.out.println("/////////////////");
        Hash.removeAll(Hash2);

        for (String j:Hash
        ) {
            System.out.println(j);
        }
        System.out.println("/////////////////");

        TreeSet<String > Tree = new TreeSet<String>();
        TreeSet<String > Tree2 = new TreeSet<String>();
        Tree.add("Кутько");
        Tree.add("Бек");
        Tree.add("Шевченко");
        Tree.add("Беспалько");
        Tree.add("Яковлев");
        Tree.add("Лабунский");
        Tree.add("Самойлик");

        for (String j:Tree
        ) {
            System.out.println(j);
        }

        int n=0;
        Iterator<String> i = Tree.iterator();
        for (String j:Tree
        ) {
            if(n<5){Tree2.add(j);}
            n++;
        }
        Tree.removeAll(Tree2);
        System.out.println("///////////////////////////");

        for (String j:Tree
        ) {
            System.out.println(j);
        }

        /////////////////////////Zadanie 5////////////////////////
        HashSet<Student> Students1 = new HashSet<Student>();
        Students1.add(new Student("Kostya","Kutko","ESTMu-19-1",5));
        Students1.add(new Student("Vadim","Beck","ESTMu-19-1",5));
        Students1.add(new Student("Asya","Shevchenko","ESTMu-19-1",5));
        Students1.add(new Student("Denis","Bespalko","ESTMu-19-1",5));
        System.out.println(Students1.contains(new Student("Kostya","Kutko","ESTMu-19-1",5)));
        System.out.println(Students1.remove(new Student("Kostya","Kutko","ESTMu-19-1",5)));
        System.out.println(Students1.contains(new Student("Kostya","Kutko","ESTMu-19-1",5)));
        for (Student j:Students1
        ) {
            System.out.println(j);
        }
        System.out.println("/////////////////////////////////////");
        TreeSet<Student> Students2 = new TreeSet<Student>();
        Students2.addAll(Students1);

        for (Student j:Students2
        ) {
            System.out.println(j);
        }
        System.out.println("/////////////////////////////////////");
        TreeSet<Student> Students3 = new TreeSet<Student>();
        Students3.add(new Student("Vadim", "Beck", "ЕСТМу 19-1", 5));
        Students3.add(new Student("Kostya", "Kutko", "ЕСТМу 19-1", 5));
        Students3.add(new Student("Artem", "Kutko", "ЕСТМу 19-1", 5));
        Students3.add(new Student("Ablexandra", "Shev", "ЕСТМу 19-1", 5));
        Students3.add(new Student("Alexandra", "Shevchenko", "ЕСТМу 19-1", 5));

        for (Student j:Students3
        ) {
            System.out.println(j);
        }


    }
}
