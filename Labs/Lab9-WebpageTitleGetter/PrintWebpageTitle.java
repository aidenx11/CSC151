import java.util.*;
import java.io.*;
import java.net.*;
/**
 * Program to query web pages for their HTML title elements
 * @author Schroeder
 */
public class PrintWebpageTitle {

	/**
	 * Start the program running and query the array of URL's for their title elements, then print to standard output
	 * @param args command line arguments
	 */
	public static void main(String[] args) {
		System.out.println("NOTE: Some characters/titles may appear as question marks if your OS does not have the correct language\npacks installed and initialized; e.g. Russian for https://www.pravdareport.com.\n");
		try {
			String[] urls = {"https://www.pravdareport.com", "https://pravda.ru", "https://www.lefigaro.fr", "https://www.independent.co.uk"};
			String title = "";
			for (int i = 0; i < urls.length; i++) {
				title = findTitle(urls[i]);
				System.out.println("Title of " + urls[i] + " ----- " + "\"" + title + "\"");
			}
			
		} catch (MalformedURLException ex) {
			
			System.out.println("A MalformedURLException has occured. Make sure the given URL's are valid.");
			ex.printStackTrace();
			System.exit(0);
			
		} catch (UnknownHostException ex) {
			
			System.out.println("An UnknownHostException has occured. Make sure the given URL's are valid.");
			ex.printStackTrace();
			System.exit(1);
			
		} catch (IOException ex) {
			
			System.out.println("An IOException has occured.");
			ex.printStackTrace();
			System.exit(2);
			
		} catch (URISyntaxException ex) {
			System.out.println("A URISyntaxException has occured.");
			ex.printStackTrace();
			System.exit(3);
		}
	}
	
	/**
	 * Queries a given URL for its title element
	 * @param link URL to be queried
	 * @return title element of web page, or message if there is no title element
	 * @throws MalformedURLException if a malformed URL was given
	 * @throws UnknownHostException if a host cannot be found from the given URL
	 * @throws IOException if an input or output exception occurred
	 * @throws URISyntaxException if the syntax for the URL cannot be used for the URI
	 */
	public static String findTitle(String link) 
		throws MalformedURLException, UnknownHostException, IOException, URISyntaxException{
		
		URL url;
		Scanner input;
		int startOfTitle;
		int endOfTitle;
		String line = "";
		String title = "";
		
		/**
		 * declare url variable and open a data stream to the given URL
		 */
		url = new URI(link).toURL(); //URL(link) no longer works as it was deprecated in java 20, so .toURL() was added.
		input = new Scanner(url.openStream());
		
		while (input.hasNextLine()) {
			line = input.nextLine();
				
			if (line.contains("<title>")) {
				startOfTitle = line.indexOf("<title>") + 7;
				endOfTitle = line.indexOf("</title");
				title = line.substring(startOfTitle, endOfTitle);
			}
		}
		input.close();
		
		if (title.length() != 0) {
			return title;
		} else {
			return ("No <title> was found in " + link);
		}

	}
}
