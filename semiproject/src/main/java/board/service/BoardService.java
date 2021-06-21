package board.service;

import java.util.List;

import board.vo.BoardVO;
import board.vo.PageVO;

public interface BoardService {
	public List<BoardVO> getBoardList();
	public List<BoardVO> getBoardList(PageVO vo);
	public void insertBoard(BoardVO vo);
	public BoardVO readBoard(Integer seq);
	public void updateBoard(BoardVO vo);
	public void deleteBoard(Integer seq);
	public BoardVO getOneBoard(Integer seq);
/*	public int count() throws Exception;
	public List listPage(int displayPost, int postNum) throws Exception;
*/
}
