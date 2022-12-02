package example.jsp.custom_tag;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class SysDateImpl extends TagSupport {
	
	@Override
	public int doStartTag() throws JspException {
		//Gets called by a container when it encounters Starting of the tag
		return EVAL_BODY_INCLUDE;//SKIP_BODY
	}
	
	@Override
	public int doEndTag() throws JspException {
		//Gets called by a container when it encounters Ending of the tag
		JspWriter out = pageContext.getOut();
		LocalDate sysDate = LocalDate.now();
		String responseHTML = "<h2>Today's date: " + sysDate + "</h2>";
		try {
			out.println(responseHTML);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return EVAL_PAGE;//SKIP_PAGE
	}
	

}







