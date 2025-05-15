/*  Gender.java
    Gender POJO class
    Author: AsandaNdhlela (230614345)
    Date: 11 May 2025
*/

package za.ac.cput.domain.demography;


public class Gender {

    protected String id;
    protected String description;

    private Gender(){};

    private Gender(Builder build){
        this.id = build.id;
        this.description = build.description;
    }

    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Gender{" +
                "id='" + id + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public static class Builder{
        private String id;
        private String description;

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder copy(Gender gender){
            this.id = gender.id;
            this.description = gender.description;
            return this;
        }

        public Gender build(){
             return new Gender(this);
        }
    }
}
