public class Student {
    private String name;
    private String id;
    private double[] grades = new double[5];

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getGrade(int index) {
        return grades[index];
    }

    public void setGrade(int index, double grade) {
        grades[index] = grade;
    }

    public double calculateAverage() {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.length;
    }

    public boolean passed() {
        return calculateAverage() >= 70;
    }
}