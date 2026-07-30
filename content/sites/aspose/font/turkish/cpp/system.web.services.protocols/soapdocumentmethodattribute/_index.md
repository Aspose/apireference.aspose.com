---
title: "System::Web::Services::Protocols::SoapDocumentMethodAttribute class"
linktitle: "SoapDocumentMethodAttribute"
second_title: "Aspose.Font için C++"
description: "System::Web::Services::Protocols::SoapDocumentMethodAttribute sınıfı. Yöntemden geçen veya dönen tüm SOAP mesajlarının Document biçimini kullandığını belirtir. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek asla yığına (stack) ya da new operatörüyle oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarmalayın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 400
url: /tr/cpp/system.web.services.protocols/soapdocumentmethodattribute/
---
## SoapDocumentMethodAttribute class


Yöntemden geçen veya dönen tüm SOAP mesajlarının Document biçimini kullandığını belirtir. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek asla yığına (stack) ya da new operatörüyle oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisiyle sarmalayın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class SoapDocumentMethodAttribute : public System::Attribute
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_Action](./get_action/)() | RTTI bilgisi. |
| [get_Binding](./get_binding/)() | XML web servisi metodunun bir işlemi uyguladığı bağlamayı alır. |
| [get_OneWay](./get_oneway/)() | Bir istemcinin bir yöntemin işlenmesini sunucunun bitirmesini bekleyip beklemediğini gösteren bir değeri alır. |
| [get_ParameterStyle](./get_parameterstyle/)() | Parametrelerin 'Body' öğesinin altında tek bir XML öğesi içinde kapsüllenip kapsüllenmediğini gösteren bir değeri alır. |
| [get_RequestElementName](./get_requestelementname/)() | Bir hizmet tanımında bir işlem olarak tanımlanan SOAP isteğiyle ilişkili XML öğesinin adını alır. |
| [get_RequestNamespace](./get_requestnamespace/)() | SOAP isteğiyle ilişkili ad alanını alır. |
| [get_ResponseElementName](./get_responseelementname/)() | SOAP yanıtıyla ilişkili XML öğesinin adını alır. |
| [get_ResponseNamespace](./get_responsenamespace/)() | SOAP yanıtıyla ilişkili ad alanını alır. |
| [get_Use](./get_use/)() | Mesaj kodlama yöntemini belirleyen bir değeri alır. |
| [set_Action](./set_action/)(String) | 'SOAPAction' özniteliğinin bir değerini ayarlar. |
| [set_Binding](./set_binding/)(String) | XML web servisi metodunun bir işlemi uyguladığı bağlamayı ayarlar. |
| [set_OneWay](./set_oneway/)(bool) | İstemcinin, sunucunun bir yöntemi işlemeyi bitirmesini bekleyip beklemediğini gösteren bir değeri ayarlar. |
| [set_ParameterStyle](./set_parameterstyle/)(SoapParameterStyle) | Parametrelerin 'Body' öğesinin altında tek bir XML öğesi içinde kapsüllenip kapsüllenmediğini gösteren bir değeri ayarlar. |
| [set_RequestElementName](./set_requestelementname/)(String) | Servis tanımında bir işlem olarak tanımlanan SOAP isteğiyle ilişkili XML öğesinin adını ayarlar. |
| [set_RequestNamespace](./set_requestnamespace/)(String) | SOAP isteğiyle ilişkili ad alanını ayarlar. |
| [set_ResponseElementName](./set_responseelementname/)(String) | SOAP yanıtıyla ilişkili XML öğesinin adını ayarlar. |
| [set_ResponseNamespace](./set_responsenamespace/)(String) | SOAP yanıtıyla ilişkili ad alanını ayarlar. |
| [set_Use](./set_use/)(Description::SoapBindingUse) | Mesaj kodlama yöntemini belirleyen bir değeri ayarlar. |
| [SoapDocumentMethodAttribute](./soapdocumentmethodattribute/)() | Yeni bir örnek oluşturur. |
| [SoapDocumentMethodAttribute](./soapdocumentmethodattribute/)(String) | Yeni bir örnek oluşturur. |
## Ayrıca Bakınız

* Class [Attribute](../../system/attribute/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Font for C++](../../)
