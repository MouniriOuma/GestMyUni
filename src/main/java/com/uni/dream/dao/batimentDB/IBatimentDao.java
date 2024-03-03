package com.uni.dream.dao.batimentDB;

import com.uni.dream.batiment.Batiment;

import java.sql.ResultSet;
import java.util.ArrayList;

public interface IBatimentDao {
	Batiment getBatiment(ResultSet res);
	ArrayList<Batiment> getBatiments();
	ArrayList<Batiment> getBatiments(String genre);
	int updateBatiment(Batiment batiment, int idBatiment);
	int deleteBatiment(int idBatiment);
	int insertBatiment(Batiment batiment);
	Batiment getBatiment(int idBatiment);

	String getBatimentGenreById(int idBatiment);
}
