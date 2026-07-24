---
title: "System::Xml::Schema::XmlSchemaSimpleContentExtension sınıfı"
linktitle: "XmlSchemaSimpleContentExtension"
second_title: "Aspose.Page için C++"
description: "System::Xml::Schema::XmlSchemaSimpleContentExtension sınıfı. Dünya Çapında Ağ Konsorsiyumu (W3C) tarafından belirlenen XML Şeması'ndan basit içerik için uzantı öğesini temsil eder. Bu sınıf, uzantı yoluyla basit tipler türetmek için kullanılabilir. Bu tür türetmeler, C++'ta öğeye öznitelikler ekleyerek basit tip içeriğini genişletmek için kullanılır."
type: docs
weight: 6000
url: /tr/cpp/system.xml.schema/xmlschemasimplecontentextension/
---
## XmlSchemaSimpleContentExtension class


XML [Schema](../) üzerinden basit içerik için **extension** öğesini, Dünya Çapında [Web](../../system.web/) Konsorsiyumu (W3C) tarafından belirtildiği gibi temsil eder. Bu sınıf, uzantı yoluyla basit tipler türetmek için kullanılabilir. Bu tür türetmeler, öğeye öznitelikler ekleyerek basit tip içeriğini genişletmek için kullanılır.

```cpp
class XmlSchemaSimpleContentExtension : public System::Xml::Schema::XmlSchemaContent
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_AnyAttribute](./get_anyattribute/)() | Öznitelik değeri için kullanılacak [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) döndürür. |
| [get_Attributes](./get_attributes/)() | [XmlSchemaAttribute](../xmlschemaattribute/) ve [XmlSchemaAttributeGroupRef](../xmlschemaattributegroupref/) koleksiyonunu döndürür. |
| [get_BaseTypeName](./get_basetypename/)() | Bu tipin uzatıldığı yerleşik veri tipi veya basit tipin adını döndürür. |
| [set_AnyAttribute](./set_anyattribute/)(const SharedPtr\<XmlSchemaAnyAttribute\>\&) | Öznitelik değeri için kullanılacak [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) ayarlar. |
| [set_BaseTypeName](./set_basetypename/)(const SharedPtr\<XmlQualifiedName\>\&) | Bu tipin uzatıldığı yerleşik veri tipi veya basit tipin adını ayarlar. |
| [XmlSchemaSimpleContentExtension](./xmlschemasimplecontentextension/)() | [XmlSchemaSimpleContentExtension](./) sınıfının yeni bir örneğini başlatır. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [Ptr](./ptr/) | Bu sınıfın bir örneğine ortak gösterici için bir takma addır. |
## Açıklamalar



Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Yığını üzerinde veya new operatörüyle bu tipin örneklerini asla oluşturmayın, çünkü bu çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

## Ayrıca Bakınız

* Class [XmlSchemaContent](../xmlschemacontent/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
