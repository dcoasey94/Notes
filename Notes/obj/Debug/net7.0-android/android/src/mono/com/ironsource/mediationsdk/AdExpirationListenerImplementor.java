package mono.com.ironsource.mediationsdk;


public class AdExpirationListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.ironsource.mediationsdk.AdExpirationListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onAdExpired:()V:GetOnAdExpiredHandler:Com.Ironsource.Mediationsdk.IAdExpirationListenerInvoker, IronSource-Android_v7.3.0.1\n" +
			"";
		mono.android.Runtime.register ("Com.Ironsource.Mediationsdk.IAdExpirationListenerImplementor, IronSource-Android_v7.3.0.1", AdExpirationListenerImplementor.class, __md_methods);
	}


	public AdExpirationListenerImplementor ()
	{
		super ();
		if (getClass () == AdExpirationListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Com.Ironsource.Mediationsdk.IAdExpirationListenerImplementor, IronSource-Android_v7.3.0.1", "", this, new java.lang.Object[] {  });
		}
	}


	public void onAdExpired ()
	{
		n_onAdExpired ();
	}

	private native void n_onAdExpired ();

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
