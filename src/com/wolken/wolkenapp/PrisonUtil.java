package com.wolken.wolkenapp;

import java.sql.SQLException;
import java.util.Scanner;

import com.wolken.wolkenapp.DAO.PrisonDAO;
import com.wolken.wolkenapp.DAO.PrisonDAOImpl;
import com.wolken.wolkenapp.DTO.PrisonDTO;
import com.wolken.wolkenapp.service.PrisonService;
import com.wolken.wolkenapp.service.PrisonServiceImpl;

public class PrisonUtil {
	public static void main(String[] args) {
		try {
			
			// Class.forName("com.wolken.wolkenapp.Festivals");
			Scanner scanner = new Scanner(System.in);
			System.out.println("enter the size");
			int size = scanner.nextInt();
		
			PrisonService prisonService = new PrisonServiceImpl();

			for (int i = 0; i < size; i++) {
				PrisonDTO prisonDTO = new PrisonDTO();
				
			
				System.out.println("enter the data for prison ");
				System.out.println("enter the  inmate id ");
				prisonDTO.setInmateNo(scanner.nextInt());
				System.out.println("enter the inmate name");
				prisonDTO.setName(scanner.next());
				System.out.println("enter no of years ");
				prisonDTO.setNoOfYears(scanner.nextInt());
				System.out.println("enter the inmate case");
				prisonDTO.setInmateCase(scanner.next());
				
				prisonService.validate(prisonDTO);
				
			}
			//Connect.closeConnect();
			
			System.out.println("enter the id for which update has to been done");
			int id = scanner.nextInt();
			System.out.println("enter the no of years to be updated");
			int no = scanner.nextInt();
			

			prisonService.validateUpdate(id, no);

			System.out.println("enter the id ");
			id = scanner.nextInt();
			prisonService.validateDelete(id);
			//prison.close();

		} finally {
			System.out.println("bye bye go home!!");
		}
	}

}
