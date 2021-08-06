import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdicionarProdutoAoCarrinho {

    private ChromeDriver driver;

    @Dado("primeiro iniciar o driver")
    public void primeiroIniciarODriver(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        // indica aonde está localizado o driver do chrome
        driver = new ChromeDriver();
        // faz uma instancia dele
    }

    @Entao("^que um usuario acesse o site \"([^\"]*)\"$")
    public void queUmUsuarioAcesseOSite(String parametroSite){
        WebDriverWait wait = new WebDriverWait(driver, 5);

        driver.get(parametroSite);
    }

    //@Entao("^pesquisa pelo produto \"([^\"]*)\"$")
    //public void pesquisaPeloProduto(String arg0){

    //}

    @AfterAll
    public void depois(){
        if(driver != null) {
            //driver.close();
            //driver.quit();
            //driver = null;
        }
    }


    /*
    @Quando("^adiciona o produto \"([^\"]*)\" ao carrinho$")
    public void adicionaOProdutoAoCarrinho(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Entao("^o produto \"([^\"]*)\" deve estar no carrinho$")
    public void oProdutoDeveEstarNoCarrinho(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }
    */



}
