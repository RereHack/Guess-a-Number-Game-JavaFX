import java.util.Random;
import javafx.application.Application;
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
public class AddSubNum extends Application {
    @Override
    public void start(Stage primaryStage) {
        //pane
        GridPane gPane = new GridPane();
        gPane.setAlignment(Pos.CENTER);
        //numbers
        int rand1 = new Random().nextInt(1000);
        int rand2 = new Random().nextInt(1000);
        int rand3 = new Random().nextInt(1000);
        int rand4 = new Random().nextInt(1000);
        //lbs & texFs & btns
        VBox vBox = new VBox(20);
        HBox hBox0 = new HBox(15);
        Label lb0 = new Label(rand1+" + "+rand2+" = ");
        TextField texF0 = new TextField();
        hBox0.getChildren().addAll(lb0,texF0);
        HBox hBox1 = new HBox(17);
        Label lb1 = new Label(" ");
        if(rand3 > rand4){
        lb1.setText(rand3+" - "+rand4+" = ");
        }else{lb1.setText(rand4+" - "+rand3+" = ");}
        TextField texF1 = new TextField();
        hBox1.getChildren().addAll(lb1,texF1);
        HBox hBox2 = new HBox(15);
        Button checkbtn = new Button("Check");
        checkbtn.setId("checkbtn");
        Label lb2 = new Label(" ");
        hBox2.getChildren().addAll(checkbtn,lb2);
        vBox.getChildren().addAll(hBox0,hBox1,hBox2);
        gPane.add(vBox,1,1);
        //btn action
        checkbtn.setOnAction(e->{
            int sumResult = Integer.parseInt(texF0.getText());
            int subResult = Integer.parseInt(texF1.getText());
            if(sumResult == rand1+rand2 && rand3>rand4 && subResult == rand3-rand4){
                lb2.setText("Right Answers! Bravo:)");
            }else if(sumResult == rand1+rand2 && rand4>rand3 && subResult == rand4-rand3){
                lb2.setText("Right Answers! Bravo:)");
            }else if(sumResult == rand1+rand2 && rand3>rand4 && subResult != rand3-rand4){
                lb2.setText("You have a wrong answer in Sub part");
            }else if(sumResult == rand1+rand2 && rand4>rand3 && subResult != rand4-rand3){
                lb2.setText("You have a wrong answer in Sub part");    
            }else if(rand3>rand4 && subResult == rand3-rand4 && sumResult != rand1+rand2){
                lb2.setText("You have a wrong answer in Sum part");
            }else if(rand4>rand3 && subResult == rand4-rand3 && sumResult != rand1+rand2){
                lb2.setText("You have a wrong answer in Sum part");    
            }else{lb2.setText("Wrong answers try again:(");}
        });
        //scene & show
        Scene scene = new Scene(gPane,450,350);
        scene.getStylesheets()
        .add(AddSubNum.class
        .getResource("AddSubStyle.css")
        .toExternalForm());
        primaryStage.setTitle("Add & Sub");
        primaryStage.setScene(scene);
        primaryStage.show();
    }//start method
    
    public static void main(String[] args) {
        launch(args);
    }//main method
    
}//main class
