class Main {  
    public static void main(String[] args) {  
        Random zufall = new Random();  
 int farbe;  
 int counter = 0;  
 int guess = 0;  
 int guthaben = 1000;  
 int einsatz = 50;  
 int mostm = 1000;  
 while ((guthaben > 0) && (guthaben < 1000000)) {  
            farbe = zufall.nextInt(1);  
  counter = counter + 1;  
  
  guthaben = guthaben - einsatz;  
 if (farbe == guess) {  
                guthaben = guthaben + 2 * einsatz;  
  einsatz = 50;  
  guess = zufall.nextInt(1);  
 if (guthaben > mostm) {  
                    mostm = guthaben;  
  }  
  
            }  
             else if ((farbe == 1) && (guess == 0)) {  
                einsatz = einsatz * 2;  
  } else if ((farbe == 0) && (guess == 1)) {  
                einsatz = einsatz * 2;}  
  
  
            System.out.println("Guthaben: "+guthaben);  
  }  
        System.out.println("-----------------------");  
  System.out.println("Simulation ended");  
  System.out.println("-----------------------");  
  System.out.println("Spieldauer: "+counter+" Runden");  
  System.out.println("Meistes Geld: "+mostm+" €");  
  }  
}