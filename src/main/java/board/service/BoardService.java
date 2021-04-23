package board.service;

import java.util.List;

import board.vo.BoardVO;

public interface BoardService {
	public List<BoardVO> getBoardList();
	public void insertBoard(BoardVO vo);
	public BoardVO readBoard(Integer seq);
	public void updateBoard(BoardVO vo);
	public void deleteBoard(Integer seq);
}
