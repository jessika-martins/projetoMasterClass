package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import runner.RunTests;

public class LoginPage extends RunTests {
    //Elementos
    private String URL = "http://automationpratice.com.br/";
    private By botaoAcessarLogin = By.className("fa-user");
    private By botaoCriarConta = By.id("createAccount");

    //Ações
    public void acessarAplicacao() {
        initDriver(System.getProperty("browser"));
        getDriver().get(URL);

    }

    public void acessarTelaLogin() {
        getDriver().findElement(botaoAcessarLogin).click();
    }
    public void preencherEmail(String email){
        getDriver().findElement(By.id("user")).sendKeys(email);
    }
    public void preencherSenha(String senha){
        getDriver().findElement(By.id("password")).sendKeys(senha);
    }
    public void clickLogin(){
        getDriver().findElement(By.id("btnLogin")).click();
    }
    public void checkLoginSucesso(){
        String textoEsperado = "Login realizado";
        // resultado esperado com o resultado atual
        String textoTela = getDriver().findElement(By.id("swal2-title")).getText();

        Assert.assertEquals(textoEsperado, textoTela);
    }
    public void checkErrorLogin(String mensagem){
        String mensagemTela = getDriver().findElement(By.className("invalid_input")).getText();
        Assert.assertEquals(mensagem,mensagemTela);
    }
    public void acessarCadastroUsuario(){
        getDriver().findElement(botaoCriarConta).click();
    }
}
