package starter.register;

import org.openqa.selenium.By;

public class RegisterForm {

    //Page 1
    public static By SIGNUP_BUTTON = By.xpath("/html/body/ui-view/unauthenticated-container/div/div/unauthenticated-header/div/div[3]/ul[2]/li[2]/a");
    public static By NAME_FIELD = By.id("firstName");
    public static By LASTNAME_FIELD = By.id("lastName");
    public static By EMAIL_FIELD = By.id("email");
    public static By MONTH_BUTTON = By.id("birthMonth");
    public static By SELECT_MONTH_BUTTON = By.xpath("//*[@id=\"birthMonth\"]/option[6]");
    public static By DAY_BUTTON = By.id("birthDay");
    public static By SELECT_DAY_BUTTON = By.xpath("//*[@id=\"birthDay\"]/option[7]");
    public static By YEAR_BUTTON = By.id("birthYear");
    public static By SELECT_YEAR_BUTTON = By.xpath("//*[@id=\"birthYear\"]/option[11]");
    public static By LENGUAGE_FIELD = By.xpath("//*[@id=\"languages\"]/div[1]/input");
    public static By NEXT_LOCATION_BUTTON = By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a");

    //Page 2
    public static By CITY_FIELD = By.id("city");
    public static By ZIP_FIELD = By.id("zip");
    public static By COUNTRY_BUTTON = By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]");
    public static By COUNTRY_FIELD = By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]");
    public static By NEXT_DEVICE = By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a");

    //Page 3
    public static By DEVICE_BUTTON = By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[1]/div[2]/div");
    public static By DEVICE_FIELD = By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[1]/div[2]/div/input[1]");
    public static By MODEL_BUTTON = By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/div[2]/div/div[1]");
    public static By MODEL_FIELD = By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/div[2]/div/input[1]");
    public static By OS_BUTTON = By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[3]/div[2]/div/div[1]");
    public static By OS_FIELD = By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[3]/div[2]/div/input[1]");
    public static By NEXT_FINAL_BUTTON = By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[2]/div/a");

    //Page 4
    public static By PASS_FIELD = By.id("password");
    public static By PASS_VALIDATE_FIELD = By.id("confirmPassword");
    public static By CONDITION_BUTTON = By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[4]/label/span");
    public static By CONDITION_TWO_BUTTON = By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]");
    public static By CONDITION_THREE_BUTTON = By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]");
    public static By COMPLETE_BUTTON = By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div/div/a");
}
