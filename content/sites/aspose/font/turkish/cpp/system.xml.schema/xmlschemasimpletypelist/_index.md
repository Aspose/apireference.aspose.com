---
title: "System::Xml::Schema::XmlSchemaSimpleTypeList class"
linktitle: "XmlSchemaSimpleTypeList"
second_title: "Aspose.Font için C++"
description: "System::Xml::Schema::XmlSchemaSimpleTypeList sınıfı. Dünya Çapında Ağ Konsorsiyumu (W3C) tarafından belirlenen XML Schema'dan liste öğesini temsil eder. Bu sınıf, C++'ta belirtilen bir veri türünün değer listesi olarak bir simpleType öğesini tanımlamak için kullanılabilir."
type: docs
weight: 6400
url: /tr/cpp/system.xml.schema/xmlschemasimpletypelist/
---
## XmlSchemaSimpleTypeList class


XML [Schema](../) üzerinden Dünya Çapında [Web](../../system.web/) Konsorsiyumu (W3C) tarafından tanımlanan **list** öğesini temsil eder. Bu sınıf, belirtilen bir veri türünün değer listesi olarak bir **simpleType** öğesini tanımlamak için kullanılabilir.

```cpp
class XmlSchemaSimpleTypeList : public System::Xml::Schema::XmlSchemaSimpleTypeContent
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_BaseItemType](./get_baseitemtype/)() | Simple type öğesinin [XmlSchemaSimpleType](../xmlschemasimpletype/) tipini, **simpleType** öğesinin [XmlSchemaSimpleTypeList::get_ItemType](./get_itemtype/) ve [XmlSchemaSimpleTypeList::get_ItemTypeName](./get_itemtypename/) değerlerine dayanarak döndürür. |
| [get_ItemType](./get_itemtype/)() | Temel değer tarafından belirtilen tipten türetilen **simpleType** öğesini döndürür. |
| [get_ItemTypeName](./get_itemtypename/)() | Bu şemada (veya belirtilen ad alanı tarafından gösterilen başka bir şemada) tanımlı yerleşik bir veri tipi ya da **simpleType** öğesinin adını döndürür. |
| [set_BaseItemType](./set_baseitemtype/)(const SharedPtr\<XmlSchemaSimpleType\>\&) | Simple type'in [XmlSchemaSimpleType](../xmlschemasimpletype/) tipini, **simpleType** öğesinin [XmlSchemaSimpleTypeList::get_ItemType](./get_itemtype/) ve [XmlSchemaSimpleTypeList::get_ItemTypeName](./get_itemtypename/) değerlerine dayanarak ayarlar. |
| [set_ItemType](./set_itemtype/)(const SharedPtr\<XmlSchemaSimpleType\>\&) | **simpleType** öğesini, temel değer tarafından belirtilen tipten türetilen olarak ayarlar. |
| [set_ItemTypeName](./set_itemtypename/)(const SharedPtr\<XmlQualifiedName\>\&) | Bu şemada (veya belirtilen ad alanı tarafından gösterilen başka bir şemada) tanımlı yerleşik bir veri tipi ya da **simpleType** öğesinin adını ayarlar. |
| [XmlSchemaSimpleTypeList](./xmlschemasimpletypelist/)() | Yeni bir [XmlSchemaSimpleTypeList](./) sınıfı örneği başlatır. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [Ptr](./ptr/) | Bu sınıfın bir örneğine ortak gösterici için bir takma ad. |
## Açıklamalar



Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu türden örnekleri yığıt üzerinde veya new operatörüyle oluşturmayın, çünkü bu çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) göstericisine sarın ve bu göstericiyi fonksiyonlara argüman olarak geçirmek için kullanın.

## Ayrıca Bakınız

* Class [XmlSchemaSimpleTypeContent](../xmlschemasimpletypecontent/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
