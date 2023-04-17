import arc.*;
import java.awt.image.BufferedImage;
//  test



public class midtermproject{
	public static void main(String[] args){
		Console con = new Console("Battle For Survival", 1280, 720);
		
		// Scene 1
		
		
		scene1(con);
		
		String strName;
		String strInitial;
		
		con.println("SEARGEANT MILLAR: Here is a quick update young adventurer");
		con.sleep(5000);
		con.clear();
		con.println("SEARGEANT MILLAR: Mythical monsters from the universe Cestearus are attacking our clan");
		con.sleep(5000);
		con.clear();
		con.println("SEARGEANT MILLAR: It is up to YOU to destroy these monsters and bring peace");
		con.sleep(5000);
		con.clear();
		con.println("SEARGEANT MILLAR: Give me your name young traveler");
		strName = con.readLine();
		con.clear();
		con.println(strName+" is a noble name");
		con.sleep(5000);
		con.clear();
		
		strInitial = "";
		strInitial = strInitial + strName.substring(0,1);
		
		
		if(strInitial.equals("a") || strInitial.equals("e") || strInitial.equals("i") || strInitial.equals("o") || strInitial.equals("u")){
			// Scene 2
			
			con.println("Good luck WARRIOR "+strName);
		}else if(strInitial.equals(strInitial.toUpperCase())){
			// Scene 4
			
			con.println("Good luck ARCHER "+strName);
		}else{
			// Scene 3
			
			con.println("Good luck MAGE "+strName);
		}
		
		
		
		
		
	} // "public static void main(String[] args)" ENDING bracket
	
	// Scene 1 - Sergeant Miller talks about the ongoing war against the mythical monsters of the universe Cestearus
	public static void scene1(Console con){
		BufferedImage imgScene1;
		imgScene1 = con.loadImage("BFSscene1.jpg");
		
		con.drawImage(imgScene1,0,0);
		con.repaint();
	}
	
	
} // "public class midtermproject" ENDING bracket
