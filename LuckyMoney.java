import java.util.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.*;
import java.math.*;
import java.lang.*;

class LuckyMoney {
    public static int luckyMoneyAlgo(int money, int giftee){
        int max_luck = money/8;
        int temp = 0;
        if(max_luck>=giftee){
            return giftee;
        }
        else{
            int max_eights = 8 * max_luck;
            if(((giftee - max_luck) == 1 ) && ((money - max_eights)==4 || (money - max_eights)== 0) || (money-max_eights < max_luck)){
                temp = max_luck -1;
            }else{
                temp = max_luck;
            }
        }
        if (temp<0){
            return 0;
        }else{
            return temp;
        }

    }
// public static void main(String[] args) { 
// LuckyMoney lucky = new LuckyMoney();
// int soul = lucky.luckyMoneyAlgo(8,1);
// System.out.println(soul);
// }

@Test
    public void testNumberOfEightsInLuckyMoney(){
        assertEquals(0, luckyMoneyAlgo(12, 2));
        assertEquals(2, luckyMoneyAlgo(24, 4));
        assertEquals(8, luckyMoneyAlgo(80, 8));
        assertEquals(1, luckyMoneyAlgo(17, 4));
        assertEquals(0, luckyMoneyAlgo(7, 2));
        assertEquals(1, luckyMoneyAlgo(13, 2));
        assertEquals(1, luckyMoneyAlgo(11, 2));

    }

}