package pl.altkom.springboot.lab06.profiles.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import pl.altkom.springboot.lab06.profiles.service.ProfileService;

@RequiredArgsConstructor
@RestController
public class ProfileController {

    private final ProfileService profileService;

    @GetMapping("/message")
    public String message() {
        return profileService.message();
    }
}
