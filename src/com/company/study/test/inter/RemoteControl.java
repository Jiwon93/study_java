package com.company.study.test.inter;

public interface RemoteControl {
	
	// 상수
	public static final int MAX_VOLUME = 10;
	public static final int MIN_VOLUME = 0;
	
	// 추상메서드
	public abstract void turnOn();
	public abstract void turnOff();
	public abstract void setVolume(int volume);
	
	// 디폴트메서드
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
		} else {
			System.out.println("무음 해제합니다.");
		}
	}
	
	// 정적메서드
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
	
}
