package generics.edureka;

public class Test1<T, U> {

    private T t; //oggetto di tipo T
    private U u; //oggetto di tipo U


    //costruttore
    public Test1(T t,
                 U u) {
        this.t = t;
        this.u = u;
    }

    public void print() {
        System.out.println(t);
        System.out.println(u);
    }


    @Override
    public String toString() {
        return "Test1{" + "t=" + t + ", u=" + u + '}';
    }
}

class ClassGenerics {
    public static void main(String[] args) {
        Test1<String, Integer> obj = new Test1<>("Ciao", 90);

        obj.print();


    }


}
