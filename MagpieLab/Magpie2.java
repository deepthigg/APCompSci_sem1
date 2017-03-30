public class Magpie2
{
	
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}
	
	
	
	public String getResponse(String statement)
	{
		String response = "";
		
		if (statement.length() == 0)
		{
			return "Say something, please";
		}

		if (statement.indexOf("no") >= 0)
		{
			response = "Why so negative?";
		}

		else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0);
		{
			response = "Tell me more about your family.";
		}

		
		 
		else if (findKeyword(statement, "cat",0) >= 0
				|| (findKeyword(statement, "fish",0)>= 0
				|| (findKeyword(statement, "turtle",0) >= 0
				|| (findKeyword(statement, "dog",0)>= 0);
		{
			response = "Tell me more about your pets.";
		}
		
		else if (findKeyword(statement, "Mr. Robinette",0)>= 0)
		{
			response = "He sounds like a pretty dank teacher.";
		}

		else
		{
			response = getRandomResponse();
		}
		return response;
	}

	private int findKeyword(String statement, String goal, int startPos)
	{
			String phrase = statement.trim();
			int psn = phrase.toLowerCase().indexOf(goal.toLowerCase(), startPos);
			
			while(psn >= 0)
			{
				String before = " ";
				String after = " ";
				if(psn > 0)
				{
					before = phrase.substring(psn - 1, psn).toLowerCase();
				}
				if (psn + goal.length() < phrase.length())
				{
					after = phrase.substring(psn + goal.length(),
											 psn + goal.length() + 1).toLowerCase();
				}
				if(((before.compareTo("a") < 0 ) || (before.compareTo("z") > 0)) && ((after.compareTo("a") < 0 ) || (after.compareTo("z") > 0)))
				{
					return psn;
				}
				psn = phrase.indexOf(goal.toLowerCase(), psn + 1);
			}

		return -1;

	}

	private int findKeyword(String statement, String goal)
	{
		
		return findKeyword(statement, goal, 0);
	}

	
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 4;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
			response = "Interesting, tell me more.";
		else if (whichResponse == 1)
			response = "Hmmm.";
		else if (whichResponse == 2)
			response = "Do you really think so?";
		else if (whichResponse == 3)
			response = "You don't say.";

		return response;
	}

}