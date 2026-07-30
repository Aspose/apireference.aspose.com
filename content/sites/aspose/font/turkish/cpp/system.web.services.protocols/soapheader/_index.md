---
title: "System::Web::Services::Protocols::SoapHeader class"
linktitle: "SoapHeader"
second_title: "Aspose.Font için C++"
description: "System::Web::Services::Protocols::SoapHeader sınıfı. SOAP başlığının içeriğini temsil eder. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek asla yığıt (stack) üzerinde veya new operatörüyle oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'da fonksiyonlara argüman olarak geçirin."
type: docs
weight: 600
url: /tr/cpp/system.web.services.protocols/soapheader/
---
## SoapHeader class


SOAP başlığının içeriğini temsil eder. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek asla yığıt üzerinde veya new operatörüyle oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin.

```cpp
class SoapHeader : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_Actor](./get_actor/)() | SOAP sürüm 1.1 kullanıldığında SOAP başlığı alıcısının URI'sini alır. |
| [get_DidUnderstand](./get_didunderstand/)() | SOAP başlığının doğru işlenip işlenmediğini gösteren bir değeri alır. |
| [get_EncodedMustUnderstand](./get_encodedmustunderstand/)() | SOAP sürüm 1.1 kullanıldığında 'mustUnderstand' özniteliğinin değerini alır. |
| [get_EncodedMustUnderstand12](./get_encodedmustunderstand12/)() | SOAP sürüm 1.2 kullanıldığında 'mustUnderstand' özniteliğinin bir değerini alır. |
| [get_EncodedRelay](./get_encodedrelay/)() | 'relay' özniteliği değerinin dize temsilini alır. |
| [get_MustUnderstand](./get_mustunderstand/)() | SOAP başlığının anlaşılması gerekip gerekmediğini gösteren bir değeri alır. |
| [get_Relay](./get_relay/)() | 'relay' özniteliğinin bir değerini alır. |
| [get_Role](./get_role/)() | SOAP sürüm 1.2 kullanıldığında SOAP başlığı alıcısının URI'sını alır. |
| [set_Actor](./set_actor/)(String) | SOAP sürüm 1.1 kullanıldığında SOAP başlığı alıcısının URI'sını ayarlar. |
| [set_DidUnderstand](./set_didunderstand/)(bool) | SOAP başlığının doğru şekilde işlenip işlenmediğini gösteren bir değeri ayarlar. |
| [set_EncodedMustUnderstand](./set_encodedmustunderstand/)(String) | SOAP sürüm 1.1 kullanıldığında 'mustUnderstand' özniteliğinin bir değerini ayarlar. |
| [set_EncodedMustUnderstand12](./set_encodedmustunderstand12/)(String) | SOAP sürüm 1.2 kullanıldığında 'mustUnderstand' özniteliğinin bir değerini ayarlar. |
| [set_EncodedRelay](./set_encodedrelay/)(String) | 'relay' özniteliği değerinin dize temsilini ayarlar. |
| [set_MustUnderstand](./set_mustunderstand/)(bool) | SOAP başlığının anlaşılması gerekip gerekmediğini gösteren bir değeri ayarlar. |
| [set_Relay](./set_relay/)(bool) | 'relay' özniteliğinin bir değerini ayarlar. |
| [set_Role](./set_role/)(String) | SOAP sürüm 1.2 kullanıldığında SOAP başlığı alıcısının URI'sını ayarlar. |
| [SoapHeader](./soapheader/)(System::SharedPtr\<Xml::XmlElement\>) | Yeni bir örnek oluşturur. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Font for C++](../../)
