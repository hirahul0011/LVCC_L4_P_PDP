

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ecommerce.EProductEntity;

/**
 * Servlet implementation class ProductDetails
 */
public class ProductDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductDetails() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		HttpSession session=request.getSession();
		EProductEntity epe = new EProductEntity();
		
		boolean isNumber=true;
		
		try {
			double test=Double.parseDouble(request.getParameter("price"))/10;
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			isNumber=false;
		}		
		
		
		if (isNumber) {
			
			epe.setpName(request.getParameter("pName"));
			epe.setpPrice(BigDecimal.valueOf((Double.parseDouble(request.getParameter("price")))));
			epe.setDateAdded(new Date());
			epe.setpHDD(request.getParameter("hdd"));
			epe.setpCPU(request.getParameter("cpu"));
			epe.setpRAM(request.getParameter("ram"));
			
			session.setAttribute("epe", epe);
			request.getRequestDispatcher("detailsDisplay.jsp").forward(request, response);
			
		}else {
			PrintWriter out=response.getWriter();
			request.getRequestDispatcher("index.jsp").include(request, response);
			out.println("<span style='color:red'>Invalid Price, Please try again!</span>");
		}
			
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
