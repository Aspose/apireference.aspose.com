---
title: "System::Web::Services::Protocols::SoapHttpClientProtocol sınıfı"
linktitle: "SoapHttpClientProtocol"
second_title: "Aspose.Page için C++"
description: "System::Web::Services::Protocols::SoapHttpClientProtocol sınıfı. SOAP kullanıldığında istemci vekil hizmetleri bu sınıftan miras almalıdır. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek hiçbir zaman yığına (stack) ya da new operatörüyle oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarmalayın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 900
url: /tr/cpp/system.web.services.protocols/soaphttpclientprotocol/
---
## SoapHttpClientProtocol class


SOAP kullanıldığında istemci vekil hizmetleri bu sınıftan miras almalıdır. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek hiçbir zaman yığına (stack) ya da new operatörüyle oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisiyle sarmalayın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class SoapHttpClientProtocol : public System::Web::Services::Protocols::HttpWebClientProtocol
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Discover](./discover/)() | Mevcut örneği XML [Web](../../system.web/) hizmetine bağlar. |
| [get_SoapVersion](./get_soapversion/)() | SOAP sürümünü alır. |
| [InitializeSerializers](./initializeserializers/)(const System::TypeInfo\&, System::SharedPtr\<System::Xml::Serialization::XmlSerializerImplementation\>, String) | Dahili alanları başlatır. |
| [set_SoapVersion](./set_soapversion/)(SoapProtocolVersion) | SOAP sürümünü ayarlar. |
| [SoapHttpClientProtocol](./soaphttpclientprotocol/)() | Yeni bir örnek oluşturur. |
## Ayrıca Bakınız

* Class [HttpWebClientProtocol](../httpwebclientprotocol/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Page for C++](../../)
