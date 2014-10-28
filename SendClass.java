import com.pi4j.io.gpio.*;

public class SendClass
{
    public static void main(String args[]) {
	return;
    }

    public void send(int[] bits) {
	final GpioController gpio = GpioFactory.getInstance();
	final GpioPinDigitalOutput pin = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_00, "BitPin", PinState.LOW);
	pin.high();		//Set Output to HIGH
	pin.low(); 		//Set Output to LOW
	pin.toggle();		//Toggle Output (LOW --> HIGH | HIGH --> LOW)
	pin.pulse(1000,true);	//Set Output to HIGH for 1 second
	gpio.shutdown();
    }
}
