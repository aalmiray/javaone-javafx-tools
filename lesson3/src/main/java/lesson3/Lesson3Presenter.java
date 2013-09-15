package lesson3;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import javax.inject.Inject;

public class Lesson3Presenter {
    @FXML
    private TextField name;
    @Inject
    Lesson3Service lesson3Service;

    public void sayHello() {
        /**
         * Watch out! This callback is executed inside the UI thread.
         * The service method should be invoked outside of the UI thread
         */
        lesson3Service.sayHello(name.getText());
    }
}