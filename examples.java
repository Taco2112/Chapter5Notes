import java.util.Scanner;


public class examples{
  public static void main(String args[]){

//Then we need to make an obejct of the Scanner
  Scanner input = new Scanner(System.in);

//Lastly, we can then use the scanner to take input
  System.out.println("Please enter amount you sold");
  int sales = input.nextInt();
  System.out.println("your sales are " + sales);
  if(sales < 100000 ){
System.out.println("You suck your fired  !");
}else if(sales >= 100000 && sales <= 300000){
System.out.println("Your are average, good job");
}
if(sales > 300000){
  System.out.println("Great Job, Take my money  ");
}


  }
}
