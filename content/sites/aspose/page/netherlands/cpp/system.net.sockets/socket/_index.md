---
title: "System::Net::Sockets::Socket class"
linktitle: "Socket"
second_title: "Aspose.Page voor C++"
description: "System::Net::Sockets::Socket class. De Socket-klasse implementeert de Berkeley sockets-interface in C++."
type: docs
weight: 400
url: /nl/cpp/system.net.sockets/socket/
---
## Socket class


De [Socket](./) klasse implementeert de Berkeley sockets-interface.

```cpp
class Socket : public System::IDisposable
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Accept](./accept/)() | Maakt een nieuwe socket aan voor de nieuw aangemaakte verbinding. |
| [BeginConnect](./beginconnect/)(System::SharedPtr\<EndPoint\>, AsyncCallback, System::SharedPtr\<Object\>) | Start een asynchrone verbindingsoperatie. |
| [BeginConnect](./beginconnect/)(String, int32_t, AsyncCallback, System::SharedPtr\<Object\>) | Start een asynchrone verbindingsoperatie. |
| [BeginConnect](./beginconnect/)(System::SharedPtr\<IPAddress\>, int32_t, AsyncCallback, System::SharedPtr\<Object\>) | Start een asynchrone verbindingsoperatie. |
| [BeginConnect](./beginconnect/)(System::ArrayPtr\<System::SharedPtr\<IPAddress\>\>, int32_t, AsyncCallback, System::SharedPtr\<Object\>) | Start een asynchrone verbindingsoperatie. |
| [BeginReceive](./beginreceive/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, AsyncCallback, System::SharedPtr\<Object\>) | Initieert een asynchrone schrijfbewerking. |
| [BeginSend](./beginsend/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, AsyncCallback, System::SharedPtr\<Object\>) | Start een asynchrone verzendoperatie. |
| [Bind](./bind/)(System::SharedPtr\<EndPoint\>) | Bindt de socket aan het opgegeven lokale eindpunt. |
| [Close](./close/)() | Sluit de socketverbinding. |
| [Close](./close/)(int) | Sluit de socketverbinding met de opgegeven time-out om in de wachtrij staande gegevens te verzenden. |
| [Connect](./connect/)(System::SharedPtr\<EndPoint\>) | Stelt een verbinding tot stand met het opgegeven externe eindpunt. |
| [Connect](./connect/)(System::SharedPtr\<IPAddress\>, int32_t) | Stelt een verbinding tot stand met het opgegeven externe eindpunt. |
| [Connect](./connect/)(String, int32_t) | Stelt een verbinding tot stand met het opgegeven externe eindpunt. |
| [Connect](./connect/)(System::ArrayPtr\<System::SharedPtr\<IPAddress\>\>, int32_t) | Stelt een verbinding tot stand met het opgegeven externe eindpunt. |
| [Dispose](./dispose/)() override | Doet niets. |
| [EndConnect](./endconnect/)(System::SharedPtr\<IAsyncResult\>) | Wacht tot de opgegeven asynchrone verbindingsbewerking is voltooid. |
| [EndReceive](./endreceive/)(System::SharedPtr\<IAsyncResult\>) | Wacht tot de opgegeven asynchrone ontvangbewerking is voltooid. |
| [EndReceive](./endreceive/)(System::SharedPtr\<IAsyncResult\>, SocketError\&) | Wacht tot de opgegeven asynchrone ontvangbewerking is voltooid. |
| [EndSend](./endsend/)(System::SharedPtr\<IAsyncResult\>) | Wacht tot de opgegeven asynchrone verzendbewerking is voltooid. |
| [EndSend](./endsend/)(System::SharedPtr\<IAsyncResult\>, SocketError\&) | Wacht tot de opgegeven asynchrone verzendbewerking is voltooid. |
| [get_AddressFamily](./get_addressfamily/)() | Retourneert de adresfamilie. |
| [get_Available](./get_available/)() | Haalt het aantal bytes op dat van het netwerk is ontvangen en beschikbaar is om te lezen. |
| [get_Blocking](./get_blocking/)() | Haalt een waarde op die aangeeft of de socket zich in de blokkerende modus bevindt. |
| [get_Connected](./get_connected/)() | Retourneert een waarde die aangeeft of de socket verbonden is met de externe host. |
| [get_DontFragment](./get_dontfragment/)() | Haalt een waarde op die aangeeft of de socket IP-datagrammen toestaat te worden gefragmenteerd. |
| [get_DualMode](./get_dualmode/)() | Haalt een waarde op die aangeeft of de socket zich in de dual-modus bevindt. |
| [get_EnableBroadcast](./get_enablebroadcast/)() | Haalt een waarde op die aangeeft of de socket broadcastpakketten toestaat. |
| [get_ExclusiveAddressUse](./get_exclusiveaddressuse/)() | Haalt een waarde op die aangeeft of slechts één proces de socket aan een poort kan binden. |
| [get_IsBound](./get_isbound/)() | Retourneert een waarde die aangeeft of de socket gebonden is aan een specifieke lokale poort. |
| [get_LingerState](./get_lingerstate/)() | Haalt een waarde op die aangeeft of de socket het sluiten vertraagt in een poging alle wachtende gegevens te verzenden. |
| [get_LocalEndPoint](./get_localendpoint/)() | Retourneert het lokale eindpunt. |
| [get_MulticastLoopback](./get_multicastloopback/)() | Haalt een waarde op die aangeeft of de socket uitgaande multicast-pakketten ontvangt. |
| [get_NoDelay](./get_nodelay/)() | Haalt een waarde op die aangeeft of de socket het Nagle-algoritme gebruikt. |
| static [get_OSSupportsIPv4](./get_ossupportsipv4/)() | Retourneert een waarde die aangeeft of het besturingssysteem en de netwerkadapters IPv4 ondersteunen. |
| static [get_OSSupportsIPv6](./get_ossupportsipv6/)() | Retourneert een waarde die aangeeft of het besturingssysteem en de netwerkadapters IPv6 ondersteunen. |
| [get_ProtocolType](./get_protocoltype/)() | Retourneert het protocoltype. |
| [get_ReceiveBufferSize](./get_receivebuffersize/)() | Haalt de grootte van de ontvangbuffer op. |
| [get_ReceiveTimeout](./get_receivetimeout/)() | Haalt een periode op waarna een 'Receive'-aanroep zal verlopen. |
| [get_RemoteEndPoint](./get_remoteendpoint/)() | Retourneert het externe eindpunt. |
| [get_SendBufferSize](./get_sendbuffersize/)() | Haalt de grootte van de verzendbuffer op. |
| [get_SendTimeout](./get_sendtimeout/)() | Haalt een periode op waarna een 'Send'-aanroep zal verlopen. |
| [get_SocketType](./get_sockettype/)() | Retourneert het sockettype. |
| static [get_SupportsIPv4](./get_supportsipv4/)() | RTTI-informatie. |
| [get_Ttl](./get_ttl/)() | Haalt de TTL-waarde op. |
| [GetImpl](./getimpl/)() const | Retourneert een pointer naar de implementatie. |
| [GetSocketOption](./getsocketoption/)(SocketOptionLevel, SocketOptionName) | Retourneert de waarde die overeenkomt met de opgegeven optienaam. |
| [GetSocketOption](./getsocketoption/)(SocketOptionLevel, SocketOptionName, System::ArrayPtr\<uint8_t\>) | Haalt de waarde op die overeenkomt met de opgegeven optienaam. |
| [GetSocketOption](./getsocketoption/)(SocketOptionLevel, SocketOptionName, int32_t) | Retourneert de waarde die overeenkomt met de opgegeven optienaam. |
| [IOControl](./iocontrol/)(int32_t, System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) | Stelt low-level operationele modi voor de socket in. |
| [IOControl](./iocontrol/)(IOControlCode, System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) | Stelt low-level operationele modi voor de socket in. |
| [Listen](./listen/)(int32_t) | Wijzigt de socketstatus naar 'listen'. |
| [Poll](./poll/)(int32_t, SelectMode) | Retourneert de status van de socket op basis van de opgegeven poll-modus. |
| [Receive](./receive/)(System::ArrayPtr\<uint8_t\>, int32_t, SocketFlags) | Ontvangt gegevens van de socket en schrijft ze naar de opgegeven byte-array. |
| [Receive](./receive/)(System::Details::ArrayView\<uint8_t\>, int32_t, SocketFlags) | Ontvangt gegevens van de socket en schrijft ze naar de opgegeven byte-array. |
| [Receive](./receive/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, SocketFlags) | Ontvangt gegevens van de socket en schrijft ze naar de opgegeven byte-array. |
| [Receive](./receive/)(System::ArrayPtr\<uint8_t\>, SocketFlags) | Ontvangt gegevens van de socket en schrijft ze naar de opgegeven byte-array. |
| [Receive](./receive/)(System::Details::ArrayView\<uint8_t\>, SocketFlags) | Ontvangt gegevens van de socket en schrijft ze naar de opgegeven byte-array. |
| [Receive](./receive/)(System::Details::StackArray\<uint8_t, N\>\&, SocketFlags) | Ontvangt gegevens van de socket en schrijft ze naar de opgegeven byte-array. |
| [Receive](./receive/)(System::ArrayPtr\<uint8_t\>) | Ontvangt gegevens van de socket en schrijft ze naar de opgegeven byte-array. |
| [Receive](./receive/)(System::Details::ArrayView\<uint8_t\>) | Ontvangt gegevens van de socket en schrijft ze naar de opgegeven byte-array. |
| [Receive](./receive/)(System::Details::StackArray\<uint8_t, N\>\&) | Ontvangt gegevens van de socket en schrijft ze naar de opgegeven byte-array. |
| [Receive](./receive/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags) | Ontvangt gegevens van de socket en schrijft ze naar de opgegeven byte-array. |
| [Receive](./receive/)(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags) | Ontvangt gegevens van de socket en schrijft ze naar de opgegeven byte-array. |
| [Receive](./receive/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags) | Ontvangt gegevens van de socket en schrijft ze naar de opgegeven byte-array. |
| [Receive](./receive/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, SocketError\&) | Ontvangt gegevens van de socket en schrijft ze naar de opgegeven byte-array. |
| [Receive](./receive/)(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags, SocketError\&) | Ontvangt gegevens van de socket en schrijft ze naar de opgegeven byte-array. |
| [Receive](./receive/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags, SocketError\&) | Ontvangt gegevens van de socket en schrijft ze naar de opgegeven byte-array. |
| [Receive](./receive/)(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>) | Ontvangt gegevens van de socket en schrijft ze naar de opgegeven byte-arrays. |
| [Receive](./receive/)(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>, SocketFlags) | Ontvangt gegevens van de socket en schrijft ze naar de opgegeven byte-arrays. |
| [Receive](./receive/)(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>, SocketFlags, SocketError\&) | Ontvangt gegevens van de socket en schrijft ze naar de opgegeven byte-arrays. |
| [ReceiveFrom](./receivefrom/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) | Ontvangt gegevens van het opgegeven eindpunt en schrijft ze naar de opgegeven byte-array. |
| [ReceiveFrom](./receivefrom/)(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) | Ontvangt gegevens van het opgegeven eindpunt en schrijft ze naar de opgegeven byte-array. |
| [ReceiveFrom](./receivefrom/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) | Ontvangt gegevens van het opgegeven eindpunt en schrijft ze naar de opgegeven byte-array. |
| [ReceiveFrom](./receivefrom/)(System::ArrayPtr\<uint8_t\>, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) | Ontvangt gegevens van het opgegeven eindpunt en schrijft ze naar de opgegeven byte-array. |
| [ReceiveFrom](./receivefrom/)(System::Details::ArrayView\<uint8_t\>, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) | Ontvangt gegevens van het opgegeven eindpunt en schrijft ze naar de opgegeven byte-array. |
| [ReceiveFrom](./receivefrom/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) | Ontvangt gegevens van het opgegeven eindpunt en schrijft ze naar de opgegeven byte-array. |
| [ReceiveFrom](./receivefrom/)(System::ArrayPtr\<uint8_t\>, SocketFlags, System::SharedPtr\<EndPoint\>\&) | Ontvangt gegevens van het opgegeven eindpunt en schrijft ze naar de opgegeven byte-array. |
| [ReceiveFrom](./receivefrom/)(System::Details::ArrayView\<uint8_t\>, SocketFlags, System::SharedPtr\<EndPoint\>\&) | Ontvangt gegevens van het opgegeven eindpunt en schrijft ze naar de opgegeven byte-array. |
| [ReceiveFrom](./receivefrom/)(System::ArrayPtr\<uint8_t\>, SocketFlags, System::SharedPtr\<EndPoint\>\&) | Ontvangt gegevens van het opgegeven eindpunt en schrijft ze naar de opgegeven byte-array. |
| [ReceiveFrom](./receivefrom/)(System::ArrayPtr\<uint8_t\>, System::SharedPtr\<EndPoint\>\&) | Ontvangt gegevens van het opgegeven eindpunt en schrijft ze naar de opgegeven byte-array. |
| [ReceiveFrom](./receivefrom/)(System::Details::ArrayView\<uint8_t\>, System::SharedPtr\<EndPoint\>\&) | Ontvangt gegevens van het opgegeven eindpunt en schrijft ze naar de opgegeven byte-array. |
| [ReceiveFrom](./receivefrom/)(System::Details::StackArray\<uint8_t, N\>\&, System::SharedPtr\<EndPoint\>\&) | Ontvangt gegevens van het opgegeven eindpunt en schrijft ze naar de opgegeven byte-array. |
| [ReceiveMessageFrom](./receivemessagefrom/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags\&, System::SharedPtr\<EndPoint\>\&, IPPacketInformation\&) | Ontvangt gegevens van het opgegeven eindpunt en schrijft ze naar de opgegeven byte-array. |
| [ReceiveMessageFrom](./receivemessagefrom/)(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags\&, System::SharedPtr\<EndPoint\>\&, IPPacketInformation\&) | Ontvangt gegevens van het opgegeven eindpunt en schrijft ze naar de opgegeven byte-array. |
| [ReceiveMessageFrom](./receivemessagefrom/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags\&, System::SharedPtr\<EndPoint\>\&, IPPacketInformation\&) | Ontvangt gegevens van het opgegeven eindpunt en schrijft ze naar de opgegeven byte-array. |
| [Send](./send/)(System::ArrayPtr\<uint8_t\>, int32_t, SocketFlags) | Verzendt de opgegeven gegevens naar de socket. |
| [Send](./send/)(System::Details::ArrayView\<uint8_t\>, int32_t, SocketFlags) | Verzendt de opgegeven gegevens naar de socket. |
| [Send](./send/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, SocketFlags) | Verzendt de opgegeven gegevens naar de socket. |
| [Send](./send/)(System::ArrayPtr\<uint8_t\>, SocketFlags) | Verzendt de opgegeven gegevens naar de socket. |
| [Send](./send/)(System::Details::ArrayView\<uint8_t\>, SocketFlags) | Verzendt de opgegeven gegevens naar de socket. |
| [Send](./send/)(System::Details::StackArray\<uint8_t, N\>\&, SocketFlags) | Verzendt de opgegeven gegevens naar de socket. |
| [Send](./send/)(System::ArrayPtr\<uint8_t\>) | Verzendt de opgegeven gegevens naar de socket. |
| [Send](./send/)(System::Details::ArrayView\<uint8_t\>) | Verzendt de opgegeven gegevens naar de socket. |
| [Send](./send/)(System::Details::StackArray\<uint8_t, N\>\&) | Verzendt de opgegeven gegevens naar de socket. |
| [Send](./send/)(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>) | Verzendt de opgegeven gegevens naar de socket. |
| [Send](./send/)(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>, SocketFlags) | Verzendt de opgegeven gegevens naar de socket. |
| [Send](./send/)(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>, SocketFlags, SocketError\&) | Verzendt de opgegeven gegevens naar de socket. |
| [Send](./send/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags) | Verzendt de opgegeven gegevens naar de socket. |
| [Send](./send/)(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags) | Verzendt de opgegeven gegevens naar de socket. |
| [Send](./send/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags) | Verzendt de opgegeven gegevens naar de socket. |
| [Send](./send/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, SocketError\&) | Verzendt de opgegeven gegevens naar de socket. |
| [Send](./send/)(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags, SocketError\&) | Verzendt de opgegeven gegevens naar de socket. |
| [Send](./send/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags, SocketError\&) | Verzendt de opgegeven gegevens naar de socket. |
| [SendTo](./sendto/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) | Verzendt de opgegeven gegevens naar het opgegeven eindpunt. |
| [SendTo](./sendto/)(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) | Verzendt de opgegeven gegevens naar het opgegeven eindpunt. |
| [SendTo](./sendto/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) | Verzendt de opgegeven gegevens naar het opgegeven eindpunt. |
| [SendTo](./sendto/)(System::ArrayPtr\<uint8_t\>, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) | Verzendt de opgegeven gegevens naar het opgegeven eindpunt. |
| [SendTo](./sendto/)(System::Details::ArrayView\<uint8_t\>, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) | Verzendt de opgegeven gegevens naar het opgegeven eindpunt. |
| [SendTo](./sendto/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) | Verzendt de opgegeven gegevens naar het opgegeven eindpunt. |
| [SendTo](./sendto/)(System::ArrayPtr\<uint8_t\>, SocketFlags, System::SharedPtr\<EndPoint\>) | Verzendt de opgegeven gegevens naar het opgegeven eindpunt. |
| [SendTo](./sendto/)(System::Details::ArrayView\<uint8_t\>, SocketFlags, System::SharedPtr\<EndPoint\>) | Verzendt de opgegeven gegevens naar het opgegeven eindpunt. |
| [SendTo](./sendto/)(System::Details::StackArray\<uint8_t, N\>\&, SocketFlags, System::SharedPtr\<EndPoint\>) | Verzendt de opgegeven gegevens naar het opgegeven eindpunt. |
| [SendTo](./sendto/)(System::ArrayPtr\<uint8_t\>, System::SharedPtr\<EndPoint\>) | Verzendt de opgegeven gegevens naar het opgegeven eindpunt. |
| [SendTo](./sendto/)(System::Details::ArrayView\<uint8_t\>, System::SharedPtr\<EndPoint\>) | Verzendt de opgegeven gegevens naar het opgegeven eindpunt. |
| [SendTo](./sendto/)(System::Details::StackArray\<uint8_t, N\>\&, System::SharedPtr\<EndPoint\>) | Verzendt de opgegeven gegevens naar het opgegeven eindpunt. |
| [set_Blocking](./set_blocking/)(bool) | Stelt een waarde in die aangeeft of de socket zich in de blokkerende modus bevindt. |
| [set_ConnectionTimeout](./set_connectiontimeout/)(int32_t) | Stelt de verbindings-timeout in. |
| [set_DontFragment](./set_dontfragment/)(bool) | Stelt een waarde in die aangeeft of de socket IP-datagrammen toestaat te fragmenteren. |
| [set_DualMode](./set_dualmode/)(bool) | Stelt een waarde in die aangeeft of de socket zich in de dual-modus bevindt. |
| [set_EnableBroadcast](./set_enablebroadcast/)(bool) | Stelt een waarde in die aangeeft of de socket broadcast-pakketten toestaat. |
| [set_ExclusiveAddressUse](./set_exclusiveaddressuse/)(bool) | Stelt een waarde in die aangeeft of slechts één proces de socket aan een poort kan binden. |
| [set_LingerState](./set_lingerstate/)(System::SharedPtr\<LingerOption\>) | Stelt een waarde in die aangeeft of de socket het sluiten vertraagt in een poging alle wachtende gegevens te verzenden. |
| [set_MulticastLoopback](./set_multicastloopback/)(bool) | Stelt een waarde in die aangeeft of de socket uitgaande multicast-pakketten ontvangt. |
| [set_NoDelay](./set_nodelay/)(bool) | Stelt een waarde in die aangeeft of de socket het Nagle-algoritme gebruikt. |
| [set_ReceiveBufferSize](./set_receivebuffersize/)(int32_t) | Stelt de grootte van de ontvangbuffer in. |
| [set_ReceiveTimeout](./set_receivetimeout/)(int32_t) | Stelt een periode in waarna een 'Receive'-aanroep time-out zal geven. |
| [set_SendBufferSize](./set_sendbuffersize/)(int32_t) | Stelt de grootte van de verzendbuffer in. |
| [set_SendTimeout](./set_sendtimeout/)(int32_t) | Stelt een periode in waarna een 'Send'-aanroep time-out zal geven. |
| [set_Ttl](./set_ttl/)(int16_t) | Stelt de TTL-waarde in. |
| [SetSocketOption](./setsocketoption/)(SocketOptionLevel, SocketOptionName, int32_t) | Stelt de opgegeven socketoptie in op de opgegeven waarde. |
| [SetSocketOption](./setsocketoption/)(SocketOptionLevel, SocketOptionName, System::ArrayPtr\<uint8_t\>) | Stelt de opgegeven socketoptie in op de opgegeven waarde. |
| [SetSocketOption](./setsocketoption/)(SocketOptionLevel, SocketOptionName, bool) | Stelt de opgegeven socketoptie in op de opgegeven waarde. |
| [SetSocketOption](./setsocketoption/)(SocketOptionLevel, SocketOptionName, System::SharedPtr\<Object\>) | Stelt de opgegeven socketoptie in op de opgegeven waarde. |
| [Shutdown](./shutdown/)(SocketShutdown) | Schakelt de verzend- en ontvangbewerkingen van de socket uit. |
| [Socket](./socket/)(System::Net::Sockets::SocketType, System::Net::Sockets::ProtocolType) | Construeert een nieuw exemplaar. |
| [Socket](./socket/)(System::Net::Sockets::AddressFamily, System::Net::Sockets::SocketType, System::Net::Sockets::ProtocolType) | Construeert een nieuw exemplaar. |
| virtual [~Socket](./~socket/)() | Vernietigt de huidige instantie. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [ImplPtr](./implptr/) | De socketimplementatie. |
## Zie ook

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Net::Sockets](../)
* Library [Aspose.Page for C++](../../)
