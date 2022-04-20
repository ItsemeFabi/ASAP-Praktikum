import java.util.Scanner;
class Main {  
  public static void main(String args[]) { 
    Scanner in = new Scanner(System.in);
    int i = in.nextInt();
    int o = 0;
    System.out.println("-----------");
    System.out.println("Starting");
    System.out.println("-----------");
    while(o <= i){
      if(o == 0){System.out.println("0");}
      else if(o%5 == 0){ System.out.println("Bar");
        }
      else if(o%2 == 0){
        System.out.println("Foo");
      }
      else{
        System.out.println(o);
      }
      o++;
    }
    System.out.println("-----------");
    System.out.println("Completed");
    System.out.println("-----------");
  } 
}