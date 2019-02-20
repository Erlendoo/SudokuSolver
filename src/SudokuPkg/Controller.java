package SudokuPkg;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;


import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML private Button button_one;
    @FXML private Button button_two;
    @FXML private Button button_three;
    @FXML private Button button_four;
    @FXML private Button button_five;
    @FXML private Button button_six;
    @FXML private Button button_seven;
    @FXML private Button button_eight;
    @FXML private Button button_nine;
    @FXML private Canvas canvas;

    GameBoard gameBoard;
    int player_selected_row;
    int player_selected_col;

    @Override
    public void initialize(URL arg0, ResourceBundle arg1){
        gameBoard = new GameBoard();
        GraphicsContext context = canvas.getGraphicsContext2D();
        drawOnCanvas(context);
        player_selected_row = 0;
        player_selected_col = 0;

    }

    public void drawOnCanvas(GraphicsContext context){

        context.clearRect(0,0,456,456);
        context.setFill(Color.WHITE);
        context.fillRect(3,3,450,450);
        int row, col;

        for(row=0; row<9; row++){
            for(col=0; col<9; col++){
                int position_y = row * 50 + 3;
                int position_x = col * 50 + 3;
                int sub_pos_y = row * 150 + 3;
                int sub_pos_x = col * 150 + 3;
                int width = 50;


                context.setStroke(Color.BLACK);
                context.setLineWidth(1);
                //context.fillRect(position_x, position_y, width, width);
                context.strokeRect(position_x, position_y, width, width);
                if (row <= 2 && col<= 2) {
                    context.setLineWidth(3);
                    context.strokeRect(sub_pos_x, sub_pos_y, width * 3, width * 3);
                }



            }
        }

        context.setStroke(Color.RED);
        context.setLineWidth(5);
        context.strokeRect(player_selected_col * 50 + 5, player_selected_row * 50 + 5, 46, 46);

        int[][] initial = gameBoard.getInitial();
        for(row=0; row<9; row++){
            for(col=0; col<9; col++){
                int position_y = row * 50 + 35;
                int position_x = col * 50 + 23;
                context.setFill(Color.BLACK);
                context.setFont(new Font(20));
                if(initial[row][col]!=0){
                    context.fillText(initial[row][col] + "", position_x, position_y);
                }
            }
        }

        int[][] player = gameBoard.getPlayer();
        for (row=0; row<9; row++){
            for (col=0; col<9; col++){
                int position_y = row * 50 + 35;
                int position_x = col * 50 + 23;
                context.setFill(Color.PURPLE);
                context.setFont(new Font(20));
                if (player[row][col] != 0){
                    context.fillText(player[row][col] + "", position_x, position_y);
                }
            }
        }

    }

    public void canvasMouseClicked(){

        canvas.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                int mouse_x = (int) event.getX();
                int mouse_y = (int) event.getY();

                player_selected_row = (int) (mouse_y / 50);
                player_selected_col = (int) (mouse_x / 50);

                drawOnCanvas(canvas.getGraphicsContext2D());
            }
        });
    }

    public void buttonOnePressed(){
        gameBoard.modifyPlayer(1, player_selected_row, player_selected_col);
        drawOnCanvas(canvas.getGraphicsContext2D());
    }

    public void buttonTwoPressed(){
        gameBoard.modifyPlayer(2, player_selected_row, player_selected_col);
        drawOnCanvas(canvas.getGraphicsContext2D());
    }

    public void buttonThreePressed(){
        gameBoard.modifyPlayer(3, player_selected_row, player_selected_col);
        drawOnCanvas(canvas.getGraphicsContext2D());
    }

    public void buttonFourPressed(){
        gameBoard.modifyPlayer(4, player_selected_row, player_selected_col);
        drawOnCanvas(canvas.getGraphicsContext2D());
    }

    public void buttonFivePressed(){
        gameBoard.modifyPlayer(5, player_selected_row, player_selected_col);
        drawOnCanvas(canvas.getGraphicsContext2D());
    }

    public void buttonSixPressed(){
        gameBoard.modifyPlayer(6, player_selected_row, player_selected_col);
        drawOnCanvas(canvas.getGraphicsContext2D());
    }

    public void buttonSevenPressed(){
        gameBoard.modifyPlayer(7, player_selected_row, player_selected_col);
        drawOnCanvas(canvas.getGraphicsContext2D());
    }

    public void buttonEightPressed(){
        gameBoard.modifyPlayer(8, player_selected_row, player_selected_col);
        drawOnCanvas(canvas.getGraphicsContext2D());
    }

    public void buttonNinePressed(){
        gameBoard.modifyPlayer(9, player_selected_row, player_selected_col);
        drawOnCanvas(canvas.getGraphicsContext2D());
    }
}