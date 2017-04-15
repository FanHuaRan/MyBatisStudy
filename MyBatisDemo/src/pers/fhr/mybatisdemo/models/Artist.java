package pers.fhr.mybatisdemo.models;

/**
 * Artist entity. @author MyEclipse Persistence Tools
 */

public class Artist implements java.io.Serializable {
	
	private static final long serialVersionUID = 7313476170121740933L;
	// Fields

	/**
	 * 
	 */
	private Integer artistId;
	private String name;
	// Constructors

	/** default constructor */
	public Artist() {
	}

	/** full constructor */
	public Artist(String name) {
		this.name = name;
	}

	// Property accessors

	public Integer getArtistId() {
		return this.artistId;
	}

	public void setArtistId(Integer artistId) {
		this.artistId = artistId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
}