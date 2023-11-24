package mono.com.ironsource.mediationsdk.impressionData;


public class ImpressionDataListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.ironsource.mediationsdk.impressionData.ImpressionDataListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onImpressionSuccess:(Lcom/ironsource/mediationsdk/impressionData/ImpressionData;)V:GetOnImpressionSuccess_Lcom_ironsource_mediationsdk_impressionData_ImpressionData_Handler:Com.Ironsource.Mediationsdk.ImpressionData.ILevelPlayImpressionDataListenerInvoker, IronSource-Android_v7.3.0.1\n" +
			"";
		mono.android.Runtime.register ("Com.Ironsource.Mediationsdk.ImpressionData.ILevelPlayImpressionDataListenerImplementor, IronSource-Android_v7.3.0.1", ImpressionDataListenerImplementor.class, __md_methods);
	}


	public ImpressionDataListenerImplementor ()
	{
		super ();
		if (getClass () == ImpressionDataListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Com.Ironsource.Mediationsdk.ImpressionData.ILevelPlayImpressionDataListenerImplementor, IronSource-Android_v7.3.0.1", "", this, new java.lang.Object[] {  });
		}
	}


	public void onImpressionSuccess (com.ironsource.mediationsdk.impressionData.ImpressionData p0)
	{
		n_onImpressionSuccess (p0);
	}

	private native void n_onImpressionSuccess (com.ironsource.mediationsdk.impressionData.ImpressionData p0);

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
