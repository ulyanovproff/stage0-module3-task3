package school.mjc.stage0.module3.task3;

public class ReassigningValues {
    public static void main(String[] args) {
        int first = 1;
        int second = 100;
        int third = 1000;

        System.out.println(first);
        System.out.println(second);
        System.out.println(third);


        int linkToFirst = first;
        int linkToSecond = second;
        int linkToThird = third;

        first = 15;
        second = 6;
        third = 4;

        System.out.println(linkToFirst);
        System.out.println(linkToSecond);
        System.out.println(linkToThird);

        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
    }
}
