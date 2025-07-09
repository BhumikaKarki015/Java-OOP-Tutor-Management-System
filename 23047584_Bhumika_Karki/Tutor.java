public class Tutor extends Teacher
{
    // declaring the variables
    private double salary;
    private String specialization;
    private String academicQualifications;
    private int performanceIndex;
    private boolean isCertified;
    
    // initializing the constructors and passing the required parameters
    Tutor(int teacherid, String teacherName, String address, String workingType, String employmentStatus, int workingHours,
    double salary, String specialization, String academicQualifications, int performanceIndex)
    {
        super(teacherid, teacherName, address, workingType, employmentStatus);
        setWorkingHours(workingHours); // call superclass setter method
        // Assigning values according to the question
        this.salary = salary;
        this.specialization = specialization;
        this.academicQualifications = academicQualifications;
        this.performanceIndex = performanceIndex;
        this.isCertified = false;
    }
    
    // Accessor methods
    public double getSalary(){
        return this.salary;
    }
    public String getSpecialization(){
        return this.specialization;
    }
    public String getAcademicQualifications(){
        return this.academicQualifications;
    }
    public int getPerformanceIndex(){
        return this.performanceIndex;
    }
    public boolean getIsCertified(){
        return this.isCertified;
    }
        
    // method to set the salary
    public void setSalary (double newSalary, int newPerformanceIndex)
    {
        if (!isCertified && newPerformanceIndex > 5 && getWorkingHours() > 20)
        {
            double appraisal = 0;
            
            if (newPerformanceIndex >= 5 && newPerformanceIndex <= 7) 
            {
                appraisal = 0.05;
            }
            else if (newPerformanceIndex >= 8 && newPerformanceIndex <=9)
            {
                appraisal = 0.1;
            }
            else if (newPerformanceIndex == 10)
            {
                appraisal = 0.2;
            }
            this.salary = salary + (appraisal * salary);
            this.performanceIndex = newPerformanceIndex;
            this.isCertified = true; // setting isCertified to true after appraisal
            System.out.println("Salary updated successfully to " + this.salary);
        }
        else 
        {
            System.out.println("The salary cannot be approved. The tutor is not certified yet.");
        }
    }
        
         // Method to remove tutor
    public void removeTutor() 
         {
             if (!isCertified)
                {
                    this.salary = 0;
                    this.specialization = "";
                    this.academicQualifications = "";
                    this.performanceIndex = 0;
                    this.isCertified = false;
                }
                else 
                {
                    System.out.println("Tutor is certified. Can't be removed");
                }
            }
            
            // Method to display the details of Tutor class
    public void display()
            {
                if (isCertified)
                {
                    super.displayInfo();    // Calling the display method in the Teacher class
                }
                else 
                {
                    super.displayInfo();    // Calling the display method in the Teacher class
                    System.out.println("The salary of the tutor is " + this.salary);
                    System.out.println("The specialization of the tutor is " + this.specialization);
                    System.out.println("The academic qualifications of the tutor is " + this.academicQualifications);
                    System.out.println("The performance index of the tutor is " + this.performanceIndex);
                }
            }
}

