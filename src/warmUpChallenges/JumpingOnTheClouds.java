package warmUpChallenges;

public class JumpingOnTheClouds {

	public static void main(String[] args) {
		int[] clouds = { 0, 0, 1, 0, 0, 1, 0 };
		System.out.println(jumpingOnClouds(clouds));
	}

	static int jumpingOnClouds(int[] c) {

		int position = 0;
		int jumps = 0;

		while (position < c.length - 1) {
			if (position + 2 <= c.length - 1 && c[position + 2] == 1) {
				jumps++;
				position++;
			} else {
				jumps++;
				position += 2;
			}

		}

		return jumps;

	}
}
