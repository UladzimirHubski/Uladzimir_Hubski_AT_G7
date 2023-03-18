package classwork.day3;

public class ConstantContainerRunner {
    public static void main(String[] args) {
        ConstantContainerRunner cPrinter = new ConstantContainerRunner();
        cPrinter.colorRunner("red");
    }


    public void colorRunner(String color) {
        switch (color) {
            case ConstantContainer.color1:
                System.out.print(ConstantContainer.color1);
                break;
            case ConstantContainer.color2:
                System.out.print(ConstantContainer.color2);
                break;
            case ConstantContainer.color3:
                System.out.print(ConstantContainer.color3);
                break;
            case ConstantContainer.color4:
                System.out.print(ConstantContainer.color4);
                break;
            case ConstantContainer.color5:
                System.out.print(ConstantContainer.color5);
                break;
            default:
                System.out.print("Color not found");
                break;
        }
    }
}
