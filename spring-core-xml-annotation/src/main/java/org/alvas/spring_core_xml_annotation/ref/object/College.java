package org.alvas.spring_core_xml_annotation.ref.object;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value = "myCollege")
public class College {
	@Autowired
	Branch branch;
	public void getCollege()
	{
		branch.getBranch();
	}
}
