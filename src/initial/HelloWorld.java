package initial;

abstract class HelloWorld
{
	/**
	 * 
	 */
	private final HelloWorldAnonymousClasses container;

	/**
	 * @param helloWorldAnonymousClasses
	 */
	HelloWorld(HelloWorldAnonymousClasses helloWorldAnonymousClasses)
	{
		container = helloWorldAnonymousClasses;
	}

	public abstract void greet();

	public abstract void greetSomeone(String someone);
}