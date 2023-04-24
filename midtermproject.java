import arc.*;
import java.awt.image.BufferedImage;
import java.awt.Color;




public class midtermproject{
	public static void main(String[] args){
		Console con = new Console("Battle For Survival", 1280, 720);
		
		// Scene 1
		
		scene1(con);

		String strName;
		String strInitial;
		
		con.println("SEARGEANT MILLAR: Here is a quick update young adventurer");
		//con.sleep(5000);
		con.clear();
		con.println("SEARGEANT MILLAR: Mythical monsters from the universe Cestearus are attacking our clan");
		//con.sleep(5000);
		con.clear();
		con.println("SEARGEANT MILLAR: It is up to YOU to destroy these monsters and bring peace");
		//con.sleep(5000);
		con.clear();
		con.println("SEARGEANT MILLAR: Give me your name young traveler");
		strName = con.readLine();
		con.clear();
		con.println(strName+" is a noble name");
		//con.sleep(5000);
		con.clear();
		
		strInitial = "";
		strInitial = strInitial + strName.substring(0,1);
		
		
		if(strInitial.equals("a") || strInitial.equals("e") || strInitial.equals("i") || strInitial.equals("o") || strInitial.equals("u")){
			// Scene 2
			con.setTextColor(Color.BLACK);
			con.println("SEARGEANT MILLAR: Good luck WARRIOR "+strName);
			con.println("[Your SWORD glows with power]");
			
			scene2(con);
			
			// SPLIT
			
			scene5(con);
			con.clear();
			
			scene8(con);
			
			

		}else if(strInitial.equals(strInitial.toUpperCase())){
			// Scene 4
			
			con.println("SEARGEANT MILLAR: Good luck ARCHER "+strName);
			con.println("[Your BOW glows with power]");
			
			scene4(con);
		}else{
			// Scene 3
			
			con.println("SEARGEANT MILLAR: Good luck MAGE "+strName);
			con.println("[Your STAFF glows with power]");
			
			scene3(con);
		}
		
		
		
		
		
	} // "public static void main(String[] args)" ENDING bracket
	
	// Scene 1 - Sergeant Miller talks about the ongoing war against the mythical monsters of the universe Cestearus
	public static void scene1(Console con){
		BufferedImage imgScene1;
		imgScene1 = con.loadImage("BFSscene1.jpg");
		
		con.drawImage(imgScene1,0,0);
		con.repaint();
	}
	
	// Scene 2 - You are welcomed as a melee WARRIOR Flaming Sword Animation
	public static void scene2(Console con){
		BufferedImage imgScene2;
		imgScene2 = con.loadImage("BFSscene2.jpg");
		
		con.repaint();
		
		int intCounter;
		
		for(intCounter = 500; intCounter > 200; intCounter--){
			con.setDrawColor(new Color(133, 42, 42));
			con.fillOval(250,intCounter,30,30);
			con.drawImage(imgScene2,0,0);
			con.repaint();
		}
		for(intCounter = 500; intCounter > 200; intCounter--){	
			con.setDrawColor(new Color(133, 42, 42));
			con.fillOval(400,intCounter,30,30);
			con.drawImage(imgScene2,0,0);
			con.repaint();
		}
		for(intCounter = 500; intCounter > 200; intCounter--){
			con.setDrawColor(new Color(133, 42, 42));
			con.fillOval(250,intCounter- 50,30,30);
			con.drawImage(imgScene2,0,0);
			con.repaint();
		}
		for(intCounter = 500; intCounter > 200; intCounter--){
			con.setDrawColor(new Color(133, 42, 42));
			con.fillOval(300,intCounter - 75,30,30);
			con.drawImage(imgScene2,0,0);
			con.repaint();
		}
		for(intCounter = 500; intCounter > 200; intCounter--){
			con.setDrawColor(new Color(133, 42, 42));
			con.fillOval(350,intCounter - 100,30,30);
			con.drawImage(imgScene2,0,0);
			con.repaint();
		}
		for(intCounter = 500; intCounter > 200; intCounter--){
			con.setDrawColor(new Color(133, 42, 42));
			con.fillOval(200,intCounter + 100,30,30);
			con.drawImage(imgScene2,0,0);
			con.repaint();
		}
		
		con.sleep(10000);
		con.clear();
	}
		
