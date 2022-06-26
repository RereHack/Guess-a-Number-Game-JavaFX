import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
/**
 *
 * @author Reema
 */
public class EvenOddNum extends Application {
    
    @Override
    public void start(Stage primaryStage) throws Exception{
        //pane
        GridPane gPane = new GridPane();
        gPane.setAlignment(Pos.CENTER);
        VBox vBox = new VBox(15);
        //TXT
        Text tex0 = new Text("Enter an Integer Number:");
        vBox.getChildren().add(tex0);
        // TXTF & BTN
        HBox hBox = new HBox(15);
        TextField texF = new TextField();
        hBox.getChildren().add(texF);
        Button checkBtn = new Button("Check");
        hBox.getChildren().add(checkBtn);
        vBox.getChildren().add(hBox);
        //TXT & BTN ACTION
        Text resultTex = new Text(" ");
        resultTex.setFill(Color.RED);
        vBox.getChildren().add(resultTex);
        gPane.add(vBox,1,1);
        checkBtn.setOnAction(e->{
         int num = (Integer.parseInt(texF.getText())); 
         if (num%2 == 0){
         resultTex.setText("Even number"); 
         }else{resultTex.setText("Odd number");}
        });
        Scene scene = new Scene(gPane,450,350);
        primaryStage.setTitle("Even or Odd");
        primaryStage.setScene(scene);
        primaryStage.show();
    }//end of start method

    public static void main(String[] args) {
        launch(args);
    }//end of main method
    
}//end of the class
