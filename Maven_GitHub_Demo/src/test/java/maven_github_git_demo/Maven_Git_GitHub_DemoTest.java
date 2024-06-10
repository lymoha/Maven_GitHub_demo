package maven_github_git_demo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Maven_Git_GitHub_DemoTest {

	@Test
public void addInteger_ShouldReturn50_WhenCallWith27And23() {
		Maven_Git_GitHub_Demo demo = new Maven_Git_GitHub_Demo();
		int add = demo.addInteger(23,27);
	assertEquals(50, add);
	}

}
