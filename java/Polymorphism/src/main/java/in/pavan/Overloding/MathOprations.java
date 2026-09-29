package in.pavan.Overloding;

public class MathOprations {
    int add(int a,int b){
        System.out.println("Intager parameters ");
        System.out.println("Addition "+ (a+b));
        return a+b;
    }
    double add(double a, double b){
        System.out.println("Double parameters ");
        System.out.println("Addition "+ (a+b));
        return a+b;
    }
    int add(int a,int b,int c){
        System.out.println("Addition of 3 numbers ");
        System.out.println("Addition "+ (a+b+c));
        return a+b+c;
    }


    public static void main(String[] args) {

        MathOprations mathOprations= new MathOprations();
        mathOprations.add(10,20);
        mathOprations.add(10,20,50);
        mathOprations.add(10.30,25.30);


    }
}
