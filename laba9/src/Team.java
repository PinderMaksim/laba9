import java.util.Random;
public class Team {//обєкт класу поля
    String name;
    int positionTeam;
    String kitColor;

    public Team(String name, int positionTeam,String kitColor){ //конструктор класу для ініціалізації полів
        this.name=name;
        this.positionTeam=positionTeam;
        this.kitColor=kitColor;
    }

    public String getName() { //повертає назву команди
        return name;
    }
    public String getKitColor() { //повертає колір форми
        return kitColor;
    }


    public boolean isHome(){ // чи грає команда дома чи в гостях тобто якщо true або false
        Random random = new Random();
        return random.nextBoolean();
    }

    public int getScore(){// метод для рандомного рахунку від 0 до 4 і повертає результат матчу
        int v =(int) (Math.random()*5);
        System.out.println(v);
        return v;
    }

}
