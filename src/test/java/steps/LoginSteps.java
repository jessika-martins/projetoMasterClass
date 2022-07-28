package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import org.junit.After;

import pages.LoginPage;
import runner.RunTests;




public class LoginSteps extends RunTests {


    LoginPage loginPage = new LoginPage();

    @Dado("^que estou na tela de login$")
    public void que_estou_na_tela_de_login() {



        loginPage.acessarAplicacao();
        loginPage.acessarTelaLogin();
    }

    @Dado("^preencho o e-mail \"([^\"]*)\" e senha \"([^\"]*)\"$")
    public void preencho_o_e_mail_e_senha(String email, String senha) {
        loginPage.preencherEmail(email);
        loginPage.preencherSenha(senha);

    }

    @Quando("^clico no botão de login$")
    public void clico_no_botão_de_login(){
        loginPage.clickLogin();

    }


    @Então("^sou logado com sucesso$")
    public void sou_logado_com_sucesso() {
       loginPage.checkLoginSucesso();
    }
    @Então("^vejo a mensagem de \"([^\"]*)\"$")
    public void vejo_a_mensagem_de(String mensagem) {
        loginPage.checkErrorLogin(mensagem);
    }
    }

