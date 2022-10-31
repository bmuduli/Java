import java.util.*;
class InsufficeientAmountException extends Exception{
    
    InsufficeientAmountException(String msg){
        super(msg);
    }
}

class InvalidAmountException extends Exception{
    
    InvalidAmountException(String msg1){
        super(msg1);
    }
}

public class Banking{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
            int TotalAmount=75000;
            System.out.print("Enter withdraw Amount :");
            int withdrawAmount=sc.nextInt();
        try{
            
            try{
                if(withdrawAmount<=0){
                    throw new InvalidAmountException("Invalid amount Entered");
                }
            }
                catch(InvalidAmountException iv){
                     iv.printStackTrace();
            }
            
            if(withdrawAmount > 0){
                if(withdrawAmount >= TotalAmount){
                    throw new InsufficeientAmountException("Insuffient amount avalilable in your Bank");
                }
                else{
                    System.out.println("Amount "+withdrawAmount+" withdraw Sucessfully");
                    TotalAmount =  TotalAmount- withdrawAmount;   
                } 
            }
        }
        catch(InsufficeientAmountException e){
             e.printStackTrace();
        }
        finally{
             System.out.println("Available Balance is : "+TotalAmount);
        }
     }
}
