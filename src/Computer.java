import java.util.Objects;

public class Computer {
    private String ComputerNumber;
    private String lcdModel;
    private int ramSize;
    private int hddSize;
    private boolean hasGPU;

    @Override
    public boolean equals(Object o) {
        Computer computer = (Computer) o;
        return ramSize == computer.ramSize && hddSize == computer.hddSize && hasGPU == computer.hasGPU && Objects.equals(ComputerNumber, computer.ComputerNumber) && Objects.equals(lcdModel, computer.lcdModel);
    }
    public String getComputerNumber() {
        return ComputerNumber;
    }

    public void setComputerNumber(String computerNumber) {
        ComputerNumber = computerNumber;
    }

    public String getLcdModel() {
        return lcdModel;
    }

    public void setLcdModel(String lcdModel) {
        this.lcdModel = lcdModel;
    }

    public int getRamSize() {
        return ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public int getHddSize() {
        return hddSize;
    }

    public void setHddSize(int hddSize) {
        this.hddSize = hddSize;
    }

    public boolean isHasGPU() {
        return hasGPU;
    }

    public void setHasGPU(boolean hasGPU) {
        this.hasGPU = hasGPU;
    }

    public Computer(){
        this.ComputerNumber= "default number";
        this.lcdModel= "default lcd";
        this.ramSize= 0;
        this.hddSize= 0;
        this.hasGPU= false;
    }
    public Computer(String computerNumber, String lcdModel, int ramSize, int hddSize, boolean hasGPU) {
        ComputerNumber = computerNumber;
        this.lcdModel = lcdModel;
        this.ramSize = ramSize;
        this.hddSize = hddSize;
        this.hasGPU = hasGPU;
    }
    public Computer clone(){
        return new Computer(this.getComputerNumber(),this.getLcdModel(),this.getRamSize(),this.getHddSize(),this.hasGPU);
    }
}
