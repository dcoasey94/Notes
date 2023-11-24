package mono.com.ironsource.mediationsdk.adunit.adapter.listener;


public class NetworkInitializationListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onInitFailed:(ILjava/lang/String;)V:GetOnInitFailed_ILjava_lang_String_Handler:Com.Ironsource.Mediationsdk.Adunit.Adapter.Listener.INetworkInitializationListenerInvoker, IronSource-Android_v7.3.0.1\n" +
			"n_onInitSuccess:()V:GetOnInitSuccessHandler:Com.Ironsource.Mediationsdk.Adunit.Adapter.Listener.INetworkInitializationListenerInvoker, IronSource-Android_v7.3.0.1\n" +
			"";
		mono.android.Runtime.register ("Com.Ironsource.Mediationsdk.Adunit.Adapter.Listener.INetworkInitializationListenerImplementor, IronSource-Android_v7.3.0.1", NetworkInitializationListenerImplementor.class, __md_methods);
	}


	public NetworkInitializationListenerImplementor ()
	{
		super ();
		if (getClass () == NetworkInitializationListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Com.Ironsource.Mediationsdk.Adunit.Adapter.Listener.INetworkInitializationListenerImplementor, IronSource-Android_v7.3.0.1", "", this, new java.lang.Object[] {  });
		}
	}


	public void onInitFailed (int p0, java.lang.String p1)
	{
		n_onInitFailed (p0, p1);
	}

	private native void n_onInitFailed (int p0, java.lang.String p1);


	public void onInitSuccess ()
	{
		n_onInitSuccess ();
	}

	private native void n_onInitSuccess ();

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
