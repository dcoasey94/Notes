package mono.com.ironsource.mediationsdk.sdk;


public class InitializationListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.ironsource.mediationsdk.sdk.InitializationListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onInitializationComplete:()V:GetOnInitializationCompleteHandler:Com.Ironsource.Mediationsdk.Sdk.IInitializationListenerInvoker, IronSource-Android_v7.3.0.1\n" +
			"";
		mono.android.Runtime.register ("Com.Ironsource.Mediationsdk.Sdk.IInitializationListenerImplementor, IronSource-Android_v7.3.0.1", InitializationListenerImplementor.class, __md_methods);
	}


	public InitializationListenerImplementor ()
	{
		super ();
		if (getClass () == InitializationListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Com.Ironsource.Mediationsdk.Sdk.IInitializationListenerImplementor, IronSource-Android_v7.3.0.1", "", this, new java.lang.Object[] {  });
		}
	}


	public void onInitializationComplete ()
	{
		n_onInitializationComplete ();
	}

	private native void n_onInitializationComplete ();

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
