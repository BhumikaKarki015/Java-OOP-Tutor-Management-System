public class Lecturer extends Teacher
{
    // Declaring the variables
    private String department;
    private int yearsOfExperience;
    private int gradedScore;
    private boolean hasGraded;
    
    // Initializing the constructor and passing the required parameters
    Lecturer (int teacherid, String teacherName, String address, String workingType, String employmentStatus, int workingHours,
    String department, int yearsOfExperience)
    {
        super(teacherid, teacherName, address, workingType, employmentStatus);
        setWorkingHours(workingHours);
        // Assigning the value according to the passed parameters
        this.department=department;
        this.yearsOfExperience=yearsOfExperience;
        this.gradedScore=0;
        this.hasGraded=false;
    }
    
    // Accessor methods
    public String getDepartment(){
        return this.department;
    }
    public int getYearsOfExperience(){
        return this.yearsOfExperience;
    }
    public int getGradedScore(){
        return this.gradedScore;
    }
    public boolean getHasGraded(){
        return this.hasGraded;
    }
        
    // mutator method for the attribute: gradedScore 
    public void setGradedScore(int gradedScore)
    {
        this.gradedScore=gradedScore;
    }
    
    // method to grade assignments
    public void gradeAssignment(int gradedScore, String studentDepartment, int yearsOfExperience)
    {
        if (hasGraded==false && yearsOfExperience >= 5 && department.equals(studentDepartment))
        {
            if (gradedScore >= 70)
            {
                System.out.print("A");
            }
            else if (gradedScore >= 60)
            {
                System.out.print("B");
            }
            else if (gradedScore >=50)
            {
                System.out.print("C");
            }
            else if (gradedScore >= 40)
            {
                System.out.print("D");
            }
            else 
            {
                System.out.print("E");
            }
            hasGraded = true;  // Setting hasGraded to true
        }   
        else
        {
             System.out.print("Assignment is not graded yet.");
        }
     }
        
        // method to display details of the lecturer
    public void display()
        {
            super.displayInfo();   // Calling the display method in the Teacher class
            System.out.println("The department of the teacher is " + this.department);
            System.out.println("The years of experience of the teacher is " + this.yearsOfExperience);
            if (hasGraded == true)
            {
                System.out.println("The graded score is " + this.gradedScore);
            }
            else
            {
                System.out.println("The score has not been graded yet");
            }
        }
    }
    
        
    
    
