package pers.fhr.mybatisdemo.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import pers.fhr.mybatisdemo.models.Album;
import pers.fhr.mybatisdemo.services.IAlbumService;
/**
 * Album服务单元测试
 * @author fhr
 * @date 2017/04/16
 */
@RunWith(SpringJUnit4ClassRunner.class)    
@ContextConfiguration(locations = {"classpath*:applicationContext.xml"}) 
public class AlbumServiceCTestCase {
	@Autowired
	private IAlbumService albumService=null;
	@Test
	public void testGetAll() {
		List<Album> albums=albumService.getAll();
		assertNotNull(albums);
		assertEquals(true, albums.size()>0);
	}

	@Test
	public void testGetById() {
		Album album=albumService.getById(100);
		assertNotNull(album);
	}

	@Test
	public void testAddAlbum() {
		Album entity=new Album(){
			{
				setAlbumArtUrl("/test/url");
				setArtistId(1);
				setGenreId(1);
				setPrice(9.8);
				setTitle("hellomusic");
			}
		};
		albumService.add(entity);
		System.out.print(entity.getAlbumId());
		assertEquals(true, entity.getAlbumId()>700);
	}

	@Test
	public void testAddListOfAlbum() {
		Album album1=new Album() {
			{
				setAlbumArtUrl("/test/url");
				setArtistId(1);
				setGenreId(1);
				setPrice(9.8);
				setTitle("hellomusic");
			}
		};
		Album album2=new Album() {
			{
				setAlbumArtUrl("/test/url");
				setArtistId(1);
				setGenreId(1);
				setPrice(9.8);
				setTitle("hellomusic");
			}
		};
		albumService.add(Stream.of(album1,album2).collect(Collectors.toList()));
	}

	@Test
	public void testDeleteInt() {
		albumService.delete(200);
		assertNull(albumService.getById(200));
	}

	@Test
	public void testDeleteListOfInteger() {
		albumService.delete(Stream.of(120,121,122).collect(Collectors.toList()));
	}

	@Test
	public void testUpdateAlbum() {
		//懒得写
		//fail("Not yet implemented");
	}

	@Test
	public void testUpdateListOfAlbum() {
		//懒得写
		//fail("Not yet implemented");
	}

}
