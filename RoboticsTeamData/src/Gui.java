import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui {

    static String teamNameOutput = "";
    static String teamNumberOutput = "";
    static String autonomousPointsOutput = "";
    static String shootingPointsOutput = "";
    static String climbingPointsOutput = "";
    static String gap = ", ";

    public static void GUI() {

        // Test Comment

        ///////////////////////// Frames \\\\\\\\\\\\\\\\\\\\\\\\\

        JFrame frame1 = new JFrame();
        JFrame frame2 = new JFrame();



        ///////////////////////// Panels \\\\\\\\\\\\\\\\\\\\\\\\\

        // Panel 1
        JPanel panel1 = new JPanel();
        panel1.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        panel1.setBackground(Color.darkGray);
        panel1.setForeground(Color.orange);

        // Panel 2
        JPanel panel2 = new JPanel();
        panel2.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        panel2.setBackground(Color.darkGray);
        panel2.setForeground(Color.orange);



        ///////////////////////// Screen Items \\\\\\\\\\\\\\\\\\\\\\\\\

        // Frame 1
        JLabel title1 = new JLabel();
        JTextField teamName = new JTextField();
        JTextField teamNumber = new JTextField();
        JButton nextButton1 = new JButton("Next Page");
        ImageIcon image = new ImageIcon("RoboticsTeamData/src/Mechanical Monarchy.png");
        JLabel logo = new JLabel(image);

        // Frame 2
        JLabel title2 = new JLabel();
        JTextField autonomousPoints = new JTextField();
        JTextField shootingPoints = new JTextField();
        JTextField climbingPoints = new JTextField();
        JButton lastButton1 = new JButton("Last Page");
        JButton submitButton = new JButton("Submit Data");

        // Additional Items
        Font titleFont = new Font("OCR A Extended", Font.BOLD, 64);
        Font headingFont = new Font("OCR A Extended", Font.PLAIN, 32);
        Font textFont = new Font("OCR A Extended", Font.PLAIN, 24);
        Color orange = new Color(241, 89, 33);



        ///////////////////////// Add Items \\\\\\\\\\\\\\\\\\\\\\\\\

        // Frame 1
        frame1.add(title1);
        frame1.add(teamName);
        frame1.add(teamNumber);
        frame1.add(nextButton1);
        frame1.add(logo);

        // Frame 2
        frame2.add(title2);
        frame2.add(autonomousPoints);
        frame2.add(shootingPoints);
        frame2.add(climbingPoints);
        frame2.add(lastButton1);
        frame2.add(submitButton);



        ///////////////////////// Configure Items Frame 1 \\\\\\\\\\\\\\\\\\\\\\\\\

        // Title 1 Configuration
        title1.setBounds(50, 0, 1180, 100);
        title1.setText("Team Details");
        title1.setForeground(orange);
        title1.setFont(titleFont);

        // Picture Configuration
        logo.setBounds(800, 100, 400, 400);

        // Team Name Configuration
        teamName.setBounds(50, 150, 500, 75);
        teamName.setBorder(BorderFactory.createTitledBorder((BorderFactory.createBevelBorder(0, Color.lightGray, Color.gray)), "Team Name", 1, 1, headingFont, orange));
        teamName.setBackground(Color.darkGray);
        teamName.setForeground(orange);
        teamName.setFont(textFont);

        // Team Number Configuration
        teamNumber.setBounds(50, 350, 500, 75);
        teamNumber.setBorder(BorderFactory.createTitledBorder((BorderFactory.createBevelBorder(0, Color.lightGray, Color.gray)), "Team Number", 1, 1, headingFont, orange));
        teamNumber.setBackground(Color.darkGray);
        teamNumber.setForeground(orange);
        teamNumber.setFont(textFont);



        ///////////////////////// Configure Items Frame 2 \\\\\\\\\\\\\\\\\\\\\\\\\

        // Title 2 Configuration
        title2.setBounds(50, 0, 1180, 100);
        title2.setText("Team Points");
        title2.setForeground(orange);
        title2.setFont(titleFont);

        // Autonomous Points Configuration
        autonomousPoints.setBounds(50, 150, 600, 75);
        autonomousPoints.setBorder(BorderFactory.createTitledBorder((BorderFactory.createBevelBorder(0, Color.lightGray, Color.gray)), "Points Scored in Autonomous", 1, 1, headingFont, orange));
        autonomousPoints.setBackground(Color.darkGray);
        autonomousPoints.setForeground(orange);
        autonomousPoints.setFont(textFont);

        // Shooting Points Configuration
        shootingPoints.setBounds(50, 275, 600, 75);
        shootingPoints.setBorder(BorderFactory.createTitledBorder((BorderFactory.createBevelBorder(0, Color.lightGray, Color.gray)), "Points Scored by Shooting", 1, 1, headingFont, orange));
        shootingPoints.setBackground(Color.darkGray);
        shootingPoints.setForeground(orange);
        shootingPoints.setFont(textFont);

        // Climbing Points Configuration
        climbingPoints.setBounds(50, 400, 600, 75);
        climbingPoints.setBorder(BorderFactory.createTitledBorder((BorderFactory.createBevelBorder(0, Color.lightGray, Color.gray)), "Points Scored by Climbing", 1, 1, headingFont, orange));
        climbingPoints.setBackground(Color.darkGray);
        climbingPoints.setForeground(orange);
        climbingPoints.setFont(textFont);



        ///////////////////////// Page Buttons \\\\\\\\\\\\\\\\\\\\\\\\\

        // Next Page 1 Configuration
        nextButton1.setBounds(1000, 575, 200, 50);
        nextButton1.setFont(textFont);
        nextButton1.setBackground(orange);
        nextButton1.setBorder(BorderFactory.createTitledBorder((BorderFactory.createBevelBorder(0, Color.lightGray, Color.gray))));
        nextButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                frame1.setVisible(false);
                frame2.setVisible(true);
            }
        });

        // Last Page 1 Configuration
        lastButton1.setBounds(50, 575, 200, 50);
        lastButton1.setFont(textFont);
        lastButton1.setBackground(orange);
        lastButton1.setBorder(BorderFactory.createTitledBorder((BorderFactory.createBevelBorder(0, Color.lightGray, Color.gray))));
        lastButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                frame1.setVisible(true);
                frame2.setVisible(false);
            }
        });

        // Submit Button Configuration
        submitButton.setBounds(1000, 575, 200, 50);
        submitButton.setFont(textFont);
        submitButton.setBackground(orange);
        submitButton.setBorder(BorderFactory.createTitledBorder((BorderFactory.createBevelBorder(0, Color.lightGray, Color.gray))));
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {

                teamNameOutput = teamName.getText();
                teamNumberOutput = teamNumber.getText();
                autonomousPointsOutput = autonomousPoints.getText();
                shootingPointsOutput = shootingPoints.getText();
                climbingPointsOutput = climbingPoints.getText();

                System.out.println(teamNameOutput + gap + teamNumberOutput + gap + autonomousPointsOutput + gap + shootingPointsOutput + gap + climbingPointsOutput);

                System.exit(0);
            }
        });



        ///////////////////////// Frame Parameters \\\\\\\\\\\\\\\\\\\\\\\\\

        // Frame 1
        frame1.add(panel1, BorderLayout.CENTER);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setPreferredSize(new Dimension(1280, 720));
        frame1.setTitle("Robotics Program - Page 1");
        frame1.pack();
        frame1.setVisible(true);

        // Frame 2
        frame2.add(panel2, BorderLayout.CENTER);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setPreferredSize(new Dimension(1280, 720));
        frame2.setTitle("Robotics Program - Page 2");
        frame2.pack();
        frame2.setVisible(false);

    }
}