class aggregation{
    int square(int a){
        return a*a;
    }
}
    class circle{
    aggregation op;
    double pi = 3.14;
    double area(int radius){
        op = new aggregation();
        int rsquare = op.square(radius);
        return pi*rsquare;
    }
    public static void main(String args[]){
        circle c = new circle();
        double result = c.area(5);
        System.out.println("Area of circle is: " + result);
    }
}