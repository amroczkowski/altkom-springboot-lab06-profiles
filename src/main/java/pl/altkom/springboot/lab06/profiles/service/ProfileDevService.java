package pl.altkom.springboot.lab06.profiles.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("dev")
@Service
public class ProfileDevService implements ProfileService {

    @Override
    public String message() {
        return "I'm using dev profile!";
    }
}
