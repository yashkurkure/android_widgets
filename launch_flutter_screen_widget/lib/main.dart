import 'package:flutter/material.dart';

// This should run, when the user clicks the widget button on the home screen
void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

  // This widget is the root of your application.
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'launch_flutter_screen_widget',
      theme: ThemeData(
        primarySwatch: Colors.blue,
      ),
      home: const HelloWorldWidget(),
    );
  }
}


class HelloWorldWidget extends StatelessWidget{
  const HelloWorldWidget({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text("Main Activity"),
      ),
      body: Center(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: const <Widget>[
            Text("Hello World!"),
          ],
        )
      ),
    );
  }

}