import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ChooseYourOwnAdventure {
    public static void main(String[] args) {
        go();
    }

    public static void go() {
        //Creates the frame.
        JFrame frame = new JFrame("Stranded on an Island");
        frame.setVisible(true);
        frame.setSize(1200, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a panel with a layout to place on the frame.
        // Attaches the panel to the frame.
        JPanel panel = new JPanel();
        frame.add(panel);
        panel.setLayout(new GridLayout(2, 2, 15, 0));
        panel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);

        // Creates labels and buttons to place on the panel.
        JLabel first = new JLabel("You open your eyes and realize your airplane crashed.");
        JLabel second = new JLabel("Now you’re stranded on an island… what will you do to survive the night?");
        JButton choice1 = new JButton("You’re starving! Turn to the right. You see strange-looking fruit in the distance.");
        JButton choice2 = new JButton("It will get dark soon…turn to the left and find materials to make a fire.");

        //Attach the action listeners to the buttons.
        choice1.addActionListener(new Action1());
        choice2.addActionListener(new Action2());

        // Attach the labels and the buttons to the panel.
        panel.add(first);
        panel.add(second);
        panel.add(choice1);
        panel.add(choice2);

        //next screen
    }

    static class Action1 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            //Creates the frame.
            JFrame frame = new JFrame("Choice 2");
            frame.setVisible(true);
            frame.setSize(1200, 600);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel panel = new JPanel();
            frame.add(panel);
            panel.setLayout(new GridLayout(2, 2, 15, 0));
            panel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);

            JLabel first = new JLabel("You walk to the tree. It’s very tall and has strange-looking fruit on it.");
            JLabel second = new JLabel(" ");
            JButton choice1a = new JButton("Attempt to climb the tree and look for people or a ship from a higher point");
            JButton choice1b = new JButton("Pick a trusting piece of fruit off of the tree and eat it.");

            //Attach the action listeners to the buttons.
            choice1a.addActionListener(new Action3());
            choice1b.addActionListener(new Action4());

            // Attach the labels and the buttons to the panel.
            panel.add(first);
            panel.add(second);
            panel.add(choice1a);
            panel.add(choice1b);
        }
    }

    static class Action2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            //Creates the frame.
            System.out.println(e.getActionCommand());
            JFrame frame = new JFrame("Choice 2");
            frame.setVisible(true);
            frame.setSize(1200, 600);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel panel = new JPanel();
            frame.add(panel);
            panel.setLayout(new GridLayout(2, 2, 15, 0));
            panel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
            // Creates labels and buttons to place on the panel.
            JLabel third = new JLabel("As you try to gather wood, you notice a strange noise near you.");
            JLabel fourth = new JLabel("What will you do next?");
            JButton choice2a = new JButton("Explore around you for the noise; nothing bad can happen when it’s daytime.");
            JButton choice2b = new JButton("I won’t have time to build before sunset… ignore it and gather supplies.");


            //Attach the action listeners to the buttons.
            choice2a.addActionListener(new Action5());
            choice2b.addActionListener(new Action6());

            // Attach the labels and the buttons to the panel.
            panel.add(third);
            panel.add(fourth);
            panel.add(choice2a);
            panel.add(choice2b);

        }

    }

    static class Action3 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            //Creates the frame.
            System.out.println(e.getActionCommand());
            JFrame frame = new JFrame("Choice 3");
            frame.setVisible(true);
            frame.setSize(1200, 600);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel panel = new JPanel();
            frame.add(panel);

            panel.setLayout(new GridLayout(2, 2, 15, 0));
            panel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);

            // Creates labels and buttons to place on the panel.
            JLabel third = new JLabel("Sadly, you do not find a ship. Instead, you fall off of the tree!");
            JLabel fourth = new JLabel("You decide to keep searching for trusty food, but it's getting dark.");
            JButton choice1a1 = new JButton("Find materials to build shelter and spend the night working.");
            JButton choice1a2 = new JButton("You’re too tired to do that. Fall asleep on a soft rock near you.");

            //Attach the action listeners to the buttons.
            choice1a1.addActionListener(new Action7());

            choice1a2.addActionListener(new Action8());

            // Attach the labels and the buttons to the panel.
            panel.add(third);
            panel.add(fourth);
            panel.add(choice1a1);
            panel.add(choice1a2);

        }
    }

    static class Action4 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            //Creates the frame.
            System.out.println(e.getActionCommand());
            JFrame frame = new JFrame("Choice 3");
            frame.setVisible(true);
            frame.setSize(1200, 600);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel panel = new JPanel();
            frame.add(panel);

            panel.setLayout(new GridLayout(2, 2, 15, 0));
            panel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
            // Creates labels and buttons to place on the panel.
            JLabel third = new JLabel("The fruit seems to be fine. You carry some with you as you wonder what to do next.");
            JLabel fourth = new JLabel(" ");
            JButton choice1b1 = new JButton("Survival videos tell you to never eat food without water. Find a source of water.");
            JButton choice1b2 = new JButton("Continue strolling and look for supplies for a home");

            //Attach the action listeners to the buttons.
            choice1b1.addActionListener(new Action9());
            choice1b2.addActionListener(new Action10());

            // Attach the labels and the buttons to the panel.
            panel.add(third);
            panel.add(fourth);
            panel.add(choice1b1);
            panel.add(choice1b2);

        }
    }

    static class Action5 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            //Creates the frame.
            System.out.println(e.getActionCommand());
            JFrame frame = new JFrame("Choice 3");
            frame.setVisible(true);
            frame.setSize(1200, 600);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel panel = new JPanel();
            frame.add(panel);

            panel.setLayout(new GridLayout(2, 2, 15, 0));
            panel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);

            // Creates labels and buttons to place on the panel.
            JLabel third = new JLabel("You see a terrifying snake, your biggest fear! You panic inside and you...");
            JLabel fourth = new JLabel(" ");
            JButton choice2a1 = new JButton("Run for your life!");
            JButton choice2a2 = new JButton("Slowly move back and continue to search. I hope this snake is friendly!");

            //Attach the action listeners to the buttons.
            choice2a1.addActionListener(new Action11());
            choice2a2.addActionListener(new Action12());

            // Attach the labels and the buttons to the panel.
            panel.add(third);
            panel.add(fourth);
            panel.add(choice2a1);
            panel.add(choice2a2);
        }
    }

    static class Action6 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            //Creates the frame.
            System.out.println(e.getActionCommand());
            JFrame frame = new JFrame("Choice 3");
            frame.setVisible(true);
            frame.setSize(1200, 600);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel panel = new JPanel();
            frame.add(panel);

            panel.setLayout(new GridLayout(2, 2, 15, 0));
            panel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);

            // Creates labels and buttons to place on the panel.
            JLabel third = new JLabel("You find your materials and walk near the plane crash. ");
            JLabel fourth = new JLabel("Suddenly, you see someone in the distance.");
            JButton choice2b1 = new JButton("Finally, another person! Walk toward them and receive help.");
            JButton choice2b2 = new JButton("I don’t trust them... let’s avoid them and start to make shelter elsewhere.");

            //Attach the action listeners to the buttons.
            choice2b1.addActionListener(new Action13());
            choice2b2.addActionListener(new Action14());

            // Attach the labels and the buttons to the panel.
            panel.add(third);
            panel.add(fourth);
            panel.add(choice2b1);
            panel.add(choice2b2);
        }
    }

    static class Action7 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            //Creates the frame.
            System.out.println(e.getActionCommand());
            JFrame frame = new JFrame("Choice 1");
            frame.setVisible(true);
            frame.setSize(1200, 600);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel panel = new JPanel();
            frame.add(panel);

            panel.setLayout(new GridLayout(2, 2, 15, 0));
            panel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);

            // Creates labels and buttons to place on the panel.
            JLabel third = new JLabel("You finally built a makeshift home! But, you hear a crackling noise near you");
            JLabel fourth = new JLabel(" ");
            JButton choice1a1a = new JButton("Search for the source of the strange noise.");
            JButton choice1a1b = new JButton("Sleep in your bed, nothing can disrupt your beauty sleep.");

            choice1a1a.addActionListener(new Action75());
            choice1a1b.addActionListener(new Action75());

            // Attach the labels and the buttons to the panel.
            panel.add(third);
            panel.add(fourth);
            panel.add(choice1a1a);
            panel.add(choice1a1b);

        }
    }

    static class Action75 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            //Creates the frame.
            System.out.println(e.getActionCommand());
            JFrame frame = new JFrame("End");
            frame.setVisible(true);
            frame.setSize(1200, 600);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel panel = new JPanel();
            frame.add(panel);

            JLabel label = new JLabel("Unfortunately, A large fox suddenly tackled you. You could not fight back and you died. ");
            panel.add(label);

            panel.setLayout(new GridLayout(1, 1, 15, 0));
            panel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);

        }
    }

    static class Action8 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            //Creates the frame.
            System.out.println(e.getActionCommand());
            JFrame frame = new JFrame("Choice 2");
            frame.setVisible(true);
            frame.setSize(1200, 600);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel panel = new JPanel();
            frame.add(panel);

            panel.setLayout(new GridLayout(2, 2, 15, 0));
            panel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);

            // Creates labels and buttons to place on the panel.
            JLabel third = new JLabel("You wake up with another person standing above you! They don’t seem to speak English.");
            JLabel fourth = new JLabel("You’re in shock, but your stomach still rumbles.");
            JButton choice1a2a = new JButton("Who needs food?! Follow the person!");
            JButton choice1a2b = new JButton("I think I’ll walk by myself… I don’t trust them.");

            choice1a2a.addActionListener(new Action85());
            choice1a2b.addActionListener(new Action85());

            // Attach the labels and the buttons to the panel.
            panel.add(third);
            panel.add(fourth);
            panel.add(choice1a2a);
            panel.add(choice1a2b);
        }
    }

    static class Action85 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            //Creates the frame.
            System.out.println(e.getActionCommand());
            JFrame frame = new JFrame("End");
            frame.setVisible(true);
            frame.setSize(1200, 600);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel panel = new JPanel();
            frame.add(panel);

            JLabel label = new JLabel("You were exploring when you suddenly got cornered by another person. They pushed you off a high cliff and you died");
            panel.add(label);

            panel.setLayout(new GridLayout(1, 1, 15, 0));
            panel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);

        }
    }

    static class Action9 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            //Creates the frame.
            System.out.println(e.getActionCommand());
            JFrame frame = new JFrame("Choice 4");
            frame.setVisible(true);
            frame.setSize(1200, 600);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel panel = new JPanel();
            frame.add(panel);

            panel.setLayout(new GridLayout(2, 2, 15, 0));
            panel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);

            // Creates labels and buttons to place on the panel.
            JLabel third = new JLabel("You find water and filter it using a piece of cloth. You’re now hydrated!");
            JLabel fourth = new JLabel("You spot a small, abandoned hut in the distance, and it's getting dark.");
            JButton choice1b1a = new JButton("Ignore it! Collect supplies on your own and build a house very quickly.");
            JButton choice1b1b = new JButton("Sleep inside the hut. It looks vacant and will protect me!");

            choice1b1a.addActionListener(new Action95());
            choice1b1b.addActionListener(new Action95());

            // Attach the labels and the buttons to the panel.
            panel.add(third);
            panel.add(fourth);
            panel.add(choice1b1a);
            panel.add(choice1b1b);

        }
    }

    static class Action95 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            //Creates the frame.
            System.out.println(e.getActionCommand());
            JFrame frame = new JFrame("End");
            frame.setVisible(true);
            frame.setSize(1200, 600);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel panel = new JPanel();
            frame.add(panel);

            JLabel label = new JLabel("Congratulations! You survived the night by getting food, water, and shelter. Well done!");
            panel.add(label);

            panel.setLayout(new GridLayout(1, 1, 15, 0));
            panel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);

        }
    }

    static class Action10 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            //Creates the frame.
            System.out.println(e.getActionCommand());
            JFrame frame = new JFrame("Choice 4");
            frame.setVisible(true);
            frame.setSize(1200, 600);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel panel = new JPanel();
            frame.add(panel);

            panel.setLayout(new GridLayout(2, 2, 15, 0));
            panel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);

            // Creates labels and buttons to place on the panel.
            JLabel third = new JLabel("You find it too difficult to build because of dehydration.");
            JLabel fourth = new JLabel("What will you do next?");
            JButton choice1b2a = new JButton("Look around for a place of shelter. There has to be someone living here!");
            JButton choice1b2b = new JButton("Push through and attempt to build something in the dark night.");

            choice1b2a.addActionListener(new Action105());
            choice1b2b.addActionListener(new Action105());

            // Attach the labels and the buttons to the panel.
            panel.add(third);
            panel.add(fourth);
            panel.add(choice1b2a);
            panel.add(choice1b2b);

        }
    }

    static class Action105 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            //Creates the frame.
            System.out.println(e.getActionCommand());
            JFrame frame = new JFrame("End");
            frame.setVisible(true);
            frame.setSize(1200, 600);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel panel = new JPanel();
            frame.add(panel);

            JLabel label = new JLabel("While you were walking, trying to find items you needed, a large bird flew down and grabbed you. You could not fight back because of weakness and died from a high fall. Better luck next time!");
            panel.add(label);

            panel.setLayout(new GridLayout(1, 1, 15, 0));
            panel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        }
    }

    static class Action11 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            //Creates the frame.
            System.out.println(e.getActionCommand());
            JFrame frame = new JFrame("Choice 2");
            frame.setVisible(true);
            frame.setSize(1200, 600);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel panel = new JPanel();
            frame.add(panel);

            panel.setLayout(new GridLayout(2, 2, 15, 0));
            panel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);

            // Creates labels and buttons to place on the panel.
            JLabel third = new JLabel("You start to run, and realize you lost all of your wood. ");
            JLabel fourth = new JLabel("Unfortunately, your stomach starts to rumble");
            JButton choice2a1a = new JButton("Pick random fruit off of a tree and eat it.");
            JButton choice2a1b = new JButton("Climb the tree to find something from a high altitude.");

            choice2a1a.addActionListener(new Action115());
            choice2a1b.addActionListener(new Action115());

            // Attach the labels and the buttons to the panel.
            panel.add(third);
            panel.add(fourth);
            panel.add(choice2a1a);
            panel.add(choice2a1b);
        }
    }

    static class Action115 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            //Creates the frame.
            System.out.println(e.getActionCommand());
            JFrame frame = new JFrame("End");
            frame.setVisible(true);
            frame.setSize(1200, 600);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel panel = new JPanel();
            frame.add(panel);

            JLabel label = new JLabel("Unfortunately, as you reach for the suspicious tree, an animal grabs your arm and bites you. You died instantly.");
            panel.add(label);

            panel.setLayout(new GridLayout(1, 1, 15, 0));
            panel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        }
    }

    static class Action12 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            //Creates the frame.
            System.out.println(e.getActionCommand());
            JFrame frame = new JFrame("Choice 2");
            frame.setVisible(true);
            frame.setSize(1200, 600);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel panel = new JPanel();
            frame.add(panel);

            panel.setLayout(new GridLayout(2, 2, 15, 0));
            panel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);

            // Creates labels and buttons to place on the panel.
            JLabel third = new JLabel("You are no longer bothered by the snake.");
            JLabel fourth = new JLabel("You successfully gather materials, yet it’s nighttime.");
            JButton choice2a2a = new JButton("Stay up at night to quickly build a home to sleep.");
            JButton choice2a2b = new JButton("Walk toward the mango tree, gather food, then sleep in a makeshift bed.");

            choice2a2a.addActionListener(new Action125());
            choice2a2b.addActionListener(new Action125());

            // Attach the labels and the buttons to the panel.
            panel.add(third);
            panel.add(fourth);
            panel.add(choice2a2a);
            panel.add(choice2a2b);

        }
    }

    static class Action125 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            //Creates the frame.
            System.out.println(e.getActionCommand());
            JFrame frame = new JFrame("End");
            frame.setVisible(true);
            frame.setSize(1200, 600);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel panel = new JPanel();
            frame.add(panel);

            JLabel label = new JLabel("Congratulations! You successfully survived the night by getting food and building shelter!");
            panel.add(label);

            panel.setLayout(new GridLayout(1, 1, 15, 0));
            panel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        }
    }

    static class Action13 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            //Creates the frame.
            System.out.println(e.getActionCommand());
            JFrame frame = new JFrame("Choice 2");
            frame.setVisible(true);
            frame.setSize(1200, 600);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel panel = new JPanel();
            frame.add(panel);

            panel.setLayout(new GridLayout(2, 2, 15, 0));
            panel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);

            // Creates labels and buttons to place on the panel.
            JLabel third = new JLabel("They tell you they are from the plane and are very scared.");
            JLabel fourth = new JLabel("They want you to follow them to their shelter!");
            JButton choice2b1a = new JButton("Great! Now I don’t have to build one myself.");
            JButton choice2b1b = new JButton("Ok…now they seem sketchy. I will walk away.");

            choice2b1a.addActionListener(new Action135());
            choice2b1b.addActionListener(new Action135());

            // Attach the labels and the buttons to the panel.
            panel.add(third);
            panel.add(fourth);
            panel.add(choice2b1a);
            panel.add(choice2b1b);

        }
    }

    static class Action135 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            //Creates the frame.
            System.out.println(e.getActionCommand());
            JFrame frame = new JFrame("End");
            frame.setVisible(true);
            frame.setSize(1200, 600);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel panel = new JPanel();
            frame.add(panel);

            JLabel label = new JLabel("Suddenly, the person grabs and kidnaps you! They are not from the plane, and you fell into their trap. You died.");
            panel.add(label);

            panel.setLayout(new GridLayout(1, 1, 15, 0));
            panel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        }
    }


    static class Action14 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            //Creates the frame.
            System.out.println(e.getActionCommand());
            JFrame frame = new JFrame("Choice 2");
            frame.setVisible(true);
            frame.setSize(1200, 600);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel panel = new JPanel();
            frame.add(panel);

            panel.setLayout(new GridLayout(2, 2, 15, 0));
            panel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);

            // Creates labels and buttons to place on the panel.
            JLabel third = new JLabel("You peacefully build your fire and shelter.");
            JLabel fourth = new JLabel(" It gets dark and you need water. However, you feel something  following you.");
            JButton choice2b2a = new JButton("Obtain the water and filter it to be hydrated.");
            JButton choice2b2b = new JButton("Search near you to see what is there, then get water.");

            choice2b2a.addActionListener(new Action145());
            choice2b2b.addActionListener(new Action145());

            // Attach the labels and the buttons to the panel.
            panel.add(third);
            panel.add(fourth);
            panel.add(choice2b2a);
            panel.add(choice2b2b);
        }
    }

    static class Action145 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            //Creates the frame.
            System.out.println(e.getActionCommand());
            JFrame frame = new JFrame("End");
            frame.setVisible(true);
            frame.setSize(1200, 600);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel panel = new JPanel();
            frame.add(panel);

            JLabel label = new JLabel("Congratulations! You peacefully and successfully survived the night by eventually finding water, and realizing that there was a friendly dog following you, who is now your best friend. ");
            panel.add(label);

            panel.setLayout(new GridLayout(1, 1, 15, 0));
            panel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        }
    }
}