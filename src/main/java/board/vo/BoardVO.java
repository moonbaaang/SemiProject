package board.vo;

import org.springframework.stereotype.Component;

@Component("bvo")
public class BoardVO {
	int seq;
	String writer;
	String title;
	String content;
	int viewcount;
	
	public BoardVO() {}

	public BoardVO(int seq, String writer, String title, String content, int viewcount) {
		super();
		this.seq = seq;
		this.writer = writer;
		this.title = title;
		this.content = content;
		this.viewcount = viewcount;
	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getViewcount() {
		return viewcount;
	}

	public void setViewcount(int viewcount) {
		this.viewcount = viewcount;
	}
	
}
