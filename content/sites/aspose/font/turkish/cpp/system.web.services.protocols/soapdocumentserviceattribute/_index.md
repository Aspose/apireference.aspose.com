---
title: "System::Web::Services::Protocols::SoapDocumentServiceAttribute sınıfı"
linktitle: "SoapDocumentServiceAttribute"
second_title: "Aspose.Font için C++"
description: "System::Web::Services::Protocols::SoapDocumentServiceAttribute sınıfı. SOAP istekleri ve yanıtları için varsayılan biçimi ayarlar. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek hiçbir zaman yığıt üzerinde veya new operatörüyle oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta işlevlere argüman olarak geçirmek için kullanın."
type: docs
weight: 500
url: /tr/cpp/system.web.services.protocols/soapdocumentserviceattribute/
---
## SoapDocumentServiceAttribute class


SOAP istekleri ve yanıtları için varsayılan biçimi ayarlar. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek hiçbir zaman yığıt üzerinde veya new operatörüyle oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi işlevlere argüman olarak geçirmek için kullanın.

```cpp
class SoapDocumentServiceAttribute : public System::Attribute
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_ParameterStyle](./get_parameterstyle/)() | RTTI bilgisi. |
| [get_RoutingStyle](./get_routingstyle/)() | SOAP mesajlarının hizmete nasıl yönlendirildiğini gösteren bir değer alır. |
| [get_Use](./get_use/)() | Parametre biçimlendirmesini alır. |
| [set_ParameterStyle](./set_parameterstyle/)(SoapParameterStyle) | Parametrelerin 'Body' öğesinin altında tek bir XML öğesi içinde kapsüllenip kapsüllenmediğini gösteren bir değeri ayarlar. |
| [set_RoutingStyle](./set_routingstyle/)(SoapServiceRoutingStyle) | SOAP mesajlarının hizmete nasıl yönlendirildiğini gösteren bir değeri ayarlar. |
| [set_Use](./set_use/)(Description::SoapBindingUse) | Parametre biçimlendirmesini ayarlar. |
| [SoapDocumentServiceAttribute](./soapdocumentserviceattribute/)() | Yeni bir örnek oluşturur. |
| [SoapDocumentServiceAttribute](./soapdocumentserviceattribute/)(Description::SoapBindingUse) | Yeni bir örnek oluşturur. |
| [SoapDocumentServiceAttribute](./soapdocumentserviceattribute/)(Description::SoapBindingUse, SoapParameterStyle) | Yeni bir örnek oluşturur. |
## Ayrıca Bakınız

* Class [Attribute](../../system/attribute/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Font for C++](../../)
