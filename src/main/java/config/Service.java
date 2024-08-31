package config;

public class Service {
    private int maximumurine;
    private int maximumFeces;

    public Service() {
        this.maximumurine = 70;
        this.maximumFeces = 70;
    }

    public int getMaximumurine() {
        return maximumurine;
    }

    public int getMaximumFeces() {
        return maximumFeces;
    }

    public static void main(String[] args) {
        Service service = new Service();
        System.out.println(service.getMaximumurine());
    }
}
