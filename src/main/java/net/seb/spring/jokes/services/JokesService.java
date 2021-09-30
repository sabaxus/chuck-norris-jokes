package net.seb.spring.jokes.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokesService implements net.seb.spring.jokes.services.Service {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokesService() {
        chuckNorrisQuotes = new ChuckNorrisQuotes();;
    }

    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
