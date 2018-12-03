package utils;

public final class Constants {
	public static final String GAME_NAME = "CAT 01";
	public static final int GAME_SIZE_X = 800;
	public static final int GAME_SIZE_Y = 600;
	
	public static final int BACKGROUND_LEVEL = 0;
	public static final int GAME_LEVEL = 1;
	public static final int HERO_LEVEL = 2;
	public static final int DETAILS_LEVEL = 3;
	public static final int MENU_LEVEL = 4;
	
	/** System property - <tt>line.separator</tt> */
	public static final String NEW_LINE = System.getProperty("line.separator");
	/** System property - <tt>file.separator</tt> */
	public static final String FILE_SEPARATOR = System.getProperty("file.separator");
	/** System property - <tt>path.separator</tt> */
	public static final String PATH_SEPARATOR = System.getProperty("path.separator");

	public static final String EMPTY_STRING = "";
	public static final String SPACE = " ";
	public static final String TAB = "\t";
	public static final String SINGLE_QUOTE = "'";
	public static final String PERIOD = ".";
	public static final String DOUBLE_QUOTE = "\"";

	public static final String DIRECTORY_ASSETS = "assets"+FILE_SEPARATOR;
	public static final String DIRECTORY_BACKGROUNDS = Constants.DIRECTORY_ASSETS+"backgrounds";
	public static final String DIRECTORY_LEVELS = Constants.DIRECTORY_ASSETS+"levels";
	
	private Constants(){
	    throw new AssertionError();
	}
}