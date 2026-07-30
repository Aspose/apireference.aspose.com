---
title: "System::Net::Sockets::TcpClient sınıfı"
linktitle: "TcpClient"
second_title: "Aspose.Font için C++"
description: "System::Net::Sockets::TcpClient sınıfı. TCP ağ hizmetleri için bir istemciyi temsil eder. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığına (stack) ya da operator new ile asla oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisi ile sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 500
url: /tr/cpp/system.net.sockets/tcpclient/
---
## TcpClient class


TCP ağ hizmetleri için bir istemciyi temsil eder. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığına (stack) ya da operator new ile asla oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisi ile sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class TcpClient : public System::IDisposable
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [BeginConnect](./beginconnect/)(String, int32_t, AsyncCallback, System::SharedPtr\<Object\>) | Asenkron bir bağlanma işlemi başlatır. |
| [BeginConnect](./beginconnect/)(System::SharedPtr\<IPAddress\>, int32_t, AsyncCallback, System::SharedPtr\<Object\>) | Asenkron bir bağlanma işlemi başlatır. |
| [BeginConnect](./beginconnect/)(System::ArrayPtr\<System::SharedPtr\<IPAddress\>\>, int32_t, AsyncCallback, System::SharedPtr\<Object\>) | Asenkron bir bağlanma işlemi başlatır. |
| [Close](./close/)() | Bağlantıyı kapatır ve mevcut örneği serbest bırakır. |
| [Connect](./connect/)(String, int32_t) | Belirtilen uzak ana bilgisayara bir bağlantı kurar. |
| [Connect](./connect/)(System::SharedPtr\<IPAddress\>, int32_t) | Belirtilen uzak ana bilgisayara bir bağlantı kurar. |
| [Connect](./connect/)(System::SharedPtr\<IPEndPoint\>) | Belirtilen uzak ana bilgisayara bir bağlantı kurar. |
| [Connect](./connect/)(System::ArrayPtr\<System::SharedPtr\<IPAddress\>\>, int32_t) | Belirtilen uzak ana bilgisayara bir bağlantı kurar. |
| [EndConnect](./endconnect/)(System::SharedPtr\<IAsyncResult\>) | Belirtilen asenkron bağlanma işlemi tamamlanana kadar bekler. |
| [get_Available](./get_available/)() | Alınan ve okunmaya hazır bayt sayısını döndürür. |
| [get_Client](./get_client/)() | RTTI bilgisi. |
| [get_Connected](./get_connected/)() | Soketin uzak ana bilgisayara bağlı olup olmadığını gösteren bir değer döndürür. |
| [get_ExclusiveAddressUse](./get_exclusiveaddressuse/)() | Mevcut örneğin bir bağlantı noktasını yalnızca bir istemcinin kullanmasına izin verip vermediğini gösteren bir değeri alır. |
| [get_LingerState](./get_lingerstate/)() | Soketin bekleyen tüm verileri göndermeye çalışarak kapanmayı geciktirip geciktirmeyeceğini gösteren bir değer alır. |
| [get_NoDelay](./get_nodelay/)() | Mevcut örneğin Nagle algoritmasını kullanıp kullanmadığını gösteren bir değeri alır. |
| [get_ReceiveBufferSize](./get_receivebuffersize/)() | Veri alımı için kullanılan tamponun boyutunu alır. |
| [get_ReceiveTimeout](./get_receivetimeout/)() | Veri alımının zaman aşımına uğrayacağı süreyi gösteren bir değeri alır. |
| [get_SendBufferSize](./get_sendbuffersize/)() | Veri gönderimi için kullanılan tamponun boyutunu alır. |
| [get_SendTimeout](./get_sendtimeout/)() | Veri gönderiminin zaman aşımına uğrayacağı süreyi gösteren bir değeri alır. |
| [GetStream](./getstream/)() | Veri gönderimi ve alımı için kullanılan akışı döndürür. |
| [set_Client](./set_client/)(System::SharedPtr\<Socket\>) | Soketi ayarlar. |
| [set_ExclusiveAddressUse](./set_exclusiveaddressuse/)(bool) | Mevcut örneğin bir bağlantı noktasını yalnızca bir istemcinin kullanmasına izin verip vermediğini gösteren bir değeri ayarlar. |
| [set_LingerState](./set_lingerstate/)(System::SharedPtr\<LingerOption\>) | Soketin, bekleyen tüm verileri göndermeye çalışarak kapanmayı geciktirip geciktirmeyeceğini gösteren bir değeri ayarlar. |
| [set_NoDelay](./set_nodelay/)(bool) | Mevcut örneğin Nagle algoritmasını kullanıp kullanmadığını gösteren bir değeri ayarlar. |
| [set_ReceiveBufferSize](./set_receivebuffersize/)(int32_t) | Veri alımı için kullanılan tamponun boyutunu ayarlar. |
| [set_ReceiveTimeout](./set_receivetimeout/)(int32_t) | Veri alımının zaman aşımına uğrayacağı süreyi gösteren bir değeri ayarlar. |
| [set_SendBufferSize](./set_sendbuffersize/)(int32_t) | Veri gönderimi için kullanılan tamponun boyutunu ayarlar. |
| [set_SendTimeout](./set_sendtimeout/)(int32_t) | Veri gönderiminin zaman aşımına uğrayacağı süreyi gösteren bir değeri ayarlar. |
| [TcpClient](./tcpclient/)(System::SharedPtr\<IPEndPoint\>) | Yeni bir örnek oluşturur. |
| [TcpClient](./tcpclient/)() | Yeni bir örnek oluşturur. |
| [TcpClient](./tcpclient/)(AddressFamily) | Yeni bir örnek oluşturur. |
| [TcpClient](./tcpclient/)(String, int32_t) | Yeni bir örnek oluşturur. |
| virtual [~TcpClient](./~tcpclient/)() | Geçerli örneği yok eder. |
## Ayrıca Bakınız

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Net::Sockets](../)
* Library [Aspose.Font for C++](../../)
