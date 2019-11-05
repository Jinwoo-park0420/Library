package com.spring.domain;

import java.util.Date;

public class BookVO {
	private String b_code; //도서번호
	private String b_name; //도서이름
	private String b_genre; //도서장르(카테고리)
	private String b_writer; //도서저자
	private Date newbookdate; //신간도서 날짜
	private Date lenbookdate; //대여 날짜
}
