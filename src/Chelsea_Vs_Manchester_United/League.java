/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chelsea_Vs_Manchester_United;

/**
 *
 * @author STH
 */
public class League {

    public static void main(String[] args) {
        Team team1 = new Team();
        team1.TeamName = "Chelsea";

        Player player1 = new Player();
        player1.PlayerName = "Eden Hazard";
        Player player2 = new Player();
        player2.PlayerName = "Diego Costa";
        Player player3 = new Player();
        player3.PlayerName = "David Luiz";

        Team team2 = new Team();
        team2.TeamName = "Manchester United";

        team2.players = new Player[3];
        team2.players[0] = new Player();
        team2.players[0].PlayerName = "Zlatan Ibrahimivic";
        team2.players[1] = new Player();
        team2.players[1].PlayerName = "Juan Mata";
        team2.players[2] = new Player();
        team2.players[2].PlayerName = "Michael Carrick";

        Player[] footballers = {player1, player2, player3};
        team1.players = footballers;
        System.out.println(team1.TeamName + " : ");
        for (Player The_Players : team1.players) {
            System.out.println(The_Players.PlayerName);
        }
        System.out.println(" ");
        System.out.println(team2.TeamName + " : ");
        for (Player The_Players : team2.players) {
            System.out.println(The_Players.PlayerName);
        }

        Game game = new Game();
        game.Away_team = team1;
        game.Home_team = team2;
        Goal goal1 = new Goal();
        goal1.Goal_Time = 0.5;
        goal1.The_Players = game.Away_team.players[1];
        goal1.The_Team = game.Away_team;
        Goal goal2 = new Goal();
        goal2.The_Players = game.Away_team.players[0];
        goal2.The_Team = game.Away_team;
        goal2.Goal_Time = 15;
        Goal goal3 = new Goal();
        goal3.The_Players = game.Away_team.players[1];
        goal3.The_Team = game.Away_team;
        goal3.Goal_Time = 67;
        Goal[] the_goals = {goal1, goal2, goal3};
        game.goals = the_goals;
        System.out.println("");
        System.out.println("Goals:");
        for (Goal g : game.goals) {
            System.out.println("Goal Scored after " + g.Goal_Time + " mins by " + g.The_Players.PlayerName + " of the "
                    + g.The_Team.TeamName);
        }

//        System.out.println("Goal Scored after " + goal1.Goal_Time + " mins by " + player1.PlayerName + " of the " + team1.TeamName);
//        System.out.println("Goal Scored after " + goal2.Goal_Time + " mins by " + player1.PlayerName + " of the " + team1.TeamName);
//        System.out.println("Goal Scored after " + goal3.Goal_Time + " mins by " + team2.players[1].PlayerName + " of the " + team2.TeamName);
        System.out.println(" ");
        for (Player The_Players : team1.players) {

            String lastName = The_Players.PlayerName.substring(The_Players.PlayerName.indexOf(" "),
                    The_Players.PlayerName.length());
            
            //System.out.println(FullName);
            if (lastName.matches(".*Co.*")) {
                System.out.println("Found " + The_Players.PlayerName);

            }

        }
        //Player[] name= team2.players;
        for (Player The_Players : team2.players) {
            String lastName = The_Players.PlayerName.substring(The_Players.PlayerName.indexOf(" "),
                    The_Players.PlayerName.length());

            String firstName = The_Players.PlayerName.substring(The_Players.PlayerName.indexOf(The_Players.PlayerName),
                    The_Players.PlayerName.indexOf(lastName));
            String FullName = lastName + ", " + firstName;
            System.out.println(FullName);

        }

    }
}
