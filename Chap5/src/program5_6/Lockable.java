//*******************************************
// Nathan Schnitzer
// Lockable interface
// 3/15/17
// This will create 4 abstract methods
//*******************************************

package program5_6;

public interface Lockable {
	public void setKey(int k);
	
	public void lock(int k);
	
	public void unlock(int k);
	
	public boolean locked();

}

/*
Output:
Heads
Heads
Heads
Tails
Tails
Heads
Heads
Tails
Tails
Tails
Locked
Locked
Locked
Locked
Locked
Heads
Heads
Heads
Tails
Heads
Locked
Locked
Locked
Locked
Locked
Tails
Tails
Tails
Tails
Tails
Locked
Locked
Locked
Locked
Locked
Heads
Heads

Lock Count:
15
Head Count:
11
Tail Count:
11

*/