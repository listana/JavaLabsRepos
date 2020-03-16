package homework1;


//        Создать класс Champion  у которого будут поля (строка)Name, (число)Strenght, (число)Agility и (число)Intelligence,
//        реализовать метод который будет принимать 2 чемпиона, сравнивать их поля, и выводить в консоль сообщение "{имя чемпиона} win"
//        (возможны ничьи, на это случай должно быть свое сообщение)
//        подсказка: нужен счетчик

public class Champion {

    String name = "Default_Champion";
    int strength = 1;
    int agility = 1;
    int intelligence = 1;

    public Champion(String n, int s, int a, int i) {
        name = n;
        strength = s;
        agility = a;
        intelligence = i;
    }

    void Fights(Champion other) {
        int otherPoints = other.strength + other.agility + other.intelligence;
        int thisPoints = this.strength + this.agility + this.intelligence;
        if (thisPoints == otherPoints) {
            System.out.println("Ничья");
            return;
        }
        System.out.println(otherPoints > thisPoints ? other.name : this.name + " wins!");
    }
}


