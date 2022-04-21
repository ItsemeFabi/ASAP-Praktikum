

class Main
{
    public static void main(String[] args)
    {      
        
        double Einsatz = 23466.53;
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
                    counter500 = Math.floor(Einsatz/500.0);
                    Einsatz = Math.round((Einsatz%500.0)*100.0)/100.0;
                    
                }
                else if(Einsatz>200.0)
                {
                    counter200 = Math.floor(Einsatz/200.0);
                  
                    Einsatz =Math.round((Einsatz%200.0)*100.0)/100.0;
                  
                }
                else if(Einsatz>100.0)
                {
                    counter100 = Math.floor(Einsatz/100.0);
                    Einsatz = Math.round((Einsatz%100.0)*100.0)/100.0;
                }
                else if(Einsatz>50.0)
                {
                    counter50 = Math.floor(Einsatz/50.0);
                    Einsatz = Math.round((Einsatz%50.0)*100.0)/100.0;
                }
                else if(Einsatz>20.0)
                {
                    counter20 = Math.floor(Einsatz/20.0);
                    Einsatz = Math.round((Einsatz%20.0)*100.0)/100.0;
                  
                }
                else if(Einsatz>10.0)
                {
                    counter10 = Math.floor(Einsatz/10.0);
                    Einsatz = Math.round((Einsatz%10.0)*100.0)/100.0;
                 
                }
                else if(Einsatz>5.0)
                {
                    counter5 = Math.floor(Einsatz/5.0);
                    Einsatz = Math.round((Einsatz%5.0)*100.0)/100.0;
                }
                else if(Einsatz>2.0)
                {
                    counter2 = Math.floor(Einsatz/2.0);
                    Einsatz = Math.round((Einsatz%2.0)*100.0)/100.0;
                }
                else if(Einsatz>1.0)
                {
                    counter1 = Math.floor(Einsatz/1.0);
                    Einsatz = Math.round((Einsatz%1.0)*100.0)/100.0;
                }
                else if(Einsatz>0.5)
                {
                  
                  counter050 = Math.floor(Einsatz/0.5);
                    Einsatz = Math.round((Einsatz%0.5)*100.0)/100.0;
                  
                  
                }
                else if(Einsatz>0.2)
                {
                    counter020 = Math.floor(Einsatz/0.2);
                    Einsatz = Math.round((Einsatz%0.2)*100.0)/100.0;
                }
                else if(Einsatz>0.1)
                {
                    counter010 = Math.floor(Einsatz/0.1);
                    Einsatz = Math.round((Einsatz%0.1)*100.0)/100.0;
                }
                else if(Einsatz>0.05)
                {
                    counter005 = Math.floor(Einsatz/0.05);
                    Einsatz = Math.round((Einsatz%0.05)*100.0)/100.0;
                }
                else if(Einsatz>0.02)
                {
                    counter002 =Math.floor(Einsatz/0.02);
                    Einsatz = Math.round((Einsatz%0.02)*100.0)/100.0;
                  
                  
                }
                else if(Einsatz==0.01)
                {
                    counter001 = 1.0;
                   Einsatz = 0.0;
                  
                   
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
        System.out.println("2-Cent Münzen: "+counter002);
        System.out.println("1-Cent Münzen: "+counter001);
        System.out.println("---------------------------");

        }

    }