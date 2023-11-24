package mono.com.ironsource.mediationsdk.bidding;


public class BiddingDataManager_CollectBiddingDataListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.ironsource.mediationsdk.bidding.BiddingDataManager.CollectBiddingDataListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onFailure:(Ljava/lang/String;)V:GetOnFailure_Ljava_lang_String_Handler:Com.Ironsource.Mediationsdk.Bidding.BiddingDataManager/ICollectBiddingDataListenerInvoker, IronSource-Android_v7.3.0.1\n" +
			"n_onSuccess:(Ljava/util/List;JLjava/util/List;)V:GetOnSuccess_Ljava_util_List_JLjava_util_List_Handler:Com.Ironsource.Mediationsdk.Bidding.BiddingDataManager/ICollectBiddingDataListenerInvoker, IronSource-Android_v7.3.0.1\n" +
			"";
		mono.android.Runtime.register ("Com.Ironsource.Mediationsdk.Bidding.BiddingDataManager+ICollectBiddingDataListenerImplementor, IronSource-Android_v7.3.0.1", BiddingDataManager_CollectBiddingDataListenerImplementor.class, __md_methods);
	}


	public BiddingDataManager_CollectBiddingDataListenerImplementor ()
	{
		super ();
		if (getClass () == BiddingDataManager_CollectBiddingDataListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Com.Ironsource.Mediationsdk.Bidding.BiddingDataManager+ICollectBiddingDataListenerImplementor, IronSource-Android_v7.3.0.1", "", this, new java.lang.Object[] {  });
		}
	}


	public void onFailure (java.lang.String p0)
	{
		n_onFailure (p0);
	}

	private native void n_onFailure (java.lang.String p0);


	public void onSuccess (java.util.List p0, long p1, java.util.List p2)
	{
		n_onSuccess (p0, p1, p2);
	}

	private native void n_onSuccess (java.util.List p0, long p1, java.util.List p2);

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
