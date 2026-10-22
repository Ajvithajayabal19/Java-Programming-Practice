class student{
    String name;
    int age;
    student(){
        name = "John";
        age = 20;
    }
    void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    public static void main(String args[]){
        student s = new student();
        s.display();
    }
}