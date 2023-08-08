<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="layout" tadir="/WEB-INF/tags/layouts" %>
<c:url var="action" value="/wokrs/edit" />
<layout:main title="작업 수정">
    <form name="frmSave" method="POST" action="${action}" autocomplete="off">
        <jsp:include page="_form.jsp" />

        <div class="btns">
           <button type="reset">다시입력</button>
           <button type="submit">등록하기</button>
        </div>
    </form>
</layout:main>