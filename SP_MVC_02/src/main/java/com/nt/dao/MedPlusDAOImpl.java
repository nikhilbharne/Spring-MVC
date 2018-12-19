package com.nt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.nt.bo.MedicineDetailsBO;
@Repository("medDAO")
public class MedPlusDAOImpl implements MedPlusDAO {
	private static final String ALL_MEDICINE_DETAILS="SELECT MID,MEDNAME,PRICE,MFGDATE,EXPDATE FROM  MEDPLUS_STORE";
	
	@Autowired
	private JdbcTemplate jt;

	public List<MedicineDetailsBO> retriveMedicine() {
		List<MedicineDetailsBO> listBo=null;
		 listBo=(List<MedicineDetailsBO>) jt.query(ALL_MEDICINE_DETAILS, new MedPlusExtractor());
		
		return listBo;
	}
	
	private class MedPlusExtractor implements ResultSetExtractor<MedicineDetailsBO>{

		public MedicineDetailsBO extractData(ResultSet rs) throws SQLException, DataAccessException {
			List<MedicineDetailsBO> listBo=null;
			
			MedicineDetailsBO bo=null;
			
			listBo=new ArrayList();
			
			while (rs.next()) {
				bo=new MedicineDetailsBO();
				bo.setMid(rs.getInt(1));
				bo.setMedName(rs.getString(2));
				bo.setPrice(rs.getInt(3));
				bo.setMfgDate(rs.getDate(4));
				bo.setExpDate(rs.getDate(5));
				listBo.add(bo);
			}
			
			return (MedicineDetailsBO) listBo;
		}
		
	}

}
