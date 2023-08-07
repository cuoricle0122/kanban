# 칸반보드 만들기

## 1일차
<details>
    <summary>작업 내용</summary>
    1. 의존성 추가<br>
    2. 톰캣 서버 셋팅<br>
</details>

## 2일차
* 초기설정
  - 데이터베이스 연결 설정 (MyBatis)
    - 작업 내용
    - 테이블명 workList
      - workNo INT, PK, AI : 작업 번호
      - userNo INT, FK : 회원 번호
      - status ENUM('READY', 'PROGRESS', 'DONE', 'POSTPONE') / NN / DEFAULT READY: 작업 상태
      - subject VARCHAR(255) / NN : 작업명
      - content LONGTEXT : 작업 상세 내용
      - regDt DATETIME DEFAULT NOW() : 작업 등록 일시
      - modDt DATETIME : 작업 수정일시
* 레이아웃 구성
* 모델, 뷰, 컨트롤러 개념 (MVC)
  - M(모델, Model) : 기능 (Service)
    - DTO(Data Transfer Object) : 데이터 전달용 객체
      - VO(Value Object)
    - DAO(Data Access Object) : 데이터 접근 객체(데이터 추가, 조회, 수정, 삭제)
    - 기타 필요 객체
  - V(뷰, View) : 출력(응답) → jsp
  - C(컨트롤러, Controller) 구성
    - 요청과 응답의 중재자 → servlet
* 모델, 뷰, 컨트롤러 구성하기 (MVC)
  - 컨트롤러 구성
    - 회원쪽 컨트롤러
      - 회원가입 - /member/join
      - 로그인 - /member/login
      - 정보수정 - /member/info
    - 작업관리 컨트롤러
      - 작업목록 - /works
      - 작업등록 - /works/add
      - 작업조회 - /works/작업번호
      - 작업수정 - /works/edit/등록번호
      - 작업삭제 - /works/delete/등록번호

## 3일차
* 모델 구성
* 뷰 구성
* 칸반 등록, 수정, 삭제, 조회
    
