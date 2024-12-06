package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.websites.FacebookPublisher;
import com.kodilla.patterns.strategy.social.websites.TwitterPublisher;

public class Millenials extends User{

    public Millenials(String username) {
        super(username);
        this.socialPublisher = new FacebookPublisher();
    }
}
