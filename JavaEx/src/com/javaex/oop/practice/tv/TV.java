package com.javaex.oop.practice.tv;

public class TV {
	private int channel;
	private int volume;
	private boolean power;
	
	// default generator
	public TV() {}
	
	// custom generator
	public TV(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}
	
	// getter
	public int getChannel() {
		return channel;
	}
	public int getVolume() {
		return volume;
	}
	public boolean getPower() {
		return power;
	}
	
	// channel method
	public void channel(int channel) {
		if(channel > 0 && channel <256)
			this.channel = channel;
		else
			System.out.println("Channel is over. Retry to adjust!");
	}
	public void channel(boolean upDown) {
		if(upDown == true) {
			if(channel>0 && channel<255)
				channel++;
			else channel = 1;
		}
		else {
			if(channel > 1) channel--;
			else channel = 255;
		}
	}
	
	// volume method
	public void volume(int volume) {
		if(volume>=0 && volume<=100)
			this.volume = volume;
		else
			System.out.println("Volume is over. Retry to adjust!");
	}
	public void volume(boolean upDown) {
		if(upDown == true) {
			if(volume>=0 && volume<=99)
				volume++;
		}
		else {
			if(volume > 0)
				volume--;
		}
	}
	
	// power method
	public void power(boolean power) {
		if(power == true) this.power = power;
		else this.power = power;
	}
	
	// status method
	public void status() {
		System.out.printf("Power: %b, Channel: %d, Volume: %d%n", power, channel, volume);
	}
}
