import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EmployeeForm {
    private JTextField nameField, ageField, departmentField;
    private JRadioButton maleButton, femaleButton;
    private JCheckBox javaCheckBox, pythonCheckBox, cppCheckBox;
    private JRadioButton highschoolButton, intermediateButton, graduationButton, postGraduationButton;
    private JButton submitButton, resetButton;

    public EmployeeForm() {
        // Set up the frame
        JFrame frame = new JFrame("Employee Form");
        frame.setSize(400, 500); // 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(9, 2));  // 

        // Name Label and Text Field
        JLabel nameLabel = new JLabel("Name:");
        nameField = new JTextField();
        frame.add(nameLabel);
        frame.add(nameField);

        // Age Label and Text Field
        JLabel ageLabel = new JLabel("Age:");
        ageField = new JTextField();
        frame.add(ageLabel);
        frame.add(ageField);

        // Department Label and Text Field
        JLabel departmentLabel = new JLabel("Department:");
        departmentField = new JTextField();
        frame.add(departmentLabel);
        frame.add(departmentField);

        // Gender Label and Radio Buttons
        JLabel genderLabel = new JLabel("Gender:");
        maleButton = new JRadioButton("Male");
        femaleButton = new JRadioButton("Female");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleButton);
        genderGroup.add(femaleButton);
        JPanel genderPanel = new JPanel();
        genderPanel.add(maleButton);
        genderPanel.add(femaleButton);
        frame.add(genderLabel);
        frame.add(genderPanel);

        // Skills Label and Checkboxes
        JLabel skillsLabel = new JLabel("Skills:");
        javaCheckBox = new JCheckBox("Java");
        pythonCheckBox = new JCheckBox("Python");
        cppCheckBox = new JCheckBox("C++");
        JPanel skillsPanel = new JPanel();
        skillsPanel.add(javaCheckBox);
        skillsPanel.add(pythonCheckBox);
        skillsPanel.add(cppCheckBox);
        frame.add(skillsLabel);
        frame.add(skillsPanel);

        // Education Label and Radio Buttons
        JLabel educationLabel = new JLabel("Education:");
        highschoolButton = new JRadioButton("High School");
        intermediateButton = new JRadioButton("Intermediate");
        graduationButton = new JRadioButton("Graduation");
        postGraduationButton = new JRadioButton("Post Graduation");
        ButtonGroup educationGroup = new ButtonGroup();
        educationGroup.add(highschoolButton);
        educationGroup.add(intermediateButton);
        educationGroup.add(graduationButton);
        educationGroup.add(postGraduationButton);
        JPanel educationPanel = new JPanel();
        educationPanel.add(highschoolButton);
        educationPanel.add(intermediateButton);
        educationPanel.add(graduationButton);
        educationPanel.add(postGraduationButton);
        frame.add(educationLabel);
        frame.add(educationPanel);

        // Submit Button
        submitButton = new JButton("Submit");
        frame.add(submitButton);

        // Reset Button
        resetButton = new JButton("Reset");
        frame.add(resetButton);

        // Add Action Listeners
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String age = ageField.getText();
                String department = departmentField.getText();
                String gender = maleButton.isSelected() ? "Male" : "Female";
                String skills = "";
                if (javaCheckBox.isSelected()) skills += "Java ";
                if (pythonCheckBox.isSelected()) skills += "Python ";
                if (cppCheckBox.isSelected()) skills += "C++ ";
                String education = "";
                if (highschoolButton.isSelected()) education = "High School";
                if (intermediateButton.isSelected()) education = "Intermediate";
                if (graduationButton.isSelected()) education = "Graduation";
                if (postGraduationButton.isSelected()) education = "Post Graduation";

                // Show the details in a message dialog
                JOptionPane.showMessageDialog(frame, "Employee Details:\nName: " + name + "\nAge: " + age + "\nDepartment: " + department + "\nGender: " + gender + "\nSkills: " + skills + "\nEducation: " + education);
            }
        });

        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Reset all fields
                nameField.setText("");
                ageField.setText("");
                departmentField.setText("");
                genderGroup.clearSelection();
                javaCheckBox.setSelected(false);
                pythonCheckBox.setSelected(false);
                cppCheckBox.setSelected(false);
                educationGroup.clearSelection();
            }
        });

        // Make the frame visible
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // Run the application
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new EmployeeForm(); 
            }
        });
    }
}
