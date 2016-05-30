import javafx.scene.text.*;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.scene.effect.DropShadow;
import javafx.scene.shape.Polygon;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.effect.DropShadow;
public class MachineBuilder {

    
    public Pane make(){
	Pane machine = new Pane();

	////////////////////////////////////////image cadre
	int posy= 100;
	int posx= 63;
	StackPane image_cadre_tab[] = new StackPane[4];
	for(int i=0; i< 4; i++){
	    image_cadre_tab[i]=cadrebuilder();
	    image_cadre_tab[i].setLayoutX(posx+(125*i));
	    image_cadre_tab[i].setLayoutY(posy);
	}
	////////////////////////////////////////////
	Rectangle screen = new Rectangle();
	screen.setX(60);
	screen.setY(100);
	screen.setWidth(511);
	screen.setHeight(183);
	screen.setFill(Color.TRANSPARENT);
	screen.setArcWidth(7);
	screen.setArcHeight(7);
        screen.setStroke(new LinearGradient(0, 1, 0, 0, true, 			CycleMethod.NO_CYCLE, new Stop[] { new Stop(0, Color.GOLD), new Stop(1, Color.WHITE)}));
        screen.setStrokeWidth(8);
        
	Pane image_cadre = new Pane();
	
	image_cadre.setLayoutX(20);

	image_cadre.setLayoutY(55);


	Rectangle haut1 = new Rectangle();

	haut1.setWidth(700);
	haut1.setHeight(100);

	haut1.setFill(Color.WHITE);


	Rectangle haut = new Rectangle();

	haut.setX(30);
	haut.setY(110);
	haut.setWidth(600);
	haut.setHeight(260);
        haut.setStroke(new LinearGradient(0, 1, 0, 0, true, CycleMethod.NO_CYCLE, new Stop[] { new Stop(0, Color.BLACK), new Stop(1, Color.WHITE)}));

        haut.setStrokeWidth(98);
	haut.setFill(Color.TRANSPARENT);

	Rectangle bas = new Rectangle();
	bas.setX(0);
	bas.setY(360);
	bas.setWidth(700);
	bas.setHeight(300);
	bas.setFill(new LinearGradient(0, 1, 0, 0, true, CycleMethod.NO_CYCLE, new Stop[] { new Stop(0, Color.WHITE), new Stop(1, Color.BLACK)}));

	image_cadre.getChildren().add(screen);
	for(int i=0; i<4; i++)image_cadre.getChildren().add(image_cadre_tab[i]);

	
	Rectangle bar = new Rectangle();
	bar.setX(72);
	bar.setY(245);
	bar.setWidth(523);
	bar.setHeight(2);
	bar.setFill(Color.BLACK);	


	Polygon p= new Polygon();
	p.getPoints().addAll(new Double[]{
		60.0, 20.0+420,
		20.0, 100.0+420,
		650.0, 100.0+420,
		610.0 ,20.0+420});
        p.setStroke(new LinearGradient(0, 0, 0, 0.5,  true, CycleMethod.REFLECT, new Stop[] {
            new Stop(0, Color.GRAY),
            new Stop(0.1, Color.BLACK),
            new Stop(1, Color.GRAY)
		 }));
        p.setStrokeWidth(15);
        p.setFill(Color.DARKSLATEGRAY);

        p.setFill(new LinearGradient(0, 0, 0, 0.5,  true, CycleMethod.REFLECT, new Stop[] {
            new Stop(0, Color.GRAY),
            new Stop(0.1, Color.WHITE),
            new Stop(1, Color.GRAY)
		 }));
        p.setStrokeWidth(15);
        
	Rectangle machinebar = new Rectangle();
	 machinebar.setX(60);
 machinebar.setY(130);
	 machinebar.setWidth(550);
	 machinebar.setHeight(300);
	 machinebar.setFill(Color.TRANSPARENT);
         machinebar.setStroke(new LinearGradient(0, 0, 0, 0.5,  true, CycleMethod.REFLECT, new Stop[] {
            new Stop(0, Color.GRAY),
            new Stop(0.1, Color.BLACK),
            new Stop(1, Color.GRAY)
		 }));
         machinebar.setStrokeWidth(15);
	 
	Rectangle machinebar2 = new Rectangle();
	 machinebar2.setX(16);
	 machinebar2.setY(534);
	 machinebar2.setWidth(638);
	 machinebar2.setHeight(80);
	 
        machinebar2.setFill(new LinearGradient(0, 0, 0, 0.5,  true, CycleMethod.REFLECT, new Stop[] {
            new Stop(0, Color.GRAY),
            new Stop(0.1, Color.WHITE),
            new Stop(1, Color.GRAY)
		 }));
         machinebar2.setStroke(new LinearGradient(0, 0, 0, 0.5,  true, CycleMethod.REFLECT, new Stop[] {
            new Stop(0, Color.GRAY),
            new Stop(0.1, Color.BLACK),
            new Stop(1, Color.GRAY)
		 }));
         machinebar2.setStrokeWidth(15);

	 
	Rectangle machinebar3 = new Rectangle();
	 machinebar3.setX(100);
 machinebar3.setY(15);
	 machinebar3.setWidth(470);
	 machinebar3.setHeight(110);

 machinebar3.setFill(new LinearGradient(0, 0, 0, 0.5,  true, CycleMethod.REFLECT, new Stop[] {
            new Stop(0, Color.BLUE),
            new Stop(0.1, Color.VIOLET),
            new Stop(1, Color.BLUE)
		}));

	 machinebar3.setFill(Color.BLACK);
         machinebar3.setStroke(new LinearGradient(0, 0, 0, 0.5,  true, CycleMethod.REFLECT, new Stop[] {
            new Stop(0, Color.GRAY),
            new Stop(0.1, Color.BLACK),
            new Stop(1, Color.GRAY)
		 }));
	 
	machinebar3.setArcWidth(20);
	machinebar3.setArcHeight(15);
         machinebar3.setStrokeWidth(15);


/*
DropShadow ds = new DropShadow();
ds.setOffsetY(5.0f);
ds.setColor(Color.color(0.4f, 0.4f, 0.4f));
*/
 DropShadow dropShadow = new DropShadow();
 dropShadow.setRadius(4.0);
 dropShadow.setOffsetX(2.0);
 dropShadow.setOffsetY(2.0);
 dropShadow.setColor(Color.color(1.0, 0.9, 0.0));  
	Text tm= new Text();
	tm.setText("EURO JACKPOT");
	tm.setX(125);
	tm.setY(90);
	tm.setCache(true);
	tm.setEffect(dropShadow);
	tm.setFont(Font.font(null, FontWeight.BOLD, 50));
	tm.setFill(new LinearGradient(0, 0, 0, 0.5,  true, CycleMethod.REFLECT, new Stop[] {
            new Stop(0, Color.YELLOW),
            new Stop(0.1, Color.WHITE),
            new Stop(1, Color.GOLD)
		}));
	 
	/*
	StackPane st;
	StackPane st2;
	st =scoreboardbuilder2(180,50,beting);
	st2=scoreboardbuilder2(250,50,credit);
	st.setLayoutX(100);
	st.setLayoutY(355);
	st2.setLayoutX(300);
	st2.setLayoutY(355);
	*/
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

	machine.getChildren().addAll(haut1,haut,bas,image_cadre,bar,p);
	machine.getChildren().addAll(/*st,st2,*//*credit_txt,bet_txt,*/machinebar3,machinebar2,machinebar,tm);
	return machine;
	}

