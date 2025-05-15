package za.co.shinysneakers.factory;

import za.co.shinysneakers.domain.Flat;
import za.co.shinysneakers.util.Helper;

public class FlatFactory {

    public static Flat createFlat(Flat flat) {
        if(Helper.isNullOrEmpty(flat.getFlatName() )){
            return null;
        }
        return new Flat.Builder().setAddressId(flat.getAddressId()).
                setStreetNumber(flat.getStreetNumber()).
                setStreetName(flat.getStreetName()).
                setSuburb(flat.getSuburb()).
                setCity(flat.getCity()).
                setProvince(flat.getProvince()).
                setPostalCode(flat.getPostalCode()).
                setUnitNumber(flat.getUnitNumber()).
                setFlatName(flat.getFlatName()).build();
    }

}


