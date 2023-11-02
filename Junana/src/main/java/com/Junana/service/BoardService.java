package com.Junana.service;

import java.util.List;



import com.Junana.domain.BoardVo;



public interface BoardService {
	  public void regist(BoardVo board) throws Exception;
	  public BoardVo read(Integer bno) throws Exception;
	  public void modify(BoardVo board) throws Exception;
	  public void remove(Integer bno) throws Exception;
	  public List<BoardVo> listAll() throws Exception;
}