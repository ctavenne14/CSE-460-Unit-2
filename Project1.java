import java.util.Queue;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import org.apache.commons.collections4.queue.CircularFifoQueue;

public class Project1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		Queue<Athlete> fifo = new CircularFifoQueue<Athlete>(5);
	    
		int option;
		int a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v;
		
		System.out.println("Please select one of the following options: ");
		System.out.println("1. Enter Symptoms");
		System.out.println("2. Display Symptoms Summary");
		System.out.println("3. Am I at Risk?");
		System.out.println("4. Quit");
		do{ System.out.println("Enter your choice (1-4): ");
			option=scan.nextInt();
			switch (option)
			{
			case 1:
				System.out.println("Please enter your headache score (none (0), mild (1-2), moderate (3-4), severe (5-6)): ");
				a = scan.nextInt();
				System.out.println("Please enter your pressure in your head score (none (0), mild (1-2), moderate (3-4), severe (5-6)): ");
				b = scan.nextInt();
				System.out.println("Please enter your neck pain score (none (0), mild (1-2), moderate (3-4), severe (5-6)): ");
				c = scan.nextInt();
				System.out.println("Please enter your nausea or vomiting score (none (0), mild (1-2), moderate (3-4), severe (5-6)): ");
				d = scan.nextInt();
				System.out.println("Please enter your dizziness score (none (0), mild (1-2), moderate (3-4), severe (5-6)): ");
				e = scan.nextInt();
				System.out.println("Please enter your blurred vision score (none (0), mild (1-2), moderate (3-4), severe (5-6)): ");
				f = scan.nextInt();
				System.out.println("Please enter your balance problems score (none (0), mild (1-2), moderate (3-4), severe (5-6)): ");
				g = scan.nextInt();
				System.out.println("Please enter your sensitivity to the light score (none (0), mild (1-2), moderate (3-4), severe (5-6)): ");
				h = scan.nextInt();
				System.out.println("Please enter your sensitivity to noise score (none (0), mild (1-2), moderate (3-4), severe (5-6)): ");
				i = scan.nextInt();
				System.out.println("Please enter your feeling slowed down score (none (0), mild (1-2), moderate (3-4), severe (5-6)): ");
				j = scan.nextInt();
				System.out.println("Please enter your feeling like in a fog score (none (0), mild (1-2), moderate (3-4), severe (5-6)): ");
				k = scan.nextInt();
				System.out.println("Please enter your don't feel right score (none (0), mild (1-2), moderate (3-4), severe (5-6)): ");
				l = scan.nextInt();
				System.out.println("Please enter your difficulty concentrating score (none (0), mild (1-2), moderate (3-4), severe (5-6)): ");
				m = scan.nextInt();
				System.out.println("Please enter your difficulty remembering score (none (0), mild (1-2), moderate (3-4), severe (5-6)): ");
				n = scan.nextInt();
				System.out.println("Please enter your fatigue score (none (0), mild (1-2), moderate (3-4), severe (5-6)): ");
				o = scan.nextInt();
				System.out.println("Please enter your confusion score (none (0), mild (1-2), moderate (3-4), severe (5-6)): ");
				p = scan.nextInt();
				System.out.println("Please enter your drowsiness score (none (0), mild (1-2), moderate (3-4), severe (5-6)): ");
				q = scan.nextInt();
				System.out.println("Please enter your trouble falling asleep score (none (0), mild (1-2), moderate (3-4), severe (5-6)): ");
				r = scan.nextInt();
				System.out.println("Please enter your more emotional score (none (0), mild (1-2), moderate (3-4), severe (5-6)): ");
				s = scan.nextInt();
				System.out.println("Please enter your irritability score (none (0), mild (1-2), moderate (3-4), severe (5-6)): ");
				t = scan.nextInt();
				System.out.println("Please enter your sadness score (none (0), mild (1-2), moderate (3-4), severe (5-6)): ");
				u = scan.nextInt();
				System.out.println("Please enter your nervous score (none (0), mild (1-2), moderate (3-4), severe (5-6)): ");
				v = scan.nextInt();
				Athlete one = new Athlete (a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v);
				fifo.add(one);
				break;
			
			case 2:
				if(fifo.isEmpty())
				{
					System.out.println("No games completed");
					
				}
				if(fifo.size() == 1)
				{
					System.out.println("No Difference");

				}
				if(fifo.size() == 2)
				{
					Athlete first1 = ((CircularFifoQueue<Athlete>) fifo).get(1);
					int total;
					total = first1.totalSymp();
					System.out.println("Total number of symptoms: " + total);
					int severity;
					severity = first1.severity();
					System.out.println("Severity Score: " + severity);
					Athlete two = ((CircularFifoQueue<Athlete>) fifo).get(0);
					if(Math.abs(total-two.totalSymp()) < 3 && Math.abs(severity-two.severity()) < 10)
					{
						System.out.println("No Difference");
					}
					else if(Math.abs(total-two.totalSymp()) < 3 && Math.abs(severity-two.severity()) >= 10)
					{
						System.out.println("Unsure");
					}
					else if(Math.abs(total-two.totalSymp()) >= 3 || Math.abs(severity-two.severity()) >= 15)
					{
						System.out.println("Very Different");
					}
					
				}
				if(fifo.size() == 3)
				{
					Athlete first1 = ((CircularFifoQueue<Athlete>) fifo).get(2);
					int total;
					total = first1.totalSymp();
					System.out.println("Total number of symptoms: " + total);
					int severity;
					severity = first1.severity();
					System.out.println("Severity Score: " + severity);
					Athlete two = ((CircularFifoQueue<Athlete>) fifo).get(1);
					if(Math.abs(total-two.totalSymp()) < 3 && Math.abs(severity-two.severity()) < 10)
					{
						System.out.println("No Difference");
					}
					else if(Math.abs(total-two.totalSymp()) < 3 && Math.abs(severity-two.severity()) >= 10)
					{
						System.out.println("Unsure");
					}
					else if(Math.abs(total-two.totalSymp()) >= 3 || Math.abs(severity-two.severity()) >= 15)
					{
						System.out.println("Very Different");
					}
				}
				if(fifo.size() == 4)
				{
					Athlete first1 = ((CircularFifoQueue<Athlete>) fifo).get(3);
					int total;
					total = first1.totalSymp();
					System.out.println("Total number of symptoms: " + total);
					int severity;
					severity = first1.severity();
					System.out.println("Severity Score: " + severity);
					Athlete two = ((CircularFifoQueue<Athlete>) fifo).get(2);
					if(Math.abs(total-two.totalSymp()) < 3 && Math.abs(severity-two.severity()) < 10)
					{
						System.out.println("No Difference");
					}
					else if(Math.abs(total-two.totalSymp()) < 3 && Math.abs(severity-two.severity()) >= 10)
					{
						System.out.println("Unsure");
					}
					else if(Math.abs(total-two.totalSymp()) >= 3 || Math.abs(severity-two.severity()) >= 15)
					{
						System.out.println("Very Different");
					}
				}
				if(fifo.size() == 5)
				{
					Athlete first1 = ((CircularFifoQueue<Athlete>) fifo).get(4);
					int total;
					total = first1.totalSymp();
					System.out.println("Total number of symptoms: " + total);
					int severity;
					severity = first1.severity();
					System.out.println("Severity Score: " + severity);
					Athlete two = ((CircularFifoQueue<Athlete>) fifo).get(3);
					if(Math.abs(total-two.totalSymp()) < 3 && Math.abs(severity-two.severity()) < 10)
					{
						System.out.println("No Difference");
					}
					else if(Math.abs(total-two.totalSymp()) < 3 && Math.abs(severity-two.severity()) >= 10)
					{
						System.out.println("Unsure");
					}
					else if(Math.abs(total-two.totalSymp()) >= 3 || Math.abs(severity-two.severity()) >= 15)
					{
						System.out.println("Very Different");
					}
					
				}
				
			break;
			
			case 3:
				if(fifo.isEmpty())
				{
					System.out.println("No games completed");
					
				}
		
				if(fifo.size() == 1)
				{
					Athlete first1 = ((CircularFifoQueue<Athlete>) fifo).get(0);
					  JFrame frame = new JFrame();
					  ImageIcon icon = new ImageIcon("green.png");
					  JLabel label = new JLabel(icon);
					  frame.add(label);
					  frame.setDefaultCloseOperation
					         (JFrame.EXIT_ON_CLOSE);
					  frame.pack();
					  frame.setVisible(true);

				}
				if(fifo.size() == 2)
				{
					Athlete first1 = ((CircularFifoQueue<Athlete>) fifo).get(1);
					int total;
					total = first1.totalSymp();
					System.out.println("Total number of symptoms: " + total);
					int severity;
					severity = first1.severity();
					System.out.println("Severity Score: " + severity);
					Athlete two = ((CircularFifoQueue<Athlete>) fifo).get(0);
					if(Math.abs(total-two.totalSymp()) < 3 && Math.abs(severity-two.severity()) < 10)
					{
						JFrame frame = new JFrame();
						  ImageIcon icon = new ImageIcon("green.png");
						  JLabel label = new JLabel(icon);
						  frame.add(label);
						  frame.setDefaultCloseOperation
						         (JFrame.EXIT_ON_CLOSE);
						  frame.pack();
						  frame.setVisible(true);
					}
					else if(Math.abs(total-two.totalSymp()) < 3 && Math.abs(severity-two.severity()) >= 10)
					{
						JFrame frame = new JFrame();
						  ImageIcon icon = new ImageIcon("yellow.jpg");
						  JLabel label = new JLabel(icon);
						  frame.add(label);
						  frame.setDefaultCloseOperation
						         (JFrame.EXIT_ON_CLOSE);
						  frame.pack();
						  frame.setVisible(true);
					}
					else if(Math.abs(total-two.totalSymp()) >= 3 || Math.abs(severity-two.severity()) >= 15)
					{
						JFrame frame = new JFrame();
						  ImageIcon icon = new ImageIcon("red.png");
						  JLabel label = new JLabel(icon);
						  frame.add(label);
						  frame.setDefaultCloseOperation
						         (JFrame.EXIT_ON_CLOSE);
						  frame.pack();
						  frame.setVisible(true);
					}
					
				}
				if(fifo.size() == 3)
				{
					Athlete first1 = ((CircularFifoQueue<Athlete>) fifo).get(2);
					int total;
					total = first1.totalSymp();
					System.out.println("Total number of symptoms: " + total);
					int severity;
					severity = first1.severity();
					System.out.println("Severity Score: " + severity);
					Athlete two = ((CircularFifoQueue<Athlete>) fifo).get(1);
					if(Math.abs(total-two.totalSymp()) < 3 && Math.abs(severity-two.severity()) < 10)
					{
						JFrame frame = new JFrame();
						  ImageIcon icon = new ImageIcon("green.png");
						  JLabel label = new JLabel(icon);
						  frame.add(label);
						  frame.setDefaultCloseOperation
						         (JFrame.EXIT_ON_CLOSE);
						  frame.pack();
						  frame.setVisible(true);
					}
					else if(Math.abs(total-two.totalSymp()) < 3 && Math.abs(severity-two.severity()) >= 10)
					{
						JFrame frame = new JFrame();
						  ImageIcon icon = new ImageIcon("yellow.jpg");
						  JLabel label = new JLabel(icon);
						  frame.add(label);
						  frame.setDefaultCloseOperation
						         (JFrame.EXIT_ON_CLOSE);
						  frame.pack();
						  frame.setVisible(true);
					}
					else if(Math.abs(total-two.totalSymp()) >= 3 || Math.abs(severity-two.severity()) >= 15)
					{
						JFrame frame = new JFrame();
						  ImageIcon icon = new ImageIcon("red.png");
						  JLabel label = new JLabel(icon);
						  frame.add(label);
						  frame.setDefaultCloseOperation
						         (JFrame.EXIT_ON_CLOSE);
						  frame.pack();
						  frame.setVisible(true);
					}
					
				}
				if(fifo.size() == 4)
				{
					Athlete first1 = ((CircularFifoQueue<Athlete>) fifo).get(3);
					int total;
					total = first1.totalSymp();
					System.out.println("Total number of symptoms: " + total);
					int severity;
					severity = first1.severity();
					System.out.println("Severity Score: " + severity);
					Athlete two = ((CircularFifoQueue<Athlete>) fifo).get(2);
					if(Math.abs(total-two.totalSymp()) < 3 && Math.abs(severity-two.severity()) < 10)
					{
						JFrame frame = new JFrame();
						  ImageIcon icon = new ImageIcon("green.png");
						  JLabel label = new JLabel(icon);
						  frame.add(label);
						  frame.setDefaultCloseOperation
						         (JFrame.EXIT_ON_CLOSE);
						  frame.pack();
						  frame.setVisible(true);
					}
					else if(Math.abs(total-two.totalSymp()) < 3 && Math.abs(severity-two.severity()) >= 10)
					{
						JFrame frame = new JFrame();
						  ImageIcon icon = new ImageIcon("yellow.jpg");
						  JLabel label = new JLabel(icon);
						  frame.add(label);
						  frame.setDefaultCloseOperation
						         (JFrame.EXIT_ON_CLOSE);
						  frame.pack();
						  frame.setVisible(true);
					}
					else if(Math.abs(total-two.totalSymp()) >= 3 || Math.abs(severity-two.severity()) >= 15)
					{
						JFrame frame = new JFrame();
						  ImageIcon icon = new ImageIcon("red.png");
						  JLabel label = new JLabel(icon);
						  frame.add(label);
						  frame.setDefaultCloseOperation
						         (JFrame.EXIT_ON_CLOSE);
						  frame.pack();
						  frame.setVisible(true);
					}
					
				}
				if(fifo.size() == 5)
				{
					Athlete first1 = ((CircularFifoQueue<Athlete>) fifo).get(4);
					int total;
					total = first1.totalSymp();
					System.out.println("Total number of symptoms: " + total);
					int severity;
					severity = first1.severity();
					System.out.println("Severity Score: " + severity);
					Athlete two = ((CircularFifoQueue<Athlete>) fifo).get(3);
					if(Math.abs(total-two.totalSymp()) < 3 && Math.abs(severity-two.severity()) < 10)
					{
						JFrame frame = new JFrame();
						  ImageIcon icon = new ImageIcon("green.png");
						  JLabel label = new JLabel(icon);
						  frame.add(label);
						  frame.setDefaultCloseOperation
						         (JFrame.EXIT_ON_CLOSE);
						  frame.pack();
						  frame.setVisible(true);
					}
					else if(Math.abs(total-two.totalSymp()) < 3 && Math.abs(severity-two.severity()) >= 10)
					{
						JFrame frame = new JFrame();
						  ImageIcon icon = new ImageIcon("yellow.jpg");
						  JLabel label = new JLabel(icon);
						  frame.add(label);
						  frame.setDefaultCloseOperation
						         (JFrame.EXIT_ON_CLOSE);
						  frame.pack();
						  frame.setVisible(true);
					}
					else if(Math.abs(total-two.totalSymp()) >= 3 || Math.abs(severity-two.severity()) >= 15)
					{
						JFrame frame = new JFrame();
						  ImageIcon icon = new ImageIcon("red.png");
						  JLabel label = new JLabel(icon);
						  frame.add(label);
						  frame.setDefaultCloseOperation
						         (JFrame.EXIT_ON_CLOSE);
						  frame.pack();
						  frame.setVisible(true);
					}
					
				}
				
				
			break;
			
			case 4:
			break;
			}
		}while(option != 4);
	}

}
