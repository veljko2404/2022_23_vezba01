package web_service;

public class SearchService
{
	private final SearchEngine _searchEngine = new SearchEngine();

	public String[] search(
		String serviceName,
		String fromDate,
		String toDate,
		String logType,
		String jobFilter,
		String countryFilter,
		int offset,
		int limit,
		String sortBy,
		String sortDirection)
	{
		// Some processing here...

		return _searchEngine.search(
			serviceName,
			fromDate,
			toDate,
			logType,
			jobFilter,
			countryFilter,
			offset,
			limit,
			sortBy,
			sortDirection);
	}
}
