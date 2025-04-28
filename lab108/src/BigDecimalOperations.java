import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalOperations {

//    Converts a BigDecimal to a double rounded to the nearest hundredth

    public static double toDoubleRoundedToHundredth(BigDecimal value) {
        BigDecimal rounded = value.setScale(2, RoundingMode.HALF_UP);
        return rounded.doubleValue();
    }

//    Negates a BigDecimal, rounds it to the nearest tenth

    public static BigDecimal negateAndRoundToTenth(BigDecimal value) {
        BigDecimal negated = value.negate();
        BigDecimal rounded = negated.setScale(1, RoundingMode.HALF_UP);
        return rounded;
    }
}
