package mono.com.ironsource.mediationsdk.adunit.waterfall;


public class WaterfallLifeCycleHolderEventListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.ironsource.mediationsdk.adunit.waterfall.WaterfallLifeCycleHolderEventListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_maxWaterfallsReached:(I)V:GetMaxWaterfallsReached_IHandler:Com.Ironsource.Mediationsdk.Adunit.Waterfall.IWaterfallLifeCycleHolderEventListenerInvoker, IronSource-Android_v7.3.0.1\n" +
			"";
		mono.android.Runtime.register ("Com.Ironsource.Mediationsdk.Adunit.Waterfall.IWaterfallLifeCycleHolderEventListenerImplementor, IronSource-Android_v7.3.0.1", WaterfallLifeCycleHolderEventListenerImplementor.class, __md_methods);
	}


	public WaterfallLifeCycleHolderEventListenerImplementor ()
	{
		super ();
		if (getClass () == WaterfallLifeCycleHolderEventListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Com.Ironsource.Mediationsdk.Adunit.Waterfall.IWaterfallLifeCycleHolderEventListenerImplementor, IronSource-Android_v7.3.0.1", "", this, new java.lang.Object[] {  });
		}
	}


	public void maxWaterfallsReached (int p0)
	{
		n_maxWaterfallsReached (p0);
	}

	private native void n_maxWaterfallsReached (int p0);

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
