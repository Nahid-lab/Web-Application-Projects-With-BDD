package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features",glue = "StepDefinations",

        tags = "@card_deposit_usd_us",
        plugin ={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        monochrome = true)


public class US_Full_Test_Runner {
}
/* ::::::::::::::::::::::::::::::::::::Note for tags::::::::::::::::::::::::::::::::::

*** @all_us   ----> All stable features for US members will run by this tag And FP,SEPA,WAR & ACH added with card top-up.

++++++++++++++++++++++++++++++++++++++++++++++++New Members Scenarios+++++++++++++++++++++++++++++++++++++++++++++++++++


1. @new_member_dc_us
 ---> popup-topup, virtual card purchase and activate using debit/credit card; m2m beneficiary creation; phy card activation scenarios for US members.
2. @new_member_acc
 ---> popup-topup using debit/credit card; virtual card purchase and activate using e-Wallet; m2m beneficiary creation; phy card activation scenarios for US members.

++++++++++++++++++++++++++++++++++++++++++++++++ Accounts Features ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
*** All Wallet Features:
1. @all_wallet_features_us        ---> All wallet (USD,EUR,GBP,JPY,CNY) features for US members will run by this tag

*** Individual Wallet feature:
1. @usd_all_features_us            ---> Only USD wallet features for US members will run by this tag
2. @euro_all_features_us           ---> Only Euro wallet features for US members will run by this tag
3. @gbp_all_features_us            ---> Only GBP wallet features for US members will run by this tag
4. @jpy_all_features_us            ---> Only JPY wallet features for US members will run by this tag
5. @cny_all_features_us            ---> Only CNY wallet features for US members will run by this tag

++++++++++++++++++++++++++++++++++++++++++++++++ Cards Features +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
*** All Cards Features:
1. @all_card_features   ---> All card (both physical and virtual) features will run by this tag
2. @all_Vcard_features   ---> Only all  Virtual card features will run by this tag
3. @cs_card_topup_us    ---> All card (both physical and virtual) topup feature for Club Swan US members only.

*** Individual Cards Features:
1.@all_phy_card_feature      ----> All physical card's feature(US and Non-US) will run by this tag.
2.@all_first_Vcard_feature   ----> All first virtual card's feature(US and Non-US) will run by this tag.
3.@all_second_Vcard_feature  ----> All second virtual card's feature(US and Non-US) will run by this tag.
4.@all_third_Vcard_feature   ----> All third virtual card's feature(US and Non-US) will run by this tag.


+++++++++++++++++++++++++++++++++++++++++++++++ Others +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
***  @others --> all features in this block will run by this tag

1. @concierge   --->  Concierge feature will run by this tag
2. @inst_reward_feature   ---> Instant Reward feature will run by this tag
3. @settings   ---> All settings feature will run by this tag
4. @shopping   ---> All shopping feature will run by this tag
5. @logout     ---> this will do logout

*/






