---
title: "System::Net::Sockets::UdpClient sınıfı"
linktitle: "UdpClient"
second_title: "Aspose.Font için C++"
description: "System::Net::Sockets::UdpClient sınıfı. Kullanıcı Datagram Protokolü (UDP) ağ hizmetleri sağlar. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığına (stack) veya new operatörüyle oluşturmaya çalışmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarmalayın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 700
url: /tr/cpp/system.net.sockets/udpclient/
---
## UdpClient class


Kullanıcı Datagram Protokolü (UDP) ağ hizmetleri sağlar. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığına (stack) veya new operatörüyle oluşturmaya çalışmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisiyle sarmalayın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class UdpClient : public System::IDisposable
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Close](./close/)() | UDP bağlantısını kapatır. |
| [Connect](./connect/)(String, int32_t) | Belirtilen ana bilgisayardaki belirtilen bağlantı noktasına bir bağlantı kurar. |
| [Connect](./connect/)(System::SharedPtr\<IPAddress\>, int32_t) | Belirtilen bağlantı noktasındaki belirtilen adresteki ana bilgisayara bir bağlantı kurar. |
| [Connect](./connect/)(System::SharedPtr\<IPEndPoint\>) | Uzak bir uç noktaya bağlantı kurar. |
| [Dispose](./dispose/)() override | Yönetilen ve yönetilmeyen, [UdpClient](./) tarafından kullanılan kaynakları serbest bırakır. |
| [get_Client](./get_client/)() | RTTI bilgisi. |
| [Receive](./receive/)(System::SharedPtr\<IPEndPoint\>\&) | Sunucu tarafından gönderilen bir datagramı döndürür. |
| [Send](./send/)(System::ArrayPtr\<uint8_t\>, int32_t, System::SharedPtr\<IPEndPoint\>) | Uzak uç noktadaki ana bilgisayara bir UDP datagramı gönderir. |
| [Send](./send/)(System::ArrayPtr\<uint8_t\>, int32_t, String, int32_t) | Belirtilen uzak ana bilgisayardaki belirtilen bağlantı noktasına bir UDP datagramı gönderir. |
| [Send](./send/)(System::ArrayPtr\<uint8_t\>, int32_t) | Uzak bir ana bilgisayara bir UDP datagramı gönderir. |
| [set_Client](./set_client/)(System::SharedPtr\<Socket\>) | Temel ağ soketini sağlamak için kullanılır. |
| [UdpClient](./udpclient/)() | Yeni bir [UdpClient](./) sınıf örneği başlatır. |
| [UdpClient](./udpclient/)(AddressFamily) | Yeni bir [UdpClient](./) sınıf örneği başlatır. |
| [UdpClient](./udpclient/)(int32_t) | Yeni bir [UdpClient](./) sınıf örneği başlatır. |
| [UdpClient](./udpclient/)(int32_t, AddressFamily) | Yeni bir [UdpClient](./) sınıf örneği başlatır. |
| [UdpClient](./udpclient/)(System::SharedPtr\<IPEndPoint\>) | Yeni bir [UdpClient](./) sınıf örneği başlatır. param local EP UDP bağlantısını bağladığınız yerel uç nokta. |
| [UdpClient](./udpclient/)(String, int32_t) | Yeni bir [UdpClient](./) sınıf örneği oluşturur ve belirtilen bağlantı noktasındaki belirtilen uzak ana bilgisayara bağlanır. |
## Ayrıca Bakınız

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Net::Sockets](../)
* Library [Aspose.Font for C++](../../)
