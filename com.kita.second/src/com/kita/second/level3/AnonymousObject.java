package com.kita.second.level3;

public class AnonymousObject {//익명객체
	public static void main(String[] args) {
		ParentAO p = new ChildAO();
		ChildAO c = (ChildAO)p;
		c.childMethod();
		p.parentMethod();
		
		ParentAO p2 = new ParentAO() {
			int childField;
			
			@Override
			void parentMethod() {}
			
			void childMethod() {}
		};
	}

}

class ParentAO{
	int parentField;
	
	void parentMethod() {}
}

class ChildAO extends ParentAO {
	int childField;
	
	@Override
	void parentMethod() {}
	
	void childMethod() {}
}