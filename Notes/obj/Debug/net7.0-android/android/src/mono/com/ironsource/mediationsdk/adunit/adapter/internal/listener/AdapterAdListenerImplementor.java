package mono.com.ironsource.mediationsdk.adunit.adapter.internal.listener;


public class AdapterAdListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onAdClicked:()V:GetOnAdClickedHandler:Com.Ironsource.Mediationsdk.Adunit.Adapter.Internal.Listener.IAdapterAdListenerInvoker, IronSource-Android_v7.3.0.1\n" +
			"n_onAdLoadFailed:(Lcom/ironsource/mediationsdk/adunit/adapter/utility/AdapterErrorType;ILjava/lang/String;)V:GetOnAdLoadFailed_Lcom_ironsource_mediationsdk_adunit_adapter_utility_AdapterErrorType_ILjava_lang_String_Handler:Com.Ironsource.Mediationsdk.Adunit.Adapter.Internal.Listener.IAdapterAdListenerInvoker, IronSource-Android_v7.3.0.1\n" +
			"n_onAdLoadSuccess:()V:GetOnAdLoadSuccessHandler:Com.Ironsource.Mediationsdk.Adunit.Adapter.Internal.Listener.IAdapterAdListenerInvoker, IronSource-Android_v7.3.0.1\n" +
			"n_onAdOpened:()V:GetOnAdOpenedHandler:Com.Ironsource.Mediationsdk.Adunit.Adapter.Internal.Listener.IAdapterAdListenerInvoker, IronSource-Android_v7.3.0.1\n" +
			"";
		mono.android.Runtime.register ("Com.Ironsource.Mediationsdk.Adunit.Adapter.Internal.Listener.IAdapterAdListenerImplementor, IronSource-Android_v7.3.0.1", AdapterAdListenerImplementor.class, __md_methods);
	}


	public AdapterAdListenerImplementor ()
	{
		super ();
		if (getClass () == AdapterAdListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Com.Ironsource.Mediationsdk.Adunit.Adapter.Internal.Listener.IAdapterAdListenerImplementor, IronSource-Android_v7.3.0.1", "", this, new java.lang.Object[] {  });
		}
	}


	public void onAdClicked ()
	{
		n_onAdClicked ();
	}

	private native void n_onAdClicked ();


	public void onAdLoadFailed (com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType p0, int p1, java.lang.String p2)
	{
		n_onAdLoadFailed (p0, p1, p2);
	}

	private native void n_onAdLoadFailed (com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType p0, int p1, java.lang.String p2);


	public void onAdLoadSuccess ()
	{
		n_onAdLoadSuccess ();
	}

	private native void n_onAdLoadSuccess ();


	public void onAdOpened ()
	{
		n_onAdOpened ();
	}

	private native void n_onAdOpened ();

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
