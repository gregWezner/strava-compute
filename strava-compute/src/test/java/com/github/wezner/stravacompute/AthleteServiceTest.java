package com.github.wezner.stravacompute;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class AthleteServiceTest {

    @InjectMocks
    private AthleteService athleteService;

    @Test
    public void shouldGetAthleteDataForRightToken() {
        athleteService.getAthlete();
    }
}