package egovframework.com.school.service.impl;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.com.school.service.SchoolService;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("SchoolService")
public class SchoolServiceImpl extends EgovAbstractServiceImpl implements SchoolService{
	
	@Resource(name="SchoolDAO")
	private SchoolDAO schoolDAO;

	@Override
	public List<HashMap<String, Object>> selectSchoolList() {
		// TODO Auto-generated method stub
		return schoolDAO.selectSchoolList();
	}

	@Override
	public HashMap<String, Object> selectSchoolInfo(HashMap<String, Object> paramMap) {
		// TODO Auto-generated method stub
		return schoolDAO.selectSchoolInfo(paramMap);
	}

}