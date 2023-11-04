package edu.eci.arsw.app.ucord.persistence.cache.impl;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import edu.eci.arsw.app.ucord.model.Decanatura;
import edu.eci.arsw.app.ucord.persistence.cache.IUcordCache;

@Repository
public class UcordCache implements IUcordCache {

    public static final String KEY = "ucordkey";

    private RedisTemplate<String, Object> redisTemplate;
    private HashOperations<String, Long, Decanatura> hashOperations;

    public UcordCache (){}

    @Autowired
	public UcordCache(RedisTemplate<String, Object> redisTemplate) {
		this.redisTemplate = redisTemplate;
	}

    @PostConstruct
	private void intializeHashOperations() {
		hashOperations = redisTemplate.opsForHash();
	}

    @Override
    public Decanatura get(int idDecanatura) throws Exception {
        try {
            return hashOperations.get(KEY, (long) idDecanatura);
        } catch (Exception e) {
            throw new Exception(e.toString());
        }  
    }

    @Override
    public void put(Decanatura decantura) {
        try {
            hashOperations.put(KEY, (long) decantura.getId(), decantura);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }    
    }

    @Override
    public boolean exists(int idDecanatura) {
        return false;
    }

    @Override
    public List<Decanatura> getDecanaturas() throws Exception {
        try {
            return hashOperations.values(KEY);
        } catch (Exception e) {
            throw new Exception(e.toString());
        }
    }

    @Override
    public void delete(int idDecanatura) throws Exception {
        try {
            hashOperations.delete(KEY,(long) idDecanatura);
        } catch (Exception e) {
            throw new Exception(e.toString());
        }   
    }

}
