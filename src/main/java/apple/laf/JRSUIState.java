package apple.laf;

import apple.laf.JRSUIConstants.Property;
import apple.laf.JRSUIConstants.Widget;

@SuppressWarnings("unchecked")
public class JRSUIState
{

	public static JRSUIState getInstance()
	{
		return null;
	}

	JRSUIState(final Widget widget)
	{
		this(widget.apply(0));
	}

	JRSUIState(final long encodedState)
	{
	}

	boolean isDerivationSame()
	{
		return false;
	}

	public <T extends JRSUIState> T derive()
	{
		if(isDerivationSame())
		{
			return (T) this;
		}
		final T derivation = (T) createDerivation();

		//        if (!states.add(derivation)) {
		//            System.out.println("dupe: " + states.size());
		//        }

		return derivation;
	}

	public <T extends JRSUIState> T createDerivation()
	{
		return null;
	}

	public void reset()
	{
	}

	public void set(final Property property)
	{
	}

	public void apply(final JRSUIControl control)
	{
	}

	@Override
	public boolean equals(final Object obj)
	{
		return false;
	}

	public boolean is(Property property)
	{
		return false;
	}

	@Override
	public int hashCode()
	{
		return 0;
	}

	public static class AnimationFrameState extends JRSUIState
	{

		AnimationFrameState(final long encodedState, final int animationFrame)
		{
			super(encodedState);
		}

		@Override
		boolean isDerivationSame()
		{
			return false;
		}

		@Override
		public <T extends JRSUIState> T createDerivation()
		{
			return null;
		}

		@Override
		public void reset()
		{
		}

		public void setAnimationFrame(final int frame)
		{
		}

		@Override
		public void apply(final JRSUIControl control)
		{
		}

		@Override
		public boolean equals(final Object obj)
		{
			return false;
		}

		@Override
		public int hashCode()
		{
			return 0;
		}
	}

	public static class ValueState extends JRSUIState
	{
		ValueState(final long encodedState, final double value)
		{
			super(encodedState);
		}

		@Override
		boolean isDerivationSame()
		{
			return false;
		}

		@Override
		public <T extends JRSUIState> T createDerivation()
		{
			return null;
		}

		@Override
		public void reset()
		{
		}

		public void setValue(final double value)
		{
		}

		@Override
		public void apply(final JRSUIControl control)
		{
		}

		@Override
		public boolean equals(final Object obj)
		{
			return false;
		}

		@Override
		public int hashCode()
		{
			return 0;
		}
	}

	public static class TitleBarHeightState extends ValueState
	{
		TitleBarHeightState(final long encodedState, final double value)
		{
			super(encodedState, value);
		}

		@Override
		public <T extends JRSUIState> T createDerivation()
		{
			return null;
		}

		@Override
		public void apply(final JRSUIControl control)
		{
		}
	}

	public static class ScrollBarState extends ValueState
	{
		ScrollBarState(final long encodedState, final double value, final double thumbProportion, final double thumbStart)
		{
			super(encodedState, value);
		}

		@Override
		boolean isDerivationSame()
		{
			return false;
		}

		@Override
		public <T extends JRSUIState> T createDerivation()
		{
			return null;
		}

		@Override
		public void reset()
		{
		}

		public void setThumbPercent(final double thumbPercent)
		{
		}

		public void setThumbStart(final double thumbStart)
		{
		}

		@Override
		public void apply(final JRSUIControl control)
		{
		}

		@Override
		public boolean equals(final Object obj)
		{
			return false;
		}

		@Override
		public int hashCode()
		{
			return 0;
		}
	}
}