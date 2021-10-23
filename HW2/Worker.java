package HW2;

public class Worker {

    int id, age, exp, time;
    String name;

    public Worker(int id, String name, int age, int exp, int time){
        this.id = id;
        this.name = name;
        this.age = age;
        this.exp = exp;
        this.time = time;
    }

    @Override
    public String toString(){
        return  "{name: " + name +
                " | id: " + id +
                " | age: " + age +
                " | exp: " + exp +
                " | time: " + time +
                "}";
    }

}
