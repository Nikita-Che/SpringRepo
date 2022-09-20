package aop;

public class Student {
    private String nameSurname;
    private int cource;
    private double avgGrade;

    @Override
    public String toString() {
        return super.toString();
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public int getCource() {
        return cource;
    }

    public void setCource(int cource) {
        this.cource = cource;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }

    public Student(String nameSurname, int cource, double avgGrade) {
        this.nameSurname = nameSurname;
        this.cource = cource;
        this.avgGrade = avgGrade;
    }
}
