import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LuckyMoneyTest {
LuckyMoney luckyMoney = new LuckyMoney();

    @Test
    public void testNumberOfEightsInLuckyMoney(){
        assertEquals(0, luckyMoney.luckyMoneyAlgo(12, 2));
        assertEquals(2, luckyMoney.luckyMoneyAlgo(24, 4));
        assertEquals(8, luckyMoney.luckyMoneyAlgo(80, 8));
        assertEquals(1, luckyMoney.luckyMoneyAlgo(17, 4));
        assertEquals(0, luckyMoney.luckyMoneyAlgo(7, 2));
        assertEquals(1, luckyMoney.luckyMoneyAlgo(13, 2));
        assertEquals(1, luckyMoney.luckyMoneyAlgo(11, 2));

    }

    @Test
    public void edgeCases10_10(){
        assertEquals(0, luckyMoney.luckyMoneyAlgo(10, 10));
    }

    @Test
    public void edgeCases10_3(){
        assertEquals(1, luckyMoney.luckyMoneyAlgo(10, 3));
    }

    @Test
    public void edgeCases10_4() {
        assertEquals(0, luckyMoney.luckyMoneyAlgo(10, 4));
    }
    
    @Test
    public void edgeCases25_4(){
        assertEquals(3, luckyMoney.luckyMoneyAlgo(25, 4));
        assertEquals(3, luckyMoney.luckyMoneyAlgo(26, 4));
        assertEquals(3, luckyMoney.luckyMoneyAlgo(27, 4));
        assertEquals(2, luckyMoney.luckyMoneyAlgo(28, 4));
    }

    @Test
    public void edgeCases60_18(){
        assertEquals(6, luckyMoney.luckyMoneyAlgo(60, 18));
    }

    @Test
    public void edgeCases60_19(){
        assertEquals(5, luckyMoney.luckyMoneyAlgo(60, 19));
    }

}
