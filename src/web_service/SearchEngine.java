package web_service;

public class SearchEngine
{
	public String[] search(
		String serviceName,
		String fromDate,
		String toDate,
		String logType, // Only values STANDARD or FREE_TEXT
		String jobNameFilter, // Optional
		String countryFilter,
		int offset, // Optional, default 0
		int limit, // Optional, default no value
		String sortBy, // JOB_NAME, COUNTRY
		String sortDirection) // Only ASC or DESC, Optional, default ASC
	{
		System.out.println("Searching...");
		return new String[] { "item1", "item2" };
	}
}
