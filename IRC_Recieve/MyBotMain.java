import org.jibble.pircbot.*;

@SuppressWarnings("unused")
public class MyBotMain {
    
    public static void main(String[] args) throws Exception {
        
        // Now start our bot up.
        MyBot bot = new MyBot();
        
        // Enable debugging output.
        bot.setVerbose(false);
        
        // Connect to the IRC server.
        bot.connect("irc.freenode.net");

        // Join the #pircbot channel.
        bot.joinChannel("#bashsc");
        
        //while(true){
        //    Thread.sleep(1000);
        //}
    }
    
}