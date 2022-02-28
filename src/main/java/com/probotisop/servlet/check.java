package com.probotisop.servlet;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/check")
public class check extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		String url = request.getParameter("site");
		

		URL u = new URL(url);

		try {
			HttpURLConnection connection = (HttpURLConnection) u.openConnection();
			connection.setConnectTimeout(3000);
			connection.connect();

			if (connection.getResponseCode() == 200) {
				System.out.println("site is UP");
				String status = "SITE IS UP";
				request.setAttribute("status", status);
				RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
				rd.forward(request, response);

			}

			else {
				System.out.println("site is DOWN");
				request.setAttribute("status", "SITE IS UP !!");
				RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
				rd.forward(request, response);
			}
		}

		catch (Exception e) {
			System.out.println("TIMEOUT");
			request.setAttribute("status", "TIMEOUT , SEEMS DOWN");
			RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
			rd.forward(request, response);

		}
		
		

	}
}
