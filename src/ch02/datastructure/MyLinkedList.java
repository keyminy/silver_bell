package ch02.datastructure;

public class MyLinkedList {

	private MyListNode head;
	int count;
	
	public MyLinkedList() {
		this.head = null;
		this.count = 0;
	}
	public MyListNode addElement(String data) {
		MyListNode newNode;
		if(head == null) {
			newNode = new MyListNode(data);
			//삽입할 곳이, 첫번째 element일 경우
			head = newNode;
		}else {
			//기존 요소가 존재함
			MyListNode current = this.head;
			while(current.next != null) {
				current = current.next;
			}
			newNode = new MyListNode(data);
			current.next = newNode;
		}
		count++;
		//새로 추가된 Node반환
		return newNode;
	}
	
	public MyListNode insertElement(int position,String data) {
		//5번째 위치 넣는다면, 4번째뒤에 삽입함
		MyListNode current = this.head;
		MyListNode newNode = new MyListNode(data);
		
		if(position < 0 || position > count) {
			System.out.println("추가 할 위치 오류 입니다. 현재 리스트의 갯수는 " + count + "개 입니다");
			return null;
		}
		//맨 앞 삽입
		if(position == 0) {
			newNode.next = this.head;
			this.head = newNode;
		}else {
			//삽입할 노드의 이전 prev알아야함
			MyListNode prevNode = null;
			for(int i = 0;i < position; i++) {
				prevNode = current; //prevNode = this.head
				current = current.next;
			}
			//2.새로운 Node생성
			//3.새로운 Node의 right붙이고
			newNode.next = prevNode.next;
			//3.새로운 Node의 left붙이고
			prevNode.next = newNode;
		}
		count++;
		return newNode;
	}
	public MyListNode removeElement(int position) {
		MyListNode current = head;
		
		if(position < 0 || position >= count) {
			System.out.println("삭제 할 위치 오류입니다. 현재 리스트의 갯수는 " + count + "개 입니다.");
			return null;
		}
		
		if(position == 0) {
			//그냥 head만 이동
			this.head = current.next;
		}else {
			//삭제할 position의 next값을 없애면됨
			MyListNode prevNode = null;
			for(int i=0; i < position; i++) {
				prevNode = current;
				current = current.next;
			}
			prevNode.next = current.next;
		}
		count--;
		System.out.println(position + "번째 항목 삭제되었습니다.");
		return current; //삭제된 녀석임
	}
	
	public String getElement(int position)
	{
		int i;
		MyListNode tempNode = head;
		
		if(position >= count ){
			System.out.println("검색 위치 오류 입니다. 현재 리스트의 개수는 " + count +"개 입니다.");
			return new String("error");
		}
		
		if(position == 0){  //맨 인 경우

			return head.getData();
		}
		
		for(i=0; i<position; i++){
			tempNode = tempNode.next;
			
		}
		return tempNode.getData();
	}

	public MyListNode getNode(int position)
	{
		int i;
		MyListNode tempNode = head;
		
		if(position >= count ){
			System.out.println("검색 위치 오류 입니다. 현재 리스트의 개수는 " + count +"개 입니다.");
			return null;
		}
		
		if(position == 0){  //맨 인 경우

			return head;
		}
		
		for(i=0; i<position; i++){
			tempNode = tempNode.next;
			
		}
		return tempNode;
	}

	public void removeAll()
	{
		head = null;
		count = 0;
		
	}
	
	public int getSize()
	{
		return count;
	}
	
	public void printAll()
	{
		if(count == 0){
			System.out.println("출력할 내용이 없습니다.");
			return;
		}
		
		MyListNode temp = head;
		while(temp != null){
			System.out.print(temp.getData());
			temp = temp.next;
			if(temp!=null){
				System.out.print("->");
			}
		}
		System.out.println("");
	}
	
	public boolean isEmpty()
	{
		if(head == null) return true;
		else return false;
	}

}
