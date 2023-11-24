package mono.com.ironsource.lifecycle;


public class IronsourceLifecycleListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.ironsource.lifecycle.IronsourceLifecycleListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_appPaused:()V:GetAppPausedHandler:Com.Ironsource.Lifecycle.IIronsourceLifecycleListenerInvoker, IronSource-Android_v7.3.0.1\n" +
			"n_appResumed:()V:GetAppResumedHandler:Com.Ironsource.Lifecycle.IIronsourceLifecycleListenerInvoker, IronSource-Android_v7.3.0.1\n" +
			"n_appStarted:()V:GetAppStartedHandler:Com.Ironsource.Lifecycle.IIronsourceLifecycleListenerInvoker, IronSource-Android_v7.3.0.1\n" +
			"n_appStopped:()V:GetAppStoppedHandler:Com.Ironsource.Lifecycle.IIronsourceLifecycleListenerInvoker, IronSource-Android_v7.3.0.1\n" +
			"";
		mono.android.Runtime.register ("Com.Ironsource.Lifecycle.IIronsourceLifecycleListenerImplementor, IronSource-Android_v7.3.0.1", IronsourceLifecycleListenerImplementor.class, __md_methods);
	}


	public IronsourceLifecycleListenerImplementor ()
	{
		super ();
		if (getClass () == IronsourceLifecycleListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Com.Ironsource.Lifecycle.IIronsourceLifecycleListenerImplementor, IronSource-Android_v7.3.0.1", "", this, new java.lang.Object[] {  });
		}
	}


	public void appPaused ()
	{
		n_appPaused ();
	}

	private native void n_appPaused ();


	public void appResumed ()
	{
		n_appResumed ();
	}

	private native void n_appResumed ();


	public void appStarted ()
	{
		n_appStarted ();
	}

	private native void n_appStarted ();


	public void appStopped ()
	{
		n_appStopped ();
	}

	private native void n_appStopped ();

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
