---
title: "System::Net::Sockets::TcpListener sınıfı"
linktitle: "TcpListener"
second_title: "Aspose.Font için C++"
description: "System::Net::Sockets::TcpListener sınıfı. TCP ağ hizmetleri için bir dinleyiciyi temsil eder. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığına (stack) veya new operatörüyle oluşturmaktan kaçının; aksi takdirde çalışma zamanı hataları ve/veya doğrulama hataları ortaya çıkar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 600
url: /tr/cpp/system.net.sockets/tcplistener/
---
## TcpListener class


TCP ağ hizmetleri için bir dinleyiciyi temsil eder. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığına (stack) veya new operatörüyle oluşturmaktan kaçının; aksi takdirde çalışma zamanı hataları ve/veya doğrulama hataları ortaya çıkar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class TcpListener : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [AcceptSocket](./acceptsocket/)() | Bekleyen bağlantı isteğini kabul eder ve veri gönderip almak için kullanılan soketi döndürür. |
| [AcceptTcpClient](./accepttcpclient/)() | Bekleyen bağlantı isteğini kabul eder ve veri gönderip almak için kullanılan TcpClient-sınıfı örneğini döndürür. |
| [AllowNatTraversal](./allownattraversal/)(bool) | NAT geçişini etkinleştirir veya devre dışı bırakır. |
| [BeginAcceptSocket](./beginacceptsocket/)(AsyncCallback, System::SharedPtr\<Object\>) | Asenkron bir kabul işlemi başlatır. |
| [BeginAcceptTcpClient](./beginaccepttcpclient/)(AsyncCallback, System::SharedPtr\<Object\>) | Asenkron bir kabul işlemi başlatır. |
| static [Create](./create/)(int32_t) | Belirtilen bağlantı noktası numarasını kullanarak yeni bir örnek oluşturur. |
| [EndAcceptSocket](./endacceptsocket/)(System::SharedPtr\<IAsyncResult\>) | Belirtilen eşzamansız kabul işlemi tamamlanana kadar bekler. |
| [EndAcceptTcpClient](./endaccepttcpclient/)(System::SharedPtr\<IAsyncResult\>) | Belirtilen eşzamansız kabul işlemi tamamlanana kadar bekler. |
| [get_ExclusiveAddressUse](./get_exclusiveaddressuse/)() | Mevcut örneğin bir bağlantı noktasını yalnızca bir istemcinin kullanmasına izin verip vermediğini gösteren bir değeri alır. |
| [get_LocalEndpoint](./get_localendpoint/)() | Temel uç noktayı döndürür. |
| [get_Server](./get_server/)() | RTTI bilgisi. |
| [Pending](./pending/)() | Bekleyen bağlantı istekleri olup olmadığını gösteren bir değeri döndürür. |
| [set_ExclusiveAddressUse](./set_exclusiveaddressuse/)(bool) | Mevcut örneğin bir bağlantı noktasını yalnızca bir istemcinin kullanmasına izin verip vermediğini gösteren bir değeri ayarlar. |
| [Start](./start/)() | Gelen bağlantıları dinlemeye başlar. |
| [Start](./start/)(int32_t) | Gelen bağlantıları dinlemeye başlar. |
| [Stop](./stop/)() | Gelen bağlantıları dinlemeyi durdurur. |
| [TcpListener](./tcplistener/)(System::SharedPtr\<IPEndPoint\>) | Yeni bir örnek oluşturur. |
| [TcpListener](./tcplistener/)(System::SharedPtr\<IPAddress\>, int32_t) | Yeni bir örnek oluşturur. |
| [TcpListener](./tcplistener/)(int32_t) | Yeni bir örnek oluşturur. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Net::Sockets](../)
* Library [Aspose.Font for C++](../../)
