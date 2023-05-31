package br.com.alura.leilao;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWorldSelenium {

	@Test
	public void helloTest() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver browser = new ChromeDriver();

		//o link: http://localhost:8080/leiloes deve ser copiado ao rodar a classe Main e abrir o endereço "localhost:8080" na máquina
		browser.navigate().to("http://localhost:8080/leiloes");
	}

}
