package edu.grinnell.csc207.gaocharl17.layout;
import edu.grinnell.csc207.gaocharl17.layout.*;
import java.io.PrintWriter;

public class testClass {
	public static void main(String[] args)
	{
		PrintWriter pen = new PrintWriter(System.out,true);
		TBUtils.print(pen,new BlockPair(new BoxedBlock(new RightJustified(new Grid(7,3,'*'),21))));
	}

}
