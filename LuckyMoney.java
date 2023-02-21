
class LuckyMoney {
    int temp;
    int numOfGifteeThatCanGet8;

    public int luckyMoneyAlgo(int money, int giftee) {
        numOfGifteeThatCanGet8 = money / 8;
        temp = numOfGifteeThatCanGet8;

        //if all the giftees can get 8
        if (numOfGifteeThatCanGet8 >= giftee) {
            return giftee;
        }else {
            for (int i = 0; i < numOfGifteeThatCanGet8; i++) {
                algo(money, giftee);
            }

        }
        return temp;

    }
    
    public void algo(int money, int giftee) {
        int maxAmountWith8 = 8 * numOfGifteeThatCanGet8;

        int amountRemainingAfterGiving8s = money - maxAmountWith8;
        int peopleRemainingAfterGiving8s = giftee - numOfGifteeThatCanGet8;
        
        if (
            // When one giftee is remaining check if he will get 4/0 if he does reduce the number of people getting 8(First three in if block)
            (peopleRemainingAfterGiving8s == 1)
                    && (amountRemainingAfterGiving8s == 4 || amountRemainingAfterGiving8s == 0)
                    // if the remaining giftees who didn't get 8 exceed the money left
                    || (amountRemainingAfterGiving8s < peopleRemainingAfterGiving8s)) {
                temp--;
                numOfGifteeThatCanGet8--;
            }
    }
    
public static void main(String[] args) {
LuckyMoney luckyMoney = new LuckyMoney();
int soul = luckyMoney.luckyMoneyAlgo(60,19);
System.out.println(soul);
}

}