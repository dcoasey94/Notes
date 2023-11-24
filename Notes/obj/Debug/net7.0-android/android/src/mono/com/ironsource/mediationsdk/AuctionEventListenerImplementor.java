package mono.com.ironsource.mediationsdk;


public class AuctionEventListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.ironsource.mediationsdk.AuctionEventListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onAuctionFailed:(ILjava/lang/String;ILjava/lang/String;J)V:GetOnAuctionFailed_ILjava_lang_String_ILjava_lang_String_JHandler:Com.Ironsource.Mediationsdk.IAuctionEventListenerInvoker, IronSource-Android_v7.3.0.1\n" +
			"n_onAuctionSuccess:(Ljava/util/List;Ljava/lang/String;Lcom/ironsource/mediationsdk/AuctionResponseItem;Lorg/json/JSONObject;Lorg/json/JSONObject;IJILjava/lang/String;)V:GetOnAuctionSuccess_Ljava_util_List_Ljava_lang_String_Lcom_ironsource_mediationsdk_AuctionResponseItem_Lorg_json_JSONObject_Lorg_json_JSONObject_IJILjava_lang_String_Handler:Com.Ironsource.Mediationsdk.IAuctionEventListenerInvoker, IronSource-Android_v7.3.0.1\n" +
			"";
		mono.android.Runtime.register ("Com.Ironsource.Mediationsdk.IAuctionEventListenerImplementor, IronSource-Android_v7.3.0.1", AuctionEventListenerImplementor.class, __md_methods);
	}


	public AuctionEventListenerImplementor ()
	{
		super ();
		if (getClass () == AuctionEventListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Com.Ironsource.Mediationsdk.IAuctionEventListenerImplementor, IronSource-Android_v7.3.0.1", "", this, new java.lang.Object[] {  });
		}
	}


	public void onAuctionFailed (int p0, java.lang.String p1, int p2, java.lang.String p3, long p4)
	{
		n_onAuctionFailed (p0, p1, p2, p3, p4);
	}

	private native void n_onAuctionFailed (int p0, java.lang.String p1, int p2, java.lang.String p3, long p4);


	public void onAuctionSuccess (java.util.List p0, java.lang.String p1, com.ironsource.mediationsdk.AuctionResponseItem p2, org.json.JSONObject p3, org.json.JSONObject p4, int p5, long p6, int p7, java.lang.String p8)
	{
		n_onAuctionSuccess (p0, p1, p2, p3, p4, p5, p6, p7, p8);
	}

	private native void n_onAuctionSuccess (java.util.List p0, java.lang.String p1, com.ironsource.mediationsdk.AuctionResponseItem p2, org.json.JSONObject p3, org.json.JSONObject p4, int p5, long p6, int p7, java.lang.String p8);

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
