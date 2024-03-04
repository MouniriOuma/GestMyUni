package com.uni.dream.dao.sectionDB;

import com.uni.dream.section.Section;
import com.uni.dream.singletonConnector.SingletonConnector;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class SectionDB implements ISectionDB {


    @Override
    public Section getSections(ResultSet res) {
        return null;
    }

    @Override
    public ArrayList<Section> getSections() {
        return null;
    }

    @Override
    public ArrayList<Section> getSections(String genre) {
        return null;
    }

    @Override
    public int updateSection(Section batiment, int idSection) {
        return 0;
    }

    @Override
    public int deleteSection(int idSection) {
        return 0;
    }

    @Override
    public int insertSection(Section batiment) {
        return 0;
    }

    @Override
    public Section getSection(int idSection) {
        return null;
    }

    @Override
    public String getSectionGenreById(int idSection) {
        return null;
    }
}
