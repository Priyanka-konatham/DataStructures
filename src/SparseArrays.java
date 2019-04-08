/*
 * There is a collection of input strings and a collection of query strings. For each query
 *  string, determine how many times it occurs in the list of input strings.

 * For example, given input strings=['ab','abc','ab'] and queries=['ab','abc','bc'],
 * result should be [2,1,0]
 * Function Description
 * Complete the function matchingStrings in the editor below. The function must return an
 * array of integers representing the frequency of occurrence of each query string in
 * strings.
 * matchingStrings has the following parameters:
 * strings - an array of strings to search
 *queries - an array of query strings
 */
import java.io.*;
import java.util.*;
public class SparseArrays {

    static int[] matchingStrings(String[] strings, String[] queries)
    {
        int[] cnt=new int[queries.length];
        for(int i=0;i<queries.length;i++)
        {
            for(int j=0;j<strings.length;j++)
            {
                if(strings[j].equals(queries[i]))cnt[i]++;
            }
        }
        return cnt;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int stringsCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] strings = new String[stringsCount];

        for (int i = 0; i < stringsCount; i++) {
            String stringsItem = scanner.nextLine();
            strings[i] = stringsItem;
        }

        int queriesCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] queries = new String[queriesCount];

        for (int i = 0; i < queriesCount; i++) {
            String queriesItem = scanner.nextLine();
            queries[i] = queriesItem;
        }

        int[] res = matchingStrings(strings, queries);

        for (int i = 0; i < res.length; i++) {
            bufferedWriter.write(String.valueOf(res[i]));

            if (i != res.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
