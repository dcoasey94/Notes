package mono.com.ironsource.mediationsdk.adunit.manager.listeners;


public class AdUnitManagerListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.ironsource.mediationsdk.adunit.manager.listeners.AdUnitManagerListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onAdClicked:(Lcom/ironsource/mediationsdk/adunit/smash/bases/BaseAdUnitSmash;)V:GetOnAdClicked_Lcom_ironsource_mediationsdk_adunit_smash_bases_BaseAdUnitSmash_Handler:Com.Ironsource.Mediationsdk.Adunit.Manager.Listeners.IAdUnitManagerListenerInvoker, IronSource-Android_v7.3.0.1\n" +
			"n_onAdLoadFailed:(Lcom/ironsource/mediationsdk/logger/IronSourceError;Lcom/ironsource/mediationsdk/adunit/smash/bases/BaseAdUnitSmash;)V:GetOnAdLoadFailed_Lcom_ironsource_mediationsdk_logger_IronSourceError_Lcom_ironsource_mediationsdk_adunit_smash_bases_BaseAdUnitSmash_Handler:Com.Ironsource.Mediationsdk.Adunit.Manager.Listeners.IAdUnitManagerListenerInvoker, IronSource-Android_v7.3.0.1\n" +
			"n_onAdLoadSuccess:(Lcom/ironsource/mediationsdk/adunit/smash/bases/BaseAdUnitSmash;)V:GetOnAdLoadSuccess_Lcom_ironsource_mediationsdk_adunit_smash_bases_BaseAdUnitSmash_Handler:Com.Ironsource.Mediationsdk.Adunit.Manager.Listeners.IAdUnitManagerListenerInvoker, IronSource-Android_v7.3.0.1\n" +
			"n_onAdOpened:(Lcom/ironsource/mediationsdk/adunit/smash/bases/BaseAdUnitSmash;)V:GetOnAdOpened_Lcom_ironsource_mediationsdk_adunit_smash_bases_BaseAdUnitSmash_Handler:Com.Ironsource.Mediationsdk.Adunit.Manager.Listeners.IAdUnitManagerListenerInvoker, IronSource-Android_v7.3.0.1\n" +
			"";
		mono.android.Runtime.register ("Com.Ironsource.Mediationsdk.Adunit.Manager.Listeners.IAdUnitManagerListenerImplementor, IronSource-Android_v7.3.0.1", AdUnitManagerListenerImplementor.class, __md_methods);
	}


	public AdUnitManagerListenerImplementor ()
	{
		super ();
		if (getClass () == AdUnitManagerListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Com.Ironsource.Mediationsdk.Adunit.Manager.Listeners.IAdUnitManagerListenerImplementor, IronSource-Android_v7.3.0.1", "", this, new java.lang.Object[] {  });
		}
	}


	public void onAdClicked (com.ironsource.mediationsdk.adunit.smash.bases.BaseAdUnitSmash p0)
	{
		n_onAdClicked (p0);
	}

	private native void n_onAdClicked (com.ironsource.mediationsdk.adunit.smash.bases.BaseAdUnitSmash p0);


	public void onAdLoadFailed (com.ironsource.mediationsdk.logger.IronSourceError p0, com.ironsource.mediationsdk.adunit.smash.bases.BaseAdUnitSmash p1)
	{
		n_onAdLoadFailed (p0, p1);
	}

	private native void n_onAdLoadFailed (com.ironsource.mediationsdk.logger.IronSourceError p0, com.ironsource.mediationsdk.adunit.smash.bases.BaseAdUnitSmash p1);


	public void onAdLoadSuccess (com.ironsource.mediationsdk.adunit.smash.bases.BaseAdUnitSmash p0)
	{
		n_onAdLoadSuccess (p0);
	}

	private native void n_onAdLoadSuccess (com.ironsource.mediationsdk.adunit.smash.bases.BaseAdUnitSmash p0);


	public void onAdOpened (com.ironsource.mediationsdk.adunit.smash.bases.BaseAdUnitSmash p0)
	{
		n_onAdOpened (p0);
	}

	private native void n_onAdOpened (com.ironsource.mediationsdk.adunit.smash.bases.BaseAdUnitSmash p0);

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
