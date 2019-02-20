package SudokuPkg;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;



public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("BoardLayout.fxml"));
        primaryStage.setTitle("Sudoku");
        //Group root = new Group();
        //Canvas canvas = new Canvas(330, 330);
        //GraphicsContext gc = canvas.getGraphicsContext2D();
        //DrawBoard.drawShapes(gc);
        //root.getChildren().add(canvas);
        primaryStage.setScene(new Scene(root, 720, 480));
        primaryStage.show();
    }




    public static void main(String[] args) {
        launch(args);
    }
}
