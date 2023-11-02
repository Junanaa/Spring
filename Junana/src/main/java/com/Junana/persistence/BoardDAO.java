package com.Junana.persistence;

import java.util.List;

import com.Junana.domain.BoardVo;

public interface BoardDAO {

   public void create(BoardVo vo) throws Exception;
   public BoardVo read(Integer bno) throws Exception;
   public void update(BoardVo vo) throws Exception;
   public void delete(Integer bno) throws Exception;
   public List<BoardVo> listAll() throws Exception;

}