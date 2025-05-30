import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class GUISortFinal extends javax.swing.JPanel {

    private int[] numbers;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() { //runs the JFrame
                JFrame frame = new JFrame();
                frame.add(new GUISortFinal());
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setLocationByPlatform(true);
                frame.setVisible(true);
            }
        });
    }

    public GUISortFinal() {
        numbers = new int[]{252, 79, 350, 40, 489, 103, 27, 498, 272, 382}; //two examples of arrays
        //numbers = new int [] {378, 48, 392, 16, 254, 108, 98, 183, 479, 9};
        addMouseListener(new MouseAdapter() {
            //MouseListener allows the array to be sorted after the user clicks on it
            @Override
            public void mouseClicked(MouseEvent e) {
                selectionSort(numbers);
            }
        });
    }

    @Override
    public Dimension getPreferredSize() { //sets the size of the frame
        return new Dimension(500, 500); //frame is 500x500, so all array values are <500
    }

    public void selectionSort(final int[] a) { //selection sort algorithm
        new Thread(new Runnable() { //create a threat to slow down
            @Override
            public void run() {
                for (int i = 0; i < a.length - 1; i++) {
                    //'i' goes through each number
                    int min = i; // min is at i at first
                    for (int j = i + 1; j < a.length; j++) { // j can go to the end
                        if (a[j] < a[min]) {
                            //if the element at j is less than the first, then that is the min
                            min = j;
                        }
                    }
                    int temp = a[min]; //this is the swap of the algorithm
                    a[min] = a[i];
                    a[i] = temp;
                    repaint();
                    try { //use thread.sleep(1000) to see the sort in slower motion
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                    }
                }
            }
        }).start();
    }


    @Override
    public void paint(Graphics g) {
        super.paint(g);
        //all numbers set to floats

        int rectWidth = 50; //sets the width of each bar
        int width = getWidth() - 1;
        int height = getHeight() - 1;
        int colSpan = Math.round((float) width / (float) numbers.length);
        //the width of each bar is 50/(number of elements)
        int x = 10; //have 10 bars

        for (int num : numbers) { //for each element in the array
            int colHeight = (int) ((float) height * ((float) num / (float) 500)); //height of the columns (bars)
            g.setColor(Color.lightGray);
            g.fillRect(x, height - colHeight, rectWidth, colHeight); //color in the bars of this set size
            g.setColor(Color.magenta);
            g.drawString(String.valueOf(num), x, height);
            //set color to magenta, then draw the number near the bottom of each graph
            g.setColor(Color.black); //set color back to black to fill the next rectangle
            x += colSpan;
        }

    }
}