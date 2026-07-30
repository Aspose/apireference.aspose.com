---
title: "System::Web::Services::Protocols::SoapClientMessage class"
linktitle: "SoapClientMessage"
second_title: "Aspose.Font için C++"
description: "System::Web::Services::Protocols::SoapClientMessage class. Gönderilen bir SOAP isteğinde veya alınan bir SOAP yanıtında bulunan verileri temsil eder. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığıt üzerinde veya new operatörüyle asla oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve C++'da fonksiyonlara argüman olarak geçirmek için bu işaretçiyi kullanın."
type: docs
weight: 300
url: /tr/cpp/system.web.services.protocols/soapclientmessage/
---
## SoapClientMessage class


SOAP isteği gönderildiğinde veya SOAP yanıtı alındığında verileri temsil eder. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek hiçbir zaman yığıt üzerinde veya new operatörüyle oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi işlevlere argüman olarak geçirmek için kullanın.

```cpp
class SoapClientMessage : public System::Web::Services::Protocols::SoapMessage
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_Action](./get_action/)() override | 'SOAPAction' özniteliğinin değerini döndürür. |
| [get_Client](./get_client/)() | İstemci vekil sınıfının bir örneğini döndürür. |
| virtual [get_OneWay](./get_oneway/)() | İstemcinin bir yöntemin işlenmesini sunucu bitirmesini beklemediğini gösteren bir değer döndürür. |
| [get_SoapVersion](./get_soapversion/)() override | Kullanılan SOAP sürümünü döndürür. |
| [get_Url](./get_url/)() override | XML [Web](../../system.web/) hizmet URL'sini döndürür. |
| [SoapClientMessage](./soapclientmessage/)(System::SharedPtr\<SoapHttpClientProtocol\>, System::SharedPtr\<SoapMethodStubInfo\>, String, System::ArrayPtr\<System::SharedPtr\<Object\>\>) | Yeni bir örnek oluşturur. |
## Ayrıca Bakınız

* Class [SoapMessage](../soapmessage/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Font for C++](../../)
