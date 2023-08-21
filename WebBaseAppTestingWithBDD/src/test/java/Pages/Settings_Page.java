package Pages;

import Utility.BaseData;
import Utility.CommonPageMethods;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class Settings_Page extends CommonPageMethods {
    public static WebDriver driver;
    int previousCardCount = 0;
    int afterCardCount = 0;
    String newlyAddedCardNumber = null;
    String addCardNum="4000000360000006";
    @FindBy(xpath = "//span[text()='Settings']")
    public WebElement settingsBtn;
    @FindBy(xpath = "//span[contains(text(),'password')]")
    public WebElement changePass;
    @FindBy(id = "current-password")
    public WebElement currentPass;
    @FindBy(id = "new-password")
    public WebElement newPass;
    @FindBy(id = "confirm-new-password")
    public WebElement confirmNewPass;
    @FindBy(xpath = "(//span[contains(text(),'Change Password')])[2]")
    public WebElement changePassBtn;
    @FindBy(xpath = "//span[contains(text(),'set billing method')]")
    public WebElement setBillingMethodBtn;
    @FindBy(xpath = "//span[contains(text(),'change billing method')]")
    public WebElement changeBillingMethodBtn;
    @FindBy(xpath = "//span[contains(text(),'billing method')]/../../../div[1]")
    public WebElement savedMethod;
    @FindBy(xpath = "//../div[2]/div/div/div/div")
    public WebElement dropdown;
    @FindBy(xpath = "//li[text()='Automatic']")
    public WebElement automatic;
    @FindBy(xpath = "//span[text()='SAVE']/..")
    public WebElement saveBtn;
    @FindBy(xpath = "//li[text()='Crypto']")
    public WebElement crypto;
    @FindBy(xpath = "//tr[@class=\"MuiTableRow-root tableRow \"][1]")
    public WebElement cryptocurrency;
    @FindBy(xpath = "(//tr[@class='MuiTableRow-root tableRow ']//child::td)[2]")
    public WebElement wallet;
    @FindBy(xpath = "//li[contains(text(),'Card')]")
    public WebElement card;
    @FindBy(xpath = "//td[contains(text(),' new card')]")
    public WebElement addNewCard;
    @FindBy(xpath = "(//tr[@class=\"MuiTableRow-root tableRow \"])[1]")
    public WebElement cardselect;
    @FindBy(xpath = "(//span[contains(text(),'change')]//parent::button[@type='button'])[5]")
    public WebElement phoneChange;
    @FindBy(xpath = "(//span[contains(text(),'change')]//parent::button[@type='button'])[6]")
    public WebElement faxChange;
    @FindBy(xpath = "(//span[contains(text(),'change')]//parent::button[@type='button'])[7]")
    public WebElement emialChange;
    @FindBy(xpath = "(//span[contains(text(),'change')]//parent::button[@type='button'])[8]")
    public WebElement postalmail;
    @FindBy(xpath = "(//span[contains(text(),'change')])[9]")
    public WebElement change5;
    @FindBy(xpath = "(//span[contains(text(),'change')])[10]")
    public WebElement preferredLanguage;
    @FindBy(xpath = "//li[5]")
    public WebElement firstLanguage;
    @FindBy(xpath = "//li[6]")
    public WebElement secondLanguage;
    @FindBy(xpath = "//li[8]")
    public WebElement thirdLanguage;
    @FindBy(xpath = "//p[contains(text(),'Language')]")
    public WebElement savedLanguage;
    @FindBy(xpath = "//span[contains(text(),'Marketing consent has successfully updated.')]")
    public WebElement message;
    @FindBy(xpath = "//li[2]")
    public WebElement firstCurrency;
    @FindBy(xpath = "//li[3]")
    public WebElement secondCurrency;
    @FindBy(xpath = "//li[4]")
    public WebElement thirdCurrency;
    @FindBy(xpath = "//p[contains(text(),'Currency')]")
    public WebElement savedCurrency;
    @FindAll({@FindBy(xpath = "//tr[@class='MuiTableRow-root tableRow ']")})
    public List<WebElement> countDebtorCreditCard;
//    @FindAll({@FindBy(xpath = "//tr[@class='MuiTableRow-root tableRow ']")})
    @FindAll({@FindBy(xpath = "(//table/tbody/tr)[not(position() = last())]")})
    public List<WebElement> countCard;
    @FindBy(xpath = "//table/tbody/tr[1]")
    public WebElement cardListFirstRow;
    @FindBy(xpath = "(//span[contains(text(),'XX')])")
    public WebElement savedCard;
    @FindBy(xpath = "//tr[@class='MuiTableRow-root tableRow '][last()]")
    public WebElement newlyAddedCard;
    @FindBy(id = "secret_code")
    WebElement otp;
    @FindBy(xpath = "//span[text()='CONFIRM']")
    WebElement otpConfirmBtn;
    @FindBy(xpath = "//span[text()=\"Logout\"]")
    WebElement logoutBtn;
    @FindBy(xpath = "//input[@id=\"email\"]")
    WebElement email;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement submit;
    @FindBy(xpath = "//input[@id=\"password\"]")
    WebElement password;
    @FindBy(xpath = "//input[@id=\"code\"]")
    WebElement loginOtp;
    @FindBy(xpath = "//div[contains(text(),'selecting automatic')]")
    WebElement automaticWarningMsg;
    @FindBy(xpath = "//li[text()='Accounts']")
    WebElement accounts;
    @FindBy(xpath = "//span[contains(text(),'Automatic') or contains(text(),'automatic') ]")
    WebElement savedAutomaticMethod;
    @FindBy(xpath = "//span[@class='section-body-image-text-value'][2]")
    WebElement savedWallet;

    public Settings_Page(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void settingsBtnClick() {
        settingsBtn.click();
    }

    public void changePassClick() {
        changePass.click();
    }

    public void inputCurrentPass() {
        currentPass.sendKeys("Tt123#123#");
    }

    public void inputNewPass() throws InterruptedException {
        newPass.sendKeys("Tt123#123");
        Thread.sleep(200);
        confirmNewPass.sendKeys("Tt123#123");
        Thread.sleep(300);
    }

    public void changePassBtnClick() throws InterruptedException {
        changePassBtn.click();
        Thread.sleep(2000);
    }

    public void inputOtp() throws Exception {
        Thread.sleep(2000);
        otp.sendKeys(BaseData.BaseOtp());
    }

    public void confirmBtnClick() {
        otpConfirmBtn.click();
    }

    /**
     *This will Log in the portal using newly changed password
     */
    public void logoutandLogin() throws Exception {
        logoutBtn.click();
        Thread.sleep(3000);
        email.sendKeys(BaseData.BaseEmail());
        Thread.sleep(1000);
        submit.click();
        Thread.sleep(3000);
        password.sendKeys("Tt123#123");
        Thread.sleep(1000);
        submit.click();
        Thread.sleep(500);
        loginOtp.sendKeys(BaseData.BaseOtp());
        Thread.sleep(500);
        submit.click();
        Thread.sleep(9000);
    }

    /**
     *This will change back the password to "Tt123#123#"
     */
    public void backtoPrevious() throws Exception {
        settingsBtn.click();
        Thread.sleep(2000);
        changePass.click();
        Thread.sleep(2000);
        currentPass.sendKeys("Tt123#123");
        Thread.sleep(200);
        newPass.sendKeys("Tt123#123#");
        Thread.sleep(200);
        confirmNewPass.sendKeys("Tt123#123#");
        Thread.sleep(1000);
        changePassBtn.click();
        Thread.sleep(500);
        Thread.sleep(2000);
        otp.sendKeys(BaseData.BaseOtp());
        Thread.sleep(2000);
        otpConfirmBtn.click();
        Thread.sleep(10000);
    }

    public String savedBilingMethodCheck() {
        return savedMethod.getText();
    }

    public void changeBillingMethodBtnClick() {
        changeBillingMethodBtn.click();

    }

    public void setBillingMethodBtnClick() {
        setBillingMethodBtn.click();

    }

    /**
     * This will click Change billing Method dropdown in Settings page
     */
    public void methodDropdown() {
        dropdown.click();
    }

    public void automaticClick() {
        automatic.click();
    }

    public boolean automaticWarningMsgCheck() {
        return automaticWarningMsg.isDisplayed();
    }

    public void saveBtnClick() throws InterruptedException {
        saveBtn.sendKeys(Keys.PAGE_DOWN);
        Thread.sleep(1000);
        saveBtn.click();
    }

    public boolean savedAutomaticCheck() {
        return savedAutomaticMethod.isDisplayed();
    }

    public void crypto() {
        crypto.click();
    }

    public void cryptoCurrency() {
        cryptocurrency.click();
    }

    public void accountsClick() {
        accounts.click();
    }

    public void firstWalletClick() {
        wallet.click();
    }

    public String getSavedWalletNum() {
        String number = savedWallet.getText();
        return number;
    }

    public boolean savedWalletCheck() {
        return savedWallet.isDisplayed();
    }

    public void card() {
        card.click();
    }

    public void addNewCardClick() {
        addNewCard.click();
    }

    public void cardClick() {
        cardselect.click();
    }

    public void phoneChangeBtnClick() throws InterruptedException {
        emialChange.sendKeys(Keys.PAGE_DOWN);
        Thread.sleep(5000);
        phoneChange.click();
    }

    public void faxChangeBtnClick() {
        faxChange.click();
    }

    public void emailChangeBtnClick() {
        emialChange.click();
    }

    public void postalmailChangeBtnClick() throws InterruptedException {
        postalmail.click();
    }

    public boolean sucessMessageCheck() {
        return message.isDisplayed();
    }

    public void Change5() {
        change5.click();
    }

    public void prefLanguageBtnCLik() {
        preferredLanguage.click();
    }

    public void Dropdown() throws InterruptedException {
        dropdown.click();
    }

    public void firstCurrencyClick() {
        firstCurrency.click();
    }

    public void secondCurrencyClick() {
        secondCurrency.click();
    }

    public void thirdCurrencyClick() {
        thirdCurrency.click();
    }

    /**
     *This will check if saved currency and Language name is appeared in settings page
     */
    public boolean savedSettingsCheck() {
        String currency = savedCurrency.getText();
        String language = savedLanguage.getText();
        if ((currency.contains("USD") || currency.contains("EUR") || currency.contains("GBP")) && (language.contains("English")
                || language.contains("Español") || language.contains("German"))) {
            return savedCurrency.isDisplayed();
        }
        return false;
    }

    public void firstLanguageClick() {
        firstLanguage.click();
    }

    public void secondLanguageClick() {
        secondLanguage.click();
    }

    public void thirdLanguageClick() {
        thirdLanguage.click();
    }

    //To get card count Before adding card
    public int prevCardCount() {
        previousCardCount = countDebtorCreditCard.size();
        System.out.println("Prev card count " + previousCardCount);
        return previousCardCount;

    }

    /**
     * To get card count after adding card
     */
    public int afterCardCount() {
        afterCardCount = countCard.size();
        return afterCardCount;
    }

    /**
     * To check if list is empty or not
     */
    public void savedCardListCheck() {
        if (cardListFirstRow.getText().equals("No card found!")) {
            previousCardCount = 0;
        } else {
            previousCardCount = countCard.size();
        }
    }

    /**
     * For stripe same card number shouldn't appear twice in the list
     * 5105105105105100 card will be saved
     * This method is applicable for both:
     * 1. If there is no saved card in the list
     * 2. If 5105105105105100 is already in the list
     */
    public boolean addedCardCheck() {
        if (previousCardCount == 0) {
            if (afterCardCount == 1 && BaseData.stripeCardNumber().contains(cardListFirstRow.getText().substring(12)))
                return true;
        }
        else if (previousCardCount > 0) {
            List<String> matchedCard = new ArrayList<>();
            for (WebElement card : countCard) {
                String cardNum = card.getText();
                if (addCardNum.contains(cardNum.trim().substring(12))) {
                    System.out.println("cardNum: "+cardNum);
                    matchedCard.add(cardNum);
                }
            }
            System.out.println("Matched card count:" + matchedCard.size());
            if (matchedCard.size() == 1) {
                return true;
            }
        }
            return false;
    }


    /**
     *
     * This method will select a saved card ending with 4444 (we added this card in previous scenario)
     */
    public void selectAddedCard() throws InterruptedException {
        for (WebElement card : countCard) {
            String cardNum = card.getText();
            if (addCardNum.contains(cardNum.trim().substring(12))) {
                card.click();
                Thread.sleep(1000);
                saveBtn.sendKeys(Keys.PAGE_DOWN);
                Thread.sleep(500);
                saveBtn.click();
                Thread.sleep(3000);
            }
            break;
        }
    }

    public boolean verifyAddedCard() {
        return previousCardCount < afterCardCount;
    }

    public void newlyAddedCardClick() {
        newlyAddedCardNumber = newlyAddedCard.getText();
        newlyAddedCard.click();
    }

    public boolean verifySavedCard() {
        System.out.println(savedMethod.getText().trim());
        System.out.println(savedMethod.getText().trim().substring(12));
        return addCardNum.contains(savedMethod.getText().trim().substring(12));

    }

}

