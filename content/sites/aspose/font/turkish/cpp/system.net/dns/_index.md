---
title: "System::Net::Dns sınıfı"
linktitle: "Dns"
second_title: "Aspose.Font için C++"
description: "System::Net::Dns sınıfı. C++'ta DNS ile çalışmak için yöntemler sağlar."
type: docs
weight: 700
url: /tr/cpp/system.net/dns/
---
## Dns class


DNS ile çalışmak için yöntemler sağlar.

```cpp
class Dns : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| static [BeginGetHostAddresses](./begingethostaddresses/)(String, AsyncCallback, System::SharedPtr\<Object\>) | Belirtilen ana bilgisayar adı veya IP adresi içeren dizeyi kullanarak yeni bir IPHostEntry-class örneği oluşturmak için eşzamanlı bir işlem başlatır. |
| static [BeginGetHostByName](./begingethostbyname/)(String, AsyncCallback, System::SharedPtr\<Object\>) | Belirtilen ana bilgisayar adını kullanarak yeni bir IPHostEntry-class örneği oluşturmak için eşzamanlı bir işlem başlatır. |
| static [BeginGetHostEntry](./begingethostentry/)(String, AsyncCallback, System::SharedPtr\<Object\>) | Belirtilen ana bilgisayar adı veya IP adresi içeren dizeyi kullanarak yeni bir IPHostEntry-class örneği oluşturmak için eşzamanlı bir işlem başlatır. |
| static [BeginGetHostEntry](./begingethostentry/)(System::SharedPtr\<IPAddress\>, AsyncCallback, System::SharedPtr\<Object\>) | Belirtilen IP adresini kullanarak yeni bir IPHostEntry-class örneği oluşturmak için eşzamanlı bir işlem başlatır. |
| static [BeginResolve](./beginresolve/)(String, AsyncCallback, System::SharedPtr\<Object\>) | Belirtilen ana bilgisayar adını kullanarak yeni bir IPHostEntry-class örneği oluşturmak için eşzamanlı bir işlem başlatır. |
| [Dns](./dns/)() | Silinmiş varsayılan yapıcı. |
| static [EndGetHostAddresses](./endgethostaddresses/)(System::SharedPtr\<IAsyncResult\>) | Belirtilen eşzamanlı işlemin yeni bir IPHostEntry-class örneği oluşturması tamamlanana kadar bekler. |
| static [EndGetHostByName](./endgethostbyname/)(System::SharedPtr\<IAsyncResult\>) | Belirtilen eşzamanlı işlemin yeni bir IPHostEntry-class örneği oluşturması tamamlanana kadar bekler. |
| static [EndGetHostEntry](./endgethostentry/)(System::SharedPtr\<IAsyncResult\>) | Belirtilen eşzamanlı işlemin yeni bir IPHostEntry-class örneği oluşturması tamamlanana kadar bekler. |
| static [EndResolve](./endresolve/)(System::SharedPtr\<IAsyncResult\>) | Belirtilen eşzamanlı işlemin yeni bir IPHostEntry-class örneği oluşturması tamamlanana kadar bekler. |
| static [GetHostAddresses](./gethostaddresses/)(String) | Belirtilen ana bilgisayar adı veya IP adresinin IP adresleri koleksiyonunu döndürür. |
| static [GetHostByAddress](./gethostbyaddress/)(String) | Belirtilen IP adresinin dize temsili kullanılarak yeni bir IPHostEntry-class örneği oluşturur. |
| static [GetHostByAddress](./gethostbyaddress/)(System::SharedPtr\<IPAddress\>) | Belirtilen IP adresini kullanarak yeni bir IPHostEntry-class örneği oluşturur. |
| static [GetHostByName](./gethostbyname/)(String) | RTTI bilgisi. |
| static [GetHostEntry](./gethostentry/)(String) | Belirtilen, bir ana bilgisayar adı veya IP adresi içeren dizeyi kullanarak yeni bir IPHostEntry sınıfı örneği oluşturur. |
| static [GetHostEntry](./gethostentry/)(System::SharedPtr\<IPAddress\>) | Belirtilen IP adresini kullanarak yeni bir IPHostEntry-class örneği oluşturur. |
| static [GetHostName](./gethostname/)() | Yerel makinenin ana bilgisayar adını döndürür. |
| static [Resolve](./resolve/)(String) | Belirtilen ana bilgisayar adını kullanarak yeni bir IPHostEntry sınıfı örneği oluşturur. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
