public class Andriod extends Mobile{
    private String name;
    private String color;
    private String brand;

    public Andriod(String name, String color, String brand) {
        super(name, color, brand);
    }

    public void makeACall(String inputMessage){
        System.out.print("<Andriod>");
        super.makeACall(inputMessage);
    }
}