	// Scene 3 - You are welcomed as a magic wielding MAGE Flaming Staff Animation

	public static void scene3(Console con){
		BufferedImage imgScene3;
		imgScene3 = con.loadImage("BFSscene3.jpg");
		
		int intCounter;
		
		for(intCounter = 0; intCounter < 300; intCounter++){
			con.setDrawColor(new Color(36, 120, 199));
			con.fillOval(250,intCounter,30,30);
			con.drawImage(imgScene3,0,0);
			con.repaint();
		}
		for(intCounter = 0; intCounter < 300; intCounter++){
			con.setDrawColor(new Color(33, 117, 173));
			con.fillOval(100,intCounter,30,30);
			con.drawImage(imgScene3,0,0);
			con.repaint();
		}
		for(intCounter = 0; intCounter < 300; intCounter++){
			con.setDrawColor(new Color(126, 193, 237));
			con.fillOval(400,intCounter,30,30);
			con.drawImage(imgScene3,0,0);
			con.repaint();
		}
		for(intCounter = 0; intCounter < 300; intCounter++){
			con.setDrawColor(new Color(61, 150, 209));
			con.fillOval(175,intCounter,30,30);
			con.drawImage(imgScene3,0,0);
			con.repaint();
		}
		for(intCounter = 0; intCounter < 300; intCounter++){
			con.setDrawColor(new Color(14, 102, 161));
			con.fillOval(275,intCounter,30,30);
			con.drawImage(imgScene3,0,0);
			con.repaint();
		}
		
		con.sleep(10000);


	}
	
	// Scene 4 - You are welcomed as a bow-handling ARCHER Flaming Bow Animation
	public static void scene4(Console con){
		BufferedImage imgScene4;
		imgScene4 = con.loadImage("BFSscene4.jpg");
		
		int intCounter;
		
		for(intCounter = 0; intCounter < 300; intCounter++){
			con.setDrawColor(new Color(76, 140, 95));
			con.fillOval(980,intCounter+200,30,30);
			con.drawImage(imgScene4,-300,0);
			con.repaint();
		}
		for(intCounter = 0; intCounter < 300; intCounter++){
			con.setDrawColor(new Color(124, 222, 154));
			con.fillOval(1100,intCounter+300,30,30);
			con.drawImage(imgScene4,-300,0);
			con.repaint();
		}
		for(intCounter = 0; intCounter < 300; intCounter++){
			con.setDrawColor(new Color(3, 171, 54));
			con.fillOval(1050,intCounter+450,30,30);
			con.drawImage(imgScene4,-300,0);
			con.repaint();
		}
		for(intCounter = 0; intCounter < 300; intCounter++){
			con.setDrawColor(new Color(31, 194, 80));
			con.fillOval(1150,intCounter+400,30,30);
			con.drawImage(imgScene4,-300,0);
			con.repaint();
		}
		for(intCounter = 0; intCounter < 300; intCounter++){
			con.setDrawColor(new Color(52, 235, 107));
			con.fillOval(1075,intCounter+370,30,30);
			con.drawImage(imgScene4,-300,0);
			con.repaint();
		}
		
		con.sleep(10000);
		
	}
	
	// Scene 5 - A mythical fire breathing dragon appears. What do you do?
	public static void scene5(Console con){
		BufferedImage imgScene5;
		imgScene5 = con.loadImage("BFSscene5.jpg");
		
		int intChoice1;
		
		con.setTextColor(Color.WHITE);
		
		con.println("[A mythical fire breathing dragon appears]");
		con.println("[Are you going to attack it?]");
		con.println("[ATTACK - 1]");
		con.println("[DO NOTHING - 2]");
		
		con.drawImage(imgScene5,0,0);
		con.repaint();
		
		double startTime;
		startTime = System.currentTimeMillis();
		
		intChoice1 = con.readInt();
		double duration;
		duration = System.currentTimeMillis() - startTime;
		
		if(intChoice1 >= 2 || duration > 10000){
			scene6(con);
		}else if(intChoice1 == 1){
			scene7(con);
		}		
		
	}
	
