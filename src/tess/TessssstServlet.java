package tess;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class TessssstServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("Hello, world");
	}
}
