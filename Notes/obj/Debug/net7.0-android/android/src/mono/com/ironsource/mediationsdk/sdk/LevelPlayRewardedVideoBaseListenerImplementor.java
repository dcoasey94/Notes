package mono.com.ironsource.mediationsdk.sdk;


public class LevelPlayRewardedVideoBaseListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoBaseListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onAdClicked:(Lcom/ironsource/mediationsdk/model/Placement;Lcom/ironsource/mediationsdk/adunit/adapter/utility/AdInfo;)V:GetOnAdClicked_Lcom_ironsource_mediationsdk_model_Placement_Lcom_ironsource_mediationsdk_adunit_adapter_utility_AdInfo_Handler:Com.Ironsource.Mediationsdk.Sdk.ILevelPlayRewardedVideoBaseListenerInvoker, IronSource-Android_v7.3.0.1\n" +
			"n_onAdClosed:(Lcom/ironsource/mediationsdk/adunit/adapter/utility/AdInfo;)V:GetOnAdClosed_Lcom_ironsource_mediationsdk_adunit_adapter_utility_AdInfo_Handler:Com.Ironsource.Mediationsdk.Sdk.ILevelPlayRewardedVideoBaseListenerInvoker, IronSource-Android_v7.3.0.1\n" +
			"n_onAdOpened:(Lcom/ironsource/mediationsdk/adunit/adapter/utility/AdInfo;)V:GetOnAdOpened_Lcom_ironsource_mediationsdk_adunit_adapter_utility_AdInfo_Handler:Com.Ironsource.Mediationsdk.Sdk.ILevelPlayRewardedVideoBaseListenerInvoker, IronSource-Android_v7.3.0.1\n" +
			"n_onAdRewarded:(Lcom/ironsource/mediationsdk/model/Placement;Lcom/ironsource/mediationsdk/adunit/adapter/utility/AdInfo;)V:GetOnAdRewarded_Lcom_ironsource_mediationsdk_model_Placement_Lcom_ironsource_mediationsdk_adunit_adapter_utility_AdInfo_Handler:Com.Ironsource.Mediationsdk.Sdk.ILevelPlayRewardedVideoBaseListenerInvoker, IronSource-Android_v7.3.0.1\n" +
			"n_onAdShowFailed:(Lcom/ironsource/mediationsdk/logger/IronSourceError;Lcom/ironsource/mediationsdk/adunit/adapter/utility/AdInfo;)V:GetOnAdShowFailed_Lcom_ironsource_mediationsdk_logger_IronSourceError_Lcom_ironsource_mediationsdk_adunit_adapter_utility_AdInfo_Handler:Com.Ironsource.Mediationsdk.Sdk.ILevelPlayRewardedVideoBaseListenerInvoker, IronSource-Android_v7.3.0.1\n" +
			"";
		mono.android.Runtime.register ("Com.Ironsource.Mediationsdk.Sdk.ILevelPlayRewardedVideoBaseListenerImplementor, IronSource-Android_v7.3.0.1", LevelPlayRewardedVideoBaseListenerImplementor.class, __md_methods);
	}


	public LevelPlayRewardedVideoBaseListenerImplementor ()
	{
		super ();
		if (getClass () == LevelPlayRewardedVideoBaseListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Com.Ironsource.Mediationsdk.Sdk.ILevelPlayRewardedVideoBaseListenerImplementor, IronSource-Android_v7.3.0.1", "", this, new java.lang.Object[] {  });
		}
	}


	public void onAdClicked (com.ironsource.mediationsdk.model.Placement p0, com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo p1)
	{
		n_onAdClicked (p0, p1);
	}

	private native void n_onAdClicked (com.ironsource.mediationsdk.model.Placement p0, com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo p1);


	public void onAdClosed (com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo p0)
	{
		n_onAdClosed (p0);
	}

	private native void n_onAdClosed (com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo p0);


	public void onAdOpened (com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo p0)
	{
		n_onAdOpened (p0);
	}

	private native void n_onAdOpened (com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo p0);


	public void onAdRewarded (com.ironsource.mediationsdk.model.Placement p0, com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo p1)
	{
		n_onAdRewarded (p0, p1);
	}

	private native void n_onAdRewarded (com.ironsource.mediationsdk.model.Placement p0, com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo p1);


	public void onAdShowFailed (com.ironsource.mediationsdk.logger.IronSourceError p0, com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo p1)
	{
		n_onAdShowFailed (p0, p1);
	}

	private native void n_onAdShowFailed (com.ironsource.mediationsdk.logger.IronSourceError p0, com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo p1);

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
