package e.exercises;

import java.util.List;
import java.util.stream.Collectors;

//Scenario:
//Given a list of emails, extract the unique domain names using Java Streams.

//input:
//List<String> emails = List.of(
//	    "alice@gmail.com", "bob@yahoo.com", "charlie@gmail.com", 
//	    "david@hotmail.com", "eve@yahoo.com"
//	);

//output:
//	[Gmail.com, Yahoo.com, Hotmail.com]

public class EmailDomainNames {

	public static void main(String[] args) {
		List<String> emails = List.of("alice@gmail.com", "bob@yahoo.com", "charlie@gmail.com", "david@hotmail.com",
				"eve@yahoo.com");
		getDomainname(emails);
	}

	private static void getDomainname(List<String> emails) {
		List<String> domains = emails.stream().map(email -> email.split("@")[1]).distinct().collect(Collectors.toList());
		System.out.println(domains);
	}

}
