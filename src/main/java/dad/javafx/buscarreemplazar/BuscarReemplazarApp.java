package dad.javafx.buscarreemplazar;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BuscarReemplazarApp extends Application {

	private Button buscarButton, reemplazarButton, replaceButton, cerrarButton, ayudaButton;
	private CheckBox caseCheck, buscarCheck, regexCheck, resaltarCheck;
	private TextField buscarText, reemplazarText;
	private Label reemplazarLabel, buscarLabel;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		reemplazarLabel = new Label("Reemplazazr con:");
		reemplazarLabel.setMinWidth(100);
		
		buscarLabel = new Label("Buscar:");
		buscarLabel.setMinWidth(100);
		
		buscarButton = new Button("Buscar"); 
		buscarButton.setMaxWidth(150);
		buscarButton.setMinWidth(100);
		
		reemplazarButton= new Button("Reemplazar");
		reemplazarButton.setMaxWidth(150);
		reemplazarButton.setMinWidth(100);
		
		replaceButton= new Button("Reemplazar todo");
		replaceButton.setMaxWidth(150);
		replaceButton.setMinWidth(100);
		
		cerrarButton= new Button("Cerrar");
		cerrarButton.setMaxWidth(150);
		cerrarButton.setMinWidth(100);
		
		ayudaButton= new Button("Ayuda");
		ayudaButton.setMaxWidth(150);
		ayudaButton.setMinWidth(100);
		
		buscarText = new TextField();
		buscarText.setPromptText("Buscar");
		
		reemplazarText = new TextField();
		reemplazarText.setPromptText("Reemplazar");
		
		VBox botones = new VBox(5, buscarButton, reemplazarButton, replaceButton, cerrarButton, ayudaButton);
		botones.setAlignment(Pos.CENTER);
		botones.setMinWidth(100);
		
		caseCheck = new CheckBox();
		buscarCheck = new CheckBox();
		regexCheck = new CheckBox();
		resaltarCheck = new CheckBox();
		
		FlowPane checks = new FlowPane();
		checks.setHgap(5);
		checks.setVgap(5);
		checks.setAlignment(Pos.CENTER);
		checks.getChildren().addAll(caseCheck, new Label("Mayúsculas y minúsculas"), buscarCheck, new Label("Buscar hacia atrás"), regexCheck, new Label("Expresión regular"), resaltarCheck, new Label("Resaltar resultados"));
		checks.setMaxWidth(275);
		
		GridPane root = new GridPane();
		root.addRow(0, buscarLabel, buscarText, botones);
		root.addRow(1, reemplazarLabel, reemplazarText);
		root.add(checks, 1, 2);
		
		GridPane.setRowSpan(botones, 3);
		
		Scene scene = new Scene(root, 350, 200);
		
		primaryStage.setTitle("Buscar y reemplazar");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	}

}
