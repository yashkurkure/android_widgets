# Launch Activity Widget

This is an example widget which can get you started on creating a simple widget. This app contains a widget, which has a button to luanch the main activity of the app.

## What files to create to implement widgets?

1. A layout file, specifiying the layout of your widget. Create this in res/layout/. In the context of this app, the corresponding file is [example_widget.xml](https://github.com/yashkurkure/android_widgets/blob/master/launch_activity_widget/app/src/main/res/layout/example_widget.xml).
2. A xml file defining the appwidget_provider. This is the decalration for the AppWidgetProviderInfo object. This file specifies the essential quantities of a widget such as ressizing, minimum dimensions, default dimensions, updatePeriod, etc. Create this in res/xml/. The corresponding file w.r.t this app is [example_appwidget_info.xml](https://github.com/yashkurkure/android_widgets/blob/master/launch_activity_widget/app/src/main/res/xml/example_appwidget_info.xml)

## Next you will need to create a AppWidgetProvider for your widget.

This can be done by extending the AppWidgetProvider class or the BroadcastReceiver class, we will use the AppWIdgetProvider.

The AppWidgetProvider extends the BroadcastReceiver class, so using either works. The AppWidgetProvider is a simple convinience, as it provied simple callbacks for each corresponding intent the onReceive method receives.

The most import callback in AppWidgetProvider is the onUpdate callback. This is called to update the widget at intervals defined by the updatePeriodMillis attribute in the AppWidgetProviderInfo. This method is also called when the user adds the widget, so it should perform the essential setup, such as define event handlers for View objects or start a job to load data to be displayed in the widget. However, if you have declared a configuration activity without the configuration_optional flag, this method is not called when the user adds the widget, but is called for the subsequent updates. It is the responsibility of the configuration activity to perform the first update when configuration is complete. 

[Additional Info Here](https://developer.android.com/guide/topics/appwidgets#use_the_appwidgetprovider_class_to_handle_widget_broadcasts)

Look at the file [ExampleAppWidgetProvider](https://github.com/yashkurkure/android_widgets/blob/master/launch_activity_widget/app/src/main/java/com/yash/examples/launchactivitywidget/ExampleAppWidgetProvider.java) to see my implementation. 

## Lastly, update the manifest file.

Widgets use broadcasts to communiate with the app, and the AppWidgetProvider is simply a BroadcastReceiver. Thus, we will need to register a broadcast receiver in the manifest file with the appropriate inent filter. Look at the [manifest](https://github.com/yashkurkure/android_widgets/blob/master/launch_activity_widget/app/src/main/AndroidManifest.xml) for more detials on this.
