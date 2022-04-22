import java.util.Random;
class Main {  
public static void main(String[] args) {  
 Random zufall = new Random();  
 int farbe;  
 int anzahl = 1;
 int counter = 0;
 int gewinnzahl = 0;  
 int guess = 0;  
 int guthaben = 2000;  
 int einsatz = 50;  
 int mostm = 1000;
 int mingewinn = 1000;
 int maxzahl = 0;
 int minzahl = 10000;
 while(anzahl<10000)  {
 while ((guthaben > 0) && (guthaben < 10000000)) {  
            farbe = zufall.nextInt(2);  
  counter = counter + 1;  
  
  guthaben = guthaben - einsatz;  
 if (farbe == guess) {  
       gewinnzahl = gewinnzahl + 1;
                guthaben = guthaben + 2 * einsatz;  
  einsatz = 50;  
  guess = zufall.nextInt(2);  
 if (guthaben > mostm) {  
                    mostm = guthaben;  

  }  
  
            }  
             else if ((farbe == 2) && (guess == 1)) {  
                einsatz = einsatz * 2;  
  } else if ((farbe == 1) && (guess == 2)) {  
                einsatz = einsatz * 2;}  
  
  
             
  }  
        //System.out.println("-----------------------");  
  //System.out.println("Simulation ended");  
  //System.out.println("-----------------------");  
  //System.out.println("Spieldauer: "+counter+" Runden");  
  //System.out.println("Meistes Geld: "+mostm); */ 
  guthaben = 1000;
  if(counter>maxzahl)
{
      maxzahl = counter;
}
  else if(counter<minzahl)
  {
        minzahl = counter;
  }
  else if(gewinnzahl<mingewinn)
  {
        mingewinn = gewinnzahl;
  }
  counter = 0;
  //System.out.println("Aktuelle meistes Geld: "+mostm);
  System.out.println("Aktuelle simulierte Besucher: "+ anzahl);
  anzahl++;
  }  
  System.out.println("Meiste Runden: "+maxzahl);
  System.out.println("Meistes Geld: " + mostm);
  //System.out.println("Wenigste Runden: "+ minzahl);
}
}