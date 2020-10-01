package be.abis.exa1.model;

public class Company {

    private String name;
    private Address address;

    public Company(String name, Address address) {
        super();
        this.name = name;
        this.address = address;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }


    public double calculateTaxToPay(){
        double tax = 0.0;
        String countryCode = this.address.getCountryCode();
        switch (countryCode){
            case "BE": tax = 51.0; break;
            case "NL": tax = 47.0; break;
            default: tax = 35.0; break;
        }
        return tax;
    }
}