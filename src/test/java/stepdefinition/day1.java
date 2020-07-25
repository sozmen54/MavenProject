package stepdefinition;
import cucumber.api.java.en.Given;

public class day1 {


    @Given("^navigate$")
        public void navigate()  {

            System.out.println("hello");
        }

    @Given("^pull$")
    public void pull()  {

        System.out.println("hello");
    }

    @Given("^login to the page$")
    public void login_to_the_page() throws Throwable {

    }


}
