package pers.fhr.mybatisdemo.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pers.fhr.mybatisdemo.daos.AlbumDao;
import pers.fhr.mybatisdemo.models.Album;
import pers.fhr.mybatisdemo.services.IAlbumService;
/**
 * Album服务实现，暂时不加缓存层！
 * @author fhr
 * @date 2017/04/16
 */
@Service
public class AlbumServiceClass implements IAlbumService {
	@Autowired
	private AlbumDao albumDao=null;
	@Override
	public List<Album> getAll() {
		return albumDao.getAll();
	}

	@Override
	public Album getById(int id) {
		return albumDao.getById(id);
	}

	@Override
	public void add(Album entity) {
		albumDao.add(entity);
	}
	@Transactional
	@Override
	public void add(List<Album> entitys) {
		for(Album album:entitys){
			albumDao.add(album);
		}
	}

	@Override
	public void delete(int id) {
		albumDao.delete(id);
	}
    @Transactional
	@Override
	public void delete(List<Integer> ids) {
    	for(Integer id:ids){
    		if(id!=null)
    		{
    			albumDao.delete(id);
    		}
		}
	}

	@Override
	public void update(Album entity) {
		albumDao.update(entity);
	}
    @Transactional
	@Override
	public void update(List<Album> entitys) {
    	for(Album album:entitys){
			albumDao.add(album);
		}
	}

}
