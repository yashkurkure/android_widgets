# Launch Flutter App Through Android Widget

Adding Android widgets to flutter apps

This app is a demonstration of adding android widgets to flutter apps.

## Widgets and Flutter

The problem at hand is that, while flutter apps can run on both android and iOS devices, there is no widget built in widget suppoer. Thus, the only way to include widgets with your flutter app is to write native code that provide the implementation of widgets. This would be different for both android and iOS.
This app is an example of creating android widgets for te flutter app.

The steps are fairly similar to how you create widgets for any other andoird app. You must open the adnroid/ directory of your flutter project in andoid studio and create your widget here. This includes following all the usual steps of registering a broadcast receiever, creating the xml file for AppWidgetProviderInfo etc.

In this implementation, I have simply added the same files for creating the widget that exists in this [app](https://github.com/yashkurkure/android_widgets/tree/master/launch_activity_widget)

The resulting widget simply launches the flutter app in its entry point main().
