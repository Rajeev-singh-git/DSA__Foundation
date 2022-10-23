package arrayList;

import java.util.ArrayList;

public class arrayListBasic {


    public static  void main(String[]args) {

        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list + "->" + list.size());

        //add
        list.add(20);
        list.add(30);
        list.add(60);

       System.out.println(list + "->" + list.size());

       list.add(1,25);

       System.out.println(list + "->" + list.size());

       int val = list.get(3);
       System.out.println(val);

       list.set(2,90);
        System.out.println(list + "->" + list.size());

       //remove
        list.remove(0);
        System.out.println(list + "->" + list.size());


        ArrayList<String> name = new ArrayList<>();
        name.add("Puja");
        name.add("Rajeev");
        name.add("Abhishek");

        System.out.println(name +" -> "+name.size());

        for(int i=0;i<name.size();i++){
            String nam = name.get(i);
            System.out.println(nam);
       }

        for(int value:list){
            System.out.println(value);
        }

    }

}
