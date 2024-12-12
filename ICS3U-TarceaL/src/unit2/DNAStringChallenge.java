package unit2;

/**
 * Description: Counts number of A's, C's, G's, and T's in a string of DNA
 * Date: 26/11/24
 * @author Luca Tarcea
 */

public class DNAStringChallenge {
	/**
	 * Entry point to the program.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// A string is simply an ordered collection of symbols selected from some
		// alphabet and formed into a word; the length of a string is the number of
		// symbols that it contains.
		// An example of a length 21 DNA string (whose alphabet contains the symbols
		// 'A', 'C', 'G', and 'T') is "ATGCTTCAGAAAGGTCTTACG."
		// Given: A DNA string s of length at most 1000 nt.
		// Return: Four integers (separated by spaces) counting the respective number of
		// times that the symbols 'A', 'C', 'G', and 'T' occur in s

		String dna = "AGCTTTTCATTCTGACTGCAACGGGCAATATGTCTCTGTGTGGATTAAAAAAAGAGTGTCTGATAGCAGC";
		int a = 0;
		int c = 0;
		int g = 0;
		int t = 0;
		for (int i = 0; i < dna.length(); i++) {
			if (dna.charAt(i) == 'A')
				a++;
			if (dna.charAt(i) == 'C')
				c++;
			if (dna.charAt(i) == 'G')
				g++;
			if (dna.charAt(i) == 'T')
				t++;
		}
		System.out.println(a + " " + c + " " + g + " " + t);

	}
}