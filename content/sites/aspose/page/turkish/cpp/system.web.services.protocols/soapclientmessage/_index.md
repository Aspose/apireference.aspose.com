---
title: "System::Web::Services::Protocols::SoapClientMessage sınıfı"
linktitle: "SoapClientMessage"
second_title: "Aspose.Page için C++"
description: "System::Web::Services::Protocols::SoapClientMessage sınıfı. Gönderilen bir SOAP isteğinde veya alınan bir SOAP yanıtında bulunan verileri temsil eder. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek, yığına (stack) veya operator new kullanılarak oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 300
url: /tr/cpp/system.web.services.protocols/soapclientmessage/
---
## SoapClientMessage class


Bir SOAP isteği gönderildiğinde veya bir SOAP yanıtı alındığında bulunan verileri temsil eder. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek, yığına (stack) veya operator new kullanılarak oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class SoapClientMessage : public System::Web::Services::Protocols::SoapMessage
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_Action](./get_action/)() override | 'SOAPAction' özniteliğinin değerini döndürür. |
| [get_Client](./get_client/)() | İstemci vekil sınıfının bir örneğini döndürür. |
| virtual [get_OneWay](./get_oneway/)() | Bir istemcinin bir yöntemin işlenmesini sunucu bitirene kadar bekleyip beklemediğini gösteren bir değeri döndürür. |
| [get_SoapVersion](./get_soapversion/)() override | Kullanılan SOAP sürümünü döndürür. |
| [get_Url](./get_url/)() override | XML [Web](../../system.web/) hizmetinin URL'sini döndürür. |
| [SoapClientMessage](./soapclientmessage/)(System::SharedPtr\<SoapHttpClientProtocol\>, System::SharedPtr\<SoapMethodStubInfo\>, String, System::ArrayPtr\<System::SharedPtr\<Object\>\>) | Yeni bir örnek oluşturur. |
## Ayrıca Bakınız

* Class [SoapMessage](../soapmessage/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Page for C++](../../)
