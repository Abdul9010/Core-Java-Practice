
public class Transfer {

	public static void main(String[] args) {
		
		// key words for transfer statements are continue and break
		
		for (int i = 0; i < 10; i++) {
			if (i == 4) {
				continue; // iteration will skip 4 value as i equals to 4
				
			}
			System.out.println(i);
		}
		for (int i = 0; i < 10; i++) {
			if (i == 7) {
				break; // iteration will break at 7
				
			}
			System.out.println(i);
		}

	}

}
