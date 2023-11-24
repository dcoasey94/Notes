package mono.com.iab.omid.library.ironsrc.adsession;


public class PossibleObstructionListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.iab.omid.library.ironsrc.adsession.PossibleObstructionListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onPossibleObstructionsDetected:(Ljava/lang/String;Ljava/util/List;)V:GetOnPossibleObstructionsDetected_Ljava_lang_String_Ljava_util_List_Handler:Com.Iab.Omid.Library.Ironsrc.Adsession.IPossibleObstructionListenerInvoker, IronSource-Android_v7.3.0.1\n" +
			"";
		mono.android.Runtime.register ("Com.Iab.Omid.Library.Ironsrc.Adsession.IPossibleObstructionListenerImplementor, IronSource-Android_v7.3.0.1", PossibleObstructionListenerImplementor.class, __md_methods);
	}


	public PossibleObstructionListenerImplementor ()
	{
		super ();
		if (getClass () == PossibleObstructionListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Com.Iab.Omid.Library.Ironsrc.Adsession.IPossibleObstructionListenerImplementor, IronSource-Android_v7.3.0.1", "", this, new java.lang.Object[] {  });
		}
	}


	public void onPossibleObstructionsDetected (java.lang.String p0, java.util.List p1)
	{
		n_onPossibleObstructionsDetected (p0, p1);
	}

	private native void n_onPossibleObstructionsDetected (java.lang.String p0, java.util.List p1);

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
