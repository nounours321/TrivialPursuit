package model;

import java.io.Serializable;

/**
 * Stocke les valeurs X et Y définissant des coordonnées.
 * @author Sébastien
 *
 */
public class Coord implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public int x, y;
	
	//Constructeur des coordonnees
	public Coord(int x, int y) {
		this.x = x; 
		this.y = y;
	}

	
	@Override
	public String toString() {
		return "[x=" + x + ", y=" + y + "]";
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coord other = (Coord) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
}
