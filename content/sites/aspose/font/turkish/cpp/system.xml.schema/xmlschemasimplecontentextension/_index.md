---
title: "System::Xml::Schema::XmlSchemaSimpleContentExtension sınıfı"
linktitle: "XmlSchemaSimpleContentExtension"
second_title: "Aspose.Font için C++"
description: "System::Xml::Schema::XmlSchemaSimpleContentExtension sınıfı. Dünya Çapında Web Konsorsiyumu (W3C) tarafından belirtilen XML Şeması'ndan basit içerik için uzantı öğesini temsil eder. Bu sınıf, basit türleri uzantı yoluyla türetmek için kullanılabilir. Bu tür türetmeler, öğenin basit tür içeriğini C++'ta öznitelikler ekleyerek genişletmek için kullanılır."
type: docs
weight: 6000
url: /tr/cpp/system.xml.schema/xmlschemasimplecontentextension/
---
## XmlSchemaSimpleContentExtension class


XML [Schema](../) üzerinden basit içerik için **extension** öğesini, Dünya Çapında [Web](../../system.web/) Konsorsiyumu (W3C) tarafından belirtildiği gibi temsil eder. Bu sınıf, uzantı yoluyla basit türleri türetmek için kullanılabilir. Bu tür türetmeler, öğenin basit tür içeriğini öznitelikler ekleyerek genişletmek için kullanılır.

```cpp
class XmlSchemaSimpleContentExtension : public System::Xml::Schema::XmlSchemaContent
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_AnyAttribute](./get_anyattribute/)() | Öznitelik değeri için kullanılacak [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) öğesini döndürür. |
| [get_Attributes](./get_attributes/)() | [XmlSchemaAttribute](../xmlschemaattribute/) ve [XmlSchemaAttributeGroupRef](../xmlschemaattributegroupref/) öğelerinin koleksiyonunu döndürür. |
| [get_BaseTypeName](./get_basetypename/)() | Bu türün genişletildiği yerleşik bir veri türünün veya basit bir türün adını döndürür. |
| [set_AnyAttribute](./set_anyattribute/)(const SharedPtr\<XmlSchemaAnyAttribute\>\&) | Öznitelik değeri için kullanılacak [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) ayarlar. |
| [set_BaseTypeName](./set_basetypename/)(const SharedPtr\<XmlQualifiedName\>\&) | Bu tipin genişletildiği yerleşik veri tipi veya basit tipin adını ayarlar. |
| [XmlSchemaSimpleContentExtension](./xmlschemasimplecontentextension/)() | [XmlSchemaSimpleContentExtension](./) sınıfının yeni bir örneğini başlatır. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [Ptr](./ptr/) | Bu sınıfın bir örneğine ortak gösterici için bir takma ad. |
## Açıklamalar



Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu türden örnekleri yığıt üzerinde veya new operatörüyle oluşturmayın, çünkü bu çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) göstericisine sarın ve bu göstericiyi fonksiyonlara argüman olarak geçirmek için kullanın.

## Ayrıca Bakınız

* Class [XmlSchemaContent](../xmlschemacontent/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
