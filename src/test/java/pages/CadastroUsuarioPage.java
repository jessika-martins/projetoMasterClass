package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import runner.RunTests;

public class CadastroUsuarioPage extends RunTests {
    //Elementos

    private By campoNome= By.id("user");
    private By campoEmail= By.id("email");
    private By campoSenha= By.id("password");
    private By botaoSalvarCadastro = By.id("btnRegister");



    public void preencherNome(String nome){

        getDriver().findElement(campoNome).sendKeys(nome);
    }
    public void preencherEmail(String email){

        getDriver().findElement(campoEmail).sendKeys(email);
    }
    public void preencherSenha(String senha){

        getDriver().findElement(campoSenha).sendKeys(senha);
    }
    public void clicarSalvarCadastro(){

        getDriver().findElement(botaoSalvarCadastro).click();
    }


    public void checkCadastroSucesso(){
        String textoEsperado = "Cadastro realizado!";
        // resultado esperado com o resultado atual
        String textoTela = getDriver().findElement(By.id("swal2-title")).getText();

        Assert.assertEquals(textoEsperado, textoTela);
    }

    }

