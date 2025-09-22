import java.util.Scanner;
public class PlayerSelection {
    public static void main(String[] args){
        Scanner values= new Scanner(System.in);
        String name;
        int age;
        double height;
        int jersey_number;
        int weight;
        String category;
        String position;
        String eligible;
        String attacker_jersey;
        String decision;
        

        System.out.println("please enter your name:");
        name=values.next();
        System.out.println("please enter your age:");
        age=values.nextInt();
        System.out.println("please enter your height:");
        height=values.nextDouble();
        System.out.println("please enter your weight:");
        weight=values.nextInt();
        System.out.println("please enter your jersey number:");
        jersey_number=values.nextInt();

        final float pound=0.45359237f;
        final int meter=100;
        float lbs_kgs=weight*pound;
        double m_to_cm=height/meter;

        //Category
        if (age<20){
            category="Rising star";
        }
        else if (age<=30) {
            category="Prime player";
            
        } else {
            category="Veteran";
            
        }
        
        //position
        switch (jersey_number) {
            case 1:
                position="Goalkeeper";
                System.out.println("position is:"+ position);
                break;

            case 2:
            case 5:
                position="Defender";
                System.out.println("position is:"+ position);
                break;

            case 6:
            case 8:
                position="Midfielder";
                System.out.println("position is:"+ position);
                break;
                

            case 7:
            case 11:
                position="Winger";
                System.out.println("position is:"+ position);
            
            case 9:
                position="Striker";
                System.out.println("position is:"+ position);
                break;

            case 10:
                position="Playmaker";
                System.out.println("position is:"+ position);
                break;
            
            
            default:
                position="Unknown";
                System.out.println("Player position not known");
                break; 
        }
        //lineup decision
        if (category=="Prime player" && weight<80 ){
            decision=" Player in starting lineup";
        }
        else{
            decision=" Player on bench";
        }

        //attacker jersey
        attacker_jersey=( position=="Defender" || position=="Goalkeeper")? "Yes":"No";

        //Final decision
        eligible = (18<=age && age<=35 && weight>=90)? "Play":"Rest";
        System.out.println(eligible);

        System.out.println("Player: "+name);
        System.out.println("Age: " + age + " (" + category + ")");
        System.out.println("Height: "+m_to_cm);
        System.out.println("Weight: "+lbs_kgs);
        System.out.println("Jersey: "+ jersey_number);
        System.out.println("Position: "+position);
        System.out.println("Attacker jersey:"+ attacker_jersey);
        System.out.println("Eligibility: "+eligible);
        System.out.println("Lineup Decision: "+ decision);

        values.close();

    }
    
}
