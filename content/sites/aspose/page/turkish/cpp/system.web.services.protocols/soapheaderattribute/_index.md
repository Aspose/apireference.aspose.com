---
title: "System::Web::Services::Protocols::SoapHeaderAttribute sınıfı"
linktitle: "SoapHeaderAttribute"
second_title: "Aspose.Page için C++"
description: "System::Web::Services::Protocols::SoapHeaderAttribute sınıfı. XML Web hizmeti yöntemi veya XML Web hizmeti istemcisinin işleyebileceği SOAP başlığını belirtir. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek hiçbir zaman yığına (stack) ya da new operatörüyle oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarmalayın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 700
url: /tr/cpp/system.web.services.protocols/soapheaderattribute/
---
## SoapHeaderAttribute class


XML [Web](../../system.web/) hizmeti yöntemi veya XML [Web](../../system.web/) hizmeti istemcisinin işleyebileceği SOAP başlığını belirtir. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek hiçbir zaman yığına (stack) ya da new operatörüyle oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisiyle sarmalayın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class SoapHeaderAttribute : public System::Attribute
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_Direction](./get_direction/)() | RTTI bilgisi. |
| [get_MemberName](./get_membername/)() | SOAP başlığı içeriğini almak için kullanılan XML SOAP hizmetinin bir üye değişken adını alır. |
| [get_Required](./get_required/)() | Alıcı XML [Web](../../system.web/) hizmeti veya XML [Web](../../system.web/) hizmeti istemcisi tarafından SOAP başlığının anlaşılması ve işlenmesi gerekip gerekmediğini gösteren bir değeri alır. |
| [set_Direction](./set_direction/)(SoapHeaderDirection) | SOAP başlığı yönünü ayarlar. |
| [set_MemberName](./set_membername/)(String) | SOAP başlığı içeriğini almak için kullanılan XML SOAP hizmetinin bir üye değişken adını ayarlar. |
| [set_Required](./set_required/)(bool) | Alıcı XML [Web](../../system.web/) hizmeti veya XML [Web](../../system.web/) hizmeti istemcisi tarafından SOAP başlığının anlaşılması ve işlenmesi gerekip gerekmediğini gösteren bir değeri ayarlar. |
| [SoapHeaderAttribute](./soapheaderattribute/)(String) | Yeni bir örnek oluşturur. |
## Ayrıca Bakınız

* Class [Attribute](../../system/attribute/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Page for C++](../../)
