package initial;

public class HelloWorldAnonymousClasses
{
	private int population;
	
	HelloWorld englishGreeting = new EnglishGreeting(this, HelloWorldAnonymousClasses.this);

	HelloWorld frenchGreeting = new HelloWorld(this)
	{
		String	name	= "tout le monde";

		public void greet()
		{
			greetSomeone(name);
		}

		public void greetSomeone(String someone)
		{
			name = someone;
			System.out.println("Salut " + name + "!");
		}
	};

	HelloWorld spanishGreeting = new HelloWorld(this)
	{
		String	name	= "mundo";

		public void greet()
		{
			greetSomeone(name);
		}

		public void greetSomeone(String someone)
		{
			name = someone;
			System.out.println("Hola, " + name);
		}
	};
	
	/**
	 * @deprecated Use {@link #salute()} instead
	 */
	public void sayHello()
	{
		salute();
	}

	public void salute()
	{
		englishGreeting.greet();
		frenchGreeting.greetSomeone("Fred");
		spanishGreeting.greet();
	}

	public static void main(String... args)
	{
		HelloWorldAnonymousClasses myApp = new HelloWorldAnonymousClasses();
		myApp.salute();
	}
}
