package com.bread.vo;

public class CommentVO {
	
	private int commentNo;
	private int borderNo;
	private String commentWriter;
	private String commentContent;
	private String commentPasswd;
	private String commentDay;
	
	public CommentVO() {
		super();
	}
	
	public CommentVO(int commentNo, int borderNo, String commentWriter, String commentContent, String commentPasswd,
			String commentDay) {
		super();
		this.commentNo = commentNo;
		this.borderNo = borderNo;
		this.commentWriter = commentWriter;
		this.commentContent = commentContent;
		this.commentPasswd = commentPasswd;
		this.commentDay = commentDay;
	}

	public int getCommentNo() {
		return commentNo;
	}

	public void setCommentNo(int commentNo) {
		this.commentNo = commentNo;
	}

	public int getBorderNo() {
		return borderNo;
	}

	public void setBorderNo(int borderNo) {
		this.borderNo = borderNo;
	}

	public String getCommentWriter() {
		return commentWriter;
	}

	public void setCommentWriter(String commentWriter) {
		this.commentWriter = commentWriter;
	}

	public String getCommentContent() {
		return commentContent;
	}

	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
	}

	public String getCommentPasswd() {
		return commentPasswd;
	}

	public void setCommentPasswd(String commentPasswd) {
		this.commentPasswd = commentPasswd;
	}

	public String getCommentDay() {
		return commentDay;
	}

	public void setCommentDay(String commentDay) {
		this.commentDay = commentDay;
	}

	@Override
	public String toString() {
		return "CommentVO [commentNo=" + commentNo + ", borderNo=" + borderNo + ", commentWriter=" + commentWriter
				+ ", commentContent=" + commentContent + ", commentPasswd=" + commentPasswd + ", commentDay="
				+ commentDay + "]";
	}
	
	
}
