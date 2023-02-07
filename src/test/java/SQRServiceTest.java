import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.sqr.SQRService;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/limit_test.csv")
        // тестирует работу для диапазона с 0 возможных значений
    public void shdCalcForZeroIntervalHits(int lowerLimit, int upperLimit, int expectedHits) {
        SQRService count = new SQRService();
        int actualHits = count.enumerateSquareIntervalHits(lowerLimit, upperLimit);
        Assertions.assertEquals(expectedHits, actualHits);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/limit_test.csv")
        //тестирует работу для диапазона, включающего крайниие значения из перебираемых чисел (т.е. 10 и 99)
    public void shdCalcForIntervalLimitValues(int lowerLimit, int upperLimit, int expectedHits) {
        SQRService count = new SQRService();
        int actualHits = count.enumerateSquareIntervalHits(lowerLimit, upperLimit);
        Assertions.assertEquals(expectedHits, actualHits);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/limit_test.csv")
        //тестирует работу для случая, если перепутаны максимальное и минимальное значения
    public void shdCalcForMixedUpLimitValues(int lowerLimit, int upperLimit, int expectedHits) {
        SQRService count = new SQRService();
        int actualHits = count.enumerateSquareIntervalHits(lowerLimit, upperLimit);
        Assertions.assertEquals(expectedHits, actualHits);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/limit_test.csv")
        //тестирует работу при совпадении крайних значений диапазона, являющихся при этом квадратом
    public void shdCalcForOverlappingLimitValuesThatAreSquare(int lowerLimit, int upperLimit, int expectedHits) {
        SQRService count = new SQRService();
        int actualHits = count.enumerateSquareIntervalHits(lowerLimit, upperLimit);
        Assertions.assertEquals(expectedHits, actualHits);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/limit_test.csv")
        //тестирует работу при совпадении крайних значений диапазона, которые при этом квадратами НЕ являются
    public void shdCalcForOverlappingLimitValuesThatAreNotSquare(int lowerLimit, int upperLimit, int expectedHits) {
        SQRService count = new SQRService();
        int actualHits = count.enumerateSquareIntervalHits(lowerLimit, upperLimit);
        Assertions.assertEquals(expectedHits, actualHits);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/limit_test.csv")
        //тестирует поведение при границах диапазона, превосходящих разброс значений, т.е. за пределами [100;9801]
    public void shdCalcForLimitValuesOutOfInterval(int lowerLimit, int upperLimit, int expectedHits) {
        SQRService count = new SQRService();
        int actualHits = count.enumerateSquareIntervalHits(lowerLimit, upperLimit);
        Assertions.assertEquals(expectedHits, actualHits);
    }
}
