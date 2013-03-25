package sicimi.api.persistence;

public enum Anni {
	
	DUEMILATREDICI("2013"),
	DUEMILADODICI("2012"),
	DUEMILAUNDICI("2011"),
	DUEMILADIECI("2010"),
	DUEMILANOVE("2009"),
	DUEMILACINQUE("2005");

	
	private String _anno;

	private Anni(String anno) {
		this._anno = anno;
	}
	
	public String getValue(){
		return _anno;
	}

}
