---
title: "System::Web::Services::Protocols::SoapHttpClientProtocol sınıfı"
linktitle: "SoapHttpClientProtocol"
second_title: "Aspose.Font için C++"
description: "System::Web::Services::Protocols::SoapHttpClientProtocol sınıfı. SOAP kullanıldığında istemci vekil hizmetleri bu sınıftan türemelidir. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığına (stack) ya da operator new ile asla oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'de fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 900
url: /tr/cpp/system.web.services.protocols/soaphttpclientprotocol/
---
## SoapHttpClientProtocol class


SOAP kullanıldığında istemci proxy hizmetleri bu sınıftan miras almalıdır. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini asla yığıt üzerinde veya new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

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
* Library [Aspose.Font for C++](../../)
