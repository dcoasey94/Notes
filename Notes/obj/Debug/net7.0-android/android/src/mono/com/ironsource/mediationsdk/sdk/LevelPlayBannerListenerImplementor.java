package mono.com.ironsource.mediationsdk.sdk;


public class LevelPlayBannerListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.ironsource.mediationsdk.sdk.LevelPlayBannerListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onAdClicked:(Lcom/ironsource/mediationsdk/adunit/adapter/utility/AdInfo;)V:GetOnAdClicked_Lcom_ironsource_mediationsdk_adunit_adapter_utility_AdInfo_Handler:Com.Ironsource.Mediationsdk.Sdk.ILevelPlayBannerListenerInvoker, IronSource-Android_v7.3.0.1\n" +
			"n_onAdLeftApplication:(Lcom/ironsource/mediationsdk/adunit/adapter/utility/AdInfo;)V:GetOnAdLeftApplication_Lcom_ironsource_mediationsdk_adunit_adapter_utility_AdInfo_Handler:Com.Ironsource.Mediationsdk.Sdk.ILevelPlayBannerListenerInvoker, IronSource-Android_v7.3.0.1\n" +
			"n_onAdLoadFailed:(Lcom/ironsource/mediationsdk/logger/IronSourceError;)V:GetOnAdLoadFailed_Lcom_ironsource_mediationsdk_logger_IronSourceError_Handler:Com.Ironsource.Mediationsdk.Sdk.ILevelPlayBannerListenerInvoker, IronSource-Android_v7.3.0.1\n" +
			"n_onAdLoaded:(Lcom/ironsource/mediationsdk/adunit/adapter/utility/AdInfo;)V:GetOnAdLoaded_Lcom_ironsource_mediationsdk_adunit_adapter_utility_AdInfo_Handler:Com.Ironsource.Mediationsdk.Sdk.ILevelPlayBannerListenerInvoker, IronSource-Android_v7.3.0.1\n" +
			"n_onAdScreenDismissed:(Lcom/ironsource/mediationsdk/adunit/adapter/utility/AdInfo;)V:GetOnAdScreenDismissed_Lcom_ironsource_mediationsdk_adunit_adapter_utility_AdInfo_Handler:Com.Ironsource.Mediationsdk.Sdk.ILevelPlayBannerListenerInvoker, IronSource-Android_v7.3.0.1\n" +
			"n_onAdScreenPresented:(Lcom/ironsource/mediationsdk/adunit/adapter/utility/AdInfo;)V:GetOnAdScreenPresented_Lcom_ironsource_mediationsdk_adunit_adapter_utility_AdInfo_Handler:Com.Ironsource.Mediationsdk.Sdk.ILevelPlayBannerListenerInvoker, IronSource-Android_v7.3.0.1\n" +
			"";
		mono.android.Runtime.register ("Com.Ironsource.Mediationsdk.Sdk.ILevelPlayBannerListenerImplementor, IronSource-Android_v7.3.0.1", LevelPlayBannerListenerImplementor.class, __md_methods);
	}


	public LevelPlayBannerListenerImplementor ()
	{
		super ();
		if (getClass () == LevelPlayBannerListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Com.Ironsource.Mediationsdk.Sdk.ILevelPlayBannerListenerImplementor, IronSource-Android_v7.3.0.1", "", this, new java.lang.Object[] {  });
		}
	}


	public void onAdClicked (com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo p0)
	{
		n_onAdClicked (p0);
	}

	private native void n_onAdClicked (com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo p0);


	public void onAdLeftApplication (com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo p0)
	{
		n_onAdLeftApplication (p0);
	}

	private native void n_onAdLeftApplication (com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo p0);


	public void onAdLoadFailed (com.ironsource.mediationsdk.logger.IronSourceError p0)
	{
		n_onAdLoadFailed (p0);
	}

	private native void n_onAdLoadFailed (com.ironsource.mediationsdk.logger.IronSourceError p0);


	public void onAdLoaded (com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo p0)
	{
		n_onAdLoaded (p0);
	}

	private native void n_onAdLoaded (com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo p0);


	public void onAdScreenDismissed (com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo p0)
	{
		n_onAdScreenDismissed (p0);
	}

	private native void n_onAdScreenDismissed (com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo p0);


	public void onAdScreenPresented (com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo p0)
	{
		n_onAdScreenPresented (p0);
	}

	private native void n_onAdScreenPresented (com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo p0);

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
