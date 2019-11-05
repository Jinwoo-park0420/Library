package com.spring.domain;

import java.util.Date;

public class BookVO {
	private String Library_bookcode; //도서번호
	private String Library_bookname; //도서이름
	private String Library_bookgenre; //도서장르(카테고리)
	private String Library_bookwriter; //도서저자
	private Date Library_newbookdate; //신간도서 날짜
	private Date Library_lenbookdate; //대여 날짜
}
