package com.techwizzle.backend.service;

import com.techwizzle.backend.dao.GraphicsCardDAO;
import com.techwizzle.backend.model.GraphicsCard;

import java.util.List;

public class GraphicsCardService {

    private GraphicsCardDAO graphicsCardDAO;

    public GraphicsCardService() {
        this.graphicsCardDAO = new GraphicsCardDAO();
    }

    public List<GraphicsCard> getAllGraphicsCards(){
        try{
            graphicsCardDAO.openCurrentSession();
            return graphicsCardDAO.findAll();
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            graphicsCardDAO.closeCurrentSession();
        }
        return null;
    }

    public GraphicsCard addGraphicsCard(GraphicsCard graphicsCard){
        try{
            graphicsCardDAO.openCurrentSessionwithTransaction();
            graphicsCardDAO.persist(graphicsCard);
            return graphicsCard;
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            graphicsCardDAO.closeCurrentSessionwithTransaction();
        }
        return null;
    }
}