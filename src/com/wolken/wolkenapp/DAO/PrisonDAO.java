package com.wolken.wolkenapp.DAO;

import java.sql.Connection;
import java.sql.SQLException;

import com.wolken.wolkenapp.DTO.PrisonDTO;

public interface PrisonDAO {
	public void add(PrisonDTO prisonDTO) throws SQLException;
	public void get() throws SQLException;
	public void update(int id,int years) throws SQLException;
	public void delete(int id) throws SQLException;
	//public void close();
}
