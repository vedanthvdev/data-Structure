
class LuckyMoney {


    public static int luckyMoneyAlgo(int money, int giftee){
        int max_luck = money/8;
        int temp = 0;

        //error conditions
        if(money<0 || money >100 || giftee<0 || giftee > 10){
            try {
                throw new Exception("Invalid input field \n-- > money: " + money + "\n-- > giftee: " + giftee);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return 0;
        }

        //if all the giftees can get 8
        if(max_luck>=giftee){
            return giftee;
        }

        else{
            int max_eights = 8 * max_luck;
            if(((giftee - max_luck) == 1 ) && ((money - max_eights)==4 || (money - max_eights)== 0) || (money-max_eights < max_luck)){
                temp = max_luck - 1 ;
            }else{
                temp = max_luck;
                int noOfPeopleThatWillBePaidfterEight = money - max_eights + max_luck;
                //10-4 condition
                if( giftee > noOfPeopleThatWillBePaidfterEight ){
                    temp = 0;
                }
            }
            
        }
        return temp;

    }
public static void main(String[] args) { 
int soul = LuckyMoney.luckyMoneyAlgo(10,11);
System.out.println(soul);
}

}