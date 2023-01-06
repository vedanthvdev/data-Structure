import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LuckyMoneyTest {

    @Test
    public void testNumberOfEightsInLuckyMoney(){
        assertEquals(0, LuckyMoney.luckyMoneyAlgo(12, 2));
        assertEquals(2, LuckyMoney.luckyMoneyAlgo(24, 4));
        assertEquals(8, LuckyMoney.luckyMoneyAlgo(80, 8));
        assertEquals(1, LuckyMoney.luckyMoneyAlgo(17, 4));
        assertEquals(0, LuckyMoney.luckyMoneyAlgo(7, 2));
        assertEquals(1, LuckyMoney.luckyMoneyAlgo(13, 2));
        assertEquals(1, LuckyMoney.luckyMoneyAlgo(11, 2));

    }

    @Test
    public void edgeCases10_10(){
        assertEquals(0, LuckyMoney.luckyMoneyAlgo(10, 10));
    }

    @Test
    public void edgeCases10_3(){
        assertEquals(1, LuckyMoney.luckyMoneyAlgo(10, 3));
    }

    @Test
    public void edgeCases10_4(){
        assertEquals(0, LuckyMoney.luckyMoneyAlgo(10, 4));
    }

    // @Test
    // public void edgeCases60_18(){
    //     assertEquals(6, LuckyMoney.luckyMoneyAlgo(60, 18));
    // }

    // @Test
    // public void edgeCases60_19(){
    //     assertEquals(5, LuckyMoney.luckyMoneyAlgo(60, 19));
    // }

}
