import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.util.Duration;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.*;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.scene.effect.PerspectiveTransform;
import javafx.scene.effect.DropShadow;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.scene.shape.Polygon;
import javafx.scene.layout.Pane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import java.util.Random;
import javafx.scene.media.AudioClip;    
import javafx.animation.AnimationTimer;

public class Main extends Application {
    public String tabstr[]={"cerise.png","coeur.png","bell.png","7.png","graph.png","bar.png","coin.png","pomme.png","citron"};
    private TranslateTransition transitiontab[]=new TranslateTransition[4];
    private static int score[]= new int[4];
    private static int credit=10000;
    private static int beting=0;
    private static int isWin=0;
    private static GridPane img_grid_tab[]= new GridPane[4];
    private GridPane menu = new GridPane();
    private Pane machine_img;
    private Stage stg_sauv;
    
    private final AudioClip soundeffect =new AudioClip(Main.class.getResource("win.wav").toString()); 
    private static final AudioClip soundeffect2 =new AudioClip(Main.class.getResource("jackpot3.wav").toString());
    
    private double opacity = 2.1;
    
    private class MyTimer extends AnimationTimer {
	
        @Override
        public void handle(long now) {
            opacity -= 0.01;
            if (opacity <= 0) {
		stop();
		if(isWin==3){
		    gameover(stg_sauv);
		    beting=0;
		    isWin=0;
		    credit=10000;
		}else{
		if(isWin==1){
		System.out.println("WIN");
		    soundeffect2.play();
		}else System.out.println("LOSE");
		
		init(stg_sauv,1);
		stg_sauv.show();
		    }
		isWin=0;
		System.out.println("Animation stopped");
		opacity = 2.1;// fin d'animation et aussi debut d'animation
            }
       }
    }


    private void startmenu(Stage primaryStage){

	Group root = new Group();
        primaryStage.setResizable(false);
        primaryStage.setScene(new Scene(root, 740,420));

 DropShadow dropShadow = new DropShadow();
 dropShadow.setRadius(5.0);
 dropShadow.setOffsetX(3.0);
 dropShadow.setOffsetY(3.0);
 dropShadow.setColor(Color.color(1.0, 1.0, 1.0));  
	Text logo= new Text();
 logo.setEffect(dropShadow);
	logo.setX(80);
	logo.setY(120);
	logo.setCache(true);
	logo.setFont(Font.font(null, FontWeight.BOLD, 70));
	logo.setFill(new LinearGradient(0, 0, 0, 0.5,  true, CycleMethod.REFLECT, new Stop[] {
            new Stop(0, Color.YELLOW),
            new Stop(0.1, Color.WHITE),
            new Stop(1, Color.GOLD)
		}));
	logo.setText("EURO JACKPOT");



	Image img = new Image("casino.jpg");
	
         ImageView iv2 = new ImageView();
         iv2.setImage(img);
         iv2.setFitWidth(800);
         iv2.setPreserveRatio(true);
         iv2.setSmooth(true);
         iv2.setCache(true);
	 iv2.setOpacity(0.9); 
	Text t= new Text();
	t.setX(10);
	t.setY(30);
	t.setCache(true);
	t.setFont(Font.font(null, FontWeight.BOLD, 28));
	t.setFill(Color.WHITE);
	t.setText("START");

	
	Button stmenu = new Button();
    	stmenu.setGraphic(t);
	
	stmenu.setLayoutX(320);
	stmenu.setLayoutY(280);
	stmenu.setStyle("-fx-base: #D4AF37;");
	stmenu.setOnAction(new EventHandler<ActionEvent>() {
		@Override
      public void handle(ActionEvent event) {
	init(primaryStage,0);
        primaryStage.show();
	     }});

	Text t2= new Text();
	t2.setX(10);
	t2.setY(30);
	t2.setCache(true);
	t2.setFont(Font.font(null, FontWeight.BOLD, 28));
	t2.setFill(Color.WHITE);
	t2.setText("EXIT");
	Button stmenu2 = new Button();
    	stmenu2.setGraphic(t2);
	stmenu2.setLayoutX(337);
	stmenu2.setLayoutY(350);
	stmenu2.setStyle("-fx-base: #C5B358;");
	stmenu2.setOnAction(new EventHandler<ActionEvent>() {
		@Override
      public void handle(ActionEvent event) {
        primaryStage.close();
	     }});
	root.getChildren().add(iv2);
	root.getChildren().add(stmenu);
	root.getChildren().add(stmenu2);
	root.getChildren().add(logo);
        primaryStage.show();
    }
    
