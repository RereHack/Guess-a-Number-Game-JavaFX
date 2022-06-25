import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
/**
 *
 * @author Reema
 */
public class GuessNum extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        GridPane gPane = new GridPane();
        gPane.setAlignment(Pos.CENTER);
        
        Integer num = 1+(int)(100*Math.random());
        
        VBox vBox = new VBox(20);
        Label lb = new Label(" Guess a number between 1 and 100 :) ");
        vBox.getChildren().add(lb);
        TextField texF = new TextField();
        vBox.getChildren().add(texF);
        Label lb1 = new Label(" ");
        vBox.getChildren().add(lb1);
        gPane.add(vBox,0,1);
        
        HBox hBox = new HBox(10);
        Button guessBtn = new Button("Guess");
        hBox.getChildren().add(guessBtn);
        Button helpBtn = new Button("Help");
        hBox.getChildren().add(helpBtn);
        gPane.add(hBox, 1, 2);
        
        guessBtn.setOnAction(e->{
            int guess = Integer.parseInt(texF.getText());
            if (num == guess){
            lb1.setText("Great , Right Guess!");
            } else {lb1.setText("Wrong answer , Try again :( ");}
        });
        
        helpBtn.setOnAction(e->{
            int guess = Integer.parseInt(texF.getText());
            if (num > guess){
            lb1.setText("Increase your guess");
            } else if(num < guess){
            lb1.setText("Decrease your guess");
            }else{lb1.setText("YOU HAVE REACHED :D!");}
        });
        
        
        Scene scene = new Scene(gPane , 450 , 350);
        
        primaryStage.setTitle("Guess a number");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
