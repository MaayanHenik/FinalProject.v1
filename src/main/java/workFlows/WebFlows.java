package workFlows;

import com.google.common.util.concurrent.Uninterruptibles;
import extensions.UIActions;
import io.qameta.allure.Step;
import utilities.CommonOps;

import java.util.concurrent.TimeUnit;

public class WebFlows extends CommonOps {

    @Step("Business Flow: Login")
    public static void login(String user, String pass){
        UIActions.updateText(grafanaLogin.txt_username, user);
        UIActions.updateText(grafanaLogin.txt_password, pass);
        UIActions.click(grafanaLogin.btn_login);
        Uninterruptibles.sleepUninterruptibly(500, TimeUnit.MILLISECONDS);
    }

    @Step("Business Flow: Create Nwe User")
    public static void createNewUser(String name, String email, String userName, String pass){
        UIActions.click(grafanaServarAdminMain.btn_newUser);
        UIActions.updateText(grafanaAddNewUser.txt_name, name);
        UIActions.updateText(grafanaAddNewUser.txt_email, email);
        UIActions.updateText(grafanaAddNewUser.txt_userName,userName);
        UIActions.updateText(grafanaAddNewUser.txt_password, pass);
        UIActions.click(grafanaAddNewUser.btn_submit);
    }

    @Step("Business Flow: Delete New User")
    public static void deleteLastUser(){
        UIActions.click(grafanaServarAdminMain.rows.get(grafanaServarAdminMain.rows.size()-1));
        UIActions.click(grafanaEditUser.btn_deleteUser);
        UIActions.click(grafanaEditUser.btn_confirmDeleteUser);
    }

}
