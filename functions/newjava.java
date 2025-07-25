import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EmployeeForm {
    private JTextField nameField, ageField, departmentField;
    private JRadioButton maleButton, femaleButton;
    private JCheckBox javaCheckBox, pythonCheckBox, cppCheckBox;
    private JButton submitButton, resetButton;

    public EmployeeForm() {
        // Set up the frame
        JFrame frame = new JFrame("Employee Form");
        frame.setSize(450, 550);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Heading at the top
        JLabel headingLabel = new JLabel("edSlash Coding Hub", JLabel.CENTER);
        headingLabel.setFont(new Font("Arial", Font.BOLD, 24));
        headingLabel.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));
        frame.add(headingLabel, BorderLayout.NORTH);

        // Main panel with padding around the form
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        // Create a panel for the form inputs
        JPanel formPanel = new JPanel(new GridLayout(8, 2, 5, 5));

        // Name Label and Text Field
        JLabel nameLabel = new JLabel("Name:");
        nameField = new JTextField();
        formPanel.add(nameLabel);
        formPanel.add(nameField);

        // Age Label and Text Field
        JLabel ageLabel = new JLabel("Age:");
        ageField = new JTextField();
        formPanel.add(ageLabel);
        formPanel.add(ageField);

        // Department Label and Text Field
        JLabel departmentLabel = new JLabel("Department:");
        departmentField = new JTextField();
        formPanel.add(departmentLabel);
        formPanel.add(departmentField);

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
        formPanel.add(genderLabel);
        formPanel.add(genderPanel);

        // Skills Label and Checkboxes
        JLabel skillsLabel = new JLabel("Skills:");
        javaCheckBox = new JCheckBox("Java");
        pythonCheckBox = new JCheckBox("Python");
        cppCheckBox = new JCheckBox("C++");
        JPanel skillsPanel = new JPanel();
        skillsPanel.add(javaCheckBox);
        skillsPanel.add(pythonCheckBox);
        skillsPanel.add(cppCheckBox);
        formPanel.add(skillsLabel);
        formPanel.add(skillsPanel);

        // Submit Button
        submitButton = new JButton("Submit");
        formPanel.add(submitButton);

        // Reset Button
        resetButton = new JButton("Reset");
        formPanel.add(resetButton);

        // Add the form panel to the center
        mainPanel.add(formPanel, BorderLayout.CENTER);

        // Add Action Listeners
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleSubmitAction(frame);
            }
        });

        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleResetAction();
            }
        });

        // Add the main panel to the frame
        frame.add(mainPanel, BorderLayout.CENTER);

        // Make the frame visible
        frame.setVisible(true);
    }

    private void handleSubmitAction(JFrame frame) {
        String name = nameField.getText().trim();
        String ageText = ageField.getText().trim();
        String department = departmentField.getText().trim();
        String gender = "";

        // Validate Name
        if (name.isEmpty()) {
            JOptionPane.showMessageDialog(frame, "Please enter the name.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validate Age
        int age;
        try {
            age = Integer.parseInt(ageText);
            if (age <= 0) {
                throw new NumberFormatException("Age must be positive.");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(frame, "Please enter a valid age (positive integer).", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validate Department
        if (department.isEmpty()) {
            JOptionPane.showMessageDialog(frame, "Please enter the department.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validate Gender
        if (maleButton.isSelected()) {
            gender = "Male";
        } else if (femaleButton.isSelected()) {
            gender = "Female";
        } else {
            JOptionPane.showMessageDialog(frame, "Please select a gender.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Collect Skills
        StringBuilder skills = new StringBuilder();
        if (javaCheckBox.isSelected()) skills.append("Java ");
        if (pythonCheckBox.isSelected()) skills.append("Python ");
        if (cppCheckBox.isSelected()) skills.append("C++ ");

        // Validate Skills
        if (skills.toString().isEmpty()) {
            JOptionPane.showMessageDialog(frame, "Please select at least one skill.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Show the details in a message dialog
        JOptionPane.showMessageDialog(frame, "Employee Details:\nName: " + name + "\nAge: " + age + "\nDepartment: " + department + "\nGender: " + gender + "\nSkills: " + skills.toString().trim());
    }

    private void handleResetAction() {
        // Reset all fields
        nameField.setText("");
        ageField.setText("");
        departmentField.setText("");
        maleButton.setSelected(false);
        femaleButton.setSelected(false);
        javaCheckBox.setSelected(false);
        pythonCheckBox.setSelected(false);
        cppCheckBox.setSelected(false);
    }

    public static void main(String[] args) {
        // Run the application
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new EmployeeForm(); // Create and show the EmployeeForm
            }
        });
    }
}