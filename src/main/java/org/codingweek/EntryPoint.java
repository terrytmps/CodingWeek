package org.codingweek;

import javafx.application.Application;
import javafx.stage.Stage;
import org.codingweek.view.MainView;
import java.io.IOException;

public class EntryPoint extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        ApplicationSettings.getInstance().setPrimaryStage(stage);
        stage.setTitle(Configuration.APP_TITLE);
        stage.setScene(new MainView().loadScene());
        stage.show();
    }

    public static void main(String[] args) {
            launch();
        }
}