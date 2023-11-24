package mono.com.ironsource.mediationsdk.demandOnly;


public class ISDemandOnlyBannerListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onBannerAdClicked:(Ljava/lang/String;)V:GetOnBannerAdClicked_Ljava_lang_String_Handler:Com.Ironsource.Mediationsdk.DemandOnly.ISDemandOnlyBannerListenerInvoker, IronSource-Android_v7.3.0.1\n" +
			"n_onBannerAdLeftApplication:(Ljava/lang/String;)V:GetOnBannerAdLeftApplication_Ljava_lang_String_Handler:Com.Ironsource.Mediationsdk.DemandOnly.ISDemandOnlyBannerListenerInvoker, IronSource-Android_v7.3.0.1\n" +
			"n_onBannerAdLoadFailed:(Ljava/lang/String;Lcom/ironsource/mediationsdk/logger/IronSourceError;)V:GetOnBannerAdLoadFailed_Ljava_lang_String_Lcom_ironsource_mediationsdk_logger_IronSourceError_Handler:Com.Ironsource.Mediationsdk.DemandOnly.ISDemandOnlyBannerListenerInvoker, IronSource-Android_v7.3.0.1\n" +
			"n_onBannerAdLoaded:(Ljava/lang/String;)V:GetOnBannerAdLoaded_Ljava_lang_String_Handler:Com.Ironsource.Mediationsdk.DemandOnly.ISDemandOnlyBannerListenerInvoker, IronSource-Android_v7.3.0.1\n" +
			"n_onBannerAdShown:(Ljava/lang/String;)V:GetOnBannerAdShown_Ljava_lang_String_Handler:Com.Ironsource.Mediationsdk.DemandOnly.ISDemandOnlyBannerListenerInvoker, IronSource-Android_v7.3.0.1\n" +
			"";
		mono.android.Runtime.register ("Com.Ironsource.Mediationsdk.DemandOnly.ISDemandOnlyBannerListenerImplementor, IronSource-Android_v7.3.0.1", ISDemandOnlyBannerListenerImplementor.class, __md_methods);
	}


	public ISDemandOnlyBannerListenerImplementor ()
	{
		super ();
		if (getClass () == ISDemandOnlyBannerListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Com.Ironsource.Mediationsdk.DemandOnly.ISDemandOnlyBannerListenerImplementor, IronSource-Android_v7.3.0.1", "", this, new java.lang.Object[] {  });
		}
	}


	public void onBannerAdClicked (java.lang.String p0)
	{
		n_onBannerAdClicked (p0);
	}

	private native void n_onBannerAdClicked (java.lang.String p0);


	public void onBannerAdLeftApplication (java.lang.String p0)
	{
		n_onBannerAdLeftApplication (p0);
	}

	private native void n_onBannerAdLeftApplication (java.lang.String p0);


	public void onBannerAdLoadFailed (java.lang.String p0, com.ironsource.mediationsdk.logger.IronSourceError p1)
	{
		n_onBannerAdLoadFailed (p0, p1);
	}

	private native void n_onBannerAdLoadFailed (java.lang.String p0, com.ironsource.mediationsdk.logger.IronSourceError p1);


	public void onBannerAdLoaded (java.lang.String p0)
	{
		n_onBannerAdLoaded (p0);
	}

	private native void n_onBannerAdLoaded (java.lang.String p0);


	public void onBannerAdShown (java.lang.String p0)
	{
		n_onBannerAdShown (p0);
	}

	private native void n_onBannerAdShown (java.lang.String p0);

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
