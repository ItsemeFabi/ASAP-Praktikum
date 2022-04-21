import java.util.Scanner;
class Main
{
    public static void main(String[] args)
    {          
        
        double Einsatz = 234.56;
        double counter500 = 0;
        double counter200 = 0;
        double counter100 = 0;
        double counter50 = 0;
        double counter20 = 0;
        double counter10 = 0;
        double counter5 = 0;
        double counter2 = 0;
        double counter1= 0;
        double counter050= 0;
        double counter020= 0;
        double counter010= 0;
        double counter005= 0;
        double counter002= 0;
        double counter001= 0;
        while (Einsatz>0.0)
        {
                if(Einsatz>500.0)
                {
                    counter500 = Einsatz/500.0;
                    Einsatz = Einsatz%500.0;
                    
                }
                else if(Einsatz>200.0)
                {
                    counter500 = Einsatz/200.0;
                    Einsatz = Einsatz%200.0;
                }
                else if(Einsatz>100.0)
                {
                    counter500 = Einsatz/100.0;
                    Einsatz = Einsatz%100.0;
                }
                else if(Einsatz>50.0)
                {
                    counter500 = Einsatz/50.0;
                    Einsatz = Einsatz%50.0;
                }
                else if(Einsatz>20.0)
                {
                    counter500 = Einsatz/20.0;
                    Einsatz = Einsatz%20.0;
                }
                else if(Einsatz>10.0)
                {
                    counter500 = Einsatz/10.0;
                    Einsatz = Einsatz%10.0;
                }
                else if(Einsatz>5.0)
                {
                    counter500 = Einsatz/5.0;
                    Einsatz = Einsatz%5.0;
                }
                else if(Einsatz>2.0)
                {
                    counter500 = Einsatz/2.0;
                    Einsatz = Einsatz%2.0;
                }
                else if(Einsatz>1.0)
                {
                    counter500 = Einsatz/1.0;
                    Einsatz = Einsatz%1.0;
                }
                else if(Einsatz>0.5)
                {
                    counter500 = Einsatz/0.5;
                    Einsatz = Einsatz%0.5;
                }
                else if(Einsatz>0.2)
                {
                    counter500 = Einsatz/0.2;
                    Einsatz = Einsatz%0.2;
                }
                else if(Einsatz>0.1)
                {
                    counter500 = Einsatz/0.1;
                    Einsatz = Einsatz%0.1;
                }
                else if(Einsatz>0.05)
                {
                    counter500 = Einsatz/0.05;
                    Einsatz = Einsatz%0.05;
                }
                else if(Einsatz>0.02)
                {
                    counter500 = Einsatz/0.02;
                    Einsatz = Einsatz%0.02;
                }
                else if(Einsatz>0.01)
                {
                    counter500 = Einsatz/0.1;
                    Einsatz = Einsatz%0.01;
                }
        }
        System.out.println("----------------");
        System.out.println("Berechnung fertig");
        System.out.println("----------------");
        System.out.println("500-Euro Scheine: "+counter500);
        System.out.println("200-Euro Scheine: "+counter200);
        System.out.println("100-Euro Scheine: "+counter100);
        System.out.println("50-Euro Scheine: "+counter50);
        System.out.println("20-Euro Scheine: "+counter20);
        System.out.println("10-Euro Scheine: "+counter10);
        System.out.println("5-Euro Scheine: "+counter5);
        System.out.println("2-Euro Münzen: "+counter2);
        System.out.println("1-Euro Münzen: "+counter1);
        System.out.println("50-Cent Münzen: "+counter050);
        System.out.println("20-Cent Münzen: "+counter020);
        System.out.println("10-Cent Münzen: "+counter010);
        System.out.println("5-Cent Münzen: "+counter005);
        System.out.println("2-Cent Münzen"+counter002);
        System.out.println("1-Cent Münzen"+counter001);
        }
        System.out.println("---------------------------");

    }
}

