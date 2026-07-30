---
title: "System::Net::Sockets::Socket Klasse"
linktitle: "Socket"
second_title: "Aspose.Font für C++"
description: "System::Net::Sockets::Socket Klasse. Die Socket-Klasse implementiert die Berkeley-Sockets-Schnittstelle in C++."
type: docs
weight: 400
url: /de/cpp/system.net.sockets/socket/
---
## Socket class


Die [Socket](./) Klasse implementiert die Berkeley-Sockets-Schnittstelle.

```cpp
class Socket : public System::IDisposable
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Accept](./accept/)() | Erstellt einen neuen Socket für die neu erstellte Verbindung. |
| [BeginConnect](./beginconnect/)(System::SharedPtr\<EndPoint\>, AsyncCallback, System::SharedPtr\<Object\>) | Startet einen asynchronen Verbindungsaufbau. |
| [BeginConnect](./beginconnect/)(String, int32_t, AsyncCallback, System::SharedPtr\<Object\>) | Startet einen asynchronen Verbindungsaufbau. |
| [BeginConnect](./beginconnect/)(System::SharedPtr\<IPAddress\>, int32_t, AsyncCallback, System::SharedPtr\<Object\>) | Startet einen asynchronen Verbindungsaufbau. |
| [BeginConnect](./beginconnect/)(System::ArrayPtr\<System::SharedPtr\<IPAddress\>\>, int32_t, AsyncCallback, System::SharedPtr\<Object\>) | Startet einen asynchronen Verbindungsaufbau. |
| [BeginReceive](./beginreceive/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, AsyncCallback, System::SharedPtr\<Object\>) | Startet einen asynchronen Schreibvorgang. |
| [BeginSend](./beginsend/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, AsyncCallback, System::SharedPtr\<Object\>) | Startet einen asynchronen Sendevorgang. |
| [Bind](./bind/)(System::SharedPtr\<EndPoint\>) | Bindet den Socket an den angegebenen lokalen Endpunkt. |
| [Close](./close/)() | Schließt die Socket-Verbindung. |
| [Close](./close/)(int) | Schließt die Socket-Verbindung mit dem angegebenen Timeout, um das Senden von zwischengespeicherten Daten zu ermöglichen. |
| [Connect](./connect/)(System::SharedPtr\<EndPoint\>) | Stellt eine Verbindung zum angegebenen Remote-Endpunkt her. |
| [Connect](./connect/)(System::SharedPtr\<IPAddress\>, int32_t) | Stellt eine Verbindung zum angegebenen Remote-Endpunkt her. |
| [Connect](./connect/)(String, int32_t) | Stellt eine Verbindung zum angegebenen Remote-Endpunkt her. |
| [Connect](./connect/)(System::ArrayPtr\<System::SharedPtr\<IPAddress\>\>, int32_t) | Stellt eine Verbindung zum angegebenen Remote-Endpunkt her. |
| [Dispose](./dispose/)() override | Tut nichts. |
| [EndConnect](./endconnect/)(System::SharedPtr\<IAsyncResult\>) | Wartet, bis der angegebene asynchrone Verbindungsaufbau abgeschlossen ist. |
| [EndReceive](./endreceive/)(System::SharedPtr\<IAsyncResult\>) | Wartet, bis der angegebene asynchrone Empfangsvorgang abgeschlossen ist. |
| [EndReceive](./endreceive/)(System::SharedPtr\<IAsyncResult\>, SocketError\&) | Wartet, bis der angegebene asynchrone Empfangsvorgang abgeschlossen ist. |
| [EndSend](./endsend/)(System::SharedPtr\<IAsyncResult\>) | Wartet, bis der angegebene asynchrone Sendevorgang abgeschlossen ist. |
| [EndSend](./endsend/)(System::SharedPtr\<IAsyncResult\>, SocketError\&) | Wartet, bis der angegebene asynchrone Sendevorgang abgeschlossen ist. |
| [get_AddressFamily](./get_addressfamily/)() | Gibt die Adressfamilie zurück. |
| [get_Available](./get_available/)() | Ermittelt die Anzahl der vom Netzwerk empfangenen Bytes, die zum Lesen verfügbar sind. |
| [get_Blocking](./get_blocking/)() | Ermittelt einen Wert, der angibt, ob der Socket im Blockierungsmodus ist. |
| [get_Connected](./get_connected/)() | Gibt einen Wert zurück, der angibt, ob der Socket mit dem Remote-Host verbunden ist. |
| [get_DontFragment](./get_dontfragment/)() | Ermittelt einen Wert, der angibt, ob der Socket die Fragmentierung von IP-Datagrammen zulässt. |
| [get_DualMode](./get_dualmode/)() | Ermittelt einen Wert, der angibt, ob der Socket im Dualmodus ist. |
| [get_EnableBroadcast](./get_enablebroadcast/)() | Ermittelt einen Wert, der angibt, ob der Socket Broadcast-Pakete zulässt. |
| [get_ExclusiveAddressUse](./get_exclusiveaddressuse/)() | Ermittelt einen Wert, der angibt, ob nur ein Prozess den Socket an einen Port binden kann. |
| [get_IsBound](./get_isbound/)() | Gibt einen Wert zurück, der angibt, ob der Socket an einen bestimmten lokalen Port gebunden ist. |
| [get_LingerState](./get_lingerstate/)() | Ermittelt einen Wert, der angibt, ob der Socket das Schließen verzögert, um alle ausstehenden Daten zu senden. |
| [get_LocalEndPoint](./get_localendpoint/)() | Gibt den lokalen Endpunkt zurück. |
| [get_MulticastLoopback](./get_multicastloopback/)() | Ermittelt einen Wert, der angibt, ob der Socket ausgehende Multicast-Pakete empfängt. |
| [get_NoDelay](./get_nodelay/)() | Gibt einen Wert zurück, der anzeigt, ob der Socket den Nagle-Algorithmus verwendet. |
| static [get_OSSupportsIPv4](./get_ossupportsipv4/)() | Gibt einen Wert zurück, der anzeigt, ob das Betriebssystem und die Netzwerkadapter IPv4 unterstützen. |
| static [get_OSSupportsIPv6](./get_ossupportsipv6/)() | Gibt einen Wert zurück, der anzeigt, ob das Betriebssystem und die Netzwerkadapter IPv6 unterstützen. |
| [get_ProtocolType](./get_protocoltype/)() | Gibt den Protokolltyp zurück. |
| [get_ReceiveBufferSize](./get_receivebuffersize/)() | Ermittelt die Größe des Empfangspuffers. |
| [get_ReceiveTimeout](./get_receivetimeout/)() | Ermittelt einen Zeitraum, nach dem ein 'Receive'-Aufruf abläuft. |
| [get_RemoteEndPoint](./get_remoteendpoint/)() | Gibt den entfernten Endpunkt zurück. |
| [get_SendBufferSize](./get_sendbuffersize/)() | Ermittelt die Größe des Sendepuffers. |
| [get_SendTimeout](./get_sendtimeout/)() | Ermittelt einen Zeitraum, nach dem ein 'Send'-Aufruf abläuft. |
| [get_SocketType](./get_sockettype/)() | Gibt den Socket-Typ zurück. |
| static [get_SupportsIPv4](./get_supportsipv4/)() | RTTI-Informationen. |
| [get_Ttl](./get_ttl/)() | Ermittelt den TTL-Wert. |
| [GetImpl](./getimpl/)() const | Gibt einen Zeiger auf die Implementierung zurück. |
| [GetSocketOption](./getsocketoption/)(SocketOptionLevel, SocketOptionName) | Gibt den Wert zurück, der dem angegebenen Optionsnamen entspricht. |
| [GetSocketOption](./getsocketoption/)(SocketOptionLevel, SocketOptionName, System::ArrayPtr\<uint8_t\>) | Ermittelt den Wert, der dem angegebenen Optionsnamen entspricht. |
| [GetSocketOption](./getsocketoption/)(SocketOptionLevel, SocketOptionName, int32_t) | Gibt den Wert zurück, der dem angegebenen Optionsnamen entspricht. |
| [IOControl](./iocontrol/)(int32_t, System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) | Legt niedrigstufige Betriebsmodi für den Socket fest. |
| [IOControl](./iocontrol/)(IOControlCode, System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) | Legt niedrigstufige Betriebsmodi für den Socket fest. |
| [Listen](./listen/)(int32_t) | Ändert den Socket-Zustand zu 'listen'. |
| [Poll](./poll/)(int32_t, SelectMode) | Gibt den Status des Sockets basierend auf dem angegebenen Abfragemodus zurück. |
| [Receive](./receive/)(System::ArrayPtr\<uint8_t\>, int32_t, SocketFlags) | Empfängt Daten vom Socket und schreibt sie in das angegebene Byte-Array. |
| [Receive](./receive/)(System::Details::ArrayView\<uint8_t\>, int32_t, SocketFlags) | Empfängt Daten vom Socket und schreibt sie in das angegebene Byte-Array. |
| [Receive](./receive/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, SocketFlags) | Empfängt Daten vom Socket und schreibt sie in das angegebene Byte-Array. |
| [Receive](./receive/)(System::ArrayPtr\<uint8_t\>, SocketFlags) | Empfängt Daten vom Socket und schreibt sie in das angegebene Byte-Array. |
| [Receive](./receive/)(System::Details::ArrayView\<uint8_t\>, SocketFlags) | Empfängt Daten vom Socket und schreibt sie in das angegebene Byte-Array. |
| [Receive](./receive/)(System::Details::StackArray\<uint8_t, N\>\&, SocketFlags) | Empfängt Daten vom Socket und schreibt sie in das angegebene Byte-Array. |
| [Receive](./receive/)(System::ArrayPtr\<uint8_t\>) | Empfängt Daten vom Socket und schreibt sie in das angegebene Byte-Array. |
| [Receive](./receive/)(System::Details::ArrayView\<uint8_t\>) | Empfängt Daten vom Socket und schreibt sie in das angegebene Byte-Array. |
| [Receive](./receive/)(System::Details::StackArray\<uint8_t, N\>\&) | Empfängt Daten vom Socket und schreibt sie in das angegebene Byte-Array. |
| [Receive](./receive/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags) | Empfängt Daten vom Socket und schreibt sie in das angegebene Byte-Array. |
| [Receive](./receive/)(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags) | Empfängt Daten vom Socket und schreibt sie in das angegebene Byte-Array. |
| [Receive](./receive/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags) | Empfängt Daten vom Socket und schreibt sie in das angegebene Byte-Array. |
| [Receive](./receive/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, SocketError\&) | Empfängt Daten vom Socket und schreibt sie in das angegebene Byte-Array. |
| [Receive](./receive/)(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags, SocketError\&) | Empfängt Daten vom Socket und schreibt sie in das angegebene Byte-Array. |
| [Receive](./receive/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags, SocketError\&) | Empfängt Daten vom Socket und schreibt sie in das angegebene Byte-Array. |
| [Receive](./receive/)(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>) | Empfängt Daten vom Socket und schreibt sie in die angegebenen Byte-Arrays. |
| [Receive](./receive/)(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>, SocketFlags) | Empfängt Daten vom Socket und schreibt sie in die angegebenen Byte-Arrays. |
| [Receive](./receive/)(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>, SocketFlags, SocketError\&) | Empfängt Daten vom Socket und schreibt sie in die angegebenen Byte-Arrays. |
| [ReceiveFrom](./receivefrom/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) | Empfängt Daten vom angegebenen Endpunkt und schreibt sie in das angegebene Byte-Array. |
| [ReceiveFrom](./receivefrom/)(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) | Empfängt Daten vom angegebenen Endpunkt und schreibt sie in das angegebene Byte-Array. |
| [ReceiveFrom](./receivefrom/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) | Empfängt Daten vom angegebenen Endpunkt und schreibt sie in das angegebene Byte-Array. |
| [ReceiveFrom](./receivefrom/)(System::ArrayPtr\<uint8_t\>, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) | Empfängt Daten vom angegebenen Endpunkt und schreibt sie in das angegebene Byte-Array. |
| [ReceiveFrom](./receivefrom/)(System::Details::ArrayView\<uint8_t\>, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) | Empfängt Daten vom angegebenen Endpunkt und schreibt sie in das angegebene Byte-Array. |
| [ReceiveFrom](./receivefrom/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) | Empfängt Daten vom angegebenen Endpunkt und schreibt sie in das angegebene Byte-Array. |
| [ReceiveFrom](./receivefrom/)(System::ArrayPtr\<uint8_t\>, SocketFlags, System::SharedPtr\<EndPoint\>\&) | Empfängt Daten vom angegebenen Endpunkt und schreibt sie in das angegebene Byte-Array. |
| [ReceiveFrom](./receivefrom/)(System::Details::ArrayView\<uint8_t\>, SocketFlags, System::SharedPtr\<EndPoint\>\&) | Empfängt Daten vom angegebenen Endpunkt und schreibt sie in das angegebene Byte-Array. |
| [ReceiveFrom](./receivefrom/)(System::ArrayPtr\<uint8_t\>, SocketFlags, System::SharedPtr\<EndPoint\>\&) | Empfängt Daten vom angegebenen Endpunkt und schreibt sie in das angegebene Byte-Array. |
| [ReceiveFrom](./receivefrom/)(System::ArrayPtr\<uint8_t\>, System::SharedPtr\<EndPoint\>\&) | Empfängt Daten vom angegebenen Endpunkt und schreibt sie in das angegebene Byte-Array. |
| [ReceiveFrom](./receivefrom/)(System::Details::ArrayView\<uint8_t\>, System::SharedPtr\<EndPoint\>\&) | Empfängt Daten vom angegebenen Endpunkt und schreibt sie in das angegebene Byte-Array. |
| [ReceiveFrom](./receivefrom/)(System::Details::StackArray\<uint8_t, N\>\&, System::SharedPtr\<EndPoint\>\&) | Empfängt Daten vom angegebenen Endpunkt und schreibt sie in das angegebene Byte-Array. |
| [ReceiveMessageFrom](./receivemessagefrom/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags\&, System::SharedPtr\<EndPoint\>\&, IPPacketInformation\&) | Empfängt Daten vom angegebenen Endpunkt und schreibt sie in das angegebene Byte-Array. |
| [ReceiveMessageFrom](./receivemessagefrom/)(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags\&, System::SharedPtr\<EndPoint\>\&, IPPacketInformation\&) | Empfängt Daten vom angegebenen Endpunkt und schreibt sie in das angegebene Byte-Array. |
| [ReceiveMessageFrom](./receivemessagefrom/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags\&, System::SharedPtr\<EndPoint\>\&, IPPacketInformation\&) | Empfängt Daten vom angegebenen Endpunkt und schreibt sie in das angegebene Byte-Array. |
| [Send](./send/)(System::ArrayPtr\<uint8_t\>, int32_t, SocketFlags) | Sendet die angegebenen Daten an den Socket. |
| [Send](./send/)(System::Details::ArrayView\<uint8_t\>, int32_t, SocketFlags) | Sendet die angegebenen Daten an den Socket. |
| [Send](./send/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, SocketFlags) | Sendet die angegebenen Daten an den Socket. |
| [Send](./send/)(System::ArrayPtr\<uint8_t\>, SocketFlags) | Sendet die angegebenen Daten an den Socket. |
| [Send](./send/)(System::Details::ArrayView\<uint8_t\>, SocketFlags) | Sendet die angegebenen Daten an den Socket. |
| [Send](./send/)(System::Details::StackArray\<uint8_t, N\>\&, SocketFlags) | Sendet die angegebenen Daten an den Socket. |
| [Send](./send/)(System::ArrayPtr\<uint8_t\>) | Sendet die angegebenen Daten an den Socket. |
| [Send](./send/)(System::Details::ArrayView\<uint8_t\>) | Sendet die angegebenen Daten an den Socket. |
| [Send](./send/)(System::Details::StackArray\<uint8_t, N\>\&) | Sendet die angegebenen Daten an den Socket. |
| [Send](./send/)(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>) | Sendet die angegebenen Daten an den Socket. |
| [Send](./send/)(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>, SocketFlags) | Sendet die angegebenen Daten an den Socket. |
| [Send](./send/)(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>, SocketFlags, SocketError\&) | Sendet die angegebenen Daten an den Socket. |
| [Send](./send/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags) | Sendet die angegebenen Daten an den Socket. |
| [Send](./send/)(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags) | Sendet die angegebenen Daten an den Socket. |
| [Send](./send/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags) | Sendet die angegebenen Daten an den Socket. |
| [Send](./send/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, SocketError\&) | Sendet die angegebenen Daten an den Socket. |
| [Send](./send/)(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags, SocketError\&) | Sendet die angegebenen Daten an den Socket. |
| [Send](./send/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags, SocketError\&) | Sendet die angegebenen Daten an den Socket. |
| [SendTo](./sendto/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) | Sendet die angegebenen Daten an den angegebenen Endpunkt. |
| [SendTo](./sendto/)(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) | Sendet die angegebenen Daten an den angegebenen Endpunkt. |
| [SendTo](./sendto/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) | Sendet die angegebenen Daten an den angegebenen Endpunkt. |
| [SendTo](./sendto/)(System::ArrayPtr\<uint8_t\>, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) | Sendet die angegebenen Daten an den angegebenen Endpunkt. |
| [SendTo](./sendto/)(System::Details::ArrayView\<uint8_t\>, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) | Sendet die angegebenen Daten an den angegebenen Endpunkt. |
| [SendTo](./sendto/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) | Sendet die angegebenen Daten an den angegebenen Endpunkt. |
| [SendTo](./sendto/)(System::ArrayPtr\<uint8_t\>, SocketFlags, System::SharedPtr\<EndPoint\>) | Sendet die angegebenen Daten an den angegebenen Endpunkt. |
| [SendTo](./sendto/)(System::Details::ArrayView\<uint8_t\>, SocketFlags, System::SharedPtr\<EndPoint\>) | Sendet die angegebenen Daten an den angegebenen Endpunkt. |
| [SendTo](./sendto/)(System::Details::StackArray\<uint8_t, N\>\&, SocketFlags, System::SharedPtr\<EndPoint\>) | Sendet die angegebenen Daten an den angegebenen Endpunkt. |
| [SendTo](./sendto/)(System::ArrayPtr\<uint8_t\>, System::SharedPtr\<EndPoint\>) | Sendet die angegebenen Daten an den angegebenen Endpunkt. |
| [SendTo](./sendto/)(System::Details::ArrayView\<uint8_t\>, System::SharedPtr\<EndPoint\>) | Sendet die angegebenen Daten an den angegebenen Endpunkt. |
| [SendTo](./sendto/)(System::Details::StackArray\<uint8_t, N\>\&, System::SharedPtr\<EndPoint\>) | Sendet die angegebenen Daten an den angegebenen Endpunkt. |
| [set_Blocking](./set_blocking/)(bool) | Legt einen Wert fest, der anzeigt, ob der Socket im Blockierungsmodus ist. |
| [set_ConnectionTimeout](./set_connectiontimeout/)(int32_t) | Legt den Verbindungs-Timeout fest. |
| [set_DontFragment](./set_dontfragment/)(bool) | Legt einen Wert fest, der anzeigt, ob der Socket IP-Datagramme fragmentieren lässt. |
| [set_DualMode](./set_dualmode/)(bool) | Legt einen Wert fest, der angibt, ob der Socket im Dualmodus ist. |
| [set_EnableBroadcast](./set_enablebroadcast/)(bool) | Legt einen Wert fest, der angibt, ob der Socket Broadcast-Pakete zulässt. |
| [set_ExclusiveAddressUse](./set_exclusiveaddressuse/)(bool) | Legt einen Wert fest, der angibt, ob nur ein Prozess den Socket an einen Port binden kann. |
| [set_LingerState](./set_lingerstate/)(System::SharedPtr\<LingerOption\>) | Legt einen Wert fest, der angibt, ob der Socket das Schließen verzögert, um zu versuchen, alle ausstehenden Daten zu senden. |
| [set_MulticastLoopback](./set_multicastloopback/)(bool) | Legt einen Wert fest, der angibt, ob der Socket ausgehende Multicast-Pakete empfängt. |
| [set_NoDelay](./set_nodelay/)(bool) | Legt einen Wert fest, der angibt, ob der Socket den Nagle-Algorithmus verwendet. |
| [set_ReceiveBufferSize](./set_receivebuffersize/)(int32_t) | Legt die Größe des Empfangspuffers fest. |
| [set_ReceiveTimeout](./set_receivetimeout/)(int32_t) | Legt einen Zeitraum fest, nach dem ein 'Receive'-Aufruf zeitlich abläuft. |
| [set_SendBufferSize](./set_sendbuffersize/)(int32_t) | Legt die Größe des Sendepuffers fest. |
| [set_SendTimeout](./set_sendtimeout/)(int32_t) | Legt einen Zeitraum fest, nach dem ein 'Send'-Aufruf zeitlich abläuft. |
| [set_Ttl](./set_ttl/)(int16_t) | Legt den TTL-Wert fest. |
| [SetSocketOption](./setsocketoption/)(SocketOptionLevel, SocketOptionName, int32_t) | Legt die angegebene Socket-Option auf den angegebenen Wert fest. |
| [SetSocketOption](./setsocketoption/)(SocketOptionLevel, SocketOptionName, System::ArrayPtr\<uint8_t\>) | Legt die angegebene Socket-Option auf den angegebenen Wert fest. |
| [SetSocketOption](./setsocketoption/)(SocketOptionLevel, SocketOptionName, bool) | Legt die angegebene Socket-Option auf den angegebenen Wert fest. |
| [SetSocketOption](./setsocketoption/)(SocketOptionLevel, SocketOptionName, System::SharedPtr\<Object\>) | Legt die angegebene Socket-Option auf den angegebenen Wert fest. |
| [Shutdown](./shutdown/)(SocketShutdown) | Deaktiviert die Send- und Empfangsoperationen des Sockets. |
| [Socket](./socket/)(System::Net::Sockets::SocketType, System::Net::Sockets::ProtocolType) | Erstellt eine neue Instanz. |
| [Socket](./socket/)(System::Net::Sockets::AddressFamily, System::Net::Sockets::SocketType, System::Net::Sockets::ProtocolType) | Erstellt eine neue Instanz. |
| virtual [~Socket](./~socket/)() | Zerstört die aktuelle Instanz. |
## Typedefs

| Typedef. | Beschreibung |
| --- | --- |
| [ImplPtr](./implptr/) | Die Socket-Implementierung. |
## Siehe auch

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Net::Sockets](../)
* Library [Aspose.Font for C++](../../)
