package mytree;

// AVL Tree = Height-Balanced (HB) Tree

public class DAA2 extends DAA1 {

	// 4. isHeightBalanced() [10 points]
	public static boolean isHeightBalanced(MyTree t) {
		// Write your codes in here
        //...
        // Write your codes in here
	}

	// 5. insertHB() [10 points]
	public static MyTree insertHB(int n, MyTree t) {
		// Write your codes in here
        //...
        // Write your codes in here
	}

	// rebalanceForLeft is called when the left subtree of t may have
	// grown taller by one notch.
	// If it is indeed taller than the right subtree by two notches,
	// return a height-balanced version of t using single or double rotations.
	// The subtrees of t are assumed to be already height-balanced and
	// no effort is made to rebalance them.
	//
	// Likewise, for the case of the right subtree -> rebalanceForRight
	// Both rebalanceForLeft & rebalanceForRight will be used by insertHB() and deleteHB()
	// 6. rebalanceForLeft() [15 points]
	private static MyTree rebalanceForLeft(MyTree t) {
		// Write your codes in here
        //...
        // Write your codes in here
	}
	
	// 7. rebalanceForRight() [15 points]
	private static MyTree rebalanceForRight(MyTree t) {
		// Write your codes in here
        //...
        // Write your codes in here
	}
	
	// 8. deleteHB() [10 points]
	/**
	 * Deletes the value 'x' from the given tree, if it exists, and returns the new
	 * Tree.
	 *
	 * Otherwise, the original tree will be returned.
	 */
	public static MyTree deleteHB(MyTree t, int x) {
		// Write your codes in here
        //...
        // Write your codes in here
	}

}