package mx.tec.lab;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class TestswingApplicationTests {

    TestswingApplication application = new TestswingApplication();

    @Test
    void givenTwoIntegers_WhenSum_ThenCorrectResult() {
        // Given 5 and 7
        application.numberOneTextField.setText("5");
        application.numberTwoTextField.setText("7");
        String expectedResult = "12";

        // When operation is sum
        application.operationButton.doClick();

        // Then result is 12
        String actualResult = application.resultTextField.getText();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void givenAnIncorrectInput_WhenSum_ThenFieldsCleared() {
        // Given 5 and 7
        application.numberOneTextField.setText("5a");
        application.numberTwoTextField.setText("7");
        String expectedResult = "";

        // When operation is sum
        application.operationButton.doClick();

        // Then result is 12
        String actualResult = application.resultTextField.getText();
        assertEquals(expectedResult, actualResult);
        actualResult = application.numberOneTextField.getText();
        assertEquals(expectedResult, actualResult);
    }

}
