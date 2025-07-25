
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
