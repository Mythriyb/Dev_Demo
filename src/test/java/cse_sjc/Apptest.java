package cse_sjc;

public class Apptest 
{
	@Test
	Run|Debug
	public void testlogin{
		App myapp=new App();
		{
			Assert.assertEquals(0,myapp.userLogin("abc","abc@123"));
		}
		@Test
		Run|Debug
		public void testlogin()
		{
		App myapp=new App();
			{
			Assert.assertEquals(0,myapp.userLogin("abc","abc@123"));
			}
			
		}

	}

		
	}
