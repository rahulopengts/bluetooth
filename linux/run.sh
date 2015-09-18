#!/bin/bash

rm com/homeauto/bleutooth/*.class
rm com/homeauto/bleutooth/dataprocessor/*.class
rm com/homeauto/bleutooth/dataprocessor/wifi/*.class


export CLASSPATH=$CLASSPATH:/home/pi/home_auto/bluetooth/lib/bluecove-gpl-2.1.0.jar:/home/pi/home_auto/bluetooth/lib/bluecove-2.1.0.jar:.:

javac -cp /home/pi/home_auto/bluetooth/lib/bluecove-gpl-2.1.0.jar:/home/pi/home_auto/bluetooth/lib/bluecove-2.1.0.jar:.: /home/pi/home_auto/bluetooth/src/com/homeauto/bleutooth/RemoteBluetoothServer.java

