package lab1;

import java.util.List;

public abstract class AbstractLivingPlace {
    private String address;
    public List<Family>families;

    public AbstractLivingPlace(String address) {
        this.address = address;
    }
    public AbstractLivingPlace(){

    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int countResidence() {
        int sum = 0;
        for (int i = 0; i < families.size(); i++) {
            sum += families.get(i).persons.size();
        }
        return sum;
    }
    @Override
    public String toString() {
        return "AbstractLivingPlace{" +
                "address='" + address + '\'' +
                '}';
    }
    public void live(){
        System.out.println("My address is "+ address);
    }
    public void pay(){
        System.out.println("" +
                "");
    }
}
