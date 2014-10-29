public class cTest
{
	public static void main(String args[]) {
		System.out.println(new ProcessImage(args[0],CalibrateWebcam.calibrate(args[0])));
		return;
	}
}
