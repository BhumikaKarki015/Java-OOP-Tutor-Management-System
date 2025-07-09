// Importing necessary libraries for the creation of GUI
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.util.ArrayList;

// Defining class for the TeacherGUI, implementing ActionListener
public class TeacherGUI implements ActionListener
{
    // Declaring necessary components for the GUI
    // JFrame represents the main frame to the application
    private JFrame mainFrame;
    
    // Panels for organizing contents
    private JPanel lecturerPanel;
    private JPanel tutorPanel;
    
    // Tabbed panes to switch the views between lecturer and tutor
    private JTabbedPane lecturerTabbedPane;
    private JTabbedPane tutorTabbedPane;
    
    // Using labels for various information fields
    private JLabel lecturertitle;
    private JLabel tutortitle;
    private JLabel teacherid;
    private JLabel teacherName;
    private JLabel address;
    private JLabel employmentStatus;
    private JLabel workingType;
    private JLabel workingHours;
    private JLabel department;
    private JLabel yearsOfExperience;
    private JLabel gradedScore;
    private JLabel salary;
    private JLabel specialization;
    private JLabel academicQualifications;
    private JLabel performanceIndex;
    
    // Text fields to get user input
    private JTextField teacheridTextField1;
    private JTextField teacheridTextField2;
    private JTextField teacherNameTextField1;
    private JTextField teacherNameTextField2;
    private JTextField addressTextField1;
    private JTextField addressTextField2;
    private JTextField workingHoursTextField1;
    private JTextField workingHoursTextField2;
    private JTextField departmentTextField;
    private JTextField yearsOfExperienceTextField;
    private JTextField salaryTextField;
    private JTextField specializationTextField;
    private JTextField academicQualificationTextField;
    private JTextField performanceIndexTextField;
    private JTextField gradedScoreTextField;
    
    // Buttons for various actions
    private JButton addLecturerButton;
    private JButton addTutorButton;
    private JButton gradeButton;
    private JButton setSalaryButton;
    private JButton removeTutorButton;
    private JButton lecturerclearButton;
    private JButton tutorclearButton;
    private JButton displayLecturerButton;
    private JButton displayTutorButton;
    
    // Combo Box for selecting different options
    private JComboBox workingTypeJComboBox1;
    private JComboBox workingTypeJComboBox2;
    private JComboBox statusComboBox1;
    private JComboBox statusComboBox2;
    
    // Arrays for the options in combo boxes
    private String [] comboBoxType = {"Part Time", "Full Time"};
    
    private String [] comboBoxStatus = {"Active", "Not Active"};
    
    // Array list to store the instances of Teacher objects
    ArrayList <Teacher> teacherArrayList = new ArrayList <> ();
    
