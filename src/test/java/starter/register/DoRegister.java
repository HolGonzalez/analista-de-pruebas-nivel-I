package starter.register;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DoRegister implements Task {

    private final String username;
    private final String lastname;
    private final String email;
    private final String lenguage;
    private final String city;
    private final String zip;
    private final String country;
    private final String device;
    private final String model;
    private final String os;
    private final String pass;


    public DoRegister(String username, String lastname, String email, String lenguage,
                      String city, String zip, String country,
                      String device,String model, String os,
                      String pass) {
        this.username = username;
        this.lastname = lastname;
        this.email = email;
        this.lenguage = lenguage;
        this.city = city;
        this.zip = zip;
        this.country = country;
        this.device = device;
        this.model = model;
        this.os = os;
        this.pass = pass;
    }

    public static Performable withCredentials(String username, String lastname, String email, String lenguage,
                                              String city, String zip, String country,
                                              String device, String model, String os,
                                              String pass){
        return instrumented(DoRegister.class, username,lastname,email,lenguage, city, zip, country,device,model, os,pass);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(RegisterForm.SIGNUP_BUTTON),

                //Page 1
                Enter.theValue(username).into(RegisterForm.NAME_FIELD),
                Enter.theValue(lastname).into(RegisterForm.LASTNAME_FIELD),
                Enter.theValue(email).into(RegisterForm.EMAIL_FIELD),
                Click.on(RegisterForm.MONTH_BUTTON),
                Click.on(RegisterForm.SELECT_MONTH_BUTTON),
                Click.on(RegisterForm.DAY_BUTTON),
                Click.on(RegisterForm.SELECT_DAY_BUTTON),
                Click.on(RegisterForm.YEAR_BUTTON),
                Click.on(RegisterForm.SELECT_YEAR_BUTTON),
                Enter.theValue(lenguage).into(RegisterForm.LENGUAGE_FIELD).thenHit(Keys.ENTER),
                Click.on(RegisterForm.NEXT_LOCATION_BUTTON),

                //Page 2
                Clear.field(RegisterForm.CITY_FIELD),
                Enter.theValue(city).into(RegisterForm.CITY_FIELD),
                Enter.keyValues(Keys.DOWN,Keys.ENTER).into(RegisterForm.CITY_FIELD),
                Clear.field(RegisterForm.ZIP_FIELD),
                Enter.theValue(zip).into(RegisterForm.ZIP_FIELD).thenHit(Keys.ENTER),
                Click.on(RegisterForm.COUNTRY_BUTTON),
                Enter.theValue(country).into(RegisterForm.COUNTRY_FIELD).thenHit(Keys.ENTER),
                Click.on(RegisterForm.NEXT_DEVICE),

                //Page 3
                Click.on(RegisterForm.DEVICE_BUTTON),
                Enter.theValue(device).into(RegisterForm.DEVICE_FIELD).thenHit(Keys.ENTER),
                Click.on(RegisterForm.MODEL_BUTTON),
                Enter.theValue(model).into(RegisterForm.MODEL_FIELD).thenHit(Keys.ENTER),
                Click.on(RegisterForm.OS_BUTTON),
                Enter.theValue(os).into(RegisterForm.OS_FIELD).thenHit(Keys.ENTER),
                Click.on(RegisterForm.NEXT_FINAL_BUTTON),

                //Page 4
                Enter.theValue(pass).into(RegisterForm.PASS_FIELD),
                Enter.theValue(pass).into(RegisterForm.PASS_VALIDATE_FIELD),
                Click.on(RegisterForm.CONDITION_BUTTON),
                Click.on(RegisterForm.CONDITION_TWO_BUTTON),
                Click.on(RegisterForm.CONDITION_THREE_BUTTON),
                Click.on(RegisterForm.COMPLETE_BUTTON)

        );
    }
}
