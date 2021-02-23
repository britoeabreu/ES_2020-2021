package initial;

class EnglishGreeting extends HelloWorld
{
	private final HelloWorldAnonymousClasses container;

	EnglishGreeting(HelloWorldAnonymousClasses helloWorldAnonymousClasses2, HelloWorldAnonymousClasses helloWorldAnonymousClasses)
	{
		super(helloWorldAnonymousClasses);
		container = helloWorldAnonymousClasses2;
	}

	String	name	= "world";

	public void greet()
	{
		greetSomeone(name);
	}

	public void greetSomeone(String someone)
	{
		name = someone;
		System.out.println("Hello " + name + "...");
	}
}