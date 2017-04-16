package pers.fhr.mybatisdemo.services;

import java.util.List;

import pers.fhr.mybatisdemo.models.Album;
/**
 * Album服务接口
 * @author fhr
 * @date 2017/04/16
 */
public interface IAlbumService {
	 public List<Album> getAll();
	 public Album getById(int id);
	 public void add(Album entity);
	 public void add(List<Album> entitys);
	 public void delete(int id);
	 public void delete(List<Integer> ids);
	 public void update(Album entity);
	 public void update(List<Album> entitys);
}