    private void gameover(Stage primaryStage){

	Group root = new Group();
        primaryStage.setResizable(false);
        primaryStage.setScene(new Scene(root, 740,420));
	
	Image img = new Image("gameover.jpg");
	Text gmov= new Text();
	gmov.setX(70);
	gmov.setY(150);
	gmov.setCache(true);
	gmov.setFont(Font.font(null, FontWeight.BOLD, 90));
	gmov.setFill(Color.BLACK);
	gmov.setText("GAME OVER");

	
         ImageView iv2 = new ImageView();
         iv2.setImage(img);
         iv2.setFitWidth(740);
         iv2.setPreserveRatio(true);
         iv2.setSmooth(true);
         iv2.setCache(true);
	 iv2.setOpacity(0.6);
 
	 
	Text t= new Text();
	t.setX(10);
	t.setY(30);
	t.setCache(true);
	t.setFont(Font.font(null, FontWeight.BOLD, 28));
	t.setFill(Color.WHITE);
	t.setText("MENU");
	
	Button stmenu = new Button();
    	stmenu.setGraphic(t);
	
	stmenu.setLayoutX(320);
	stmenu.setLayoutY(250);
	stmenu.setStyle("-fx-base: #000000;");
	stmenu.setOnAction(new EventHandler<ActionEvent>() {
		@Override
      public void handle(ActionEvent event) {
	startmenu(primaryStage);
        primaryStage.show();
	     }});

	Text t2= new Text();
	t2.setX(10);
	t2.setY(30);
	t2.setCache(true);
	t2.setFont(Font.font(null, FontWeight.BOLD, 28));
	t2.setFill(Color.WHITE);
	t2.setText("EXIT");
	Button stmenu2 = new Button();
    	stmenu2.setGraphic(t2);
	stmenu2.setLayoutX(330);
	stmenu2.setLayoutY(310);
	stmenu2.setStyle("-fx-base: #000000;");
	stmenu2.setOnAction(new EventHandler<ActionEvent>() {
		@Override
      public void handle(ActionEvent event) {
        primaryStage.close();
	     }});
	root.getChildren().add(iv2);
	root.getChildren().add(stmenu);
	root.getChildren().add(stmenu2);
	root.getChildren().add(gmov);
        primaryStage.show();
	
    }
    private void init(Stage primaryStage,int change) {
      
	Group root = new Group();
        primaryStage.setResizable(false);
        primaryStage.setScene(new Scene(root, 670,600));
	stg_sauv= primaryStage;
	Pane image_slot = new Pane();
	Random rd = new Random();
	int posx=108;
	int posy=125;
	
	for(int i=0;i< 4;i++){
	if(change==0)img_grid_tab[i]=imagebuilder(i);	
	img_grid_tab[i].setLayoutX(posx);
	img_grid_tab[i].setLayoutY(posy);
	image_slot.getChildren().add(img_grid_tab[i]);
	double speed=(1.7-0.9)*rd.nextFloat()+0.9;
	transitiontab[i]= new TranslateTransition(Duration.seconds(speed),img_grid_tab[i]);
        transitiontab[i].setFromY(-3800);
	transitiontab[i].setToY(0);
        transitiontab[i].setCycleCount(2);
        transitiontab[i].setAutoReverse(false);
	posx+=125;
	speed+=0.2;
	}

	
	Button return_menu = new Button();
    	return_menu.setGraphic(new ImageView(new Image("exiticon.jpg")));
	//return_menu.setText("Menu");
	return_menu.setLayoutX(600);
	return_menu.setLayoutY(0);
	return_menu.setStyle("-fx-base: #2E8B57;");
    return_menu.setOnAction(new EventHandler<ActionEvent>() {
		@Override
      public void handle(ActionEvent event) {
		startmenu(primaryStage);
	     }});
    
	if(change==0){
	buttonbuillder(primaryStage);
	MachineBuilder mch = new MachineBuilder();
	machine_img = mch.make();
	}
	ScoreBuilder scr = new ScoreBuilder();
	Pane board = scr.make(credit,beting);
	root.getChildren().add(image_slot);
	root.getChildren().add(machine_img);
	root.getChildren().add(board);
	root.getChildren().add(menu);
	root.getChildren().add(return_menu);
    }

private void buttonbuillder(Stage primaryStage){

	Text t= new Text();
	t.setX(10);
	t.setY(30);
	t.setCache(true);
	t.setFont(Font.font(null, FontWeight.BOLD, 28));
	t.setFill(Color.WHITE);
	
	Button spin = new Button();

    
	t.setText("SPIN");
    	spin.setGraphic(t);
	spin.setStyle("-fx-base: #FF0000;");


	spin.setOnAction(new EventHandler<ActionEvent>() {
		@Override
      public void handle(ActionEvent event) {
        if(opacity == 2.1){
  	  if(beting==0)System.out.println("valeur de BET = 0");
       else if(credit-beting >= 0&&credit > 0){
	  int indice=47;
	  init(primaryStage,0);
	  primaryStage.show();
	soundeffect.play();
	  if(opacity < 2.1)opacity +=2.1;
	  credit-=beting;
	  System.out.println("credit " + credit+"$");
	  for(int i=0;i < 4;i++)transitiontab[i].play();
	  
        AnimationTimer timer = new MyTimer();
        timer.start();
	win();
	System.out.println("Spin");
	System.out.println("tab1 "+tabstr[score[0]]+" tab2 "+tabstr[score[1]]+" tab3 "+tabstr[score[2]]+" tab4 "+tabstr[score[3]]);
	System.out.println("credit " + credit+"$");
	}else System.out.println("credit est insuffisant");
	}else System.out.println("Etat interdit! :L'Animation est en train de tourner(button spin)");
      }
    });
	
Text t2= new Text();
        t2.setX(10);
	t2.setY(30);
	t2.setCache(true);
	t2.setFont(Font.font(null, FontWeight.BOLD, 25));
	t2.setFill(Color.WHITE);

	t2.setText("BET UP");
    Button incremente = new Button();
    	incremente.setGraphic(t2);
	incremente.setStyle("-fx-base: #FF0000;");
	incremente.setOnAction(new EventHandler<ActionEvent>() {
		@Override
      public void handle(ActionEvent event) {

  if(opacity == 2.1){
	beting +=100;
        init(primaryStage,1);
        primaryStage.show();
	System.out.println("Bet "+beting+"$");
  }else
    System.out.println("Etat interdit! :L'Animation est en train de tourner(button bet up)");
	}
    });

	
Text t3= new Text();
        t3.setX(10);
	t3.setY(30);
	t3.setCache(true);
	t3.setFont(Font.font(null, FontWeight.BOLD, 25));
	t3.setFill(Color.WHITE);
	t3.setText("BET DOWN");	
	Button decremente = new Button();
    	decremente.setGraphic(t3);
	decremente.setStyle("-fx-base: #FF0000;");
	decremente.setOnAction(new EventHandler<ActionEvent>() {
       	@Override
      public void handle(ActionEvent event) {
	    if(opacity == 2.1){
	    if(beting!=0)beting -=100;
	    init(primaryStage,1);
	    primaryStage.show();
	    System.out.println("Bet"+beting);
	    }else System.out.println("Etat interdit! :L'Animation est en train de tourner(button bet down)");
	}
    });
	
Text btn_max_txt= new Text();
        btn_max_txt.setX(10);
	btn_max_txt.setY(30);
	btn_max_txt.setCache(true);
	btn_max_txt.setFont(Font.font(null, FontWeight.BOLD, 25));
	btn_max_txt.setFill(Color.WHITE);
	btn_max_txt.setText("BET MAX");	

	
	Button betmax = new Button();
    	betmax.setGraphic(btn_max_txt);
	betmax.setStyle("-fx-base: #FF0000;");
	
	betmax.setOnAction(new EventHandler<ActionEvent>() {
       	@Override
      public void handle(ActionEvent event) {
	      if(opacity == 2.1){
	    beting=credit;
	    init(primaryStage,1);
	    primaryStage.show();
	    System.out.println("Bet"+beting);
	      }else System.out.println("Etat interdit! :L'Animation est en train de tourner(button bet max)");
	}
    });
	menu.setHgap(7);
	menu.add(spin, 0,0);
	menu.add(betmax, 1,0);
	menu.add(decremente, 2,0);
	menu.add(incremente, 3,0);
	menu.setLayoutX(35);
	menu.setLayoutY(450);
	
	PerspectiveTransform perspectiveTrasform = new PerspectiveTransform();
	perspectiveTrasform.setUlx(40.0);
	perspectiveTrasform.setUly(0.0);
	perspectiveTrasform.setUrx(560.0);
	perspectiveTrasform.setUry(0.0);
	perspectiveTrasform.setLrx(590.0);
	perspectiveTrasform.setLry(60.0);
	perspectiveTrasform.setLlx(10.0);
	perspectiveTrasform.setLly(60.0);

 
	menu.setEffect(perspectiveTrasform);
}
    

