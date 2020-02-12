package sample;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import java.lang.Object;
import java.lang.String;
import java.util.logging.Logger;


public class Controller {
    @FXML
    Label helper;
    @FXML
    Button nullf;
    @FXML
    Button truef;
    @FXML
    Button falsef;
    @FXML
    Button first;
    @FXML
    Button second;
    @FXML
    Button third;
    @FXML
    Button fourth;
    @FXML
    Button fifth;
    @FXML
    Button sixth;
    @FXML
    Button seventh;
    @FXML
    Button eighth;
    @FXML
    Button ninth;
    @FXML
    Button tenth;
    @FXML
    Button eleventh;
    @FXML
    Button restart;
    @FXML
    Button equal;
    @FXML
    TextArea result;
    @FXML
    Button eqviv;
    @FXML
    Button not1;
    @FXML
    Button not2;
    @FXML
    Button yes1;
    @FXML
    Button yes2;
    final Logger logger = Logger.getLogger("Main");
    private String firstValue = "0";
    private String secondValue = "0";
    private String action = "c0";
    private Integer stage = 0;

    public void onClick() {
        if (stage == 3) {
            Calculator calculator = new Calculator(firstValue, secondValue, action);
            //logger.info("New object is created");
            firstValue = calculator.toCalculate();
            result.setText(String.valueOf(calculator.toCalculate()));
            //logger.info("The result is " + result);


        }
    }


    public void nullfClick(ActionEvent actionEvent) {
        if(stage == 0 || stage == 1) {
            helper.setText("null");
            firstValue = "2";
            stage = 1;
            logger.info("First value is null");
        }
        else if (stage == 2) {

            stage = 3;
            secondValue = "2";
            logger.info("Second value is null");
            helper.setText(helper.getText() + " null");
        }
        else if (stage == 3){
            secondValue = "2";
            logger.info("Second value is null");
            helper.setText(helper.getText().substring(0, helper.getText().length() - 4) + "null");
        }
        result.setText("null");


    }
    public void initialize()
    {
        helper.setText("Click on first value");
        logger.info("Application has started");
    }


    public void truefClick(ActionEvent actionEvent) {
        if(stage == 0 || stage == 1) {
            helper.setText("1");
            firstValue = "1";
            stage = 1;
            logger.info("First value is 1");
        }
        else if (stage == 2) {

            stage = 3;
            secondValue = "1";
            logger.info("Second value is 1");
            helper.setText(helper.getText() + " " + secondValue);
        }
        else if (stage == 3){
            secondValue = "1";
            logger.info("Second value is 1");
            helper.setText(helper.getText().substring(0, helper.getText().length() - 1) + "1");


        }
        result.setText("1");
    }

    public void falsefClick(ActionEvent actionEvent) {
        if(stage == 0 || stage == 1) {
            helper.setText("0");
            firstValue = "0";
            logger.info("First value is 0");
            stage = 1;
        }
        else if (stage == 2) {
            stage = 3;
            secondValue = "0";
            logger.info("Second value is 0");
            helper.setText(helper.getText() + " 0");
        }
        else if (stage == 3){
            secondValue = "0";
            logger.info("Second value is 0");
            helper.setText(helper.getText().substring(0, helper.getText().length() - 1) + "0");


        }


        result.setText("0");
    }

    public void OnClick(ActionEvent actionEvent) {
        if (stage == 3) {
            Calculator calculator = new Calculator(firstValue, secondValue, action);
            //logger.info("New object is created");
            firstValue = calculator.toCalculate();
            result.setText(String.valueOf(calculator.toCalculate()));
            logger.info("The result is " + result.getText());}
    }
    public void actionOnAction(String b){
        if (stage == 0) {
            action = "1";
        }
        else if (stage == 1){
            action = b;
            logger.info("Action is chosen, next step");
            helper.setText(helper.getText() + " " + action);
            stage = 2;
        }
        else if (stage == 2){
            action = b;
            logger.info("Stage number 2");
            logger.info("Action is chosen, next step");
            helper.setText(helper.getText().substring(0,(helper.getText().lastIndexOf(" "))) + " "  + action);


        }
        else if(stage == 3){
            logger.info("Stage number 3");
            onClick();
            action = b;
            stage = 2;
            helper.setText(helper.getText() + " " + action);


        }
    }



    public void firstClick() {
        actionOnAction("v");
        logger.info("Action is disjunction");
    }

    public void secondClick() {
        actionOnAction("^");
        logger.info("Action is conjuncture");
    }

    public void thirdClick() {
        actionOnAction("←");
        logger.info("Action is reverse implication");
    }

    public void fourthClick() {
        actionOnAction("→");
        logger.info("Action is implication");
    }

    public void fifthClick() {
        actionOnAction("↓");
        logger.info("Arrow of Pierce");
    }

    public void sixthClick() {
        actionOnAction("|");
        logger.info("Action is Barcode Scheffer");
    }

    public void seventhClick() {
        actionOnAction("!←");
        logger.info("Action is negation of the inverse implication");
    }

    public void eighthClick() {
        actionOnAction("!→");
        logger.info("Action is negation of the implication");
    }


    public void ninthClick() {
        actionOnAction("c0");
        logger.info("Action is constant 0");
    }

    public void tenthClick() {
        actionOnAction("c1");
        logger.info("Action is constant 0");
    }

    public void eleventhClick() {
        actionOnAction("⊕");
        logger.info("Action is Negation of equivalence");
    }

    public void twelfthclick(ActionEvent actionEvent) {
        actionOnAction("~");
        logger.info("Action is Equivalence");
    }

    public void thirteenthclick(ActionEvent actionEvent)
    {
        actionOnAction("not1");
        logger.info("Action is Negation of the first value");
    }

    public void fourteenthclick(ActionEvent actionEvent)
    {
        actionOnAction("not2");
        logger.info("Action is Negation of the second value");
    }

    public void fifteenthclick(ActionEvent actionEvent)
    {
        actionOnAction("yes1");
        logger.info("Action is choosing first value");
    }

    public void sixteenthclick(ActionEvent actionEvent)
    {
        actionOnAction("yes2");
        logger.info("Action is choosing second value");
    }

    public void restartClick() {
        logger.info("Application have been restarted");
        stage = 0;
        firstValue = "0";
        secondValue = "0";
        action = "1";
        helper.setText("Click on the first value");
        result.setText("");


    }


}
