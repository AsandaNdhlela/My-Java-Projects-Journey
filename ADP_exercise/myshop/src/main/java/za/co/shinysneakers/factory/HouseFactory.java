package za.co.shinysneakers.factory;
import za.co.shinysneakers.domain.House;
import za.co.shinysneakers.util.Helper;

public class HouseFactory {
    // Factory method to create a House object
    public static House createHouse(za.co.shinysneakers.domain.House house) {
        if (Helper.isValidErfNumber(house.getErfNumber())) {
            return null;
        }
        return new za.co.shinysneakers.domain.House.Builder()
                .setAddressId(house.getAddressId())
                .setStreetNumber(house.getStreetNumber())
                .setStreetName(house.getStreetName())
                .setSuburb(house.getSuburb())
                .setCity(house.getCity())
                .setProvince(house.getProvince())
                .setPostalCode(house.getPostalCode())
                .setErfNumber(house.getErfNumber())
                .build();
    }
}
