package com.example.service;

import com.example.model.Toy;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import java.util.List;
import java.util.ArrayList;
import static java.lang.System.*;


//@Service
public class ToyServiceImpl implements ToyService {

    //    @PersistenceContext
    //    EntityManager em;
        
	private List<Toy> toys = new ArrayList<Toy> ();
	
    // @Transactional
    public void addToy(Toy toy) {
	//    em.persist(toy);
    	toys.add(toy);
	//    throw new UnsupportedOperationException();
    }


    // @Transactional
    public void removeToy(Integer id) {
	//        Toy toy = em.find(Toy.class, id);
	//       if (null != toy) {
	//            em.remove(toy);
	//       }
    //	     throw new UnsupportedOperationException();
    	toys.remove(id);
    }
    

    //    @Transactional
    public List<Toy> listToys() {
	//        CriteriaQuery<Person> c = em.getCriteriaBuilder().createQuery(Toy.class);
        //        c.from(Toy.class);
	//        return em.createQuery(c).getResultList();
    // throw new UnsupportedOperationException();
    	return toys;
    }


	


    
}
