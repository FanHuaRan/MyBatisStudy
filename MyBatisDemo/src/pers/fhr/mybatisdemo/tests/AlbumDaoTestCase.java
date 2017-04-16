package pers.fhr.mybatisdemo.tests;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import pers.fhr.mybatisdemo.daos.AlbumDao;
import pers.fhr.mybatisdemo.models.Album;

@RunWith(SpringJUnit4ClassRunner.class)    
@ContextConfiguration(locations = {"classpath*:applicationContext.xml"}) 
public class AlbumDaoTestCase {
	@Autowired
	private AlbumDao albumDao=null;
	@Test
	public void testGetAll() {
		List<Album> albums=albumDao.getAll();
		assertNotNull(albums);
		assertEquals(true, albums.size()>0);
	}
	@Test
	public void testAdd(){
		Album entity=new Album(){
			{
				setAlbumArtUrl("/test/url");
				setArtistId(1);
				setGenreId(1);
				setPrice(9.8);
				setTitle("hellomusic");
			}
		};
		albumDao.add(entity);
		System.out.print(entity.getAlbumId());
		assertEquals(true, entity.getAlbumId()>0);
	}
}
