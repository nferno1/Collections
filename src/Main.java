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

        catsList.remove(1);


        Cat cat = catsList.get(0);

        System.out.println(cat);

        System.out.println(catsList.indexOf(cat));

        catsList.add(2, cat);

        catsList.set(2, new Cat("���� ���� ��������"));





        System.out.println(catsList.toString());



    }
}