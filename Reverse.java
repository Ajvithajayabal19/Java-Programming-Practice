class Reverse{
    public static void main(String[] args){
        String original = "Hello World";
        String reversed = new StringBuilder(original).reverse().toString();
        System.out.println(reversed);
    }
}