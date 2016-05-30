import javafx.scene.text.*;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;

   


public class ScoreBuilder {
    public Pane make(int credit,int beting){
		Text bet_txt= new Text();
	bet_txt.setText("BET");
	bet_txt.setX(105);
	bet_txt.setY(370);
	bet_txt.setCache(true);
	bet_txt.setFont(Font.font(null, FontWeight.BOLD, 12));
	bet_txt.setFill(new LinearGradient(0, 0, 0, 0.5,  true, CycleMethod.REFLECT, new Stop[] {
            new Stop(0, Color.YELLOW),
            new Stop(0.1, Color.WHITE),
            new Stop(1, Color.GOLD)
		}));

	Text credit_txt= new Text();
	credit_txt.setText("CREDIT");
	credit_txt.setX(305);
	credit_txt.setY(370);
	credit_txt.setCache(true);
	credit_txt.setFont(Font.font(null, FontWeight.BOLD, 12));
	credit_txt.setFill(new LinearGradient(0, 0, 0, 0.5,  true, CycleMethod.REFLECT, new Stop[] {
            new Stop(0, Color.YELLOW),
            new Stop(0.1, Color.WHITE),
            new Stop(1, Color.GOLD)
		}));
	StackPane st;
	StackPane st2;
	st =scoreboard(180,50,beting);
	st2=scoreboard(250,50,credit);
	st.setLayoutX(100);
	st.setLayoutY(355);
	st2.setLayoutX(300);
	st2.setLayoutY(355);
	Pane pane = new Pane();
	pane.getChildren().add(st);
	pane.getChildren().add(st2);
	pane.getChildren().add(bet_txt);
	pane.getChildren().add(credit_txt);
	return pane; 
    }

    
    public StackPane scoreboard(int tailleWitdth,int tailleHeight,int val){

	Text t= new Text();
	t.setText(val +"\u20AC");
	t.setCache(true);
	t.setFont(Font.font(null, FontWeight.BOLD, 32));
	t.setFill(new LinearGradient(0, 1, 0, 0, true, CycleMethod.NO_CYCLE, new Stop[] { new Stop(0, Color.YELLOW), new Stop(1, Color.WHITE)}));
	StackPane st =new StackPane();
	Rectangle pane = new Rectangle();
	pane.setWidth(tailleWitdth);//200
	pane.setHeight(tailleHeight);//45
	pane.setFill(Color.BLACK);
	pane.setArcWidth(7);
	pane.setArcHeight(7);
	Rectangle pane2 = new Rectangle();
	pane2.setWidth(tailleWitdth+5);
	pane2.setHeight(tailleHeight+5);
	pane2.setFill(new LinearGradient(0, 1, 0, 0, true, CycleMethod.NO_CYCLE, new Stop[] { new Stop(0, Color.YELLOW), new Stop(1, Color.WHITE)}));
	pane2.setArcWidth(7);
	pane2.setArcHeight(7);
	Rectangle pane3 = new Rectangle();
	pane3.setWidth(tailleWitdth+7);
	pane3.setHeight(tailleHeight+7);
	pane3.setFill(Color.BLACK);
	pane3.setArcWidth(7);
	pane3.setArcHeight(7);
	st.getChildren().addAll(pane3,pane2,pane,t);
	return st;
    }
};
