public class City {
    
private int Id;
private String Name;
private String CountryCode;
private String District;
private int Population;

    public City(int Id, String Name, String CountryCode, String District, int Population) {
        this.Id = Id;
        this.Name = Name;
        this.CountryCode = CountryCode;
        this.District = District;
        this.Population = Population;
    }
    
    public int getId() {
        return Id;
    }
    public void setId(int Id) {
        this.Id = Id;
    }

    
    public String getName() {
        return Name;
    }
    public void setName(String Name) {
        this.Name = Name;
    }

    
    public String getCountryCode() {
        return CountryCode;
    }
    public void setCountryCode(String CountryCode) {
        this.CountryCode = CountryCode;
    }

    
    public String getDistrict() {
        return District;
    }
    public void setDistrict(String District) {
        this.District = District;
    }

    
    public int getPopulation() {
        return Population;
    }
    public void setPopulation(int Population) {
        this.Population = Population;
    }
       

}
