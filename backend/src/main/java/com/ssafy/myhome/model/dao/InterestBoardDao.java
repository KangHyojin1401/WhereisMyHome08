package com.ssafy.myhome.model.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ssafy.myhome.model.dto.SaleBoard;
import com.ssafy.myhome.model.dto.InterestBoard;

@Mapper
public interface InterestBoardDao {

	InterestBoard getUserInterestBoard(int interestBoardId);
	List<InterestBoard> getUserInterestBoards(String userId);
	int insertUserInterestBoardMapping(String userId, SaleBoard board);
	int deleteUserInterestBoardMapping(int interestBoardId);
	
}
