package mono.com.ironsource.mediationsdk;


public class IronSourceBannerLayout_WindowFocusChangedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.ironsource.mediationsdk.IronSourceBannerLayout.WindowFocusChangedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onWindowFocusChanged:(Z)V:GetOnWindowFocusChanged_ZHandler:Com.Ironsource.Mediationsdk.IronSourceBannerLayout/IWindowFocusChangedListenerInvoker, IronSource-Android_v7.3.0.1\n" +
			"";
		mono.android.Runtime.register ("Com.Ironsource.Mediationsdk.IronSourceBannerLayout+IWindowFocusChangedListenerImplementor, IronSource-Android_v7.3.0.1", IronSourceBannerLayout_WindowFocusChangedListenerImplementor.class, __md_methods);
	}


	public IronSourceBannerLayout_WindowFocusChangedListenerImplementor ()
	{
		super ();
		if (getClass () == IronSourceBannerLayout_WindowFocusChangedListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Com.Ironsource.Mediationsdk.IronSourceBannerLayout+IWindowFocusChangedListenerImplementor, IronSource-Android_v7.3.0.1", "", this, new java.lang.Object[] {  });
		}
	}


	public void onWindowFocusChanged (boolean p0)
	{
		n_onWindowFocusChanged (p0);
	}

	private native void n_onWindowFocusChanged (boolean p0);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
