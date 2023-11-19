using Android.App;
using Android.Content.PM;
using Android.OS;
using com.chartboost.sdk;
using com.chartboost.sdk.ads;

namespace Notes
{
    [Activity(Theme = "@style/Maui.SplashTheme", MainLauncher = true, ConfigurationChanges = ConfigChanges.ScreenSize | ConfigChanges.Orientation | ConfigChanges.UiMode | ConfigChanges.ScreenLayout | ConfigChanges.SmallestScreenSize | ConfigChanges.Density)]
    public class MainActivity : MauiAppCompatActivity
    {
		protected override void OnCreate(Bundle savedInstanceState)
{
    base.OnCreate(savedInstanceState);
    Chartboost.Start("6556de4202db1dc1f4910d49", "715763ec356bcd27961c9a06f9f683a9168aaaf2");
}
    }
}