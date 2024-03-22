package MYST.ch15.exam02;

import java.util.List;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Board> list = new Vector<>();

		Thread threadA = new Thread() {
			public void run() {
				for (int i = 1; i <= 100; i++) {
					list.add(new Board("제목" + i, "내용" + i, "글쓴이" + i));
				}
			}
		};
		Thread threadB = new Thread() {
			public void run() {
				for (int i = 101; i <= 200; i++) {
					list.add(new Board("제목" + i, "내용" + i, "글쓴이" + i));

				}
			}
		};
		threadA.start();
		threadB.start();
		
		try {
			threadA.join();
			threadB.join();
		} catch(Exception e) {
			
		}
		int size = list.size();
		System.out.println("총객체 수:" + size);
//		System.out.println();

	}

}
