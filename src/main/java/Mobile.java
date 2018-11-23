public class Mobile {
    private String name;
    private String color;
    private String brand;

    public Mobile(String name, String color, String brand) {
        this.name = name;
        this.color = color;
        this.brand = brand;
    }

    public void makeACall(String inputMessage){
        if(inputMessage.length()<=20){
            System.out.println("Message :"+inputMessage);
        }else{
            System.out.println("Message cannot be sent");
        }

    }

    public void getMobile(){
        System.out.printf("name: %s, color: %s, brand: %s", name, color, brand);
    }
}
