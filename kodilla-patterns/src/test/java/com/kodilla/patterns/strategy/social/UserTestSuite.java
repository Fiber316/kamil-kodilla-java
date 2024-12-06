package com.kodilla.patterns.strategy.social;


import com.kodilla.patterns.strategy.social.websites.SnapchatPublisher;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        //Given
        User steven = new Millenials("Steven");
        User john = new YGeneration("John");
        User hannah = new ZGeneration("Hannah");

        //When
        String stevenShouldShare = steven.sharePost();
        System.out.println("Steven should: " + stevenShouldShare);
        String johnShouldShare = john.sharePost();
        System.out.println("John should: " + johnShouldShare);
        String hannahShouldShare = hannah.sharePost();
        System.out.println("Hannah should: " + hannahShouldShare);

        //Then
        assertEquals("Share on Facebook", stevenShouldShare);
        assertEquals("Share on Twitter", johnShouldShare);
        assertEquals("Share on Snapchat", hannahShouldShare);
    }

    @Test
    void testIndividualSharingStrategy() {
        //Given
        User steven = new Millenials("Steven");

        //When
        String stevenShouldShare = steven.sharePost();
        System.out.println("Steven should: " + stevenShouldShare);
        steven.setSocialPublisher(new SnapchatPublisher());
        stevenShouldShare = steven.sharePost();
        System.out.println("Steven now should: " + stevenShouldShare);

        //Then
        assertEquals("Share on Snapchat", stevenShouldShare);
    }

}
