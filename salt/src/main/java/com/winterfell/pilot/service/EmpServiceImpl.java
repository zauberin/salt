package com.winterfell.pilot.service;

import com.winterfell.pilot.domain.EmpVO;
import com.winterfell.pilot.repository.EmpDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {

    @Autowired
    EmpDAO empDAO;

    public List<EmpVO> getEmpList(EmpVO empVO) {
        return empDAO.getList();
    }
}
