package HW2;

public class Main {

    public static void main(String[] args) {

        Worker[] workers = new Worker[10];
        for (int i = 0; i < 10; i++) {
            workers[i] = new Worker(9 - i,"Worker_"+(10 - i),(i+10)*2,i,2021-i);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(workers[i].toString());
        }
    }
}