    // Constructor to initialize the GUI
    public void teacherGUI()
    {
        // Setting the main frame
        mainFrame = new JFrame("Teacher's Form");
        mainFrame.setSize(800,620);
        mainFrame.setVisible(true);
        mainFrame.setDefaultCloseOperation(mainFrame.EXIT_ON_CLOSE);
        
        // Creating panels for lecturer and tutor 
        lecturerPanel = new JPanel();
        lecturerPanel.setSize(800,620);
        lecturerPanel.setLayout(null);
        lecturerPanel.setBackground(new Color(230,230,255));
        
        tutorPanel = new JPanel();
        tutorPanel.setSize(800,620);
        tutorPanel.setLayout(null);
        tutorPanel.setBackground(new Color(230,230,255));
        
        // Creating tabbed panes to switch the views between lecturer and tutor 
        lecturerTabbedPane = new JTabbedPane();
        lecturerTabbedPane.add("Lecturer",lecturerPanel);
        lecturerTabbedPane.add("Tutor",tutorPanel);
        
        mainFrame.add(lecturerTabbedPane);
        
        // Setting fonts for labels
        Font font2 = new Font ("Franklin Gothic Book", Font.PLAIN,16);
        Font font3 = new Font ("Franklin Gothic Book", Font.BOLD,23);
        Font font4 = new Font ("Arial", Font.BOLD,14);

        // Creating and positioning labels for lecturer views
        lecturertitle = new JLabel("Lecturer");
        lecturertitle.setBounds(320,15,180,35);
        lecturertitle.setFont(font3);
        lecturerPanel.add(lecturertitle);
        
        teacherid =  new JLabel("Teacher ID :");
        teacherid.setBounds(50,85,150,30);
        teacherid.setFont(font2);
        lecturerPanel.add(teacherid);
        
        teacherName = new JLabel("Teacher Name :");
        teacherName.setBounds(400,85,150,30);
        teacherName.setFont(font2);
        lecturerPanel.add(teacherName);
        
        address = new JLabel("Address :");
        address.setBounds(50,145,150,30);
        address.setFont(font2);
        lecturerPanel.add(address);
        
        employmentStatus= new JLabel("     Status :");
        employmentStatus.setBounds(400,145,150,30);
        employmentStatus.setFont(font2);
        lecturerPanel.add(employmentStatus);
        
        workingType = new JLabel("Working Type :");
        workingType.setBounds(50,205,150,30);
        workingType.setFont(font2);
        lecturerPanel.add(workingType);
        
        workingHours = new JLabel("Working Hours :");
        workingHours.setBounds(400,200,150,30);
        workingHours.setFont(font2);
        lecturerPanel.add(workingHours);
        
        gradedScore = new JLabel("Graded Score :");
        gradedScore.setBounds(400,255,150,30);
        gradedScore.setFont(font2);
        lecturerPanel.add(gradedScore);
        
        department = new JLabel("Department :");
        department.setBounds(50,265,150,30);
        department.setFont(font2);
        lecturerPanel.add(department);
        
        yearsOfExperience = new JLabel("Experience :");
        yearsOfExperience.setBounds(50,320,150,30);
        yearsOfExperience.setFont(font2);
        lecturerPanel.add(yearsOfExperience);
        
        teacheridTextField1 = new JTextField();
        teacheridTextField1.setBounds(150,90,150,23);
        teacheridTextField1.setFont(font4);
        lecturerPanel.add(teacheridTextField1);
        
        teacherNameTextField1 = new JTextField();
        teacherNameTextField1.setBounds(520,90,150,23);
        teacherNameTextField1.setFont(font4);
        lecturerPanel.add(teacherNameTextField1);
        
        addressTextField1 = new JTextField();
        addressTextField1.setBounds(150,150,150,23);
        addressTextField1.setFont(font4);
        lecturerPanel.add(addressTextField1);
        
        workingTypeJComboBox1 = new JComboBox(comboBoxType);
        workingTypeJComboBox1.setBounds(160,210,125,25);
        workingTypeJComboBox1.setFont(font2);
        lecturerPanel.add(workingTypeJComboBox1);
        
        statusComboBox1 = new JComboBox(comboBoxStatus);
        statusComboBox1.setBounds(520,150,125,25);
        statusComboBox1.setFont(font2);
        lecturerPanel.add(statusComboBox1);
        
        departmentTextField = new JTextField();
        departmentTextField.setBounds(150,270,150,23);
        departmentTextField.setFont(font4);
        lecturerPanel.add(departmentTextField);
        
        yearsOfExperienceTextField = new JTextField();
        yearsOfExperienceTextField.setBounds(150,325,150,23);
        yearsOfExperienceTextField.setFont(font4);
        lecturerPanel.add(yearsOfExperienceTextField);
        
        workingHoursTextField1 = new JTextField();
        workingHoursTextField1.setBounds(520,205,150,23);
        workingHoursTextField1.setFont(font4);
        lecturerPanel.add(workingHoursTextField1);
        
        gradedScoreTextField = new JTextField();
        gradedScoreTextField.setBounds(520,260,150,23);
        gradedScoreTextField.setFont(font4);
        lecturerPanel.add(gradedScoreTextField);
        
        addLecturerButton = new JButton("Add");
        addLecturerButton.setBounds(410,330,110,30);
        addLecturerButton.setFont(font4);
        addLecturerButton.setBackground(new Color(255,253,208));
        lecturerPanel.add(addLecturerButton);
        
        gradeButton = new JButton("Grade");
        gradeButton.setBounds(550,330,110,30);
        gradeButton.setFont(font4);
        gradeButton.setBackground(new Color(255,253,208));
        lecturerPanel.add(gradeButton);
        
        displayLecturerButton = new JButton("Display");
        displayLecturerButton.setBounds(60,400,110,30);
        displayLecturerButton.setFont(font4);
        displayLecturerButton.setBackground(new Color(255,204,255));
        lecturerPanel.add(displayLecturerButton);
        
        lecturerclearButton = new JButton("Clear");
        lecturerclearButton.setBounds(210,400,110,30);
        lecturerclearButton.setFont(font4);
        lecturerclearButton.setBackground(new Color(255,204,255));
        lecturerPanel.add(lecturerclearButton);
        
        // Creating and positioning labels for tutor views
        tutortitle = new JLabel("Tutor");
        tutortitle.setBounds(340,15,180,35);
        tutortitle.setFont(font3);
        tutorPanel.add(tutortitle);
        
        teacherid =  new JLabel("Teacher ID :");
        teacherid.setBounds(50,85,150,30);
        teacherid.setFont(font2);
        tutorPanel.add(teacherid);
        
        teacherName = new JLabel("Teacher Name :");
        teacherName.setBounds(400,85,150,30);
        teacherName.setFont(font2);
        tutorPanel.add(teacherName);
        
        address = new JLabel("Address :");
        address.setBounds(50,145,150,30);
        address.setFont(font2);
        tutorPanel.add(address);
        
        employmentStatus = new JLabel("     Status :");
        employmentStatus.setBounds(400,145,150,30);
        employmentStatus.setFont(font2);
        tutorPanel.add(employmentStatus);
        
        workingType = new JLabel("Working Type :");
        workingType.setBounds(50,205,150,30);
        workingType.setFont(font2);
        tutorPanel.add(workingType);
        
        workingTypeJComboBox2 = new JComboBox(comboBoxType);
        workingTypeJComboBox2.setBounds(160,210,125,25);
        workingTypeJComboBox2.setFont(font2);
        tutorPanel.add(workingTypeJComboBox2);
        
        workingHours = new JLabel("Working Hours :");
        workingHours.setBounds(400,205,150,30);
        workingHours.setFont(font2);
        tutorPanel.add(workingHours);
        
        salary = new JLabel("Salary :");
        salary.setBounds(50,265,150,30);
        salary.setFont(font2);
        tutorPanel.add(salary);
        
        specialization = new JLabel("Specialization :");
        specialization.setBounds(400,265,150,30);
        specialization.setFont(font2);
        tutorPanel.add(specialization);
        
        academicQualifications = new JLabel("Qualification :");
        academicQualifications.setBounds(50,325,150,30);
        academicQualifications.setFont(font2);
        tutorPanel.add(academicQualifications);
        
        performanceIndex = new JLabel("Performance Index :");
        performanceIndex.setBounds(400,325,150,30);
        performanceIndex.setFont(font2);
        tutorPanel.add(performanceIndex);
        
        teacheridTextField2 = new JTextField();
        teacheridTextField2.setBounds(150,90,150,23);
        teacheridTextField2.setFont(font4);
        tutorPanel.add(teacheridTextField2);
        
        teacherNameTextField2 = new JTextField();
        teacherNameTextField2.setBounds(520,90,150,23);
        teacherNameTextField2.setFont(font4);
        tutorPanel.add(teacherNameTextField2);
        
        addressTextField2 = new JTextField();
        addressTextField2.setBounds(150,150,150,23);
        addressTextField2.setFont(font4);
        tutorPanel.add(addressTextField2);
        
        statusComboBox2 = new JComboBox(comboBoxStatus);
        statusComboBox2.setBounds(520,150,125,25);
        statusComboBox2.setFont(font2);
        tutorPanel.add(statusComboBox2);
        
        workingHoursTextField2 = new JTextField();
        workingHoursTextField2.setBounds(520,210,150,23);
        workingHoursTextField2.setFont(font4);
        tutorPanel.add(workingHoursTextField2);
        
        salaryTextField = new JTextField();
        salaryTextField.setBounds(150,270,150,23);
        salaryTextField.setFont(font4);
        tutorPanel.add(salaryTextField);
        
        specializationTextField = new JTextField();
        specializationTextField.setBounds(520,270,150,23);
        specializationTextField.setFont(font4);
        tutorPanel.add(specializationTextField);
        
        academicQualificationTextField = new JTextField();
        academicQualificationTextField.setBounds(150,330,150,23);
        academicQualificationTextField.setFont(font4);
        tutorPanel.add(academicQualificationTextField);
        
        performanceIndexTextField = new JTextField();
        performanceIndexTextField.setBounds(550,330,150,23);
        performanceIndexTextField.setFont(font4);
        tutorPanel.add(performanceIndexTextField);
        
        addTutorButton = new JButton("Add");
        addTutorButton.setBounds(420,395,110,30);
        addTutorButton.setFont(font4);
        addTutorButton.setBackground(new Color(255,253,208));
        tutorPanel.add(addTutorButton);
        
        setSalaryButton = new JButton("Set Salary");
        setSalaryButton.setBounds(570,395,110,30);
        setSalaryButton.setFont(font4);
        setSalaryButton.setBackground(new Color(255,253,208));
        tutorPanel.add(setSalaryButton);
        
        removeTutorButton = new JButton("Remove");
        removeTutorButton.setBounds(490,460,110,30);
        removeTutorButton.setFont(font4);
        removeTutorButton.setBackground(new Color(255,253,208));
        tutorPanel.add(removeTutorButton);
        
        displayTutorButton = new JButton("Display");
        displayTutorButton.setBounds(60,410,110,30);
        displayTutorButton.setFont(font4);
        displayTutorButton.setBackground(new Color(255,204,255));
        tutorPanel.add(displayTutorButton);
        
        tutorclearButton = new JButton("Clear");
        tutorclearButton.setBounds(210,410,110,30);
        tutorclearButton.setFont(font4);
        tutorclearButton.setBackground(new Color(255,204,255));
        tutorPanel.add(tutorclearButton);
        
        // Adding action listeners to buttons
        addLecturerButton.addActionListener(this);
        gradeButton.addActionListener(this);
        displayLecturerButton.addActionListener(this);
        lecturerclearButton.addActionListener(this);
        addTutorButton.addActionListener(this);
        setSalaryButton.addActionListener(this);
        removeTutorButton.addActionListener(this);
        displayTutorButton.addActionListener(this);
        tutorclearButton.addActionListener(this);
    }
    
// Method to handle button clicks and perform corresponding actions
@Override 
public void actionPerformed(ActionEvent e)
{
    // Handling lecturer clear button
    if(e.getSource()==lecturerclearButton)
    {
        // Clearing text fields and combo box options for lecturer 
        teacheridTextField1.setText("");
        teacherNameTextField1.setText("");
        addressTextField1.setText("");
        workingHoursTextField1.setText("");
        workingTypeJComboBox1.setSelectedIndex(-1);
        statusComboBox1.setSelectedIndex(-1);
        yearsOfExperienceTextField.setText("");
        gradedScoreTextField.setText("");
        departmentTextField.setText("");
    }
    // Handling tutor clear button
    else if(e.getSource()==tutorclearButton)
    {
        // Clearing text fields and combo box options for tutor 
        teacheridTextField2.setText("");
        teacherNameTextField2.setText("");
        addressTextField2.setText("");
        workingHoursTextField2.setText("");
        workingTypeJComboBox2.setSelectedIndex(-1);
        statusComboBox2.setSelectedIndex(-1);
        salaryTextField.setText("");
        specializationTextField.setText("");
        academicQualificationTextField.setText("");
        performanceIndexTextField.setText("");
    }
    // Retrieving texts for adding lecturer when Add button is clicked
    else if(e.getSource()==addLecturerButton)
    {
        // Getting texts from text fields for details of the lecturer
        String teacherid = teacheridTextField1.getText();
        String teacherName = teacherNameTextField1.getText();
        String address = addressTextField1.getText();
        String workingType = (String) workingTypeJComboBox1.getSelectedItem();
        String employmentStatus = (String) statusComboBox1.getSelectedItem();
        String workingHours = workingHoursTextField1.getText();
        String department = departmentTextField.getText();
        String yearsOfExperience = yearsOfExperienceTextField.getText();
        boolean isAdded = false;
        try
        {
            if(teacherid.isEmpty()||teacherName.isEmpty()||address.isEmpty()||workingHours.isEmpty()||
            yearsOfExperience.isEmpty())
            {
                 throw new Exception();
            }
            else
            {
                int teacheridValue = Integer.parseInt(teacherid);
                int workingHoursValue = Integer.parseInt(workingHours);
                int yearsOfExperienceValue = Integer.parseInt(yearsOfExperience);
                if(department.matches(".*\\d.*")){
                    JOptionPane.showMessageDialog(mainFrame,"Only Alphabetical characters are allowed");
            }
            
            else
            {
                for (Teacher teacherList:teacherArrayList)
                {
                    if (teacherList instanceof Lecturer)
                    {
                        Lecturer lecturer = (Lecturer) teacherList;
                        if((lecturer.getTeacherId())==(teacheridValue))
                        {
                            isAdded = true;
                        }
                    }
                }
                if (isAdded == true)
                {
                    JOptionPane.showMessageDialog(mainFrame,"A teacher with ID " + teacheridValue + " has already been added.");
                }
                else
                {
                    Lecturer lecturer = new Lecturer(teacheridValue, teacherName, address, workingType, employmentStatus,
                                        workingHoursValue, department, yearsOfExperienceValue);
                    teacherArrayList.add(lecturer);
                    JOptionPane.showMessageDialog(mainFrame,"A lecturer with ID " + teacheridValue + " is added successfully");
            
                }
            }
        }
        }

        catch(NumberFormatException exc)
        {
            JOptionPane.showMessageDialog(mainFrame,"Please Enter Only Numerical Value For teacher ID, working hours, and years of experience");
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(mainFrame,"Please Do Not Leave Any Text Field Empty");
        }
    }
    // Retrieving texts for adding tutor when Add button is clicked
    else if(e.getSource()==addTutorButton)
     {
        // Getting texts from text fields for details of the tutor
        String teacherid = teacheridTextField2.getText();
        String teacherName = teacherNameTextField2.getText();
        String address = addressTextField2.getText();
        String workingType = (String) workingTypeJComboBox2.getSelectedItem();
        String employmentStatus = (String) statusComboBox2.getSelectedItem();
        String workingHours = workingHoursTextField2.getText();
        String salary = salaryTextField.getText();
        String specialization = specializationTextField.getText();
        String academicQualification = academicQualificationTextField.getText();
        String performanceIndex = performanceIndexTextField.getText();
        boolean isAdded = false;
        try
        {
            if(teacherid.isEmpty()||teacherName.isEmpty()||address.isEmpty()||workingHours.isEmpty()||salary.isEmpty()||
            specialization.isEmpty()||academicQualification.isEmpty()||performanceIndex.isEmpty())
            {
                JOptionPane.showMessageDialog(mainFrame,"Please Do Not Leave Any Text Field Empty.");
            }
            else
            {
                int teacheridValue = Integer.parseInt(teacherid);
                int workingHoursValue = Integer.parseInt(workingHours);
                double salaryValue = Double.parseDouble(salary);
                int performanceIndexValue = Integer.parseInt(performanceIndex);
                
                {   
                    for (Teacher teacherList:teacherArrayList)
                    {
                    if(teacherList instanceof Tutor)
                    {
                        Tutor tutor = (Tutor) teacherList;
                        if((tutor.getTeacherId())==(teacheridValue))
                        {
                            isAdded = true;
                        }
                    }
                    }
                }
                if(isAdded==true)
                {
                    JOptionPane.showMessageDialog(mainFrame,"A Tutor with ID " + teacheridValue + " has already been added.");
                }
                else
                {
                    Tutor tutor = new Tutor(teacheridValue, teacherName, address, workingType, employmentStatus, 
                                  workingHoursValue, salaryValue, academicQualification,specialization,performanceIndexValue);
                    teacherArrayList.add(tutor);
                    JOptionPane.showMessageDialog(mainFrame,"A Tutor with ID " + teacheridValue + " is added successfully.");
                }
            }
        }
        catch(NumberFormatException exc)
        {
            JOptionPane.showMessageDialog(mainFrame,"Please Enter Only Numerical Value for teacherid,workingHours,salary, and performanceIndex");
        }
    }
    // Retrieving texts for grading assignments when Grade button is clicked
    else if(e.getSource()==gradeButton)
    {
        // Getting texts from text fields for grading assignments
        String teacherid = teacheridTextField1.getText();
        String gradedScore = gradedScoreTextField.getText();
        String department = departmentTextField.getText();
        String yearsOfExperience = yearsOfExperienceTextField.getText();
        boolean isAdded = false;
        try
        {
            if(teacherid.isEmpty()||gradedScore.isEmpty()||department.isEmpty()||yearsOfExperience.isEmpty())
            {
                JOptionPane.showMessageDialog(mainFrame,"Please Do Not Leave Any Text Field Empty.");
            }
            else
            {
                int teacheridValue = Integer.parseInt(teacherid);
                int yearsOfExperienceValue = Integer.parseInt(yearsOfExperience);
                int gradedScoreValue = Integer.parseInt(gradedScore);
                if(department.matches(".*\\d.*"))
                {
                    JOptionPane.showMessageDialog(mainFrame,"Only Alphabetical characters are allowed");
                }
                else
                {
                    for(int i = 0; i<teacherArrayList.size(); i++)
                    {
                        if((teacherArrayList.get(i).getTeacherId())==teacheridValue)
                        {
                            isAdded = true;
                        }
                    }
                for (Teacher teacherList:teacherArrayList)
                {
                    if (teacherList instanceof Lecturer)
                    {
                        Lecturer lecturer = (Lecturer) teacherList;
                        if(lecturer.getTeacherId()==teacheridValue)
                        {
                            if(lecturer.getHasGraded()==true)
                            {
                                JOptionPane.showMessageDialog(mainFrame,"The Assignment has already been graded." );
                            }
                            else
                            {
                                lecturer.gradeAssignment(gradedScoreValue, department, yearsOfExperienceValue);
                                JOptionPane.showMessageDialog(mainFrame,"The Assignment is graded as " + gradedScoreValue + "." );
                            }
                        }
                    }
                }
            }
            }
            if(isAdded=false)
            {
                JOptionPane.showMessageDialog(mainFrame,"A lecturer with ID " + teacherid + " is not certified.");
            }
        }
        catch(NumberFormatException exc)
        {
            JOptionPane.showMessageDialog(mainFrame,"Please Enter Only Numerical Value For teacher ID, graded score, and years of experience");
        }
    }
    // Handling display button to show the details of the lecturer
    else if(e.getSource()==displayLecturerButton)
    {
        // Checking if the teacher array list is empty
        if(teacherArrayList.size()==0)
        {
            // Displaying a message if the array list is empty
            JOptionPane.showMessageDialog(mainFrame,"The ArrayList is Empty.");
        }
        else
        {
            // looping through the teacher ArrayList to display lecturer details
            for(Teacher teacherList:teacherArrayList)
            {
                // checking if the teacher is a instance of lecturer
                if (teacherList instanceof Lecturer)
                {
                    // Casting the teacher object to a lecturer object
                    Lecturer lecturer = (Lecturer) teacherList;
                    // displaying lecturer's details
                    lecturer.display();
                }
            }
        }
    }
    // Handling display button to show the details of the tutor
    else if(e.getSource()==displayTutorButton)
    {
        // Checking if the teacher array list is empty
        if(teacherArrayList.size()==0)
        {
            // Displaying a message if the array list is empty
            JOptionPane.showMessageDialog(mainFrame,"The ArrayList is Empty.");
        }
        else
        {
            // looping through the teacher ArrayList to display tutor details
            for(Teacher teacherList:teacherArrayList)
            {
                // checking if the teacher is a instance of tutor
                if (teacherList instanceof Tutor)
                {
                    // Casting the teacher object to a tutor object
                    Tutor tutor = (Tutor) teacherList;
                    // displaying tutor's details
                    tutor.display();
                }
            }
        }
    }
    // Retrieving texts for setting new salary when Set salary button is clicked
    else if(e.getSource()==setSalaryButton)
    {
        // Getting texts from text fields for setting new salary
        String teacherid = teacheridTextField2.getText();
        String salary = salaryTextField.getText();
        String performanceIndex = performanceIndexTextField.getText();
        boolean isAdded = false;
    
        try 
        {
            if (teacherid.isEmpty() || salary.isEmpty() || performanceIndex.isEmpty()) 
            {
                JOptionPane.showMessageDialog(mainFrame, "Please Do Not Leave Any Text Field Empty.");
            } else 
            {
                int teacheridValue = Integer.parseInt(teacherid);
                double salaryValue = Double.parseDouble(salary);
                int performanceIndexValue = Integer.parseInt(performanceIndex);
    
                for (int i = 0; i < teacherArrayList.size(); i++) 
                {
                    if (teacherArrayList.get(i).getTeacherId() == teacheridValue) 
                    {
                        isAdded = true;
                    }
                }
                for(Teacher teacherList : teacherArrayList) 
                {
                    if(teacherList instanceof Tutor)
                    {
                        Tutor tutor = (Tutor) teacherList;
                        if(tutor.getTeacherId()==teacheridValue)
                        {
                            if(tutor.getIsCertified()==true)
                            {
                                JOptionPane.showMessageDialog(mainFrame,"The salary has already been updated.");
                            }
                            else
                            {
                                tutor.setSalary(salaryValue, performanceIndexValue);
                                JOptionPane.showMessageDialog(mainFrame,"The salary has been updated.");
                            }
                        }
                    }
                }
            }
        if (!isAdded)
        {
            JOptionPane.showMessageDialog(mainFrame, "A tutor with ID " + teacherid + " has not been added.");
        }
    }
        catch (NumberFormatException exc) 
        {
            JOptionPane.showMessageDialog(mainFrame, "Please Enter Only Numerical Value For teacher ID, salary, and performance index.");
        } 
        catch (Exception ex) 
        {
            JOptionPane.showMessageDialog(mainFrame, "An error occurred: " + ex.getMessage());
        }
    }
    else if(e.getSource() == removeTutorButton)
    {
        // Getting teacher ID from text field
        String teacherid = teacheridTextField2.getText();
    
        try
        {
            // Check if teacher ID field is empty
            if(teacherid.isEmpty())
            {
                JOptionPane.showMessageDialog(mainFrame,"Please enter the ID of the tutor to remove.");
            }
            else
            {
                int teacheridValue = Integer.parseInt(teacherid);
                boolean isAdded = false;
    
                // Iterate through teacherArrayList to find the tutor
                for(int i = 0; i < teacherArrayList.size(); i++)
                {
                    Teacher teacher = teacherArrayList.get(i);
                    if(teacher instanceof Tutor && teacher.getTeacherId() == teacheridValue)
                    {
                        Tutor tutor = (Tutor) teacher;
                        if(tutor.getIsCertified())
                        {
                            JOptionPane.showMessageDialog(mainFrame,"The tutor with ID " + teacheridValue + " is certified and cannot be removed.");
                        }
                        else
                        {
                            // Remove the tutor from the list
                            teacherArrayList.remove(i);
                            JOptionPane.showMessageDialog(mainFrame,"The tutor with ID " + teacheridValue + " has been removed successfully.");
                        }
                        isAdded = true;
                        break; // Stop searching after finding the tutor
                    }
                }
    
                // If tutor is not found
                if(!isAdded)
                {
                    JOptionPane.showMessageDialog(mainFrame,"No tutor found with ID " + teacheridValue);
                }
            }
        }
        catch(NumberFormatException ex)
        {
            JOptionPane.showMessageDialog(mainFrame,"Please enter a valid ID.");
        }
    }
}

public static void main(String[]args)
{
    new TeacherGUI().teacherGUI();
}
}







