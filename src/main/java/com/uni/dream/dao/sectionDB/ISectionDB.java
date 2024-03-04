package com.uni.dream.dao.sectionDB;

import com.uni.dream.section.Section;

import java.sql.ResultSet;
import java.util.ArrayList;

public interface ISectionDB {
    Section getSections(ResultSet res);
    ArrayList<Section> getSections();
    ArrayList<Section> getSections(String genre);
    int updateSection(Section batiment, int idSection);
    int deleteSection(int idSection);
    int insertSection(Section batiment);
    Section getSection(int idSection);

    String getSectionGenreById(int idSection);
}
