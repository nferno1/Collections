import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        Cat[] cats = new Cat[4];

        cats[0] = new Cat("�����");
        cats[1] = new Cat("������");
        cats[2] = new Cat("������");
        cats[3] = new Cat("������");


        //cats[1] = null;

        System.out.println(Arrays.toString(cats));


        ArrayList<Cat> catsList = new ArrayList();
        for (Cat cat : cats){
            catsList.add(cat);

        }
        catsList.add(new Cat("������"));



        System.out.println(catsList.toString());



    }
}