public class QuadraticEquation {
    int a,b,c;
    double x;
    public QuadraticEquation(){
    }
    public  QuadraticEquation(int a , int b , int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    double getDiscriminant(){
        return  this.b*this.b - 4*this.a*this.c;
    }
    double getRoot1(){
        return  (-this.b - Math.sqrt(getDiscriminant())) / (2*this.a);
    }
    double getRoot2(){
        return  (-this.b + Math.sqrt(getDiscriminant())) / (2*this.a);
    }
    public String Display(){
        return "QuadraticEquation is : " + a + "x^2 +" + + b + "x +" + c +"=0";
    }
}
