import org.jibble.pircbot.*;

public class MyBot extends PircBot {
    
	display display = new display();
	public boolean announceStatus = false;
	public String announceSender;
	
    public MyBot(){
        this.setName("Recieve_Bot");
        this.setAutoNickChange(true);
    }
    
    
    
    public void onMessage(String channel, String sender,
                       String login, String hostname, String message) {
        if (message.contains("Now Playing: ")) {
        	announceNotify(sender);
        	String parts[] = message.split(("\\-"));
        	String act = parts[0].substring(17);
        	String songNum = parts[1].substring(6);
        	String song = parts[2].substring(1);
        	display.songUpdate(1, "ACT", act);
        	display.songUpdate(2, "SONG #", songNum);
        	display.songUpdate(3, "SONG", song);
        	if(parts.length > 3){
        		display.songUpdate(4, "CLASS", parts[3]);
        	}else{
        		display.songUpdate(4, "", "");
        	}
        }
    }
    
    public void onPrivateMessage(String sender, String login, String hostname, String message){
    	if(message.equalsIgnoreCase("help")){
    		sendMessage(sender, "To Announce type \"ANNOUNCE\" followed by your message.  Use \"-\" to make new lines (up to 3 lines).");
    	}else if(message.contains("ANNOUNCE")){
    		sendMessage(sender, "Announcing...");
    		announceNotify(sender);
    		announceStatus = true;
    		String announcement = message.substring(9);
    		sendMessage("Sound_Bot", "wlamart" + announcement);
    		announcement = announcement + " - - - - ";
    		String parts[] = announcement.split(("\\-"));
    		display.specialText(1, "ANNOUNCEMENT!");
    		int counter = 2;
    		while(counter <= 4){
    			int p = counter - 2;
    			display.specialText(counter, parts[p]);
    			counter++;
    		}
    	}
    }
    
    public void announceNotify(String sender){
    	if(announceStatus == true && announceSender != sender){
    		sendMessage(announceSender, "Your last message has ended.");
    		announceStatus = false;
    		announceSender = sender;
    	}
    }
}