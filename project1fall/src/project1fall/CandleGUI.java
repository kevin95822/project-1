package project1fall;

import javax.swing.*;
import java.util.ArrayList;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class CandleGUI extends JFrame{
	
	private JTextArea unsorted, sorted;
	private ArrayList<Candle> candle;
	
	//constructor for the gui, with title, click X to close, size, setComponents method and set it visible
	public CandleGUI(ArrayList<Candle>c) {
		c = candle;
		setTitle("Candle GUI");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600,400);
		setComponents();
		setVisible(true);
	}
	//set up components such as grid layout and adding both unsorted and sorted data to the GUI
	public void setComponents() {
		setLayout(new GridLayout(1,2));
		
		unsorted = new JTextArea();
		for(int i = 0;i<candle.size();++i) {
			unsorted.append(candle.get(i).toString()+"\n");
		}
		add(unsorted);
		sort(candle);
		
		sorted = new JTextArea();
		for(int i = 0;i<candle.size();++i) {
			sorted.append(candle.get(i).toString()+"\n");
		}
		add(sorted);
	}
	//selection sort
	public void sort(ArrayList<Candle> c) {
		for(int i = 0;i<c.size()-1;i++) {
			int min = i;
			for(int j = i+1;j<c.size();j++) {
				if(c.get(j).getPrice() < c.get(min).getPrice()) {
					min = j;
				}
				Candle temp = c.get(min);
				c.set(min, c.get(i));
				c.set(i, temp);
			}
		}
	}
	
}
