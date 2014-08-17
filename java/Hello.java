class Hello {
	public static void main(String args[]) {
		int len = args.length;
		if (len < 1) len = 9;
		if (Constants.DEBUG) {
			System.out.println(len + (new Greeting("debug")).getGreeting());
		} else {
			System.err.println((new Greeting("error")).getGreeting());
		}
	}

	static class Greeting {
		private String subject;

		public Greeting(String subject)
		{
			this.subject = subject;
		}

		public String getGreeting() {
			return "Hello " + subject;
		}
	}
}
