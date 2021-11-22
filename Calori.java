

package calori;

import java.util.Scanner;

public class Calori {

  public static void main(String[] args) {
 
        Scanner k =new Scanner(System.in);
        
        System.out.println("Hello!!..");
        System.out.println("let me calculate how much calories you need to maintain your weight :)");
        System.out.println("First of all please select your gender");
        System.out.println("1- Male");
        System.out.println("2- Female");
        byte gender=k.nextByte();
        
        switch(gender){
            
            case 1: 
                System.out.println("please enter your surname..");
                String manName=k.next();
                System.out.println("Hello Mr."+manName);
                System.out.println("Please enter your weight in KG: ");
                double manWeight=k.nextDouble();
                System.out.println("Please enter your height in cm: ");
                double manHeight=k.nextDouble();
                System.out.println("Please enter your age: ");
                int manAge=k.nextInt();
                double manBMR= 66.0+(6.3*2.20462262185*manWeight)+(12.9*0.393700787*manHeight)-(6.8*manAge);
                System.out.println("Select how often you do sports at week ");
                System.out.println("1- Sedentary \n2- Somewhat active \n3- 3-4 days in week \n4- Everyday");
                byte manSport=k.nextByte();
                switch(manSport){
                    
                    case 1:
                        double increase=manBMR*0.2;
                        manBMR+=increase;
                        System.out.println("Mr."+manName+"You need "+manBMR+" of calories.\nwhich means you need to consume "+manBMR/230+" of chocolate bars. ");System.exit(0);
                        
                    case 2:
                        increase=manBMR*0.3;
                        manBMR+=increase;
                        System.out.println("Mr."+manName+"You need "+manBMR+" of calories.\nwhich means you need to consume "+manBMR/230+" of chocolate bars. ");System.exit(0);
                        
                    case 3:
                        increase=manBMR*0.4;
                        manBMR+=increase;
                        System.out.println("Mr."+manName+"You need "+manBMR+" of calories.\nwhich means you need to consume "+manBMR/230+" of chocolate bars. ");System.exit(0);
                        
                    case 4:
                        increase=manBMR*0.5;
                        manBMR+=increase;
                        System.out.println("Mr."+manName+"You need "+manBMR+" of calories.\nwhich means you need to consume "+manBMR/230+" of chocolate bars. ");System.exit(0);
                 
                    default: 
                }
                
                
                
            case 2:
                System.out.println("please enter your surname..");
                String womanName=k.next();
                System.out.println("Hello Mrs. "+womanName);
                System.out.println("Please enter your weight in KG: ");
                double womanWeight=k.nextDouble();
                System.out.println("Please enter your height in cm: ");
                double womanHeight=k.nextDouble();
                System.out.println("Please enter your age: ");
                int womanAge=k.nextInt();
                double womanBMR= 655+(4.3*2.20462262185*womanWeight)+(4.7*0.393700787*womanHeight)-(4.7*womanAge);
                System.out.println("Select how often you do sports at week ");
                System.out.println("1- Sedentary \n2- Somewhat active \n3- 3-4 days in week \n4- Everyday");
                byte womanSport=k.nextByte();
                 switch(womanSport){
                    
                    case 1:
                        double increase=womanBMR*0.2;
                        womanBMR+=increase;
                        System.out.println("Mrs."+womanName+"You need "+womanBMR+" of calories.\nwhich means you need to consume "+womanBMR/230+" of chocolate bars. ");System.exit(0);
                        
                    case 2:
                        increase=womanBMR*0.3;
                        womanBMR+=increase;
                        System.out.println("Mrs."+womanName+"You need "+womanBMR+" of calories.\nwhich means you need to consume "+womanBMR/230+" of chocolate bars. ");System.exit(0);
                        
                    case 3:
                        increase=womanBMR*0.4;
                        womanBMR+=increase;
                        System.out.println("Mrs."+womanName+"You need "+womanBMR+" of calories.\nwhich means you need to consume "+womanBMR/230+" of chocolate bars. ");System.exit(0);
                        
                    case 4:
                        increase=womanBMR*0.5;
                        womanBMR+=increase;
                        System.out.println("Mrs."+womanName+"You need "+womanBMR+" of calories.\nwhich means you need to consume "+womanBMR/230+" of chocolate bars. ");System.exit(0);
                        
                    default: 
                }
                
            default : System.out.println("Please select your choice orrectly :)");
                
        }
    }
}

