
class LinkedListMain {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		/*list.add(70);
        list.add(30);
        list.add(56);
		list.append(56);
        list.append(30);
        list.append(70);*/
		list.add(70);
        list.add(56);        
        list.insert(1, 30);
        list.insertAfter(30, 40);
        System.out.println(list.toString());
        list.delete(40);
        System.out.println(list.toString());
          
        
	}
}
