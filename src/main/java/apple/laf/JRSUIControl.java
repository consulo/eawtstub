package apple.laf;

import apple.laf.JRSUIConstants.Hit;

public final class JRSUIControl
{
	public static void initJRSUI()
	{

	}

	public JRSUIControl(final boolean flipped)
	{
	}

	JRSUIControl(final JRSUIControl other)
	{
	}

	protected synchronized final void finalize() throws Throwable
	{
	}


	enum BufferState
	{
		NO_CHANGE,
		ALL_CHANGES_IN_BUFFER,
		SOME_CHANGES_IN_BUFFER,
		CHANGE_WONT_FIT_IN_BUFFER;
	}

	public void set(final JRSUIState state)
	{
	}

	void setEncodedState(final long state)
	{
	}

	void set(final JRSUIConstants.Key key, final double value)
	{
	}

	//    private static final Color blue = new Color(0x00, 0x00, 0xFF, 0x40);
	//    private static void paintDebug(Graphics2D g, double x, double y, double w, double h) {
	//        final Color prev = g.getColor();
	//        g.setColor(blue);
	//        g.drawRect((int)x, (int)y, (int)w, (int)h);
	//        g.setColor(prev);
	//    }

	//    private static int paintsWithNoChange = 0;
	//    private static int paintsWithChangesThatFit = 0;
	//    private static int paintsWithChangesThatOverflowed = 0;

	public void paint(final int[] data, final int imgW, final int imgH, final double x, final double y, final double w, final double h)
	{
	}

	Hit getHitForPoint(final double x, final double y, final double w, final double h, final double hitX, final double hitY)
	{
		return null;
	}

	void getPartBounds(final double[] rect, final double x, final double y, final double w, final double h, final int part)
	{
	}

	double getScrollBarOffsetChange(final double x, final double y, final double w, final double h, final int offset, final int visibleAmount, final int extent)
	{
		return 0;
	}


	@Override
	public int hashCode()
	{
		return 0;
	}

	@Override
	public boolean equals(final Object obj)
	{
		return false;
	}

	@Override
	public String toString()
	{
		return "";
	}
}