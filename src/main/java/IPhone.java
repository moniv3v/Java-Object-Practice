public class IPhone extends Mobile{
    private String name;
    private String color;
    private String brand;

    public IPhone(String name, String color, String brand) {
        super(name, color, brand);
    }

    public void makeACall(String inputMessage){
        System.out.print("<iPhone>");
        super.makeACall(inputMessage);
    }
}
