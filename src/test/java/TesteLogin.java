import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteLogin {

	private WebDriver driver;
	
	@Before
	public void Setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chrome-driver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:4200/login");
	}
	
	@Test
	public void TestarLogin() {
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		WebElement inputEmail = driver.findElement(By.id("name-desktop"));
		WebElement inputSenha = driver.findElement(By.id("senha-desktop"));
		WebElement botaoLogin = driver.findElement(By.id("login-form-fazer-desktop"));
		
		String[] listaEmail = {"igor@email.com", "outro@email.com", "igor@email.com", "igor@email.com"};
		String[] listaSenhas = {"senha", "senha", "outro", "senha"};
		
		for(int tentativas = 0; tentativas < listaEmail.length; tentativas++) {
			try {
				inputEmail.clear();
				inputSenha.clear();
				
				inputEmail.sendKeys(listaEmail[tentativas]);
				inputSenha.sendKeys(listaSenhas[tentativas]);
				botaoLogin.click();
				
				Thread.sleep(3000);
				driver.switchTo().alert().accept();
				Thread.sleep(2000);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
}
