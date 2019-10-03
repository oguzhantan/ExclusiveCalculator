package pack;
import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;


public class Controller implements Initializable{

	   @FXML
	    private JFXButton clean;

	    @FXML
	    private JFXButton point;

	    @FXML
	    private JFXButton zero;

	    @FXML
	    private JFXButton Dzero;

	    @FXML
	    private JFXButton three;

	    @FXML
	    private JFXButton one;

	    @FXML
	    private JFXButton five;

	    @FXML
	    private JFXButton two;

	    @FXML
	    private JFXButton four;

	    @FXML
	    private JFXButton nine;

	    @FXML
	    private JFXButton six;

	    @FXML
	    private JFXButton eight;

	    @FXML
	    private JFXButton seven;

	    @FXML
	    private JFXButton module;

	    @FXML
	    private JFXButton clean2;

	    @FXML
	    private JFXButton minus;

	    @FXML
	    private JFXButton sum;

	    @FXML
	    private JFXButton devide;

	    @FXML
	    private JFXButton multiply;

	    @FXML
	    private JFXButton equal;

	    @FXML
	    private JFXTextField input;

	    @FXML
	    private Label promt;

	    private long num1;
	    private long num2;
	    private String operator;

		@Override
		public void initialize(URL location, ResourceBundle resources) {
			// TODO Auto-generated method stub

		}

	    public void click_point(){

	    	String oldvalue=input.getText();
	    	String set =".";
	    	input.setText(oldvalue+set);

	    }

	    public void click_one(){

	    	String oldvalue=input.getText();
	    	String set ="1";
	    	input.setText(oldvalue+set);

	    }

	    public void click_two(){

	    	String oldvalue=input.getText();
	    	String set ="2";
	    	input.setText(oldvalue+set);

	    }

	    public void click_three(){

	    	String oldvalue=input.getText();
	    	String set ="3";
	    	input.setText(oldvalue+set);

	    }

	    public void click_four(){

	    	String oldvalue=input.getText();
	    	String set ="4";
	    	input.setText(oldvalue+set);

	    }

	    public void click_five(){

	    	String oldvalue=input.getText();
	    	String set ="5";
	    	input.setText(oldvalue+set);

	    }

	    public void click_six(){

	    	String oldvalue=input.getText();
	    	String set ="6";
	    	input.setText(oldvalue+set);

	    }

	    public void click_seven(){

	    	String oldvalue=input.getText();
	    	String set ="7";
	    	input.setText(oldvalue+set);

	    }

	    public void click_eight(){

	    	String oldvalue=input.getText();
	    	String set ="8";
	    	input.setText(oldvalue+set);

	    }

	    public void click_nine(){

	    	String oldvalue=input.getText();
	    	String set ="9";
	    	input.setText(oldvalue+set);

	    }

	    public void click_zero(){

	    	String oldvalue=input.getText();
	    	String set ="0";
	    	input.setText(oldvalue+set);

	    }

	    public void click_Dzero(){

	    	String oldvalue=input.getText();
	    	String set ="00";
	    	input.setText(oldvalue+set);

	    }

	    public void click_clean(){

	    	input.setText("");
	    	promt.setText("");
	    	this.num1=0;
	    	this.num2=0;
	    }


	    public void click_multi(){

	    	String value=input.getText();
	    	long valuenumber=Integer.parseInt(value);
	    	this.num1=valuenumber;
	    	input.setText("");
	    	promt.setText(value+"x");
	    	this.operator="x";

	    }

	    public void click_devide(){

	    	String value=input.getText();
	    	long valuenumber=Integer.parseInt(value);
	    	this.num1=valuenumber;
	    	input.setText("");
	    	promt.setText(value+"/");
	    	this.operator="/";

	    }

	    public void click_sum(){

	    	String value=input.getText();
	    	long valuenumber=Integer.parseInt(value);
	    	this.num1=valuenumber;
	    	input.setText("");
	    	promt.setText(value+"+");
	    	this.operator="+";

	    }

	    public void click_minus(){

	    	String value=input.getText();
	    	long valuenumber=Integer.parseInt(value);
	    	this.num1=valuenumber;
	    	input.setText("");
	    	promt.setText(value+"-");
	    	this.operator="-";

	    }

	    public void click_module(){

	    	String value=input.getText();
	    	long valuenumber=Integer.parseInt(value);
	    	this.num1=valuenumber;
	    	input.setText("");
	    	promt.setText(value+"%");
	    	this.operator="%";

	    }

	    public void click_equal(){

	    	switch (operator) {

	    	case "x":
				String valueMulti=input.getText();
				this.num2=Integer.parseInt(valueMulti);
				long resultMulti=this.num1*this.num2;
				input.setText(String.valueOf(resultMulti));
				String oldpromtMulti=promt.getText();
				promt.setText(oldpromtMulti+valueMulti);
				break;

	    	case "/":
				String valueDivide=input.getText();
				this.num2=Integer.parseInt(valueDivide);
				long resultDivide=this.num1/this.num2;
				input.setText(String.valueOf(resultDivide));
				String oldpromtDivide=promt.getText();
				promt.setText(oldpromtDivide+valueDivide);
				break;

	    	case "+":
				String valueSum=input.getText();
				this.num2=Integer.parseInt(valueSum);
				long resultSum=this.num1+this.num2;
				input.setText(String.valueOf(resultSum));
				String oldpromtSum=promt.getText();
				promt.setText(oldpromtSum+valueSum);
				break;

	    	case "-":
				String valueMinus=input.getText();
				this.num2=Integer.parseInt(valueMinus);
				long resultMinus=this.num1-this.num2;
				input.setText(String.valueOf(resultMinus));
				String oldpromtMinus=promt.getText();
				promt.setText(oldpromtMinus+valueMinus);
				break;

	    	case "%":
				String valueModule=input.getText();
				this.num2=Integer.parseInt(valueModule);
				long resultModule=this.num1-this.num2;
				input.setText(String.valueOf(resultModule));
				String oldpromtModule=promt.getText();
				promt.setText(oldpromtModule+valueModule);
				break;
			}

	    }
}
