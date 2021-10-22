
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

import java.util.List;


public class old {
    public void timeline() throws TwitterException {

        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
                .setOAuthConsumerKey("BQkQFT3i9d1glvMaGj1ycBKcN")
                .setOAuthConsumerSecret("LyENyl2dALYUaLv04Hm7JlHo9m5VX55TSxm3c7nDMrdaHEABRH")
                .setOAuthAccessToken("1450686116353376256-XZeGGf5473Nw5VxE9wI8tucK2MzjNc")
                .setOAuthAccessTokenSecret("tPjeSPFYotC8trsl4Fnxu5syViZ8V2R7Iau1Jhhb1USXC");
        TwitterFactory tf = new TwitterFactory(cb.build());
        Twitter twitter = tf.getInstance();

        List<Status> status = twitter.getHomeTimeline();
        for(Status st : status)
        {
            System.out.println(st.getUser().getName()+"-------"+st.getText());
        }
    }

}