	// Scene 6 - You have died. The monsters have taken over Cestearus
	public static void scene6(Console con){
		BufferedImage imgScene6;
		imgScene6 = con.loadImage("BFSscene6.jpg");
		
		con.drawImage(imgScene6,-100,-200);
		con.repaint();
		
		con.println("[You have died. The monsters have taken over Cestearus]");
		
		con.sleep(5000);
		con.closeConsole();
		
	}
	
	// Scene 7 - You have slain the dragon. Congratulations!
	public static void scene7(Console con){
		
		BufferedImage imgScene5;
		imgScene5 = con.loadImage("BFSscene5.jpg");
		
		BufferedImage imgSlash;
		imgSlash = con.loadImage("BFSslash.png");
		
		con.println("[You have slain the dragon. Congratulations!]");
		
		
		con.drawImage(imgScene5,0,0);
		con.repaint();
		
		con.drawImage(imgSlash,900,200);
		
		con.sleep(10000);
				
	}
	
	// Scene 8 - A Towering Golem to slaughter you
	public static void scene8(Console con){
		BufferedImage imgScene8;
		imgScene8 = con.loadImage("BFSscene8.jpg");
		
		con.println("[A Towering Golem wants to slaughter you]");
		con.println("[What option do you choose?]");
		con.println("[RUN AWAY - 1]");
		con.println("[ATTACK - 2]");
		con.println("[TAME IT - 3]");
		
		con.drawImage(imgScene8,-400,0);
		
		int intChoice2;
		
		double startTime;
		startTime = System.currentTimeMillis();
		
		intChoice2 = con.readInt();
		double duration;
		duration = System.currentTimeMillis() - startTime;
		
		if(duration > 10000){
			scene6(con);
		}else if(intChoice2 == 1){
			int intRandom;
			intRandom = (int)(Math.random()*100+1);
			
			con.println("[You have a 50% chance of running]");
			if(intRandom > 50){
				scene6(con);
			}else if(intRandom <=50){
				scene9(con);
			}
		}
			
	}
	
	// Scene 9 - Due to your cowardice, the king wants you to solve his math puzzle
	public static void scene9(Console con){
		BufferedImage imgScene9;
		imgScene9 = con.loadImage("BFSscene9.jpg");
		
		con.println("[Due to your cowardice, the king wants you]");
		con.println("[to solve his math puzzle]");
		
		con.drawImage(imgScene9,-400,-300);
	}
	
	// Scene 10 - Attack it 20 times to slay the Golem
	public static void scene10(Console con){
		BufferedImage imgScene8;
		imgScene8 = con.loadImage("BFSscene8.jpg");
		
		con.println("[Attack the Golem 20 times]");
		con.println("[to slay it]");
		
		con.drawImage(imgScene8,-400,0);
	}
	
	// Scene 11 - A phoenix appears looking ready to destroy you
	public static void scene11(Console con){
		BufferedImage imgScene11;
		imgScene11 = con.loadImage("BFSscene11.jpg");
		
		con.println("[A phoenix appears looking ready to destroy you]");
		
		
		con.drawImage(imgScene11,0,0);
	}
	// Scene 12 - Congratulations! You win and receive a lot of gold from the king
	public static void scene12(Console con){
		BufferedImage imgScene12;
		imgScene12 = con.loadImage("BFSscene12.jpg");
		
		con.println("[Congratulations!]");
		con.println("[You win and receive a lot of gold from the king]");
		con.println("[THE END]");
		
		con.drawImage(imgScene12,-300,-425);
		
		con.sleep(15000);
		con.closeConsole();
	}
	
	
		

} // "public class midtermproject" ENDING bracket
