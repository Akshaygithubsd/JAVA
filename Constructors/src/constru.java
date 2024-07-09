
public class constru{
  
    String name;
    int age;

    public constru() {
        this.name = "Unknown";
        this.age = 0;
    }

    
    public constru(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public void displayDetails() {
        System.out.println("Name: " + this.name + ", Age: " + this.age);
    }

    public static void main(String[] args) {
     
    	constru person1 = new constru();
        person1.displayDetails(); 

        
        constru person2 = new constru("Alice", 25);
        person2.displayDetails();
    }
}

