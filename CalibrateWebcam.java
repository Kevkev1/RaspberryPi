public class CalibrateWebcam
{
    public static void main(String args[])
    {
	return;
    }

    public static int calibrate(String image)
    {
	int[] colors = JPEGRead.getVerticalColors(image);
	int rC = 0;
	int bC = 0;
	for(int i=0; i<colors.length; i++) {
	    java.awt.Color c = new java.awt.Color(colors[i]);
            int b = c.getBlue();
            int r = c.getRed();
            int g = c.getGreen();

	    if(r >= 90 && g < 200 && b < 200 && r > g && r > b) { bC = 0; rC++; }
            else if(b >= 90 && r < 200 && g < 200 && b > g && b > r) { rC = 0; bC++; }
	    else { bC = 0; rC = 0; }

	    if(rC > 40) return (i-(rC-20));
	    if(bC > 40) return (i-(bC-20));
	}
	return 0;
    }
}
