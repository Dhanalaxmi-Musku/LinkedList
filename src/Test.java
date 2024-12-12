import static org.junit.jupiter.api.Assertions.*;
class Test {

	@org.junit.jupiter.api.Test
	void test() {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(70);
        list.add(56);        
        list.insert(1, 30);
		assertTrue(list.search(30));
		assertFalse(list.search(40));
		
	}

}
