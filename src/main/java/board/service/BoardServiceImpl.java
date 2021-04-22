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
	
	
}
