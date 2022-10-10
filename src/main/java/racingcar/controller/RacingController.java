package racingcar.controller;

import racingcar.domain.RacingSystem;
import racingcar.view.InputView;
import racingcar.view.OutputView;


public class RacingController {
    InputView inputView = new InputView();
    OutputView outputView = new OutputView();

    public void play() {

        try {
            RacingSystem racingSystem = new RacingSystem();

            racingSystem.setUpCars(inputView.getCarNames());
            racingSystem.setUpFinishPosition(inputView.getFinishPosition());

            for (int i = 0; i < racingSystem.getFinishPosition(); i++) {
                movingCar(racingSystem);
                outputView.resultMovingString(racingSystem);
            }
            outputView.finalVictoryCarString(racingSystem);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }


    }
    public void movingCar(RacingSystem racingSystem) {
        for (int i = 0; i < racingSystem.getCars().size(); i++) {
            racingSystem.getCars().get(i).move(racingSystem.getRandomNo());
        }
    }


}
