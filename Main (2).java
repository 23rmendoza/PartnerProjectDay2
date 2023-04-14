import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int life=85;
    while(life>0){
      System.out.println("...You awake in a creepy abanoned house...");
      System.out.println("What would you like to do?");
      System.out.println(" *go outside* ");
      System.out.println(" *explore house* ");
      String move=input.nextLine();
      switch(move){
        case "go outside":
          System.out.println("The sun seems to be setting as you look into a forest surrounding the mysterious house...");
          System.out.println("What do you want to do?");
          System.out.println(" *explore*");
          System.out.println("*go back inside*");
          String outside=input.nextLine();
            switch(outside){
            case "explore":
            System.out.println("The sun fully sets...you can't see in front of you...suddenly the ground gives up and you fall into a death trap...");
              System.out.println("who planted that there?"); 
              life-=20;
              break;
            case "go back inside":
              System.out.println("You decide to go back inside");
              System.out.println("There are some rooms to check out");
          break;
       case "explore house":
          System.out.println("Where to first?");
          System.out.println("*kitchen*");
          System.out.println("*bathroom*");
          System.out.println("*garage*");
          String rooms=input.nextLine();
            switch(rooms){
              case "kitchen":
                System.out.println("Theres some cans of food, you take it with you.");
              break;
              case "bathroom":
                life++;
                System.out.println("You find a medkit");
                System.out.println("+1");
                break;
                case "garage":
                System.out.println("There's an old wrecked car...should you test it out?");
                System.out.println("*yes*");
                System.out.println("*no*");
                String car=input.nextLine();
                  switch(car){
                    case "no":
                      System.out.println("You're right to risky.");
                      life++;
                      break;
                    case "yes":
                      System.out.println("Luckily the keys are already in the egnition!");
                      System.out.println("You hit the case and immediatley crash.");
                      life-=20;
                      break;
        default:
            System.out.println("\uD83D\uDE15");
            System.out.println("Unrecognized response, please try again.");
      }
    }
    System.out.println("\u2620");
  }
  }
    }
  }
}


