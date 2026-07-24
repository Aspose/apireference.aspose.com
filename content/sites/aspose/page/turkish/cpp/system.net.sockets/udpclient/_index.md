---
title: "System::Net::Sockets::UdpClient class"
linktitle: "UdpClient"
second_title: "Aspose.Page için C++"
description: "System::Net::Sockets::UdpClient sınıfı. Kullanıcı Datagram Protokolü (UDP) ağ hizmetleri sağlar. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak allocate edilmelidir. Bu türün örneğini yığına (stack) ya da operator new ile asla oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 700
url: /tr/cpp/system.net.sockets/udpclient/
---
## UdpClient class


Kullanıcı Datagram Protokolü (UDP) ağ hizmetleri sağlar. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak allocate edilmelidir. Bu türün örneğini yığına (stack) ya da operator new ile asla oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class UdpClient : public System::IDisposable
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Close](./close/)() | UDP bağlantısını kapatır. |
| [Connect](./connect/)(String, int32_t) | Belirtilen ana bilgisayarda belirtilen bağlantı noktasına bir bağlantı kurar. |
| [Connect](./connect/)(System::SharedPtr\<IPAddress\>, int32_t) | Belirtilen bağlantı noktasında belirtilen adresteki ana bilgisayara bir bağlantı kurar. |
| [Connect](./connect/)(System::SharedPtr\<IPEndPoint\>) | Uzak bir uç noktaya bağlantı kurar. |
| [Dispose](./dispose/)() override | Yönetilen ve yönetilmeyen, [UdpClient](./) tarafından kullanılan kaynakları serbest bırakır. |
| [get_Client](./get_client/)() | RTTI bilgisi. |
| [Receive](./receive/)(System::SharedPtr\<IPEndPoint\>\&) | Sunucu tarafından gönderilen bir datagramı döndürür. |
| [Send](./send/)(System::ArrayPtr\<uint8_t\>, int32_t, System::SharedPtr\<IPEndPoint\>) | Uzak uç noktadaki ana bilgisayara bir UDP datagramı gönderir. |
| [Send](./send/)(System::ArrayPtr\<uint8_t\>, int32_t, String, int32_t) | Belirtilen uzak ana bilgisayarda belirtilen bağlantı noktasına bir UDP datagramı gönderir. |
| [Send](./send/)(System::ArrayPtr\<uint8_t\>, int32_t) | Uzak bir ana bilgisayara bir UDP datagramı gönderir. |
| [set_Client](./set_client/)(System::SharedPtr\<Socket\>) | Alttaki ağ soketini sağlamak için kullanılır. |
| [UdpClient](./udpclient/)() | Yeni bir [UdpClient](./) sınıfı örneği başlatır. |
| [UdpClient](./udpclient/)(AddressFamily) | Yeni bir [UdpClient](./) sınıfı örneği başlatır. |
| [UdpClient](./udpclient/)(int32_t) | Yeni bir [UdpClient](./) sınıfı örneği başlatır. |
| [UdpClient](./udpclient/)(int32_t, AddressFamily) | Yeni bir [UdpClient](./) sınıfı örneği başlatır. |
| [UdpClient](./udpclient/)(System::SharedPtr\<IPEndPoint\>) | Yeni bir [UdpClient](./) sınıfı örneği başlatır. param local EP UDP bağlantısını bağladığınız yerel uç nokta. |
| [UdpClient](./udpclient/)(String, int32_t) | Belirtilen uzaktaki ana bilgisayara ve belirtilen bağlantı noktasına bağlanan yeni bir [UdpClient](./) sınıfı örneği oluşturur. |
## Ayrıca Bakınız

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Net::Sockets](../)
* Library [Aspose.Page for C++](../../)
