public class Teacher
{
    // Declaring the variables
    private int teacherid;
    private String teacherName;
    private String address;
    private String workingType;
    private String employmentStatus;
    private int workingHours;
    
    // Initialization of the constructor and passing the required parameters
    public Teacher (int teacherid, String teacherName, String address, String workingType, String employmentStatus)
    {
        // Assigning the parameterized value to the declared variables
        this.teacherName=teacherName;
        this.teacherid=teacherid;
        this.address=address;
        this.workingType=workingType;
        this.employmentStatus=employmentStatus;
    }
    
    // Accessor methods
    public int getTeacherId(){
        return this.teacherid;
    }
    public String getTeacherName(){
        return this.teacherName;
    }
    public String getAddress(){
        return this.address;
    }
    public String getWorkingType(){
        return this.workingType;
    }
    public String getEmploymentStatus(){
        return this.employmentStatus;
    }
    public int getWorkingHours(){
        return this.workingHours;
    }

    // Method to set working hours 
    public void setWorkingHours(int workingHours){
        this.workingHours=workingHours;
    }
    
    // Methods to display all the details of the Teacher
    public void displayInfo()
    {
        System.out.println("The ID of the teacher is " + this.teacherid);
        System.out.println("The name of the teacher is " + this.teacherName);
        System.out.println("The address of the teacher is " + this.address);
        System.out.println("The working type of the teacher is " + this.workingType);
        System.out.println("The employment status of the teacher is " + this.employmentStatus);
        
        if (workingHours > 0)
        {
            System.out.println("The working hours of the teacher is " + this.workingHours);
        }
        else
        {
            System.out.println("Working hours is not assigned yet");
        }
    }
    
    
}