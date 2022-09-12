package lk.cvgen.controller;

import javafx.event.ActionEvent;
import javafx.scene.input.MouseEvent;
import lk.cvgen.commons.Commons;

import java.io.IOException;


public class HomeFormController {
    Commons com = new Commons();

    public void btnGenSLTemplateOnAction(MouseEvent mouseEvent) throws IOException {
        com.setUI("");
    }

    public void btnGenUSATemplateOnAction(MouseEvent mouseEvent) {
    }

    public void btnGenUKTemplateOnAction(MouseEvent mouseEvent) {
    }

    public void btnGenUAETemplateOnAction(MouseEvent mouseEvent) {
    }

    public void btnGenOtherTemplateOnAction(ActionEvent actionEvent) {
    }
}
