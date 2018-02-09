import java.util.List;

import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

public class TwitterMsgHandler {

	public static void main(String[] args) {
		ConfigurationBuilder configurationBuilder = new ConfigurationBuilder();
		
		configurationBuilder.setDebugEnabled(true)
			.setOAuthConsumerKey("BMsNbUOYSUYkqyXEaM9FrpPAe")
			.setOAuthConsumerSecret("R2hcxHGb65SsTyeeySF5VOhLZUZwAmVq2AMVsMfgAowZxILzjA")
			.setOAuthAccessToken("949226468940308480-XOokk14M1psQCDBfzkL46n6gJ3MHEoo")
			.setOAuthAccessTokenSecret("Q9OmDayzaPAav1jzobQoS1vSjYpvPXlGhhLPIA9Qgua1u");
		
		TwitterFactory twitterFactory = new TwitterFactory(configurationBuilder.build());
		Twitter twitter =  twitterFactory.getInstance();
		
		/*try {
			//twitter.sendDirectMessage("Bala.Gto1", "Hello from code");
			//twitter.getDirectMessages();
			
		} catch (TwitterException e) {
			e.printStackTrace();
		}*/
		
		try {
			List<Status> listStatus = twitter.getHomeTimeline();
			
			for(Status liStatus : listStatus) {
				System.out.println(liStatus.getUser().getName() + "\t" + liStatus.getText());
			}
		} catch (TwitterException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
