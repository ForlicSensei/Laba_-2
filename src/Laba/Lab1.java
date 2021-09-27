package Laba;

import java.util.Scanner;

public class Lab1 {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        /**Ввод данных для задания кординат точек **/
        Point3d a= new Point3d(in.nextDouble(),in.nextDouble(),in.nextDouble());
        Point3d b= new Point3d(in.nextDouble(),in.nextDouble(),in.nextDouble());
        Point3d z= new Point3d(in.nextDouble(),in.nextDouble(),in.nextDouble());
        /**Вывод площади **/
        System.out.printf("%.3f",Point3d.computeArea(a,b,z));
    }
}
