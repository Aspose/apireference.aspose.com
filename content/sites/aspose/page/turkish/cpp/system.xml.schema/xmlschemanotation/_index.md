---
title: "System::Xml::Schema::XmlSchemaNotation sınıfı"
linktitle: "XmlSchemaNotation"
second_title: "Aspose.Page için C++"
description: "System::Xml::Schema::XmlSchemaNotation sınıfı. XML Şema'dan notasyon öğesini, World Wide Web Consortium (W3C) tarafından belirtildiği gibi temsil eder. Bir XML şema notasyon bildirimi, XML 1.0 NOTATION bildirimlerinin yeniden yapılandırılmasıdır. Notasyonların amacı, bir XML belgesi içinde XML dışı verilerin biçimini C++'ta tanımlamaktır."
type: docs
weight: 4800
url: /tr/cpp/system.xml.schema/xmlschemanotation/
---
## XmlSchemaNotation class


XML [Schema](../) üzerinden **notation** öğesini, World Wide [Web](../../system.web/) Consortium (W3C) tarafından belirtildiği gibi temsil eder. Bir XML [Schema](../)**notation** bildirimi, **XML** 1.0 NOTATION bildirimlerinin yeniden yapılandırılmasıdır. Notasyonların amacı, bir XML belgesi içinde XML dışı verilerin biçimini tanımlamaktır.

```cpp
class XmlSchemaNotation : public System::Xml::Schema::XmlSchemaAnnotated
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_Name](./get_name/)() | Notasyonun adını döndürür. |
| [get_Public](./get_public/)() | **public** tanımlayıcısını döndürür. |
| [get_System](./get_system/)() | **system** tanımlayıcısını döndürür. |
| [set_Name](./set_name/)(const String\&) | Notasyonun adını ayarlar. |
| [set_Public](./set_public/)(const String\&) | **public** tanımlayıcısını ayarlar. |
| [set_System](./set_system/)(const String\&) | **system** tanımlayıcısını ayarlar. |
| [XmlSchemaNotation](./xmlschemanotation/)() | Yeni bir [XmlSchemaNotation](./) sınıf örneği başlatır. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [Ptr](./ptr/) | Bu sınıfın bir örneğine ortak gösterici için bir takma addır. |
## Açıklamalar



Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Yığını üzerinde veya new operatörüyle bu tipin örneklerini asla oluşturmayın, çünkü bu çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

## Ayrıca Bakınız

* Class [XmlSchemaAnnotated](../xmlschemaannotated/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
