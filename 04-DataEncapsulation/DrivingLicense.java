public class DrivingLicense {
    private String firstName;
    private String lastName;
    private String address;
    private String postalCode;
    private String city;
    private String dlNumber;
    private int yearIssue;
    private String dlCat;
    

    public String getFirstName(){
        return firstName;

    }

    public void setFirstName(String firstName){
        this.firstName = firstName;


    }

    public String getLastName(){
        return lastName;

    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getAddress(){
        return address;

    }

    public void setAddress(String address){
        this.address = address;


    }

    public String getPostalCode(){
        return postalCode;

    }

    public void setPostalCode(String postalCode){
        this.postalCode = postalCode;
    }

    public String getCity(){
        return city;

    }

    public void setCity(String city){
        this.city = city;


    }

    public String getDlNumber(){
        return dlNumber;

    }

    public void setDlNumber(String dlNumber){
        this.dlNumber = dlNumber;
    }

    public int getYearIssue(){
        return yearIssue;
    }


    public void setYearIssue(int yearIssue){
        if(yearIssue<=1980 && yearIssue>=2022){
        this.yearIssue = yearIssue;
        }
    }



    public String getDlCat(){
        return dlCat;

    }

    public void setDlCat(String dlCat){
        this.dlCat = dlCat;
    }


    public void displayInfo(){
        System.out.println("\n-  - VZ # + dlNumber " + "- -");
        System.out.println(firstName + " " + lastName);
        System.out.println(city + ", " + address + ", " + postalCode);
        System.out.println("Cat: " + dlCat);
        System.out.println("Year of issue: " + yearIssue);
    }

    public String toString(){
        return dlNumber + "\n" + firstName + "\n" + lastName + "\n" + city + "," + address + "," + postalCode + "\n" + dlCat + "\n" + yearIssue;
        
    }
}
