package racingcar.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {

    PrintMessage printMessage = new PrintMessage();
    public String getFinishPosition() {
        printPlayCountMessage();
        String position = "";

        try{
            position = Console.readLine();
        }catch (Exception e){
            throw new IllegalArgumentException("[ERROR] 시도횟수를 입력 해 주시기 바랍니다.");

        }
        return position;
    }

    public String getCarNames() {
        printRequestCarNamesMessage();
        return Console.readLine();
    }

    private void printPlayCountMessage() {
        printMessage.printPlayCountMessage();
    }

    private void printRequestCarNamesMessage() {
        printMessage.printRequestCarNamesMessage();
    }

}
