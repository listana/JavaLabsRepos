package homework1;


//        Создать класс Champion  у которого будут поля (строка)Name, (число)Strenght, (число)Agility и (число)Intelligence,
//        реализовать метод который будет принимать 2 чемпиона, сравнивать их поля, и выводить в консоль сообщение "{имя чемпиона} win"
//        (возможны ничьи, на это случай должно быть свое сообщение)
//        подсказка: нужен счетчик

public class Champion {

    String Name = "Default_Champion";
    int Strength = 1;
    int Agility = 1;
    int Intelligence = 1;

    public Champion(String n, int s, int a, int i) {
        Name = n;
        Strength = s;
        Agility = a;
        Intelligence = i;
    }

    void Fights(Champion other) {
        int otherPoints = other.Strength + other.Agility + other.Intelligence;
        int thisPoints = this.Strength + this.Agility + this.Intelligence;
        if (thisPoints == otherPoints) {
            System.out.println("Ничья");
            return;
        }
        System.out.println(otherPoints > thisPoints ? other.Name : this.Name + " wins!");
    }
}


