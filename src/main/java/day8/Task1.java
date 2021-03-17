package day8;

public class Task1 {
    public static void main(String[] args) {

        long start1 = System.currentTimeMillis();
        String str1 = new String();
        for (int i = 0; i <= 20000; i++) {
            str1 += i + " ";
        }
        long finish1 = System.currentTimeMillis();
        System.out.println(str1);
        System.out.println(finish1 - start1);

        StringBuilder str2 = new StringBuilder();

        long start2 = System.currentTimeMillis();
        for (int i = 0; i <= 20000; i++) {
            str2.append(i + " ");
        }
        long finish2 = System.currentTimeMillis();

        System.out.println(str2);
        System.out.println(finish2 - start2);


    }
}
