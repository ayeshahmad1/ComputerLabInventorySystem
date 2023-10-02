public class Lab {
    private String labID;
    public Computer[] computers;
    private LabStatus status;
    private Employee labAttendant;
    private int ccomp = 6;
    private int mcomp =6;

    public Lab(String labID, Computer[] computers, LabStatus status, Employee labAttendant) {
        this.labID = labID;
        this.computers = computers;
        this.status = status;
        this.labAttendant = labAttendant;
    }
    public Lab(){
        this.labID = "default ID";
        this.computers = null;
        this.status = null;
        this.labAttendant= null;
    }

    public Employee getLabAttendant() {
        return labAttendant;
    }

    public void setLabAttendant(Employee labAttendant) {
        this.labAttendant = labAttendant;
    }

    public void addComputer(Computer computer){
        if (ccomp < mcomp){
            computers[ccomp++] = computer;
        }
    }

    public boolean removeComputer(String computerNumber){
        int i = 0;
        for (Computer comp : computers){
            if (comp.getComputerNumber().equals(computerNumber)){
                for (int j = i; j<ccomp;){
                    computers[j++] = computers[j+1];
                    computers[--ccomp] = null;
                    i++;
                    return true;
                }
            }
            i++;
        }
        return false;
}
    public void changeStatus (LabStatus l) {
        this.status = l;
    }
    public Computer fetch(String computerNumber){
        for (Computer comp : computers){
            if (comp.getComputerNumber().equals(computerNumber)){
                return comp;
            }
        }
        return null;
    }
}
