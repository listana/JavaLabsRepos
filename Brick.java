package homework1;

// создать класс Brick с 4 полями (имя и 3 стороны),
// реализовать 2 метода которые считают и выводят в консоль площадь всех граней и объем

public class Brick {

    private String Name;
    private float Width;
    private float Height;
    private float Z;

    public Brick(){

        Name = "Default_brick";
        Width = 1;
        Height = 2;
        Z = 3;
    }

    public Brick(String n, float w, float h, float z){
        Name = n;
        Width = w;
        Height = h;
        Z = z;
    }

    public void PrintVolume(){

        float res = Width * Height * Z;
        System.out.println("Volume = " + res);
    }

    public void PrintSumOfSquares(){

        float res = 2 * Width * Height + 2 * Width * Z + 2 * Height * Z;
        System.out.println("All squares sum = " + res);
    }

}
