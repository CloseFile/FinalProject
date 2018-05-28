package com.udacity.gradle.builditbigger.javajokes;

import java.util.Random;

public class Joker {
    //    public String getJoke() {
//        return "This is totally a funny joke";
    private Random random;
    private String[] jokes;

    public Joker() {
        jokes = new String[]{
                "I ran out of new IPv4 jokes. I could tell you an IPv6 one but I'm afraid, you might not understand it.",
                "An ARP request goes to McDonald’s and asks for a Big MAC. ",
                "I was dressed up as a UDP packet for the Halloween. I don’t think anyone got it, but I couldn’t tell."};
        random = new Random();
    }

    public String getRandomJoke() {
        return jokes[random.nextInt(jokes.length)];
    }
}