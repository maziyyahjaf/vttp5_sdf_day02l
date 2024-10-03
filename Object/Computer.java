package Object;
public class Computer {

    private String CPU;
    private String model;
    private Integer RAM;
    private Integer year;
    
    
    public Computer() {
    }
    
    public Computer(String CPU, String model, Integer RAM, Integer year) {
        this.CPU = CPU;
        this.model = model;
        this.RAM = RAM;
        this.year = year;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setRAM(Integer RAM) {
        this.RAM = RAM;
    }
    public void setYear(Integer year) {
        this.year = year;
    }

    public String getCPU() {
        return CPU;
    }
    public String getModel() {
        return model;
    }
    public Integer getRAM() {
        return RAM;
    }
    public Integer getYear() {
        return year;
    }

    public void start() {
        System.out.println("Computer starting up.");
    }

    public void shutdown() {
        System.out.println("Computer shutting down");
    }

    public void displaySpec() {
        System.out.println("This compute specifications:");
        System.out.printf("%s model", model);
        System.out.printf("%d CPU", CPU);
        System.out.printf("%d RAM",RAM)
    }

    
}