package tutorial7;

public class Module {
    private String moduleCode;
    private double ictMark;
    private double cwMark;

    public Module(String moduleCode, double ictMark, double cwMark) {
        this.moduleCode = moduleCode;
        this.ictMark = ictMark;
        this.cwMark = cwMark;
    }

    private double getFinalMark() {
        return (this.cwMark*0.5) + (this.ictMark*0.5);
    }

    public boolean pass() {
        return getFinalMark() >= 40;
    }

    public String getModuleCode() {
        return this.moduleCode;
    }

    public void setModuleCode(String moduleCode) {
        this.moduleCode = moduleCode;
    }

    public double getIctMark() {
        return ictMark;
    }

    public void setIctMark(double ictMark) {
        this.ictMark = ictMark;
    }

    public double getCwMark() {
        return cwMark;
    }

    public void setCwMark(double cwMark) {
        this.cwMark = cwMark;
    }
}
