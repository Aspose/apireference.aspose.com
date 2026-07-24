---
title: "System::Net::Sockets::Socket-klass"
linktitle: "Socket"
second_title: "Aspose.Page för C++"
description: "System::Net::Sockets::Socket-klass. Socket-klassen implementerar Berkeley sockets-gränssnittet i C++."
type: docs
weight: 400
url: /sv/cpp/system.net.sockets/socket/
---
## Socket class


Klassen [Socket](./) implementerar Berkeley sockets-gränssnittet.

```cpp
class Socket : public System::IDisposable
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| [Accept](./accept/)() | Skapar en ny socket för den nyss skapade anslutningen. |
| [BeginConnect](./beginconnect/)(System::SharedPtr\<EndPoint\>, AsyncCallback, System::SharedPtr\<Object\>) | Initierar en asynkron anslutningsoperation. |
| [BeginConnect](./beginconnect/)(String, int32_t, AsyncCallback, System::SharedPtr\<Object\>) | Initierar en asynkron anslutningsoperation. |
| [BeginConnect](./beginconnect/)(System::SharedPtr\<IPAddress\>, int32_t, AsyncCallback, System::SharedPtr\<Object\>) | Initierar en asynkron anslutningsoperation. |
| [BeginConnect](./beginconnect/)(System::ArrayPtr\<System::SharedPtr\<IPAddress\>\>, int32_t, AsyncCallback, System::SharedPtr\<Object\>) | Initierar en asynkron anslutningsoperation. |
| [BeginReceive](./beginreceive/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, AsyncCallback, System::SharedPtr\<Object\>) | Initierar en asynkron skrivoperation. |
| [BeginSend](./beginsend/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, AsyncCallback, System::SharedPtr\<Object\>) | Initierar en asynkron sändningsoperation. |
| [Bind](./bind/)(System::SharedPtr\<EndPoint\>) | Binder socketen till den angivna lokala slutpunkten. |
| [Close](./close/)() | Stänger socket-anslutningen. |
| [Close](./close/)(int) | Stänger socket-anslutningen med den angivna tidsgränsen för att tillåta köad data att skickas. |
| [Connect](./connect/)(System::SharedPtr\<EndPoint\>) | Upprättar en anslutning till den angivna fjärrslutpunkten. |
| [Connect](./connect/)(System::SharedPtr\<IPAddress\>, int32_t) | Upprättar en anslutning till den angivna fjärrslutpunkten. |
| [Connect](./connect/)(String, int32_t) | Upprättar en anslutning till den angivna fjärrslutpunkten. |
| [Connect](./connect/)(System::ArrayPtr\<System::SharedPtr\<IPAddress\>\>, int32_t) | Upprättar en anslutning till den angivna fjärrslutpunkten. |
| [Dispose](./dispose/)() override | Gör ingenting. |
| [EndConnect](./endconnect/)(System::SharedPtr\<IAsyncResult\>) | Väntar tills den angivna asynkrona anslutningsoperationen slutförs. |
| [EndReceive](./endreceive/)(System::SharedPtr\<IAsyncResult\>) | Väntar tills den angivna asynkrona mottagningsoperationen slutförs. |
| [EndReceive](./endreceive/)(System::SharedPtr\<IAsyncResult\>, SocketError\&) | Väntar tills den angivna asynkrona mottagningsoperationen slutförs. |
| [EndSend](./endsend/)(System::SharedPtr\<IAsyncResult\>) | Väntar tills den angivna asynkrona sändningsoperationen slutförs. |
| [EndSend](./endsend/)(System::SharedPtr\<IAsyncResult\>, SocketError\&) | Väntar tills den angivna asynkrona sändningsoperationen slutförs. |
| [get_AddressFamily](./get_addressfamily/)() | Returnerar adressfamiljen. |
| [get_Available](./get_available/)() | Hämtar antalet byte som mottagits från nätverket och som är tillgängliga för läsning. |
| [get_Blocking](./get_blocking/)() | Hämtar ett värde som indikerar om socketen är i blockeringsläge. |
| [get_Connected](./get_connected/)() | Returnerar ett värde som indikerar om socketen är ansluten till fjärrvärden. |
| [get_DontFragment](./get_dontfragment/)() | Hämtar ett värde som indikerar om socketen tillåter IP-datagram att fragmenteras. |
| [get_DualMode](./get_dualmode/)() | Hämtar ett värde som indikerar om socketen är i dubbelläge. |
| [get_EnableBroadcast](./get_enablebroadcast/)() | Hämtar ett värde som indikerar om socketen tillåter broadcast-paket. |
| [get_ExclusiveAddressUse](./get_exclusiveaddressuse/)() | Hämtar ett värde som indikerar om endast en process kan binda socketen till en port. |
| [get_IsBound](./get_isbound/)() | Returnerar ett värde som indikerar om socketen är bunden till en specifik lokal port. |
| [get_LingerState](./get_lingerstate/)() | Hämtar ett värde som indikerar om socketen kommer att fördröja stängning i ett försök att skicka all väntande data. |
| [get_LocalEndPoint](./get_localendpoint/)() | Returnerar den lokala slutpunkten. |
| [get_MulticastLoopback](./get_multicastloopback/)() | Hämtar ett värde som indikerar om socketen tar emot utgående multicast-paket. |
| [get_NoDelay](./get_nodelay/)() | Hämtar ett värde som indikerar om socketen använder Nagle-algoritmen. |
| static [get_OSSupportsIPv4](./get_ossupportsipv4/)() | Returnerar ett värde som indikerar om operativsystemet och nätverksadaptrarna stöder IPv4. |
| static [get_OSSupportsIPv6](./get_ossupportsipv6/)() | Returnerar ett värde som indikerar om operativsystemet och nätverksadaptrarna stöder IPv6. |
| [get_ProtocolType](./get_protocoltype/)() | Returnerar protokolltypen. |
| [get_ReceiveBufferSize](./get_receivebuffersize/)() | Hämtar mottagningsbuffertens storlek. |
| [get_ReceiveTimeout](./get_receivetimeout/)() | Hämtar en period efter vilken ett 'Receive'-anrop får timeout. |
| [get_RemoteEndPoint](./get_remoteendpoint/)() | Returnerar den fjärranslutna slutpunkten. |
| [get_SendBufferSize](./get_sendbuffersize/)() | Hämtar sändningsbuffertens storlek. |
| [get_SendTimeout](./get_sendtimeout/)() | Hämtar en period efter vilken ett 'Send'-anrop får timeout. |
| [get_SocketType](./get_sockettype/)() | Returnerar socket-typen. |
| static [get_SupportsIPv4](./get_supportsipv4/)() | RTTI-information. |
| [get_Ttl](./get_ttl/)() | Hämtar TTL‑värdet. |
| [GetImpl](./getimpl/)() const | Returnerar en pekare till implementationen. |
| [GetSocketOption](./getsocketoption/)(SocketOptionLevel, SocketOptionName) | Returnerar värdet som motsvarar det angivna alternativnamnet. |
| [GetSocketOption](./getsocketoption/)(SocketOptionLevel, SocketOptionName, System::ArrayPtr\<uint8_t\>) | Hämtar värdet som motsvarar det angivna alternativnamnet. |
| [GetSocketOption](./getsocketoption/)(SocketOptionLevel, SocketOptionName, int32_t) | Returnerar värdet som motsvarar det angivna alternativnamnet. |
| [IOControl](./iocontrol/)(int32_t, System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) | Ställer in lågnivådriftslägen för socketen. |
| [IOControl](./iocontrol/)(IOControlCode, System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) | Ställer in lågnivådriftslägen för socketen. |
| [Listen](./listen/)(int32_t) | Ändrar socketens tillstånd till 'listen'. |
| [Poll](./poll/)(int32_t, SelectMode) | Returnerar socketens status baserat på det angivna pollningsläget. |
| [Receive](./receive/)(System::ArrayPtr\<uint8_t\>, int32_t, SocketFlags) | Tar emot data från socketen och skriver dem till den angivna byte‑arrayen. |
| [Receive](./receive/)(System::Details::ArrayView\<uint8_t\>, int32_t, SocketFlags) | Tar emot data från socketen och skriver dem till den angivna byte‑arrayen. |
| [Receive](./receive/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, SocketFlags) | Tar emot data från socketen och skriver dem till den angivna byte‑arrayen. |
| [Receive](./receive/)(System::ArrayPtr\<uint8_t\>, SocketFlags) | Tar emot data från socketen och skriver dem till den angivna byte‑arrayen. |
| [Receive](./receive/)(System::Details::ArrayView\<uint8_t\>, SocketFlags) | Tar emot data från socketen och skriver dem till den angivna byte‑arrayen. |
| [Receive](./receive/)(System::Details::StackArray\<uint8_t, N\>\&, SocketFlags) | Tar emot data från socketen och skriver dem till den angivna byte‑arrayen. |
| [Receive](./receive/)(System::ArrayPtr\<uint8_t\>) | Tar emot data från socketen och skriver dem till den angivna byte‑arrayen. |
| [Receive](./receive/)(System::Details::ArrayView\<uint8_t\>) | Tar emot data från socketen och skriver dem till den angivna byte‑arrayen. |
| [Receive](./receive/)(System::Details::StackArray\<uint8_t, N\>\&) | Tar emot data från socketen och skriver dem till den angivna byte‑arrayen. |
| [Receive](./receive/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags) | Tar emot data från socketen och skriver dem till den angivna byte‑arrayen. |
| [Receive](./receive/)(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags) | Tar emot data från socketen och skriver dem till den angivna byte‑arrayen. |
| [Receive](./receive/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags) | Tar emot data från socketen och skriver dem till den angivna byte‑arrayen. |
| [Receive](./receive/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, SocketError\&) | Tar emot data från socketen och skriver dem till den angivna byte‑arrayen. |
| [Receive](./receive/)(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags, SocketError\&) | Tar emot data från socketen och skriver dem till den angivna byte‑arrayen. |
| [Receive](./receive/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags, SocketError\&) | Tar emot data från socketen och skriver dem till den angivna byte‑arrayen. |
| [Receive](./receive/)(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>) | Tar emot data från socketen och skriver dem till de angivna byte‑arrayerna. |
| [Receive](./receive/)(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>, SocketFlags) | Tar emot data från socketen och skriver dem till de angivna byte‑arrayerna. |
| [Receive](./receive/)(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>, SocketFlags, SocketError\&) | Tar emot data från socketen och skriver dem till de angivna byte‑arrayerna. |
| [ReceiveFrom](./receivefrom/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) | Tar emot data från den angivna slutpunkten och skriver dem till den angivna byte‑arrayen. |
| [ReceiveFrom](./receivefrom/)(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) | Tar emot data från den angivna slutpunkten och skriver dem till den angivna byte‑arrayen. |
| [ReceiveFrom](./receivefrom/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) | Tar emot data från den angivna slutpunkten och skriver dem till den angivna byte‑arrayen. |
| [ReceiveFrom](./receivefrom/)(System::ArrayPtr\<uint8_t\>, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) | Tar emot data från den angivna slutpunkten och skriver dem till den angivna byte‑arrayen. |
| [ReceiveFrom](./receivefrom/)(System::Details::ArrayView\<uint8_t\>, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) | Tar emot data från den angivna slutpunkten och skriver dem till den angivna byte‑arrayen. |
| [ReceiveFrom](./receivefrom/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) | Tar emot data från den angivna slutpunkten och skriver dem till den angivna byte‑arrayen. |
| [ReceiveFrom](./receivefrom/)(System::ArrayPtr\<uint8_t\>, SocketFlags, System::SharedPtr\<EndPoint\>\&) | Tar emot data från den angivna slutpunkten och skriver dem till den angivna byte‑arrayen. |
| [ReceiveFrom](./receivefrom/)(System::Details::ArrayView\<uint8_t\>, SocketFlags, System::SharedPtr\<EndPoint\>\&) | Tar emot data från den angivna slutpunkten och skriver dem till den angivna byte‑arrayen. |
| [ReceiveFrom](./receivefrom/)(System::ArrayPtr\<uint8_t\>, SocketFlags, System::SharedPtr\<EndPoint\>\&) | Tar emot data från den angivna slutpunkten och skriver dem till den angivna byte‑arrayen. |
| [ReceiveFrom](./receivefrom/)(System::ArrayPtr\<uint8_t\>, System::SharedPtr\<EndPoint\>\&) | Tar emot data från den angivna slutpunkten och skriver dem till den angivna byte‑arrayen. |
| [ReceiveFrom](./receivefrom/)(System::Details::ArrayView\<uint8_t\>, System::SharedPtr\<EndPoint\>\&) | Tar emot data från den angivna slutpunkten och skriver dem till den angivna byte‑arrayen. |
| [ReceiveFrom](./receivefrom/)(System::Details::StackArray\<uint8_t, N\>\&, System::SharedPtr\<EndPoint\>\&) | Tar emot data från den angivna slutpunkten och skriver dem till den angivna byte‑arrayen. |
| [ReceiveMessageFrom](./receivemessagefrom/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags\&, System::SharedPtr\<EndPoint\>\&, IPPacketInformation\&) | Tar emot data från den angivna slutpunkten och skriver dem till den angivna byte‑arrayen. |
| [ReceiveMessageFrom](./receivemessagefrom/)(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags\&, System::SharedPtr\<EndPoint\>\&, IPPacketInformation\&) | Tar emot data från den angivna slutpunkten och skriver dem till den angivna byte‑arrayen. |
| [ReceiveMessageFrom](./receivemessagefrom/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags\&, System::SharedPtr\<EndPoint\>\&, IPPacketInformation\&) | Tar emot data från den angivna slutpunkten och skriver dem till den angivna byte‑arrayen. |
| [Send](./send/)(System::ArrayPtr\<uint8_t\>, int32_t, SocketFlags) | Skickar den angivna datan till socketen. |
| [Send](./send/)(System::Details::ArrayView\<uint8_t\>, int32_t, SocketFlags) | Skickar den angivna datan till socketen. |
| [Send](./send/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, SocketFlags) | Skickar den angivna datan till socketen. |
| [Send](./send/)(System::ArrayPtr\<uint8_t\>, SocketFlags) | Skickar den angivna datan till socketen. |
| [Send](./send/)(System::Details::ArrayView\<uint8_t\>, SocketFlags) | Skickar den angivna datan till socketen. |
| [Send](./send/)(System::Details::StackArray\<uint8_t, N\>\&, SocketFlags) | Skickar den angivna datan till socketen. |
| [Send](./send/)(System::ArrayPtr\<uint8_t\>) | Skickar den angivna datan till socketen. |
| [Send](./send/)(System::Details::ArrayView\<uint8_t\>) | Skickar den angivna datan till socketen. |
| [Send](./send/)(System::Details::StackArray\<uint8_t, N\>\&) | Skickar den angivna datan till socketen. |
| [Send](./send/)(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>) | Skickar den angivna datan till socketen. |
| [Send](./send/)(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>, SocketFlags) | Skickar den angivna datan till socketen. |
| [Send](./send/)(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>, SocketFlags, SocketError\&) | Skickar den angivna datan till socketen. |
| [Send](./send/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags) | Skickar den angivna datan till socketen. |
| [Send](./send/)(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags) | Skickar den angivna datan till socketen. |
| [Send](./send/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags) | Skickar den angivna datan till socketen. |
| [Send](./send/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, SocketError\&) | Skickar den angivna datan till socketen. |
| [Send](./send/)(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags, SocketError\&) | Skickar den angivna datan till socketen. |
| [Send](./send/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags, SocketError\&) | Skickar den angivna datan till socketen. |
| [SendTo](./sendto/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) | Skickar den angivna datan till den angivna slutpunkten. |
| [SendTo](./sendto/)(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) | Skickar den angivna datan till den angivna slutpunkten. |
| [SendTo](./sendto/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) | Skickar den angivna datan till den angivna slutpunkten. |
| [SendTo](./sendto/)(System::ArrayPtr\<uint8_t\>, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) | Skickar den angivna datan till den angivna slutpunkten. |
| [SendTo](./sendto/)(System::Details::ArrayView\<uint8_t\>, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) | Skickar den angivna datan till den angivna slutpunkten. |
| [SendTo](./sendto/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) | Skickar den angivna datan till den angivna slutpunkten. |
| [SendTo](./sendto/)(System::ArrayPtr\<uint8_t\>, SocketFlags, System::SharedPtr\<EndPoint\>) | Skickar den angivna datan till den angivna slutpunkten. |
| [SendTo](./sendto/)(System::Details::ArrayView\<uint8_t\>, SocketFlags, System::SharedPtr\<EndPoint\>) | Skickar den angivna datan till den angivna slutpunkten. |
| [SendTo](./sendto/)(System::Details::StackArray\<uint8_t, N\>\&, SocketFlags, System::SharedPtr\<EndPoint\>) | Skickar den angivna datan till den angivna slutpunkten. |
| [SendTo](./sendto/)(System::ArrayPtr\<uint8_t\>, System::SharedPtr\<EndPoint\>) | Skickar den angivna datan till den angivna slutpunkten. |
| [SendTo](./sendto/)(System::Details::ArrayView\<uint8_t\>, System::SharedPtr\<EndPoint\>) | Skickar den angivna datan till den angivna slutpunkten. |
| [SendTo](./sendto/)(System::Details::StackArray\<uint8_t, N\>\&, System::SharedPtr\<EndPoint\>) | Skickar den angivna datan till den angivna slutpunkten. |
| [set_Blocking](./set_blocking/)(bool) | Ställer in ett värde som indikerar om socketen är i blockeringsläge. |
| [set_ConnectionTimeout](./set_connectiontimeout/)(int32_t) | Ställer in anslutningens tidsgräns. |
| [set_DontFragment](./set_dontfragment/)(bool) | Ställer in ett värde som indikerar om socketen tillåter IP‑datagram att fragmenteras. |
| [set_DualMode](./set_dualmode/)(bool) | Ställer in ett värde som indikerar om socketen är i dubbelläge. |
| [set_EnableBroadcast](./set_enablebroadcast/)(bool) | Ställer in ett värde som indikerar om socketen tillåter broadcast‑paket. |
| [set_ExclusiveAddressUse](./set_exclusiveaddressuse/)(bool) | Ställer in ett värde som indikerar om endast en process kan binda socketen till en port. |
| [set_LingerState](./set_lingerstate/)(System::SharedPtr\<LingerOption\>) | Ställer in ett värde som indikerar om socketen kommer att fördröja stängning i ett försök att skicka all väntande data. |
| [set_MulticastLoopback](./set_multicastloopback/)(bool) | Ställer in ett värde som indikerar om socketen tar emot utgående multicast‑paket. |
| [set_NoDelay](./set_nodelay/)(bool) | Ställer in ett värde som indikerar om socketen använder Nagle‑algoritmen. |
| [set_ReceiveBufferSize](./set_receivebuffersize/)(int32_t) | Ställer in mottagningsbuffertens storlek. |
| [set_ReceiveTimeout](./set_receivetimeout/)(int32_t) | Ställer in en period efter vilken ett 'Receive'-anrop tidsöverskrids. |
| [set_SendBufferSize](./set_sendbuffersize/)(int32_t) | Ställer in sändningsbuffertens storlek. |
| [set_SendTimeout](./set_sendtimeout/)(int32_t) | Ställer in en period efter vilken ett 'Send'-anrop tidsöverskrids. |
| [set_Ttl](./set_ttl/)(int16_t) | Ställer in TTL‑värdet. |
| [SetSocketOption](./setsocketoption/)(SocketOptionLevel, SocketOptionName, int32_t) | Ställer in det angivna socket‑alternativet till det angivna värdet. |
| [SetSocketOption](./setsocketoption/)(SocketOptionLevel, SocketOptionName, System::ArrayPtr\<uint8_t\>) | Ställer in det angivna socket‑alternativet till det angivna värdet. |
| [SetSocketOption](./setsocketoption/)(SocketOptionLevel, SocketOptionName, bool) | Ställer in det angivna socket‑alternativet till det angivna värdet. |
| [SetSocketOption](./setsocketoption/)(SocketOptionLevel, SocketOptionName, System::SharedPtr\<Object\>) | Ställer in det angivna socket‑alternativet till det angivna värdet. |
| [Shutdown](./shutdown/)(SocketShutdown) | Inaktiverar sändnings‑ och mottagningsoperationerna för socketen. |
| [Socket](./socket/)(System::Net::Sockets::SocketType, System::Net::Sockets::ProtocolType) | Skapar en ny instans. |
| [Socket](./socket/)(System::Net::Sockets::AddressFamily, System::Net::Sockets::SocketType, System::Net::Sockets::ProtocolType) | Skapar en ny instans. |
| virtual [~Socket](./~socket/)() | Destruerar den aktuella instansen. |
## Typedefs

| Typedef | Beskrivning |
| --- | --- |
| [ImplPtr](./implptr/) | Socket‑implementationen. |
## Se även

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Net::Sockets](../)
* Library [Aspose.Page for C++](../../)
