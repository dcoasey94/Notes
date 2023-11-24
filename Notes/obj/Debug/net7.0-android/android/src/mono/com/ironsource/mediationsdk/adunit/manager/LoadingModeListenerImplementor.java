package mono.com.ironsource.mediationsdk.adunit.manager;


public class LoadingModeListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.ironsource.mediationsdk.adunit.manager.LoadingModeListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onLoadTriggered:()V:GetOnLoadTriggeredHandler:Com.Ironsource.Mediationsdk.Adunit.Manager.ILoadingModeListenerInvoker, IronSource-Android_v7.3.0.1\n" +
			"";
		mono.android.Runtime.register ("Com.Ironsource.Mediationsdk.Adunit.Manager.ILoadingModeListenerImplementor, IronSource-Android_v7.3.0.1", LoadingModeListenerImplementor.class, __md_methods);
	}


	public LoadingModeListenerImplementor ()
	{
		super ();
		if (getClass () == LoadingModeListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Com.Ironsource.Mediationsdk.Adunit.Manager.ILoadingModeListenerImplementor, IronSource-Android_v7.3.0.1", "", this, new java.lang.Object[] {  });
		}
	}


	public void onLoadTriggered ()
	{
		n_onLoadTriggered ();
	}

	private native void n_onLoadTriggered ();

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
