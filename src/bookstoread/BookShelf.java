package bookstoread;

import java.time.Year;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BookShelf {
	private final List<Book> books = new ArrayList<>();

	public List<Book> books() {
		return Collections.unmodifiableList(books);
	}

	public void add(Book... booksToAdd) {
		Arrays.stream(booksToAdd).forEach(book -> books.add(book));

	}

	public List<Book> arrange() {
		return arrange(Comparator.naturalOrder());
	}

	public List<Book> arrange(Comparator<Book> criteria) {
		return books.stream().sorted(criteria).collect(Collectors.toList());
	}

	public Map<Year, List<Book>> groupByPublicationYear() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
