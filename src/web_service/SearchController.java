package web_service;

public class SearchController
{
	private final SearchService _searchService = new SearchService();

	public String[] search(
		String serviceName,
		String fromDate,
		String toDate,
		String logType,
		String jobFilter,
		String countryFilter,
		//		int minScore, // Optional, default no value
		//		int maxScore, // Optional, default no value
		int offset,
		int limit,
		String sortBy,
		String sortDirection)
	{
		// Some processing here...

		return _searchService.search(
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
