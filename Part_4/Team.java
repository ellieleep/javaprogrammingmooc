import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Team {
    private String home;
    private String visitor;
    private int homePoints;
    private int visitorPoints;
    public Team(String HomeTeam, String VisitorTeam, int HomeTeamPoints, int VisitorTeamPoints){
        this.home = HomeTeam;
        this.visitor = VisitorTeam;
        this.homePoints = HomeTeamPoints;
        this.visitorPoints = VisitorTeamPoints;
    }
    @Override
    public String toString(){
        return this.home+" "+this.homePoints+" "+this.visitor+" "+this.visitorPoints;
    }
    public static void main(String[] args){
        ArrayList<Team> Games = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("File:");
        String fileName = scanner.nextLine();
        try(Scanner file = new Scanner(Paths.get("Part_4/"+fileName))){
            while(file.hasNext()){
                String[] fileLine = file.nextLine().split(",");
                Games.add(new Team(fileLine[0],fileLine[1],Integer.valueOf(fileLine[2]),Integer.valueOf(fileLine[3])));
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("Team:");
        String teamPrompt = scanner.nextLine();
        System.out.println("Games: ");
        int count = 0;
        for(int i = 0; i < Games.size(); i++){
            if(Games.get(i).home.equals(teamPrompt) || Games.get(i).visitor.equals(teamPrompt)){
                count++;
            }
        }
        System.out.println(count);
        int wins = 0;
        int loses = 0;
        for(int i = 0; i< Games.size(); i++){
            if((Games.get(i).home.equals(teamPrompt) || Games.get(i).visitor.equals(teamPrompt))){
                if(Games.get(i).home.equals(teamPrompt) && (Games.get(i).homePoints > Games.get(i).visitorPoints)){
                    wins++;
                }
                else if(Games.get(i).visitor.equals(teamPrompt) && (Games.get(i).visitorPoints > Games.get(i).homePoints)){
                    wins++;
                }
                else{
                    loses++;
                }
            }
        }
        System.out.println("Wins: "+wins);
        System.out.println("Loses: "+loses);
    }
}


