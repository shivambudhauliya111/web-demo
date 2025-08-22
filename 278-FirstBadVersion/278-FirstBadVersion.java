// Last updated: 8/22/2025, 4:45:05 PM
public class Solution extends VersionControl {
  public int firstBadVersion(int n) {
    int l = 1;
    int r = n;

    while (l < r) {
      final int m = l + (r - l) / 2;
      if (isBadVersion(m))
        r = m;
      else
        l = m + 1;
    }

    return l;
  }
}