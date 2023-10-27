package inEx02;

public class TvTest {

	public static void main(String[] args) {
		SmartTv sm = new SmartTv();
		sm.power();
		sm.setChannel(11);
		System.out.println("현재 채널 : " + sm.getChannel());
		System.out.println(sm.internet("java"));
		
		System.out.println(sm.genre("스릴러"));
		sm.setVolume(17);
		System.out.println("현재 볼륨 : " + sm.getVolume());
		

	}

}
