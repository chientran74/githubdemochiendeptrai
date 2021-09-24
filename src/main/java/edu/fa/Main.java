package edu.fa;

import edu.fa.business.PageVisitor;
import edu.fa.model.Page;
import edu.fa.model.User;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Page page = new Page("Homepage", "http://fresher.academy");
        User[] users=new User[2017];
        for(int i=0;i<users.length;i++) {
        	users[i]=new User("User "+i);
        	System.out.println(users[i]+ "signed in");
        	
        }
        PageVisitor pageVisitor=new PageVisitor();
        int index=0;
        while(true) {
        	index=(int) Math.round(Math.random()*2016);
        	pageVisitor.visit(users[index], page);
		
        }
	}
<<<<<<< HEAD
    int i=0,c;
=======
    int i=0,b;
>>>>>>> f9d15dd6f22e6e157ed2d8fe3aa29cf0bb0d32bc
}
