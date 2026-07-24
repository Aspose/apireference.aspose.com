---
title: "System::Xml::Schema::XmlSchemaSimpleTypeList sınıfı"
linktitle: "XmlSchemaSimpleTypeList"
second_title: "Aspose.Page için C++"
description: "System::Xml::Schema::XmlSchemaSimpleTypeList sınıfı. Dünya Çapında Ağ Konsorsiyumu (W3C) tarafından belirlenen XML Schema'dan liste öğesini temsil eder. Bu sınıf, C++'ta belirtilen bir veri tipinin değer listesi olarak bir **simpleType** öğesini tanımlamak için kullanılabilir."
type: docs
weight: 6400
url: /tr/cpp/system.xml.schema/xmlschemasimpletypelist/
---
## XmlSchemaSimpleTypeList class


XML [Schema](../) içinde **list** öğesini, Dünya Çapında [Web](../../system.web/) Konsorsiyumu (W3C) tarafından belirtildiği gibi temsil eder. Bu sınıf, belirtilen bir veri tipinin değer listesi olarak bir **simpleType** öğesini tanımlamak için kullanılabilir.

```cpp
class XmlSchemaSimpleTypeList : public System::Xml::Schema::XmlSchemaSimpleTypeContent
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_BaseItemType](./get_baseitemtype/)() | Basit tipin [XmlSchemaSimpleType](../xmlschemasimpletype/) değerini döndürür; bu, **simpleType** öğesinin tipini, [XmlSchemaSimpleTypeList::get_ItemType](./get_itemtype/) ve [XmlSchemaSimpleTypeList::get_ItemTypeName](./get_itemtypename/) değerlerine dayanarak temsil eder. |
| [get_ItemType](./get_itemtype/)() | **simpleType** öğesini, temel değer tarafından belirtilen tipten türetilmiş olarak döndürür. |
| [get_ItemTypeName](./get_itemtypename/)() | Bu şemada (veya belirtilen ad alanı tarafından gösterilen başka bir şemada) tanımlı yerleşik bir veri tipinin veya **simpleType** öğesinin adını döndürür. |
| [set_BaseItemType](./set_baseitemtype/)(const SharedPtr\<XmlSchemaSimpleType\>\&) | [XmlSchemaSimpleType](../xmlschemasimpletype/) değerini ayarlar; bu, **simpleType** öğesinin tipini, [XmlSchemaSimpleTypeList::get_ItemType](./get_itemtype/) ve [XmlSchemaSimpleTypeList::get_ItemTypeName](./get_itemtypename/) değerlerine dayanarak temsil eder. |
| [set_ItemType](./set_itemtype/)(const SharedPtr\<XmlSchemaSimpleType\>\&) | **simpleType** öğesini, temel değer tarafından belirtilen tipten türetilmiş olarak ayarlar. |
| [set_ItemTypeName](./set_itemtypename/)(const SharedPtr\<XmlQualifiedName\>\&) | Bu şemada (veya belirtilen ad alanı tarafından gösterilen başka bir şemada) tanımlı yerleşik bir veri tipinin veya **simpleType** öğesinin adını ayarlar. |
| [XmlSchemaSimpleTypeList](./xmlschemasimpletypelist/)() | Yeni bir [XmlSchemaSimpleTypeList](./) sınıfı örneği başlatır. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [Ptr](./ptr/) | Bu sınıfın bir örneğine ortak gösterici için bir takma addır. |
## Açıklamalar



Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Yığını üzerinde veya new operatörüyle bu tipin örneklerini asla oluşturmayın, çünkü bu çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

## Ayrıca Bakınız

* Class [XmlSchemaSimpleTypeContent](../xmlschemasimpletypecontent/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
