---
title: "System::Xml::Schema::XmlSchemaSimpleContentRestriction class"
linktitle: "XmlSchemaSimpleContentRestriction"
second_title: "Aspose.Font için C++"
description: "System::Xml::Schema::XmlSchemaSimpleContentRestriction sınıfı. Dünya Çapında Web Konsorsiyumu (W3C) tarafından belirlenen XML Şeması'ndan basit içerik için kısıtlama öğesini temsil eder. Bu sınıf, kısıtlama yoluyla basit tipler türetmek için kullanılabilir. Bu tür türevler, öğenin değer aralığını, kalıtılan basit tipte belirtilen değerlerin bir alt kümesine sınırlamak için kullanılabilir C++'ta."
type: docs
weight: 6100
url: /tr/cpp/system.xml.schema/xmlschemasimplecontentrestriction/
---
## XmlSchemaSimpleContentRestriction class


XML [Schema](../) üzerinden basit içerik için **restriction** öğesini temsil eder; Dünya Çapında Web [Web](../../system.web/) Konsorsiyumu (W3C) tarafından belirtilmiştir. Bu sınıf, kısıtlama yoluyla basit tipler türetmek için kullanılabilir. Bu tür türevler, öğenin değer aralığını, kalıtılan basit tipte belirtilen değerlerin bir alt kümesine sınırlamak için kullanılabilir.

```cpp
class XmlSchemaSimpleContentRestriction : public System::Xml::Schema::XmlSchemaContent
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_AnyAttribute](./get_anyattribute/)() | Özellik değeri için kullanılacak bir [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) döndürür. |
| [get_Attributes](./get_attributes/)() | Basit tip için [XmlSchemaAttribute](../xmlschemaattribute/) ve [XmlSchemaAttributeGroupRef](../xmlschemaattributegroupref/) öznitelik koleksiyonunu döndürür. |
| [get_BaseType](./get_basetype/)() | Basit tip temel değerini döndürür. |
| [get_BaseTypeName](./get_basetypename/)() | Bu tipin türetildiği yerleşik veri tipi veya basit tipin adını döndürür. |
| [get_Facets](./get_facets/)() | Bir [Xml](../../system.xml/)[Schema](../) facet'i döndürür. |
| [set_AnyAttribute](./set_anyattribute/)(const SharedPtr\<XmlSchemaAnyAttribute\>\&) | Özellik değeri için kullanılacak bir [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) ayarlar. |
| [set_BaseType](./set_basetype/)(const SharedPtr\<XmlSchemaSimpleType\>\&) | Basit tip temel değerini ayarlar. |
| [set_BaseTypeName](./set_basetypename/)(const SharedPtr\<XmlQualifiedName\>\&) | Bu tipin türetildiği yerleşik veri tipi veya basit tipin adını ayarlar. |
| [XmlSchemaSimpleContentRestriction](./xmlschemasimplecontentrestriction/)() | [XmlSchemaSimpleContentRestriction](./) sınıfının yeni bir örneğini başlatır. |
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
