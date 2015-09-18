javac -cp /home/pi/temp/bluecove-gpl-2.1.0/target/bluecove-gpl-2.1.0.jar:/home/pi/temp/bluecove/target/bluecove-2.1.0.jar:.: SimpleSPPServer.java

export CLASSPATH=$CLASSPATH:/home/pi/home_auto/bluetooth/lib/bluecove-gpl-2.1.0.jar:/home/pi/home_auto/bluetooth/lib/bluecove-2.1.0.jar:.:
export CLASSPATH=$CLASSPATH:/home/pi/intellizones/iot/ble4.0/Bluetooth/lib-linux/bluecove-gpl-2.1.0.jar:/home/pi/intellizones/iot/ble4.0/Bluetooth/lib-linux/bluecove-2.1.0.jar:.:



javac -cp /home/pi/intellizones/iot/ble4.0/BleutoothProject/lib-linux/bluecove-gpl-2.1.0.jar:/home/pi/intellizones/iot/ble4.0/BleutoothProject/lib-linux/bluecove-2.1.0.jar:.: com/homeauto/bleutooth/RemoteBluetoothServer.java