package edu.fa.business;

import edu.fa.model.Page;
import edu.fa.model.User;

public class PageVisitor {
public void visit(User user, Page page) {
	System.out.println(user+" visited "+page);
}
}
