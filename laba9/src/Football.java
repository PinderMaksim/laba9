public class Football {
    Team team1;
    Team team2;

    public Football(Team team1, Team team2) {
        this.team1 = team1;
        this.team2 = team2;

    }


    public void scoreGoal(int a,int b ) {
        if (a > b) {
            if (team1.isHome()) {
                System.out.println("Результат вдома real (Santiago Bernabeu): real " + a + ":" + b + " arsenal Winner Real");
            } else {
                System.out.println("Результат в гостях real (Stadion Park) real :  " + a + ":" + b + " arsenal Winner Real");
            }
        } else if (a == b) {
            System.out.println("Результат: real " + a + ":" + b + " arsenal Нічия");
        } else {
            if (team2.isHome()) {
                System.out.println("Результат вдома arsenal (Stadion Park): real  " + a + ":" + b + " arsenal Winner Arsenal");
            } else {
                System.out.println("Результат в гостях arsenal (Santiago Bernabeu): real " + a + ":" + b + " arsenal Winner Arsenal");
            }
        }
    }
}