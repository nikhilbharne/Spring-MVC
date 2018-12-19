package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.bo.MedicineDetailsBO;
import com.nt.dao.MedPlusDAO;
import com.nt.dto.MedicineDetailsDTO;
@Service("medSerice")
public class MedPlusService implements MedPlusSevice {

	@Autowired
	private MedPlusDAO dao;
	
	public List<MedicineDetailsDTO> getAllMedicine() {
		
		List<MedicineDetailsBO> listBo=null;
		
		List<MedicineDetailsDTO> listDto=new ArrayList<MedicineDetailsDTO>();
		
		//use dao
		listBo=dao.retriveMedicine();
		
		//copy ListBo to ListDTO
		listBo.forEach(bo->{
			MedicineDetailsDTO dto=new MedicineDetailsDTO();
			BeanUtils.copyProperties(bo, dto);
			listDto.add(dto);
		});
		
		return listDto;
	}

}
