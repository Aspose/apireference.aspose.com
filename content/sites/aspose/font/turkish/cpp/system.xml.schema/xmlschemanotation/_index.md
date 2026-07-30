---
title: "System::Xml::Schema::XmlSchemaNotation class"
linktitle: "XmlSchemaNotation"
second_title: "Aspose.Font için C++"
description: "System::Xml::Schema::XmlSchemaNotation sınıfı. Dünya Çapında Web Konsorsiyumu (W3C) tarafından belirtilen XML Şeması'ndan notasyon öğesini temsil eder. Bir XML Schemanotation bildirimi, XML 1.0 NOTATION bildirimlerinin yeniden yapılandırılmasıdır. Notasyonların amacı, C++ içinde bir XML belgesi içindeki XML dışı verinin biçimini tanımlamaktır."
type: docs
weight: 4800
url: /tr/cpp/system.xml.schema/xmlschemanotation/
---
## XmlSchemaNotation class


XML [Schema](../) üzerinden Dünya Çapında [Web](../../system.web/) Konsorsiyumu (W3C) tarafından belirtilen **notation** öğesini temsil eder. Bir XML [Schema](../)**notation** bildirimi, **XML** 1.0 NOTATION bildirimlerinin yeniden yapılandırılmasıdır. Notasyonların amacı, bir XML belgesi içinde XML dışı verinin biçimini tanımlamaktır.

```cpp
class XmlSchemaNotation : public System::Xml::Schema::XmlSchemaAnnotated
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_Name](./get_name/)() | Notasyonun adını döndürür. |
| [get_Public](./get_public/)() | Public tanımlayıcısını döndürür. |
| [get_System](./get_system/)() | System tanımlayıcısını döndürür. |
| [set_Name](./set_name/)(const String\&) | Notasyonun adını ayarlar. |
| [set_Public](./set_public/)(const String\&) | Public tanımlayıcısını ayarlar. |
| [set_System](./set_system/)(const String\&) | System tanımlayıcısını ayarlar. |
| [XmlSchemaNotation](./xmlschemanotation/)() | Yeni bir [XmlSchemaNotation](./) sınıfı örneği başlatır. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [Ptr](./ptr/) | Bu sınıfın bir örneğine ortak gösterici için bir takma ad. |
## Açıklamalar



Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu türden örnekleri yığıt üzerinde veya new operatörüyle oluşturmayın, çünkü bu çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) göstericisine sarın ve bu göstericiyi fonksiyonlara argüman olarak geçirmek için kullanın.

## Ayrıca Bakınız

* Class [XmlSchemaAnnotated](../xmlschemaannotated/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
