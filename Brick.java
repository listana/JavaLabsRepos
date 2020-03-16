package homework1;

// создать класс Brick с 4 полями (имя и 3 стороны),
// реализовать 2 метода которые считают и выводят в консоль площадь всех граней и объем

public class Brick {

    private String name;
    private float width;
    private float height;
    private float z;

    public Brick(){

        name = "Default_brick";
        width = 1;
        height = 2;
        z = 3;
    }

    public Brick(String name, float width, float height, float z){
        this.name = name;
        this.width = width;
        this.height = height;
        this.z = z;
    }

    public void PrintVolume(){

        float res = width * height * z;
        System.out.println("Volume = " + res);
    }

    public void PrintSumOfSquares(){

        float res = 2 * width * height + 2 * width * z + 2 * height * z;
        System.out.println("All squares sum = " + res);
    }

}
