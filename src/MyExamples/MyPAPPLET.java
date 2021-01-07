package MyExamples;

import processing.core.PApplet;

public class MyPAPPLET extends PApplet {
	public void setup()
	{
		size(400, 400);
		background(200, 200, 200);
		
	}
	public void keyPressed()
	{
		if(key == 'q')
		{
			background(0, 0, 0);
		}
	}
	
	public void draw()
	{
		fill(255, 255, 0);
		ellipse(200, 200, 390, 390);
		fill(0, 0, 0);
		ellipse(120, 130, 50, 70);
		fill(0, 0, 0);
		ellipse(280, 130, 50, 70);
		noFill();
		arc(200, 280, 75, 75, 0, PI );
		
	}

}
