package mono.com.ironsource.mediationsdk.testSuite.listeners;


public class ITestSuiteUILifeCycleListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.ironsource.mediationsdk.testSuite.listeners.ITestSuiteUILifeCycleListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onClosed:()V:GetOnClosedHandler:Com.Ironsource.Mediationsdk.TestSuite.Listeners.ITestSuiteUILifeCycleListenerInvoker, IronSource-Android_v7.3.0.1\n" +
			"n_onUIReady:()V:GetOnUIReadyHandler:Com.Ironsource.Mediationsdk.TestSuite.Listeners.ITestSuiteUILifeCycleListenerInvoker, IronSource-Android_v7.3.0.1\n" +
			"";
		mono.android.Runtime.register ("Com.Ironsource.Mediationsdk.TestSuite.Listeners.ITestSuiteUILifeCycleListenerImplementor, IronSource-Android_v7.3.0.1", ITestSuiteUILifeCycleListenerImplementor.class, __md_methods);
	}


	public ITestSuiteUILifeCycleListenerImplementor ()
	{
		super ();
		if (getClass () == ITestSuiteUILifeCycleListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Com.Ironsource.Mediationsdk.TestSuite.Listeners.ITestSuiteUILifeCycleListenerImplementor, IronSource-Android_v7.3.0.1", "", this, new java.lang.Object[] {  });
		}
	}


	public void onClosed ()
	{
		n_onClosed ();
	}

	private native void n_onClosed ();


	public void onUIReady ()
	{
		n_onUIReady ();
	}

	private native void n_onUIReady ();

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
