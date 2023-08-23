package ch02.datastructure;

public class MyListNode {
	private String data;
	public MyListNode next;//다음 Node
	
	public MyListNode() {
		this.data = null;
		this.next = null;
	}
	
	public MyListNode(String data) {
		this.data = data;
		this.next = null;
	}
	
	public MyListNode(String data, MyListNode link) {
		super();
		this.data = data;
		this.next = link;
	}
	//data는 private이므로 getter생성
	public String getData() {
		return data;
	}
}
