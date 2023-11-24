package mono.com.ironsource.mediationsdk;


public class ProgBannerManagerListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.ironsource.mediationsdk.ProgBannerManagerListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onBannerClicked:(Lcom/ironsource/mediationsdk/ProgBannerSmash;)V:GetOnBannerClicked_Lcom_ironsource_mediationsdk_ProgBannerSmash_Handler:Com.Ironsource.Mediationsdk.IProgBannerManagerListenerInvoker, IronSource-Android_v7.3.0.1\n" +
			"n_onBannerLeftApplication:(Lcom/ironsource/mediationsdk/ProgBannerSmash;)V:GetOnBannerLeftApplication_Lcom_ironsource_mediationsdk_ProgBannerSmash_Handler:Com.Ironsource.Mediationsdk.IProgBannerManagerListenerInvoker, IronSource-Android_v7.3.0.1\n" +
			"n_onBannerLoadFailed:(Lcom/ironsource/mediationsdk/logger/IronSourceError;Lcom/ironsource/mediationsdk/ProgBannerSmash;Z)V:GetOnBannerLoadFailed_Lcom_ironsource_mediationsdk_logger_IronSourceError_Lcom_ironsource_mediationsdk_ProgBannerSmash_ZHandler:Com.Ironsource.Mediationsdk.IProgBannerManagerListenerInvoker, IronSource-Android_v7.3.0.1\n" +
			"n_onBannerLoadSuccess:(Lcom/ironsource/mediationsdk/ProgBannerSmash;Landroid/view/View;Landroid/widget/FrameLayout$LayoutParams;)V:GetOnBannerLoadSuccess_Lcom_ironsource_mediationsdk_ProgBannerSmash_Landroid_view_View_Landroid_widget_FrameLayout_LayoutParams_Handler:Com.Ironsource.Mediationsdk.IProgBannerManagerListenerInvoker, IronSource-Android_v7.3.0.1\n" +
			"n_onBannerScreenDismissed:(Lcom/ironsource/mediationsdk/ProgBannerSmash;)V:GetOnBannerScreenDismissed_Lcom_ironsource_mediationsdk_ProgBannerSmash_Handler:Com.Ironsource.Mediationsdk.IProgBannerManagerListenerInvoker, IronSource-Android_v7.3.0.1\n" +
			"n_onBannerScreenPresented:(Lcom/ironsource/mediationsdk/ProgBannerSmash;)V:GetOnBannerScreenPresented_Lcom_ironsource_mediationsdk_ProgBannerSmash_Handler:Com.Ironsource.Mediationsdk.IProgBannerManagerListenerInvoker, IronSource-Android_v7.3.0.1\n" +
			"n_onBannerShown:(Lcom/ironsource/mediationsdk/ProgBannerSmash;)V:GetOnBannerShown_Lcom_ironsource_mediationsdk_ProgBannerSmash_Handler:Com.Ironsource.Mediationsdk.IProgBannerManagerListenerInvoker, IronSource-Android_v7.3.0.1\n" +
			"";
		mono.android.Runtime.register ("Com.Ironsource.Mediationsdk.IProgBannerManagerListenerImplementor, IronSource-Android_v7.3.0.1", ProgBannerManagerListenerImplementor.class, __md_methods);
	}


	public ProgBannerManagerListenerImplementor ()
	{
		super ();
		if (getClass () == ProgBannerManagerListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Com.Ironsource.Mediationsdk.IProgBannerManagerListenerImplementor, IronSource-Android_v7.3.0.1", "", this, new java.lang.Object[] {  });
		}
	}


	public void onBannerClicked (com.ironsource.mediationsdk.ProgBannerSmash p0)
	{
		n_onBannerClicked (p0);
	}

	private native void n_onBannerClicked (com.ironsource.mediationsdk.ProgBannerSmash p0);


	public void onBannerLeftApplication (com.ironsource.mediationsdk.ProgBannerSmash p0)
	{
		n_onBannerLeftApplication (p0);
	}

	private native void n_onBannerLeftApplication (com.ironsource.mediationsdk.ProgBannerSmash p0);


	public void onBannerLoadFailed (com.ironsource.mediationsdk.logger.IronSourceError p0, com.ironsource.mediationsdk.ProgBannerSmash p1, boolean p2)
	{
		n_onBannerLoadFailed (p0, p1, p2);
	}

	private native void n_onBannerLoadFailed (com.ironsource.mediationsdk.logger.IronSourceError p0, com.ironsource.mediationsdk.ProgBannerSmash p1, boolean p2);


	public void onBannerLoadSuccess (com.ironsource.mediationsdk.ProgBannerSmash p0, android.view.View p1, android.widget.FrameLayout.LayoutParams p2)
	{
		n_onBannerLoadSuccess (p0, p1, p2);
	}

	private native void n_onBannerLoadSuccess (com.ironsource.mediationsdk.ProgBannerSmash p0, android.view.View p1, android.widget.FrameLayout.LayoutParams p2);


	public void onBannerScreenDismissed (com.ironsource.mediationsdk.ProgBannerSmash p0)
	{
		n_onBannerScreenDismissed (p0);
	}

	private native void n_onBannerScreenDismissed (com.ironsource.mediationsdk.ProgBannerSmash p0);


	public void onBannerScreenPresented (com.ironsource.mediationsdk.ProgBannerSmash p0)
	{
		n_onBannerScreenPresented (p0);
	}

	private native void n_onBannerScreenPresented (com.ironsource.mediationsdk.ProgBannerSmash p0);


	public void onBannerShown (com.ironsource.mediationsdk.ProgBannerSmash p0)
	{
		n_onBannerShown (p0);
	}

	private native void n_onBannerShown (com.ironsource.mediationsdk.ProgBannerSmash p0);

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
