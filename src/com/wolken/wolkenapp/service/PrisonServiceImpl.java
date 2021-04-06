package com.wolken.wolkenapp.service;

import java.sql.SQLException;

import com.wolken.wolkenapp.DAO.PrisonDAO;
import com.wolken.wolkenapp.DAO.PrisonDAOImpl;
import com.wolken.wolkenapp.DTO.PrisonDTO;

public class PrisonServiceImpl implements PrisonService {

	PrisonDAO prisonDAO = new PrisonDAOImpl();
	
	
	@Override
	public void validate(PrisonDTO prisonDTO) {
		// TODO Auto-generated method stub
		if(prisonDTO.getInmateNo()>0) {
			if(prisonDTO.getName()!=null && prisonDTO.getName().length() >4) {
				if(prisonDTO.getNoOfYears()>0) {
					if(prisonDTO.getInmateCase()!=null) {
						try {
							prisonDAO.add(prisonDTO);
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					else 
						System.out.println("wrong");
				}else 
					System.out.println("wrong");
			}else 
				System.out.println("wrong");
		}else 
			System.out.println("wrong");
		
	}
	@Override
	public void validateUpdate(int id, int years) {
		// TODO Auto-generated method stub
		if(id >0) {
			if(years>0) {
				System.out.println("data is validate for update");
				try {
					prisonDAO.update(id, years);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
	@Override
	public void validateDelete(int id) {
		// TODO Auto-generated method stub
		if(id>0) {
			System.out.println("data is validate for delete");
			try {
				prisonDAO.delete(id);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
