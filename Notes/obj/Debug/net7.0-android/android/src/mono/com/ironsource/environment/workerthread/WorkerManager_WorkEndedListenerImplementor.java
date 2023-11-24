package mono.com.ironsource.environment.workerthread;


public class WorkerManager_WorkEndedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.ironsource.environment.workerthread.WorkerManager.WorkEndedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onWorkCompleted:(Ljava/util/List;J)V:GetOnWorkCompleted_Ljava_util_List_JHandler:Com.Ironsource.Environment.Workerthread.WorkerManager/IWorkEndedListenerInvoker, IronSource-Android_v7.3.0.1\n" +
			"n_onWorkFailed:(Ljava/lang/String;)V:GetOnWorkFailed_Ljava_lang_String_Handler:Com.Ironsource.Environment.Workerthread.WorkerManager/IWorkEndedListenerInvoker, IronSource-Android_v7.3.0.1\n" +
			"";
		mono.android.Runtime.register ("Com.Ironsource.Environment.Workerthread.WorkerManager+IWorkEndedListenerImplementor, IronSource-Android_v7.3.0.1", WorkerManager_WorkEndedListenerImplementor.class, __md_methods);
	}


	public WorkerManager_WorkEndedListenerImplementor ()
	{
		super ();
		if (getClass () == WorkerManager_WorkEndedListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Com.Ironsource.Environment.Workerthread.WorkerManager+IWorkEndedListenerImplementor, IronSource-Android_v7.3.0.1", "", this, new java.lang.Object[] {  });
		}
	}


	public void onWorkCompleted (java.util.List p0, long p1)
	{
		n_onWorkCompleted (p0, p1);
	}

	private native void n_onWorkCompleted (java.util.List p0, long p1);


	public void onWorkFailed (java.lang.String p0)
	{
		n_onWorkFailed (p0);
	}

	private native void n_onWorkFailed (java.lang.String p0);

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
