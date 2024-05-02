public class Main {
    public static void main(String[] args){
        Team real=new Team("real",2,"White");
        Team arsenal=new Team("arsenal",1,"Red");
        System.out.println("Матч: " + real.getName() + " проти " + arsenal.getName());
        System.out.println(real.getName() + " грає в " + arsenal.getKitColor() + " формі.");
        System.out.println(arsenal.getName() + " грає в " + real.getKitColor() + " формі.");
        Football team=new Football(real,arsenal);
        team.scoreGoal(arsenal.getScore(), real.getScore());

}}
