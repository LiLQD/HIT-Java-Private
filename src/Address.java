import java.util.Scanner;

public class Address {
    public Address(String commune, String district, String city) {
        this.commune = commune;
        this.district = district;
        this.city = city;
    }

    public Address() {
    }
    public String getCommune() {
        return commune;
    }

    public void setCommune(String commune) {
        this.commune = commune;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }



    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Xã");
        this.commune = sc.nextLine();
        System.out.println("Huyện");
        this.district = sc.nextLine();
        System.out.println("Thành phố");
        this.city = sc.nextLine();
    }

    @Override
    public String toString() {
        return "Address [commune=" + commune + ", district=" + district + ", city=" + city + "]";
    }

    public void output() {
        System.out.println(toString());
    }

    public String commune;
    public String district;
    public String city;
}
