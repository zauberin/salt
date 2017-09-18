package com.winterfell.pilot.repository;

import com.winterfell.pilot.domain.EmpVO;
import org.springframework.stereotype.Repository;

@Repository
public class EmpDAOImpl extends GenericDAOImpl<EmpVO, String> implements EmpDAO {

}
