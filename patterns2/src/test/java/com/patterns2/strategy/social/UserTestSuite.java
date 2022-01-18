package com.patterns2.strategy.social;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTestSuite {
    @Test
    void testDefaultSharingStrategies() {
        // given
        User facebookUser = new Millenials("FaceBook user");
        User twitterUser = new ZGeneration("Twitter user");
        User snapChatUser =  new YGeneration("SnapChat user");

        String millenials = facebookUser.sharePost();
        System.out.println("Facebook user posts on " + millenials);
        String zGeneration = twitterUser.sharePost();
        System.out.println("Twitter user posts on " + zGeneration);
        String yGeneration = snapChatUser.sharePost();
        System.out.println("Snapchat user post on " + yGeneration);

        Assertions.assertEquals("Facebook", millenials);
        Assertions.assertEquals("Twitter", zGeneration);
        Assertions.assertEquals("Snapchat", yGeneration);
        Assertions.assertNotEquals("Twitter", millenials);
    }
    @Test
    void testIndividualSharingStrategy() {
        // Given
        User facebookUser = new Millenials("Facebook user");
        // When
        String millenials = facebookUser.sharePost();
        System.out.println("Facebook user posts on " + millenials);
        facebookUser.setPublisher(new SnapchatPublisher());
        millenials = facebookUser.sharePost();
        System.out.println("Now Facebook user should posts on " + millenials);
        // Then
        Assertions.assertEquals("Snapchat", millenials );

    }
}
