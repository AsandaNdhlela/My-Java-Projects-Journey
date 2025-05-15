package za.co.shinysneakers.factory;
import za.co.shinysneakers.domain.Flat;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class FlatFactoryTest {


    private static Flat flat =  FlatFactory.createFlat("100223569","Besterr", "Weapon");


    @Test
    void createFlat() {
        // Add test logic here
    }

    @Test
    void createFlatWithNullName() {
        // Add test logic here
    }

    @Test
    void createFlatWithValidName() {
        // Add test logic here
    }

    @Test
    void getAll() {
        // Add test logic here
    }

}