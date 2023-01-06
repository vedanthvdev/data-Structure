
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class LuckyMoneyTest {

    static LuckyMoney lucky = new LuckyMoney();

    @Test
    public void testNumberOfEightsInLuckyMoney(){
        assertEquals(0, lucky.luckyMoneyAlgo(12, 2));
        assertEquals(2, lucky.luckyMoneyAlgo(24, 4));
        assertEquals(8, lucky.luckyMoneyAlgo(80, 8));
        assertEquals(1, lucky.luckyMoneyAlgo(17, 4));
        assertEquals(0, lucky.luckyMoneyAlgo(7, 2));
        assertEquals(1, lucky.luckyMoneyAlgo(13, 2));
        assertEquals(1, lucky.luckyMoneyAlgo(11, 2));

    }
}
