import java.util.*;
import java.util.Scanner;
public class box{
double h,w,d;
box(double height,double weight,double depth)
{
h=height;
w=weight;
d=depth;
}
 double volume(){
double v;
v=h*w*d;
return v;
}
public static void main(String[] args){
box bc=new box(4,4,4);
System.out.println(bc.volume());
}
}