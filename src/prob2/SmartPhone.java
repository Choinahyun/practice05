package prob2;

public class SmartPhone extends MusicPhone {

	@Override
	public void execute(String function) {
		if ( function.equals("앱") ) {
			playApp();
		}
		else {
			super.execute(function);
		}
		
	}
	
	public void playApp() {
		System.out.println("앱 실행");
	}

}
