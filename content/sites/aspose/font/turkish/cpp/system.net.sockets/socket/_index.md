---
title: "System::Net::Sockets::Socket sınıfı"
linktitle: "Socket"
second_title: "Aspose.Font için C++"
description: "System::Net::Sockets::Socket sınıfı. Socket sınıfı, C++'da Berkeley soket arabirimini uygular."
type: docs
weight: 400
url: /tr/cpp/system.net.sockets/socket/
---
## Socket class


Bu [Socket](./) sınıfı Berkeley soket arabirimini uygular.

```cpp
class Socket : public System::IDisposable
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Accept](./accept/)() | Yeni oluşturulan bağlantı için yeni bir soket oluşturur. |
| [BeginConnect](./beginconnect/)(System::SharedPtr\<EndPoint\>, AsyncCallback, System::SharedPtr\<Object\>) | Asenkron bir bağlanma işlemi başlatır. |
| [BeginConnect](./beginconnect/)(String, int32_t, AsyncCallback, System::SharedPtr\<Object\>) | Asenkron bir bağlanma işlemi başlatır. |
| [BeginConnect](./beginconnect/)(System::SharedPtr\<IPAddress\>, int32_t, AsyncCallback, System::SharedPtr\<Object\>) | Asenkron bir bağlanma işlemi başlatır. |
| [BeginConnect](./beginconnect/)(System::ArrayPtr\<System::SharedPtr\<IPAddress\>\>, int32_t, AsyncCallback, System::SharedPtr\<Object\>) | Asenkron bir bağlanma işlemi başlatır. |
| [BeginReceive](./beginreceive/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, AsyncCallback, System::SharedPtr\<Object\>) | Asenkron bir yazma işlemi başlatır. |
| [BeginSend](./beginsend/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, AsyncCallback, System::SharedPtr\<Object\>) | Asenkron bir gönderme işlemi başlatır. |
| [Bind](./bind/)(System::SharedPtr\<EndPoint\>) | Soketi belirtilen yerel uç noktaya bağlar. |
| [Close](./close/)() | Soket bağlantısını kapatır. |
| [Close](./close/)(int) | Kuyrukta bekleyen verilerin gönderilmesine izin vermek için belirtilen zaman aşımıyla soket bağlantısını kapatır. |
| [Connect](./connect/)(System::SharedPtr\<EndPoint\>) | Belirtilen uzak uç noktaya bir bağlantı kurar. |
| [Connect](./connect/)(System::SharedPtr\<IPAddress\>, int32_t) | Belirtilen uzak uç noktaya bir bağlantı kurar. |
| [Connect](./connect/)(String, int32_t) | Belirtilen uzak uç noktaya bir bağlantı kurar. |
| [Connect](./connect/)(System::ArrayPtr\<System::SharedPtr\<IPAddress\>\>, int32_t) | Belirtilen uzak uç noktaya bir bağlantı kurar. |
| [Dispose](./dispose/)() override | Hiçbir şey yapmaz. |
| [EndConnect](./endconnect/)(System::SharedPtr\<IAsyncResult\>) | Belirtilen asenkron bağlanma işlemi tamamlanana kadar bekler. |
| [EndReceive](./endreceive/)(System::SharedPtr\<IAsyncResult\>) | Belirtilen asenkron alma işlemi tamamlanana kadar bekler. |
| [EndReceive](./endreceive/)(System::SharedPtr\<IAsyncResult\>, SocketError\&) | Belirtilen asenkron alma işlemi tamamlanana kadar bekler. |
| [EndSend](./endsend/)(System::SharedPtr\<IAsyncResult\>) | Belirtilen asenkron gönderme işlemi tamamlanana kadar bekler. |
| [EndSend](./endsend/)(System::SharedPtr\<IAsyncResult\>, SocketError\&) | Belirtilen asenkron gönderme işlemi tamamlanana kadar bekler. |
| [get_AddressFamily](./get_addressfamily/)() | Adres ailesini döndürür. |
| [get_Available](./get_available/)() | Ağdan alınan ve okunabilir durumda olan bayt sayısını alır. |
| [get_Blocking](./get_blocking/)() | Soketin engelleme modunda olup olmadığını gösteren bir değer alır. |
| [get_Connected](./get_connected/)() | Soketin uzak ana bilgisayara bağlı olup olmadığını gösteren bir değer döndürür. |
| [get_DontFragment](./get_dontfragment/)() | Soketin IP datagramlarının parçalanmasına izin verip vermediğini gösteren bir değer alır. |
| [get_DualMode](./get_dualmode/)() | Soketin çift modda olup olmadığını gösteren bir değer alır. |
| [get_EnableBroadcast](./get_enablebroadcast/)() | Soketin yayın paketlerine izin verip vermediğini gösteren bir değer alır. |
| [get_ExclusiveAddressUse](./get_exclusiveaddressuse/)() | Soketin bir porta yalnızca bir süreç tarafından bağlanabileceğini gösteren bir değer alır. |
| [get_IsBound](./get_isbound/)() | Soketin belirli bir yerel porta bağlanıp bağlanmadığını gösteren bir değer döndürür. |
| [get_LingerState](./get_lingerstate/)() | Soketin bekleyen tüm verileri göndermeye çalışarak kapanmayı geciktirip geciktirmeyeceğini gösteren bir değer alır. |
| [get_LocalEndPoint](./get_localendpoint/)() | Yerel uç noktayı döndürür. |
| [get_MulticastLoopback](./get_multicastloopback/)() | Soketin giden çoklu yayın paketlerini alıp almadığını gösteren bir değer alır. |
| [get_NoDelay](./get_nodelay/)() | Soketin Nagle algoritmasını kullanıp kullanmadığını gösteren bir değeri alır. |
| static [get_OSSupportsIPv4](./get_ossupportsipv4/)() | İşletim sistemi ve ağ bağdaştırıcılarının IPv4'ü destekleyip desteklemediğini gösteren bir değeri döndürür. |
| static [get_OSSupportsIPv6](./get_ossupportsipv6/)() | İşletim sistemi ve ağ bağdaştırıcılarının IPv6'yı destekleyip desteklemediğini gösteren bir değeri döndürür. |
| [get_ProtocolType](./get_protocoltype/)() | Protokol tipini döndürür. |
| [get_ReceiveBufferSize](./get_receivebuffersize/)() | Alma tampon boyutunu alır. |
| [get_ReceiveTimeout](./get_receivetimeout/)() | 'Receive' çağrısının zaman aşımına uğrayacağı bir süreyi alır. |
| [get_RemoteEndPoint](./get_remoteendpoint/)() | Uzak uç noktasını döndürür. |
| [get_SendBufferSize](./get_sendbuffersize/)() | Gönderme tampon boyutunu alır. |
| [get_SendTimeout](./get_sendtimeout/)() | 'Send' çağrısının zaman aşımına uğrayacağı bir süreyi alır. |
| [get_SocketType](./get_sockettype/)() | Soket tipini döndürür. |
| static [get_SupportsIPv4](./get_supportsipv4/)() | RTTI bilgisi. |
| [get_Ttl](./get_ttl/)() | TTL değerini alır. |
| [GetImpl](./getimpl/)() const | Uygulamaya bir işaretçi döndürür. |
| [GetSocketOption](./getsocketoption/)(SocketOptionLevel, SocketOptionName) | Belirtilen seçenek adına karşılık gelen değeri döndürür. |
| [GetSocketOption](./getsocketoption/)(SocketOptionLevel, SocketOptionName, System::ArrayPtr\<uint8_t\>) | Belirtilen seçenek adına karşılık gelen değeri alır. |
| [GetSocketOption](./getsocketoption/)(SocketOptionLevel, SocketOptionName, int32_t) | Belirtilen seçenek adına karşılık gelen değeri döndürür. |
| [IOControl](./iocontrol/)(int32_t, System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) | Soket için düşük seviyeli çalışma modlarını ayarlar. |
| [IOControl](./iocontrol/)(IOControlCode, System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) | Soket için düşük seviyeli çalışma modlarını ayarlar. |
| [Listen](./listen/)(int32_t) | Soket durumunu 'listen' (dinleme) olarak değiştirir. |
| [Poll](./poll/)(int32_t, SelectMode) | Belirtilen yoklama moduna göre soketin durumunu döndürür. |
| [Receive](./receive/)(System::ArrayPtr\<uint8_t\>, int32_t, SocketFlags) | Soketten veri alır ve belirtilen bayt dizisine yazar. |
| [Receive](./receive/)(System::Details::ArrayView\<uint8_t\>, int32_t, SocketFlags) | Soketten veri alır ve belirtilen bayt dizisine yazar. |
| [Receive](./receive/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, SocketFlags) | Soketten veri alır ve belirtilen bayt dizisine yazar. |
| [Receive](./receive/)(System::ArrayPtr\<uint8_t\>, SocketFlags) | Soketten veri alır ve belirtilen bayt dizisine yazar. |
| [Receive](./receive/)(System::Details::ArrayView\<uint8_t\>, SocketFlags) | Soketten veri alır ve belirtilen bayt dizisine yazar. |
| [Receive](./receive/)(System::Details::StackArray\<uint8_t, N\>\&, SocketFlags) | Soketten veri alır ve belirtilen bayt dizisine yazar. |
| [Receive](./receive/)(System::ArrayPtr\<uint8_t\>) | Soketten veri alır ve belirtilen bayt dizisine yazar. |
| [Receive](./receive/)(System::Details::ArrayView\<uint8_t\>) | Soketten veri alır ve belirtilen bayt dizisine yazar. |
| [Receive](./receive/)(System::Details::StackArray\<uint8_t, N\>\&) | Soketten veri alır ve belirtilen bayt dizisine yazar. |
| [Receive](./receive/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags) | Soketten veri alır ve belirtilen bayt dizisine yazar. |
| [Receive](./receive/)(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags) | Soketten veri alır ve belirtilen bayt dizisine yazar. |
| [Receive](./receive/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags) | Soketten veri alır ve belirtilen bayt dizisine yazar. |
| [Receive](./receive/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, SocketError\&) | Soketten veri alır ve belirtilen bayt dizisine yazar. |
| [Receive](./receive/)(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags, SocketError\&) | Soketten veri alır ve belirtilen bayt dizisine yazar. |
| [Receive](./receive/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags, SocketError\&) | Soketten veri alır ve belirtilen bayt dizisine yazar. |
| [Receive](./receive/)(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>) | Soketten veri alır ve belirtilen bayt dizilerine yazar. |
| [Receive](./receive/)(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>, SocketFlags) | Soketten veri alır ve belirtilen bayt dizilerine yazar. |
| [Receive](./receive/)(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>, SocketFlags, SocketError\&) | Soketten veri alır ve belirtilen bayt dizilerine yazar. |
| [ReceiveFrom](./receivefrom/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) | Belirtilen uç noktadan veri alır ve belirtilen bayt dizisine yazar. |
| [ReceiveFrom](./receivefrom/)(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) | Belirtilen uç noktadan veri alır ve belirtilen bayt dizisine yazar. |
| [ReceiveFrom](./receivefrom/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) | Belirtilen uç noktadan veri alır ve belirtilen bayt dizisine yazar. |
| [ReceiveFrom](./receivefrom/)(System::ArrayPtr\<uint8_t\>, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) | Belirtilen uç noktadan veri alır ve belirtilen bayt dizisine yazar. |
| [ReceiveFrom](./receivefrom/)(System::Details::ArrayView\<uint8_t\>, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) | Belirtilen uç noktadan veri alır ve belirtilen bayt dizisine yazar. |
| [ReceiveFrom](./receivefrom/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) | Belirtilen uç noktadan veri alır ve belirtilen bayt dizisine yazar. |
| [ReceiveFrom](./receivefrom/)(System::ArrayPtr\<uint8_t\>, SocketFlags, System::SharedPtr\<EndPoint\>\&) | Belirtilen uç noktadan veri alır ve belirtilen bayt dizisine yazar. |
| [ReceiveFrom](./receivefrom/)(System::Details::ArrayView\<uint8_t\>, SocketFlags, System::SharedPtr\<EndPoint\>\&) | Belirtilen uç noktadan veri alır ve belirtilen bayt dizisine yazar. |
| [ReceiveFrom](./receivefrom/)(System::ArrayPtr\<uint8_t\>, SocketFlags, System::SharedPtr\<EndPoint\>\&) | Belirtilen uç noktadan veri alır ve belirtilen bayt dizisine yazar. |
| [ReceiveFrom](./receivefrom/)(System::ArrayPtr\<uint8_t\>, System::SharedPtr\<EndPoint\>\&) | Belirtilen uç noktadan veri alır ve belirtilen bayt dizisine yazar. |
| [ReceiveFrom](./receivefrom/)(System::Details::ArrayView\<uint8_t\>, System::SharedPtr\<EndPoint\>\&) | Belirtilen uç noktadan veri alır ve belirtilen bayt dizisine yazar. |
| [ReceiveFrom](./receivefrom/)(System::Details::StackArray\<uint8_t, N\>\&, System::SharedPtr\<EndPoint\>\&) | Belirtilen uç noktadan veri alır ve belirtilen bayt dizisine yazar. |
| [ReceiveMessageFrom](./receivemessagefrom/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags\&, System::SharedPtr\<EndPoint\>\&, IPPacketInformation\&) | Belirtilen uç noktadan veri alır ve belirtilen bayt dizisine yazar. |
| [ReceiveMessageFrom](./receivemessagefrom/)(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags\&, System::SharedPtr\<EndPoint\>\&, IPPacketInformation\&) | Belirtilen uç noktadan veri alır ve belirtilen bayt dizisine yazar. |
| [ReceiveMessageFrom](./receivemessagefrom/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags\&, System::SharedPtr\<EndPoint\>\&, IPPacketInformation\&) | Belirtilen uç noktadan veri alır ve belirtilen bayt dizisine yazar. |
| [Send](./send/)(System::ArrayPtr\<uint8_t\>, int32_t, SocketFlags) | Belirtilen veriyi sokete gönderir. |
| [Send](./send/)(System::Details::ArrayView\<uint8_t\>, int32_t, SocketFlags) | Belirtilen veriyi sokete gönderir. |
| [Send](./send/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, SocketFlags) | Belirtilen veriyi sokete gönderir. |
| [Send](./send/)(System::ArrayPtr\<uint8_t\>, SocketFlags) | Belirtilen veriyi sokete gönderir. |
| [Send](./send/)(System::Details::ArrayView\<uint8_t\>, SocketFlags) | Belirtilen veriyi sokete gönderir. |
| [Send](./send/)(System::Details::StackArray\<uint8_t, N\>\&, SocketFlags) | Belirtilen veriyi sokete gönderir. |
| [Send](./send/)(System::ArrayPtr\<uint8_t\>) | Belirtilen veriyi sokete gönderir. |
| [Send](./send/)(System::Details::ArrayView\<uint8_t\>) | Belirtilen veriyi sokete gönderir. |
| [Send](./send/)(System::Details::StackArray\<uint8_t, N\>\&) | Belirtilen veriyi sokete gönderir. |
| [Send](./send/)(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>) | Belirtilen veriyi sokete gönderir. |
| [Send](./send/)(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>, SocketFlags) | Belirtilen veriyi sokete gönderir. |
| [Send](./send/)(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>, SocketFlags, SocketError\&) | Belirtilen veriyi sokete gönderir. |
| [Send](./send/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags) | Belirtilen veriyi sokete gönderir. |
| [Send](./send/)(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags) | Belirtilen veriyi sokete gönderir. |
| [Send](./send/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags) | Belirtilen veriyi sokete gönderir. |
| [Send](./send/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, SocketError\&) | Belirtilen veriyi sokete gönderir. |
| [Send](./send/)(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags, SocketError\&) | Belirtilen veriyi sokete gönderir. |
| [Send](./send/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags, SocketError\&) | Belirtilen veriyi sokete gönderir. |
| [SendTo](./sendto/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) | Belirtilen veriyi belirtilen uç noktaya gönderir. |
| [SendTo](./sendto/)(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) | Belirtilen veriyi belirtilen uç noktaya gönderir. |
| [SendTo](./sendto/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) | Belirtilen veriyi belirtilen uç noktaya gönderir. |
| [SendTo](./sendto/)(System::ArrayPtr\<uint8_t\>, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) | Belirtilen veriyi belirtilen uç noktaya gönderir. |
| [SendTo](./sendto/)(System::Details::ArrayView\<uint8_t\>, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) | Belirtilen veriyi belirtilen uç noktaya gönderir. |
| [SendTo](./sendto/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) | Belirtilen veriyi belirtilen uç noktaya gönderir. |
| [SendTo](./sendto/)(System::ArrayPtr\<uint8_t\>, SocketFlags, System::SharedPtr\<EndPoint\>) | Belirtilen veriyi belirtilen uç noktaya gönderir. |
| [SendTo](./sendto/)(System::Details::ArrayView\<uint8_t\>, SocketFlags, System::SharedPtr\<EndPoint\>) | Belirtilen veriyi belirtilen uç noktaya gönderir. |
| [SendTo](./sendto/)(System::Details::StackArray\<uint8_t, N\>\&, SocketFlags, System::SharedPtr\<EndPoint\>) | Belirtilen veriyi belirtilen uç noktaya gönderir. |
| [SendTo](./sendto/)(System::ArrayPtr\<uint8_t\>, System::SharedPtr\<EndPoint\>) | Belirtilen veriyi belirtilen uç noktaya gönderir. |
| [SendTo](./sendto/)(System::Details::ArrayView\<uint8_t\>, System::SharedPtr\<EndPoint\>) | Belirtilen veriyi belirtilen uç noktaya gönderir. |
| [SendTo](./sendto/)(System::Details::StackArray\<uint8_t, N\>\&, System::SharedPtr\<EndPoint\>) | Belirtilen veriyi belirtilen uç noktaya gönderir. |
| [set_Blocking](./set_blocking/)(bool) | Soketin engelleme modunda olup olmadığını gösteren bir değeri ayarlar. |
| [set_ConnectionTimeout](./set_connectiontimeout/)(int32_t) | Bağlantı zaman aşımını ayarlar. |
| [set_DontFragment](./set_dontfragment/)(bool) | Soketin IP datagramlarının parçalanmasına izin verip vermediğini gösteren bir değeri ayarlar. |
| [set_DualMode](./set_dualmode/)(bool) | Soketin çift-modda olup olmadığını gösteren bir değeri ayarlar. |
| [set_EnableBroadcast](./set_enablebroadcast/)(bool) | Soketin yayın paketlerine izin verip vermediğini gösteren bir değeri ayarlar. |
| [set_ExclusiveAddressUse](./set_exclusiveaddressuse/)(bool) | Soketin bir bağlantı noktasına yalnızca bir işlem bağlayıp bağlayamayacağını gösteren bir değeri ayarlar. |
| [set_LingerState](./set_lingerstate/)(System::SharedPtr\<LingerOption\>) | Soketin, bekleyen tüm verileri göndermeye çalışarak kapanmayı geciktirip geciktirmeyeceğini gösteren bir değeri ayarlar. |
| [set_MulticastLoopback](./set_multicastloopback/)(bool) | Soketin giden çoklu yayın paketlerini alıp almayacağını gösteren bir değeri ayarlar. |
| [set_NoDelay](./set_nodelay/)(bool) | Soketin Nagle algoritmasını kullanıp kullanmadığını gösteren bir değeri ayarlar. |
| [set_ReceiveBufferSize](./set_receivebuffersize/)(int32_t) | Alma tampon boyutunu ayarlar. |
| [set_ReceiveTimeout](./set_receivetimeout/)(int32_t) | 'Receive' çağrısının zaman aşımına uğrayacağı bir süreyi ayarlar. |
| [set_SendBufferSize](./set_sendbuffersize/)(int32_t) | Gönderme tampon boyutunu ayarlar. |
| [set_SendTimeout](./set_sendtimeout/)(int32_t) | 'Send' çağrısının zaman aşımına uğrayacağı bir süreyi ayarlar. |
| [set_Ttl](./set_ttl/)(int16_t) | TTL değerini ayarlar. |
| [SetSocketOption](./setsocketoption/)(SocketOptionLevel, SocketOptionName, int32_t) | Belirtilen soket seçeneğini belirtilen değere ayarlar. |
| [SetSocketOption](./setsocketoption/)(SocketOptionLevel, SocketOptionName, System::ArrayPtr\<uint8_t\>) | Belirtilen soket seçeneğini belirtilen değere ayarlar. |
| [SetSocketOption](./setsocketoption/)(SocketOptionLevel, SocketOptionName, bool) | Belirtilen soket seçeneğini belirtilen değere ayarlar. |
| [SetSocketOption](./setsocketoption/)(SocketOptionLevel, SocketOptionName, System::SharedPtr\<Object\>) | Belirtilen soket seçeneğini belirtilen değere ayarlar. |
| [Shutdown](./shutdown/)(SocketShutdown) | Soketin gönderme ve alma işlemlerini devre dışı bırakır. |
| [Socket](./socket/)(System::Net::Sockets::SocketType, System::Net::Sockets::ProtocolType) | Yeni bir örnek oluşturur. |
| [Socket](./socket/)(System::Net::Sockets::AddressFamily, System::Net::Sockets::SocketType, System::Net::Sockets::ProtocolType) | Yeni bir örnek oluşturur. |
| virtual [~Socket](./~socket/)() | Geçerli örneği yok eder. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [ImplPtr](./implptr/) | Soket uygulaması. |
## Ayrıca Bakınız

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Net::Sockets](../)
* Library [Aspose.Font for C++](../../)