    private StackPane cadrebuilder(){

	Rectangle fond = new Rectangle();
	fond.setWidth(115);
	fond.setHeight(168);
        fond.setStroke(new LinearGradient(0, 1, 0, 0, true, CycleMethod.NO_CYCLE, new Stop[] { new Stop(0, Color.BLACK), new Stop(1, Color.RED)}));
        fond.setStrokeWidth(16);
	fond.setFill(Color.TRANSPARENT);
	Rectangle carre3 = new Rectangle();
	carre3.setWidth(93);
	carre3.setHeight(157);
	carre3.setArcWidth(7);
	carre3.setArcHeight(7);
	carre3.setFill(Color.TRANSPARENT);
        carre3.setStroke(Color.BLACK);
        carre3.setStrokeWidth(10);
	Rectangle carre = new Rectangle();
	carre.setWidth(91);
	carre.setHeight(155);
	carre.setArcWidth(7);
	carre.setArcHeight(7);
	carre.setFill(Color.TRANSPARENT);
        carre.setStroke(Color.GOLD);
        carre.setStrokeWidth(8);
	Rectangle carre2 = new Rectangle();
	carre2.setWidth(85);
	carre2.setHeight(149);
        carre2.setStroke(Color.YELLOW);
        carre2.setStrokeWidth(2);
	carre2.setFill(Color.TRANSPARENT);
	StackPane stack = new StackPane();
	stack.getChildren().add(fond);
	stack.getChildren().add(carre3);
	stack.getChildren().add(carre);
	stack.getChildren().add(carre2);
     return stack;
	
    }

};
