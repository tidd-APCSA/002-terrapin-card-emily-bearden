public class TerrapinCard{

private double balance;
private double amount;

public TerrapinCard(double balance) {
this.balance = balance;
}

public void payEconomical() {
 if (balance > 2.50){
 balance -= 2.50;
 }
}

public void payGourmet(){
  if (balance > 4.0){
  balance -= 4.0;
  }
}

public void loadMoney(double amount){
  if (balance + amount < 150){
    if (amount < 0 ){
      balance = balance;
    }
    else {
      balance = balance + amount;
    }
  }
if (balance + amount > 150) {
    balance = 150;

    }
  }


public double getBalance(){
  return balance;
}

public String toString()
{
return "This card has " + balance + " dollars";
}
}


