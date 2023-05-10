package basico;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;

public class PrimeiroFX extends Application {
	
	public void start (Stage primaryStage) throws Exception {
		
		Button botaoA = new Button("A");
		Button botaoB = new Button("B");
		Button botaoC = new Button("C");
		
		botaoA.setOnAction(e ->	System.out.println("Adailton"));
		botaoB.setOnAction(e ->	System.out.println("Bruna"));
		botaoC.setOnAction(e ->	System.exit(0));
		
		
		VBox box = new VBox(); // Vertical Box, serve para organizar na vertical
		
		box.setAlignment(Pos.CENTER);
		box.setSpacing(10);
		
		box.getChildren().add(botaoA);
		box.getChildren().add(botaoB);
		box.getChildren().add(botaoC);
		
		Scene unicaCena = new Scene(box, 100, 150);
		
		primaryStage.setScene(unicaCena);
		primaryStage.show();
		
	}
	
	public static void main (String [ ] args) {
		
		launch(args);
		
	}

}
