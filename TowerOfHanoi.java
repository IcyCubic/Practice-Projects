
//Java Textbook Chapter 5 Lab question #1 - Produce a program to solve the Tower of Hanoi with 64 discs.
/*
Pseudo-code:
set up towers
design recursive algorithm for tower game
rules: larger disc cannot move onto smaller disc
			 discs can only be moved one at a time.
Objective: move all discs from tower 1 to tower 3

 2 disc tower:
 
 1->2 <- 1 move before
 1->3 <-- mid point
 2->3 <- 1 move after
 
 3 disc tower:
 
 1->3
 1->2 <- 3 moves before
 3->2
 1->3 <-- mid point
 2->1
 2->3 <- 3 moves after
 1->3
 
 4 disc tower:
 
 1->2
 1->3
 2->3
 1->2 <- 7 moves before
 3->1
 3->2
 1->2
 1->3 <-- mid point
 2->3
 2->1
 3->1
 2->3 <- 7 moves after
 1->2
 1->3
 2->3
 
 If there's one disc, move disc from start tower to end tower.
 
 If there's more than one disc, move (n-1) stack of discs from start tower to aux tower,
 	move disc from start tower to end tower
 	move (n-1) stack of discs from aux tower to end tower.
 
*/


public class TowerOfHanoi {
		public static void solve (int numd, int from, int dest, int aux) {
				if (numd==1)
					System.out.println(from + " --> " + dest);
				else {
					solve(numd-1, from, aux, dest);
					System.out.println(from + " --> " + dest);
					solve(numd-1, aux, dest, from);
				}
			}
		
		public static void main(String[] args){
		  int numDiscs = 4, fromTower = 1, auxTower = 2, toTower = 3;
			
			solve(numDiscs, fromTower, toTower, auxTower);		
		}	
}