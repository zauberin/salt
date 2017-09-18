package com.winterfell.pilot.service;

import com.winterfell.pilot.domain.EmpVO;

import java.util.List;

public interface EmpService {

    public List<EmpVO> getEmpList(EmpVO empVO);

}
