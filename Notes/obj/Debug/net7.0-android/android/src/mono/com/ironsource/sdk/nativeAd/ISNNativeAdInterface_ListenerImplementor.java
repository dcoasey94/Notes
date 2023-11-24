package mono.com.ironsource.sdk.nativeAd;


public class ISNNativeAdInterface_ListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.ironsource.sdk.nativeAd.ISNNativeAdInterface.Listener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onClick:()V:GetOnClickHandler:Com.Ironsource.Sdk.NativeAd.ISNNativeAdInterfaceListenerInvoker, IronSource-Android_v7.3.0.1\n" +
			"n_onLoad:(Ljava/lang/Object;)V:GetOnLoad_Ljava_lang_Object_Handler:Com.Ironsource.Sdk.NativeAd.ISNNativeAdInterfaceListenerInvoker, IronSource-Android_v7.3.0.1\n" +
			"n_onShow:()V:GetOnShowHandler:Com.Ironsource.Sdk.NativeAd.ISNNativeAdInterfaceListenerInvoker, IronSource-Android_v7.3.0.1\n" +
			"";
		mono.android.Runtime.register ("Com.Ironsource.Sdk.NativeAd.ISNNativeAdInterfaceListenerImplementor, IronSource-Android_v7.3.0.1", ISNNativeAdInterface_ListenerImplementor.class, __md_methods);
	}


	public ISNNativeAdInterface_ListenerImplementor ()
	{
		super ();
		if (getClass () == ISNNativeAdInterface_ListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Com.Ironsource.Sdk.NativeAd.ISNNativeAdInterfaceListenerImplementor, IronSource-Android_v7.3.0.1", "", this, new java.lang.Object[] {  });
		}
	}


	public void onClick ()
	{
		n_onClick ();
	}

	private native void n_onClick ();


	public void onLoad (java.lang.Object p0)
	{
		n_onLoad (p0);
	}

	private native void n_onLoad (java.lang.Object p0);


	public void onShow ()
	{
		n_onShow ();
	}

	private native void n_onShow ();

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
