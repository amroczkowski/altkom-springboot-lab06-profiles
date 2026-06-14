package pl.altkom.springboot.lab06.profiles.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("!dev")
@Service
public class ProfileProdService implements ProfileService {

    @Override
    public String message() {
        return "I'm NOT using dev profile!";
    }
}
