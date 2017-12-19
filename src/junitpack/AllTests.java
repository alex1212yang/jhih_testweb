package junitpack;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({junit_add_camera.class,junit_purchase_plan.class, junit_camera_setting.class,junit_oauth_account_setting.class
 })
//junit_create_account.class,junit_login.class
//,junit_add_camera.class,junit_purchase_plan.class, junit_camera_setting.class,junit_account_setting.class
public class AllTests {

}
