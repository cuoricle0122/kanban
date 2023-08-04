package controllers.member;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * - 회원가입 - /member/join
 * - 로그인 - /member/login
 * - 정보수정 - /member/info
 */
@WebServlet("/member/*")
public class MemberController extends HttpServlet {

    private MemberURLRouter router;

    @Override
    public void init(ServletConfig config) throws ServletException {
        router = new MemberURLRouter();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        router.route(req, resp, "member");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}