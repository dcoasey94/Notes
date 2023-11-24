package mono.com.ironsource.mediationsdk.testSuite.listeners;


public class TestSuiteJavaScriptEvaluatorListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.ironsource.mediationsdk.testSuite.listeners.TestSuiteJavaScriptEvaluatorListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onAdCallbackReceived:(Ljava/lang/String;Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;Ljava/util/List;)V:GetOnAdCallbackReceived_Ljava_lang_String_Lcom_ironsource_mediationsdk_IronSource_AD_UNIT_Ljava_util_List_Handler:Com.Ironsource.Mediationsdk.TestSuite.Listeners.ITestSuiteJavaScriptEvaluatorListenerInvoker, IronSource-Android_v7.3.0.1\n" +
			"";
		mono.android.Runtime.register ("Com.Ironsource.Mediationsdk.TestSuite.Listeners.ITestSuiteJavaScriptEvaluatorListenerImplementor, IronSource-Android_v7.3.0.1", TestSuiteJavaScriptEvaluatorListenerImplementor.class, __md_methods);
	}


	public TestSuiteJavaScriptEvaluatorListenerImplementor ()
	{
		super ();
		if (getClass () == TestSuiteJavaScriptEvaluatorListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Com.Ironsource.Mediationsdk.TestSuite.Listeners.ITestSuiteJavaScriptEvaluatorListenerImplementor, IronSource-Android_v7.3.0.1", "", this, new java.lang.Object[] {  });
		}
	}


	public void onAdCallbackReceived (java.lang.String p0, com.ironsource.mediationsdk.IronSource.AD_UNIT p1, java.util.List p2)
	{
		n_onAdCallbackReceived (p0, p1, p2);
	}

	private native void n_onAdCallbackReceived (java.lang.String p0, com.ironsource.mediationsdk.IronSource.AD_UNIT p1, java.util.List p2);

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
