package communs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Communs {
	public static String URL = "https://www.github.com/login";

	public static void click(WebElement webEelement) {
		webEelement.click();
	}

	public boolean isDisplayElement(WebElement webElement) {
		return webElement.isDisplayed();
	}

	public static WebElement findElement(WebDriver driver, By locator) {
		return driver.findElement(locator);
	}

	public static boolean isEquals(String chaine, String chaineTest) {
		return chaine.equals(chaineTest);
	}

	public static boolean isEqualsTextWebElemennt(WebElement element, String text) {
		return isEquals(element.getText(), text);
	}

	public static boolean isEqualsCurrentUrl(WebDriver driver, String urlTest) {
		return isEquals(driver.getCurrentUrl(), urlTest);
	}

	public static List<WebElement> findElements(WebDriver driver, By locator) {
		return driver.findElements(locator);
	}

	public static String formatMdp(String chaine) {
		String result = chaine.replaceAll("[\\-\\+\\.\\^_:,*)//]", "");
		return result;
	}

	public static void sleep(int milliSeconde) {
		try {
			Thread.sleep(milliSeconde);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public String getText(WebElement webElement) {
		return webElement.getText();
	}

	public WebElement getWebElementIndice(List<WebElement> listWebElement, int indice) {
		return listWebElement.get(indice);
	}
}
