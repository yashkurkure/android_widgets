package com.yash.examples.flutter.launch_flutter_screen_widget;


import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;


/**
 * Notes:
 * 1) An alternate way is to extends BroadcastReceiver, and then implement all from scratch.
 *      In that case you will need to handle the following intents:
 *          ACTION_APPWIDGET_UPDATE
 *          ACTION_APPWIDGET_DELETED
 *          ACTION_APPWIDGET_ENABLED
 *          ACTION_APPWIDGET_DISABLED
 *          ACTION_APPWIDGET_OPTIONS_CHANGED
 *
 * 2) The AppWidgetProvider class extends BroadcastReceiver, the AppWidgetProvider has the following overridable methods:
 *      onUpdate
 *      onAppWidgetOptionsChanged
 *      onDeleted
 *      onDisabled
 *      onReceive
 *
 *      Notice how each intent is now simplified into a callback
 * */
public class ExampleAppWidgetProvider extends AppWidgetProvider
{
    /**
     * context: The Context in which this receiver is running.
     *
     * appWidgetManager: A AppWidgetManager object you can call AppWidgetManager.updateAppWidget(ComponentName, RemoteViews) on.
     *
     * appWidgetIds: The appWidgetIds for which an update is needed.
     *                      Note that this may be all of the AppWidget instances for this provider, or just a subset of them.
     * */
    @Override
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {

        // We loop through the widget ids for which updates are needed
        for (int appWidgetId : appWidgetIds){

            // To set the click listener for our button, we first need an intent that can launch the MainActivity
            Intent intentLaunchMainActivity = new Intent(context, MainActivity.class); //Explicit Intent

            // Create a pending intent, which can be used by the widget to use the app's permissions to launch the activity
            PendingIntent pendingIntentLaunchMainActivity = PendingIntent.getActivity(context, 0, intentLaunchMainActivity, 0);

            // RemoteViews are responsible for displaying our layout in another process.
            RemoteViews views = new RemoteViews(context.getPackageName(), R.layout.example_widget);

            // Set the click listener for the button in the widget
            views.setOnClickPendingIntent(R.id.example_widget_button, pendingIntentLaunchMainActivity);

            //update the widget
            appWidgetManager.updateAppWidget(appWidgetId, views);
        }
    }
}
