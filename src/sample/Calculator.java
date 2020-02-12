package sample;

import java.util.logging.Logger;

public class Calculator {
    private String firstValue;
    private String secondValue;
    private String action;
    final Logger logger = Logger.getLogger("Main");
    Calculator(String firstValue, String secondValue, String action) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.action = action;
    }

    public void setFirstValue(String firstValue) {
        this.firstValue = firstValue;
    }

    public void setSecondValue(String secondValue) {
        this.secondValue = secondValue;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getFirstValue() {
        return firstValue;
    }

    public String getSecondValue() {
        return secondValue;
    }

    public String getAction() {
        return action;
    }
    public String toCalculate()
    {
        String value = "0";
        switch(action)
        {



            case "c0":
                value = "0";
                logger.info("Function of Constant 0 is done");
                break;

            case "c1":
                value = "1";
                logger.info("Function of Constant 1 is done");
                break;
            case "v":
            {
                if((firstValue.equals("0")) && (secondValue.equals("0"))) {
                    value = "0";
                    logger.info("First condition of disjunction");
                }
                else if ((firstValue.equals("2")) && (secondValue.equals("2"))) {
                    value = "null";
                    logger.info("Second condition of disjunction");
                }
                else if ((firstValue.equals("2")) && (secondValue.equals("0"))) {
                    value = "null";
                    logger.info("Third condition of disjunction");
                }
                else if ((firstValue.equals("0")) && (secondValue.equals("2"))) {

                    value = "null";
                    logger.info("Third condition of disjunction");
                }

                else value = "1";
                logger.info("Function of disjunction is done");
                break;
            }
            case "^":
                switch(firstValue) {
                    case "0": value = "0";
                        logger.info("First irdcondition of conjunction");
                        break;
                    case "1": switch (secondValue) {
                        case "0" : value = "0";
                            logger.info("Second condition of conjunction");
                            break;
                        case "1": value = "1";
                            logger.info("Third condition of conjunction");
                            break;
                        case "2": value = "null";  logger.info("Fourth condition of conjunction");
                    }

                        break;
                    case "2": switch (secondValue) {
                        case "0": value = "0";
                            logger.info("Fifth condition of conjunction");
                            break;
                        case "1": value = "null";
                            logger.info("Sixth condition of conjunction");
                            break;
                        case "2": value = "null";
                            logger.info("Seventh condition of conjunction");
                            break;
                    }
                }
                logger.info("Function of conjunction is done");
                break;
            case "←":
                switch (firstValue){
                    case "0": switch (secondValue){
                        case "0": value = "1";
                            logger.info("First condition of reverse implication");
                            break;
                        case "1": value = "0";

                            logger.info("Second condition of reverse implication");break;
                        case "2": value = "!null"; logger.info("Third condition of reverse implication"); break;
                    } break;
                    case "1": value = "1"; logger.info("Fourth condition of reverse implication"); break;
                    case "2": switch (secondValue){
                        case "0": value = "1"; logger.info("Fifth condition of reverse implication");break;
                        case "1": value = "null"; logger.info("Sixth condition of reverse implication"); break;
                        case "2": value = "null"; logger.info("Seventh condition of reverse implication");
                    }
                }
                logger.info("Function of reverse implication is done");
                break;
            case "→":
                switch (firstValue) {
                    case "0": value = "1"; break;
                    case "1": switch (secondValue){
                        case "0": value = "0";  logger.info("First condition of implication"); break;
                        case "1": value = "1";  logger.info("Third condition of implication"); break;
                    } break;
                    case "2": value = "null";  logger.info("First condition of implication"); break;
                }
                logger.info("Function of implication is done");
                break;
            case "↓":
                if((firstValue.equals("0")) && (secondValue.equals("0"))) value = "1";
                else value = "0";
                logger.info("Function of Arrow of Pierce is done");
                break;
            case "|":
                if((firstValue.equals("1")) && (secondValue.equals("1"))) value = "0";
                else value = "1";
                logger.info("Function of Barcode Scheffer is done");
                break;
            case "!←":
                switch (firstValue){
                    case "0": switch (secondValue){
                        case "0": value = "0"; logger.info("First condition of negation of the inverse implication"); break;
                        case "1": value = "1"; logger.info("Second condition of negation of the inverse implication"); break;
                        case "2": value = "null"; logger.info("Third condition of negation of the inverse implication"); break;
                    } break;
                    case "1": value = "0"; logger.info("Fourth condition of negation of the inverse implication"); break;
                    case "2": switch (secondValue){
                        case "0": value = "0"; logger.info("Fifth condition of negation of the inverse implication"); break;
                        case "1": value = "!null"; logger.info("Sixth condition of negation of the inverse implication"); break;
                        case "2": value = "null"; logger.info("Seventh condition of negation of the inverse implication");

                    } break;
                }
                logger.info("Function of negation of the inverse implication id done");
                break;
            case "!→":
                switch (firstValue) {
                    case "0": value = "1"; logger.info("First condition of negation of the implication"); break;
                    case "1": switch (secondValue){
                        case "0": value = "0"; logger.info("Second condition of negation of the implication"); break;
                        case "1": value = "1";  logger.info("Third condition of negation of the implication"); break;
                        case "2": value = "null"; logger.info("Fourth condition of negation of the implication"); break;
                    } break;
                    case "2": value = "null"; logger.info("First condition of negation of the implication"); break;
                }
                logger.info("Function of negation of the implication is done");
                break;
            case "⊕":
                if(firstValue.equals(secondValue)) value = "0";
                else value = "1";
                logger.info("Function of Negation of equivalence is done");
                break;
            case "~":
                if(firstValue.equals(secondValue)) value = "1";
                else value = "0";
                logger.info("Function of Equivalence is done");
                break;
            case "not1":
                value = secondValue;
                if(value.equals("2"))
                    value = "null";
                break;
            case "not2":
                value = firstValue;
                if(value.equals("2"))
                    value = "null";
                logger.info("Function of Negation of the first value is done");
                break;
            case "yes1":
                value = firstValue;
                if(value.equals("2"))
                    value = "null";
                logger.info("Function of choosing first value done" );
                break;
            case "yes2":
                value = secondValue;
                if(value.equals("2"))
                    value = "null";
                logger.info("Function of choosing second value is done");
                break;

        }
        return value;
    }
}

//54