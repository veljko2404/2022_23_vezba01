package formatting;

public class StringStatsArray { private final String[] stats; public StringStatsArray(String[] a) { stats =
	a; } public String toString() { String ret = "{"; for (String check: stats) { ret += "\"" + check + "\", "
; } ret = ret.substring(0, ret.length() - 2) + "}"; return ret; } public double averageLength() { double
	sum = 0; for (String check: stats) { sum += check.length(); } return sum / (double) stats.length; } public
int search(String target) { for (int i = 0; i < stats.length; i++) { if (stats[i].equals(target)) { return
	i; } } return -1; } public int sortStatus() { if (stats.length <= 1) { return 1; } if ((int) stats[0]
	.charAt(0) < (int) stats[1].charAt(0)) { for (int i = 0; i < stats.length - 1; i++) { if ((int) stats[i]
	.charAt(0) > (int) stats[i + 1].charAt(0)) { return 0; } } return 1; } else if ((int) stats[0].charAt(0) >
	(int) stats[1].charAt(0)) { for (int i = 0; i < stats.length - 1; i++) { if ((int) stats[i].charAt(0) <
	(int) stats[i + 1].charAt(0)) { return 0; } } return -1; } else { for (int i = 0; i < stats.length - 1; i
	++) { if ((int) stats[i].charAt(0) < (int) stats[i + 1].charAt(0)) { for (int j = i; j < stats.length - 1;
																			  j++) { if ((int) stats[j].charAt(0) > (int) stats[j + 1].charAt(0)) { return 0; } } return 1; } if ((int)
	stats[i].charAt(0) > (int) stats[i + 1].charAt(0)) { for (int j = i; j < stats.length - 1; j++) { if ((int
	) stats[j].charAt(0) < (int) stats[j + 1].charAt(0)) { return 0; } } return -1; } } return 1; } } }
