import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Cat[] cats = new Cat[4];

        cats[0] = new Cat("�����");
        cats[1] = new Cat("������");
        cats[2] = new Cat("������");
        cats[3] = new Cat("������");


        cats[1] = null;

        System.out.println(Arrays.toString(cats));



    }
}