package LearnOops;

public class Automation extends MultipleLanguage implements Language,TestTool{
		
		public void selenium() {
		   System.out.println("Selenium");
		}

		public void java() {
			System.out.println("Java");
		}
		@Override
		public void ruby() {
			System.out.println("Ruby");
			
		}

		public static void main(String[] args) {
			Automation obj=new Automation();
			obj.java();
			obj.ruby();
			obj.selenium();

		}

	
}
