import java.util.LinkedList;
import java.util.Queue;

public class ExtendedOperationsForTST<Value> extends TST<Value> {

    public Iterable<String> keys() {
        return keysWithPrefix("");
    }

    public String longestPrefixOf(String query) {
        int length = searchPrefix(root, query, 0, 0);
        return query.substring(0, length);
    }

    public Iterable<String> keysWithPrefix(String prefix) {
        Queue<String> results = new LinkedList<>();
        Node x = get(root, prefix, 0);
        if (x == null) return results;
        if (x.val != null) results.add(prefix);
        collect(x.mid, new StringBuilder(prefix), results);
        return results;
    }

    public Iterable<String> keysThatMatch(String pattern) {
        Queue<String> results = new LinkedList<>();
        collect(root, new StringBuilder(), 0, pattern, results);
        return results;
    }

    private void collect(Node x, StringBuilder prefix, Queue<String> results) {
        if (x == null) return;
        collect(x.left, prefix, results);
        if (x.val != null) results.add(prefix.toString() + x.c);
        collect(x.mid, prefix.append(x.c), results);
        prefix.deleteCharAt(prefix.length() - 1);
        collect(x.right, prefix, results);
    }

    private void collect(Node x, StringBuilder prefix, int i, String pattern, Queue<String> results) {
        if (x == null) return;
        char c = pattern.charAt(i);
        if (c == '.' || c < x.c) collect(x.left, prefix, i, pattern, results);
        if (c == '.' || c == x.c) {
            if (i == pattern.length() - 1 && x.val != null) results.add(prefix.toString() + x.c);
            if (i < pattern.length() - 1) {
                collect(x.mid, prefix.append(x.c), i+1, pattern, results);
                prefix.deleteCharAt(prefix.length() - 1);
            }
        }
        if (c == '.' || c > x.c) collect(x.right, prefix, i, pattern, results);
    }

    private int searchPrefix(Node x, String query, int d, int length) {
        if (x == null) return length;
        if (x.val != null) length = d;
        if (d == query.length()) return length;
        char c = query.charAt(d);
        if (c < x.c) return searchPrefix(x.left, query, d, length);
        else if (c > x.c) return searchPrefix(x.right, query, d, length);
        else return searchPrefix(x.mid, query, d+1, length);
    }
}