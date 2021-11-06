package lt.ku.studentai.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;

import lt.ku.studentai.db.DB;
import lt.ku.studentai.entities.Student;

/**
 * Servlet implementation class StudentaiServlet
 */
@WebServlet("/")
public class StudentaiServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentaiServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Session session=DB.getSession();
		//Paimti vieną studentą
		//Student student= session.get(Student.class, 1);
		//System.out.println(student.getName());
		
		//Pridėti studentą
		/*
		session.beginTransaction();
		Student naujas=new Student(3, "Kazys");
		session.save(naujas);
		session.getTransaction().commit();
		session.close();
		*/
		
		//Pakoreguoti studentą
		/*
		session.beginTransaction();
		Student student=session.get(Student.class, 1);
		student.setName("Gediminas");
		session.update(student);
		
		session.getTransaction().commit();
		session.close();
		*/
		
		session.beginTransaction();
		Student naujas=new Student("Kazys", "Kazlauskas", "kazs@gmail.com", 1984);
		session.save(naujas);
		session.getTransaction().commit();
		session.close();
		
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
