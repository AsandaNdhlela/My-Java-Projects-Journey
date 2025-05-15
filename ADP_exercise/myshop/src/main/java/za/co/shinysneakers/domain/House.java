package za.co.shinysneakers.domain;

public class House extends Address{

    private int erfNumber;

    private House(long addressId, short streetNumber, String streetName, String suburb,
                  String city, String province, short postalCode, int erfNumber){
        super();
        this.erfNumber = erfNumber;
    }

    public House(Builder builder) {
        this.addressId = builder.addressId;
        this.streetNumber = builder.streetNumber;
        this.streetName = builder.streetName;
        this.suburb = builder.suburb;
        this.city = builder.city;
        this.province = builder.province;
        this.postalCode = builder.postalCode;
        this.erfNumber = builder.erfNumber;
    }

    public int getErfNumber() {
        return erfNumber;
    }

    @Override
    public String toString() {
        return "House{" +
                "erfNumber=" + erfNumber +
                ", addressId=" + addressId +
                ", streetNumber=" + streetNumber +
                ", streetName='" + streetName + '\'' +
                ", suburb='" + suburb + '\'' +
                ", city='" + city + '\'' +
                ", province='" + province + '\'' +
                ", postalCode=" + postalCode +
                '}';
    }

    public static class Builder{
        private long addressId;
        private short streetNumber;
        private String streetName;
        private String suburb;
        private String city;
        private String province;
        private short postalCode;
        private int erfNumber;

        public Builder setAddressId(long addressId) {
            this.addressId = addressId;
            return this;
        }

        public Builder setStreetNumber(short streetNumber) {
            this.streetNumber = streetNumber;
            return this;
        }

        public Builder setStreetName(String streetName) {
            this.streetName = streetName;
            return this;
        }

        public Builder setSuburb(String suburb) {
            this.suburb = suburb;
            return this;
        }

        public Builder setCity(String city) {
            this.city = city;
            return this;
        }

        public Builder setProvince(String province) {
            this.province = province;
            return this;
        }

        public Builder setPostalCode(short postalCode) {
            this.postalCode = postalCode;
            return this;
        }

        public Builder setErfNumber(int erfNumber) {
            this.erfNumber = erfNumber;
            return this;
        }

        public Builder copy(House house){
            this.addressId = house.addressId;
            this.streetNumber = house.streetNumber;
            this.streetName = house.streetName;
            this.suburb = house.suburb;
            this.city = house.city;
            this.province = house.province;
            this.postalCode = house.postalCode;
            this.erfNumber = house.erfNumber;
            return this;
        }

        public House build(){
            return new House(this);
        }
    }


}
