package SudokuPkg;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class DrawBoard {
     static void drawShapes(GraphicsContext gc){

        gc.setFill(Color.GREEN);
        gc.setStroke(Color.BLACK);

        int r,c;
        int dim = 9;
        double sqDim = Math.sqrt(dim);

        for (r=0; r<dim; r++) {
            for (c=0; c<dim; c++) {
                if (r <= sqDim -1 && c<= sqDim -1) {
                    gc.setLineWidth(3);
                    gc.strokeRect(30 + 90 * r, 30 + 90 * c, 90,90);
                }
                gc.setLineWidth(1);
                gc.strokeRect(30 + 30 * r, 30 + 30*c, 30, 30);
            }
        }

    }
}
