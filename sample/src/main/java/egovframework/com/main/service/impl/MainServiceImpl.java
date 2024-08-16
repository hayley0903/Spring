package egovframework.com.main.service.impl;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.com.main.service.MainService;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("MainService")
public class MainServiceImpl extends EgovAbstractServiceImpl implements MainService{
	
	//생성자 생성
	@Resource(name="MainDAO")
	private MainDAO mainDAO;

	@Override
	public List<HashMap<String, Object>> selectStudentInfo() {
		// TODO Auto-generated method stub
		
		List<HashMap<String, Object>> list = mainDAO.selectStudentInfo();
		return list;
	}
	
	

	@Override
	public List<HashMap<String, Object>> selectScoreInfo() {
		// TODO Auto-generated method stub
		
		List<HashMap<String, Object>> list2 = mainDAO.selectScoreInfo();
		return list2;
	}
	
}
