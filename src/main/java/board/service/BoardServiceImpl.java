package board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import board.dao.BoardDAO;
import board.vo.BoardVO;

@Service("service")
public class BoardServiceImpl implements BoardService{

	@Autowired
	BoardDAO dao;

	@Override
	public List<BoardVO> getBoardList() {
		return dao.getBoardList();
	}

	@Override
	public void insertBoard(BoardVO vo) {
		dao.insert(vo);
	}
	
	
	public BoardVO readBoard(Integer seq) {
		return dao.read(seq);
	}

	@Override
	public void updateBoard(BoardVO vo) {
		dao.update(vo);
	}

	@Override
	public void deleteBoard(Integer seq) {
		dao.delete(seq);
	}
	
	
}
