package springstruts.model;

/**
 * <p/>
 * About this class
 * This component and its source code representation are copyright protected
 * and proprietary to The Trivera Group, Inc., Worldwide D/B/A Trivera Technologies
 *
 * This component and source code may be used for instructional and
 * evaluation purposes only. No part of this component or its source code
 * may be sold, transferred, or publicly posted, nor may it be used in a
 * commercial or production environment, without the express written consent
 * of the Trivera Group, Inc.
 *
 * Copyright (c) 2011 The Trivera Group, LLC.
 * http://www.triveratech.com   http://www.triveragroup.com
 * </p>
 * @author The Trivera Group Tech Team.
 */
public class DVDTO implements java.io.Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String director;
    private String title;
    private String starring;
    private String rated;
    private String releaseDate;
    private String id;
    private String format;

    public String getFormat() {
        return format;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStarring() {
        return starring;
    }

    public void setStarring(String starring) {
        this.starring = starring;
    }

    public String getRated() {
        return rated;
    }

    public void setRated(String rated) {
        this.rated = rated;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setFormat(String format) {
        this.format = format;
    }
}
