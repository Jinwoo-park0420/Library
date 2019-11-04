package com.spring.domain;

import java.util.Date;



import lombok.Data;

@Data
public class MemberVO {
private String name; //ȸ���̸�
private int memberno; //ȸ����ȣ
private String userid; //ȸ�����̵�
private String password; //��й�ȣ
private String current_password;//��й�ȣȮ��
private String email; //�̸��� 
private String address; //���ּ�
private String phone_number; //�ڵ�����ȣ
private String gender; //����
private int grade; //�������


private String birth; //�������


private int lease_status; //�뿩����
private int jumin; //�ֹε�Ϲ�ȣ 
}
