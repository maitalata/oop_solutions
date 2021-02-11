public class SpecialNewClass extends NewClass implements SpecialNewClassInterface {

    public void specialBonus(){
        if(this.accountBalance  >= 20000000 && this.accountBalance <= 30000000){
            double interest = (this.accountBalance * 5)/100;
            this.accountBalance += interest;
        }else if(this.accountBalance > 30000000 && this.accountBalance < 50000000){
            double interest = (this.accountBalance * 7)/100;
            this.accountBalance += interest;
        }else if(this.accountBalance >= 50000000){
            double interest = (this.accountBalance * 10)/100;
            this.accountBalance += interest;
        }
    }
}
