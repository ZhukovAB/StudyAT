package studyAT;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args)
    {
        Vector3d a = new Vector3d(1 ,3 , 5);
        Vector3d b = new Vector3d(2,6,8);

        Vector2d c = new Vector2d(6, 2);
        Vector2d d = new Vector2d(4, 2);

        System.out.println("a " + a.toString());
        System.out.println("b " + b.toString());
        System.out.println("a+b= " + a.add(b).toString());
        System.out.println("a-b= " + a.subtract(b).toString());
        System.out.println("Scalar a*b = " + a.scalarMultiply(b));
        System.out.println("Vector a*b = " + a.vectorMultiply(b).toString());
        System.out.println();
        System.out.println("c " + c.toString());
        System.out.println("d " + d.toString());
        System.out.println("c+d= " + c.add(d).toString());
        System.out.println("c-d= " + c.subtract(d).toString());
        System.out.println("Scalar c*d = " + c.scalarMultiply(d));






    }
}
