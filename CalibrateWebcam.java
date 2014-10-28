public class CalibrateWebcam
{
    public static void main(String args[])
    {
	return;
    }

    public static int calibrate(String image)
    {
	JPEGRead jr = new JPEGRead();
	int[] colors = jr.getVerticalColors(image);
	for(int i=0; i<colors.length; i++) {
	    java.awt.Color c = new java.awt.Color(colors[i]);
            int b = c.getBlue();
            int r = c.getRed();
            int g = c.getGreen();
	    if(r >= 90 && g < 200 && b < 200 && r > g && r > b) colors[i] = 10;            //RED
            else if(b >= 90 && r < 200 && g < 200 && b > g && b > r) colors[i] = 01;                       //BLUE
	    else colors[i] = 00;
	}
	int lastColor = 0;
	int current = 0;
	for(int i=0; i<colors.length; i++) {
	    if(colors[i] != lastColor) {
		if(current > 40 && (lastColor == 10 || lastColor == 01)) return (i-(current-20));
		lastColor = colors[i];
		current = 0;
	    }
	    else current++;
	}
	return 0;
    }
}
