


import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.chart.PieChart.Data;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

/**
 * This panel is the basic panel, inside which other panels are placed.  
 * Before beginning to implement, design the structure of your GUI in order to 
 * understand what panels go inside which ones, and what buttons or other components
 * go in which panels.  
 * @author ralexander
 *
 */
//make the main panel's layout be a VBox
public class FXMainPane extends VBox {

	//student Task #2:
	//  declare five buttons, a label, and a textfield
	Button button1;
	
	Button button2;
	Button button3;
	Button button4;
	Button button5;
	Label label;
	TextField text;
	
	DataManager data = new DataManager();

	
	//  declare two HBoxes
	
	HBox Hbox1;
	HBox Hbox2;
	
	//student Task #4:
	//  declare an instance of DataManager
	/**
	 * The MainPanel constructor sets up the entire GUI in this approach.  Remember to
	 * wait to add a component to its containing component until the container has
	 * been created.  This is the only constraint on the order in which the following 
	 * statements appear.
	 */
	FXMainPane() {
		//student Task #2:
		//  instantiate the buttons, label, and textfield
		button1 = new Button("Hello");
		button2 = new Button("Howdy");
		button3 = new Button("Chinese");
		button4 = new Button("Clear");
		button5 = new Button("Exit");
		label = new Label("Feedback");
		text = new TextField();
		
		button1.setOnAction(new ButtonHandler()); 

		button2.setOnAction(new ButtonHandler()); 

		button3.setOnAction(new ButtonHandler()); 

		button4.setOnAction(new ButtonHandler()); 

		button5.setOnAction(new ButtonHandler()); 
		
		//  instantiate the HBoxes
		
		Hbox1 = new HBox();
		Hbox2 = new HBox();

		//student Task #4:
		//  instantiate the DataManager instance
		
		DataManager data = new DataManager();
		
		//  set margins and set alignment of the components
		HBox.setMargin(button1, new Insets(25)); 
		HBox.setMargin(button2, new Insets(25)); 

		HBox.setMargin(button3, new Insets(25)); 

		HBox.setMargin(button4, new Insets(25)); 
		HBox.setMargin(button5, new Insets(25)); 

		Hbox1.setAlignment(Pos.CENTER);
		Hbox2.setAlignment(Pos.CENTER);
		//student Task #3:
		//  add the label and textfield to one of the HBoxes
		
		Hbox2.getChildren().addAll(text, label);

		//  add the buttons to the other HBox
		
		Hbox1.getChildren().addAll(button1, button2, button3, button4, button5);

		//  add the HBoxes to this FXMainPanel (a VBox)
		getChildren().addAll(Hbox1, Hbox2);  
		
		
		
		
	}
	
	//Task #4:
	//  create a private inner class to handle the button clicks
	class ButtonHandler implements EventHandler<ActionEvent> {

		@Override
		public void handle(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
			if(((Button)arg0.getSource()).getText().equals("Hello")) {
				
				data.getHello();
				text.setText(data.getHello());
			}
			
			else if(((Button)arg0.getSource()).getText().equals("Howdy")) {
				
				data.getHowdy();
				text.setText(data.getHowdy());

			}

			else if(((Button)arg0.getSource()).getText().equals("Chinese")) {
				
				data.getChinese();
				text.setText(data.getChinese());

			}
			
			else if(((Button)arg0.getSource()).getText().equals("Clear")) {
				
				text.setText("");

				
			}
			
			else if(((Button)arg0.getSource()).getText().equals("Exit")) {
				
				Platform.exit();
				System.exit(0);
				
			}

			
			
		}
		
		
		
		
	}
	
}
	