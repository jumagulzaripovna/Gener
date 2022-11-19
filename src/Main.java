public class Main {
    public static void main(String[] args) {
        
       Box<String>box1=new Box<>("java");
       box1.met("jj");
       box1.method1(3);

        System.out.println(box1);



       Box<Integer>box2=new Box<>(24);
       box2.met("java-4");
       box2.methed(12);
       box2.method1(24l);


        System.out.println(box2);
    }


    }

