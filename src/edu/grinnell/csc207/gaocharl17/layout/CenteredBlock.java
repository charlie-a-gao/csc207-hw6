package edu.grinnell.csc207.gaocharl17.layout;

import java.util.Arrays;

public class CenteredBlock implements TextBlock {
	
	private TextBlock _contents;
	private int width;
	/**
	 * Create a new truncated block of the specified width.
	 */
	public CenteredBlock(TextBlock tb, int width)
	{
		this._contents = tb;
		this.width = width;
	} // CenteredBlock(TextBlock, int)

	/**
	 * Get the ith row of the block.
	 */
	public String row(int i) throws Exception
	{
		//check if centering is possible
		if((_contents.width() - width)%2 == 1 || (width - _contents.width()) < 2)
		{
			throw new Exception("Invalid width to center in: " + width);//check if matching odd/even
		}
		
		//make spacer strings
		int spacerLength = (width - _contents.width())/2;
		char[] spacerArray = new char[spacerLength];
		Arrays.fill(spacerArray, ' ');
		String spacer = new String(spacerArray);
		
		if(i >= 0 && i < _contents.height() && _contents.width() > 0)
		{
			return spacer + _contents.row(i) + spacer;
		}
		
		throw new Exception("Invalid row: " + i);
	}	 // row(int)

	/**
	 * Determine how many rows are in the block.
	 */
	public int height()
	{
		return _contents.height();
	} // height()

	/**
	 * Determine how many columns are in the block.
	 */
	public int width()
	{
		return width;
	} // width()
} // class CenteredBlock