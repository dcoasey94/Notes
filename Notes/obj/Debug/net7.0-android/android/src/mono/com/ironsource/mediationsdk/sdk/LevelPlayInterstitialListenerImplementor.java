package mono.com.ironsource.mediationsdk.sdk;


public class LevelPlayInterstitialListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.ironsource.mediationsdk.sdk.LevelPlayInterstitialListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onAdClicked:(Lcom/ironsource/mediationsdk/adunit/adapter/utility/AdInfo;)V:GetOnAdClicked_Lcom_ironsource_mediationsdk_adunit_adapter_utility_AdInfo_Handler:Com.Ironsource.Mediationsdk.Sdk.ILevelPlayInterstitialListenerInvoker, IronSource-Android_v7.3.0.1\n" +
			"n_onAdClosed:(Lcom/ironsource/mediationsdk/adunit/adapter/utility/AdInfo;)V:GetOnAdClosed_Lcom_ironsource_mediationsdk_adunit_adapter_utility_AdInfo_Handler:Com.Ironsource.Mediationsdk.Sdk.ILevelPlayInterstitialListenerInvoker, IronSource-Android_v7.3.0.1\n" +
			"n_onAdLoadFailed:(Lcom/ironsource/mediationsdk/logger/IronSourceError;)V:GetOnAdLoadFailed_Lcom_ironsource_mediationsdk_logger_IronSourceError_Handler:Com.Ironsource.Mediationsdk.Sdk.ILevelPlayInterstitialListenerInvoker, IronSource-Android_v7.3.0.1\n" +
			"n_onAdOpened:(Lcom/ironsource/mediationsdk/adunit/adapter/utility/AdInfo;)V:GetOnAdOpened_Lcom_ironsource_mediationsdk_adunit_adapter_utility_AdInfo_Handler:Com.Ironsource.Mediationsdk.Sdk.ILevelPlayInterstitialListenerInvoker, IronSource-Android_v7.3.0.1\n" +
			"n_onAdReady:(Lcom/ironsource/mediationsdk/adunit/adapter/utility/AdInfo;)V:GetOnAdReady_Lcom_ironsource_mediationsdk_adunit_adapter_utility_AdInfo_Handler:Com.Ironsource.Mediationsdk.Sdk.ILevelPlayInterstitialListenerInvoker, IronSource-Android_v7.3.0.1\n" +
			"n_onAdShowFailed:(Lcom/ironsource/mediationsdk/logger/IronSourceError;Lcom/ironsource/mediationsdk/adunit/adapter/utility/AdInfo;)V:GetOnAdShowFailed_Lcom_ironsource_mediationsdk_logger_IronSourceError_Lcom_ironsource_mediationsdk_adunit_adapter_utility_AdInfo_Handler:Com.Ironsource.Mediationsdk.Sdk.ILevelPlayInterstitialListenerInvoker, IronSource-Android_v7.3.0.1\n" +
			"n_onAdShowSucceeded:(Lcom/ironsource/mediationsdk/adunit/adapter/utility/AdInfo;)V:GetOnAdShowSucceeded_Lcom_ironsource_mediationsdk_adunit_adapter_utility_AdInfo_Handler:Com.Ironsource.Mediationsdk.Sdk.ILevelPlayInterstitialListenerInvoker, IronSource-Android_v7.3.0.1\n" +
			"";
		mono.android.Runtime.register ("Com.Ironsource.Mediationsdk.Sdk.ILevelPlayInterstitialListenerImplementor, IronSource-Android_v7.3.0.1", LevelPlayInterstitialListenerImplementor.class, __md_methods);
	}


	public LevelPlayInterstitialListenerImplementor ()
	{
		super ();
		if (getClass () == LevelPlayInterstitialListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Com.Ironsource.Mediationsdk.Sdk.ILevelPlayInterstitialListenerImplementor, IronSource-Android_v7.3.0.1", "", this, new java.lang.Object[] {  });
		}
	}


	public void onAdClicked (com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo p0)
	{
		n_onAdClicked (p0);
	}

	private native void n_onAdClicked (com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo p0);


	public void onAdClosed (com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo p0)
	{
		n_onAdClosed (p0);
	}

	private native void n_onAdClosed (com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo p0);


	public void onAdLoadFailed (com.ironsource.mediationsdk.logger.IronSourceError p0)
	{
		n_onAdLoadFailed (p0);
	}

	private native void n_onAdLoadFailed (com.ironsource.mediationsdk.logger.IronSourceError p0);


	public void onAdOpened (com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo p0)
	{
		n_onAdOpened (p0);
	}

	private native void n_onAdOpened (com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo p0);


	public void onAdReady (com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo p0)
	{
		n_onAdReady (p0);
	}

	private native void n_onAdReady (com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo p0);


	public void onAdShowFailed (com.ironsource.mediationsdk.logger.IronSourceError p0, com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo p1)
	{
		n_onAdShowFailed (p0, p1);
	}

	private native void n_onAdShowFailed (com.ironsource.mediationsdk.logger.IronSourceError p0, com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo p1);


	public void onAdShowSucceeded (com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo p0)
	{
		n_onAdShowSucceeded (p0);
	}

	private native void n_onAdShowSucceeded (com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo p0);

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