    private GridPane imagebuilder(int indice){
	Random rd= new Random();
	ImageView gridimg[]=new ImageView[50];
    GridPane gridpaneimg = new GridPane();
    int random_img;
	for(int i=0; i< 50 ; i++){
	      random_img=rd.nextInt(8);
	      if(i==1)score[indice]=random_img;
	      gridimg[i]=new ImageView(new Image(tabstr[random_img]));
	      gridpaneimg.add(gridimg[i],0,i);
	}
	return gridpaneimg;
    }

    
    private static void win(){


	if(credit==0)
	    isWin=3;

	
	if(score[0]==3 && score[0]==score[1] &&score[1]==score[2]&&score[2]==score[3])if(beting!=0){
		credit+=beting*777;
		if(beting!=0)isWin=1;
	    }
 	else if(score[0]==score[1] &&score[1]==score[2]&&score[2]==score[3])
	    if(beting!=0){
		credit+=beting*100;
		if(beting!=0)isWin=1;
	    }
	int count_serie=0;
	for(int i=0;i<4;i++)
		for(int j=0;j<4;j++)
		if(score[i]==score[j] && i!=j)
		count_serie++;			

	if(count_serie==2){
	    credit+=beting*3;
	    if(beting!=0)isWin=1;
	}
	if(count_serie>2){
	    credit+=beting*30;
	    if(beting!=0)isWin=1;
	}
	System.out.println(count_serie+" images sont identiques");

	}

    @Override
    public void start(Stage primaryStage) throws Exception {
	startmenu(primaryStage);

	}
    public static void main(String[] args){
        launch(args);
    }
}
