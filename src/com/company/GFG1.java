package com.company;

import java.util.*;

class Shape{
    int a;
    double b;
    boolean c=true;
    String d="default";
    String s=" shape interface ";
}
class Shape_one extends Shape{
    float b;
}
class Shape_two extends Shape{
    boolean c=true;
}
class Shape_three extends Shape{
    String d="default";
}
class GFG1 {
    public static void main(){
        ArrayList<Shape> list = new ArrayList<Shape>();
        Shape A=new Shape();A.a=1;
        Shape B=new Shape_one();B.b=2.0;
        Shape C=new Shape_two();C.c=false;
        Shape D=new Shape_three();D.d="amin";
        list.add(A);
        list.add(B);
        list.add(C);
        list.add(D);
        Iterator<Shape> it = list.iterator();
        while (it.hasNext()){
            Shape tmp = it.next();
            if( tmp == B || tmp == C){
                if ( tmp == B )System.out.print( tmp.b );
                else System.out.print( tmp.c );
                System.out.println( " " + tmp.a + tmp.s + " so the class name is " + tmp.getClass().getName() ) ;
            }
        }
        Map<String, Object > mp = new HashMap<>();
        mp.put("first", A);
        mp.put("second",B);
        Iterator mpitr = mp.entrySet().iterator();
        while( mpitr.hasNext() ){
            Map.Entry mpobj = (Map.Entry)mpitr.next();
            Object mpval = (Object) mpobj.getValue();
            System.out.println( mpobj.getKey() + " : " + mpval );
            if( A == mpobj.getValue() ){
                System.out.println("map checking right !!");
            }
            else if( B == mp.get("second") ){
                System.out.println("map checking directly also worked !!!");
            }
        }
        Shape shape = new Shape();
        Optional<Shape> optionalShape = Optional.ofNullable((Shape) shape );
        System.out.println("OPTIONAL IS : " + optionalShape);
    }
}