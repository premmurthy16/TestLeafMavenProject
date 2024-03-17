package week3.day1;

public class Chrome extends Browser {

	public static void main(String[] args) {

		Chrome chrome = new Chrome();

		chrome.clearCache();

		chrome.openIncognito();

		chrome.openURL();
		chrome.navigateBack();
		chrome.closeBrowser();

	}

	public void clearCache() {

		System.out.println("Chrome --> clearCache ");

	}

	public void openIncognito() {

		System.out.println("Chrome --> openIncognito ");

	}

}
