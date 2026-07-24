---
title: "System::Xml::Schema::XmlSchemaAttributeGroupRef sınıfı"
linktitle: "XmlSchemaAttributeGroupRef"
second_title: "Aspose.Page için C++"
description: "System::Xml::Schema::XmlSchemaAttributeGroupRef sınıfı. XML Şeması'ndan ref özniteliğiyle attributeGroup öğesini temsil eder. AttributesGroupRef, bir attributeGroup için referanstır; name özelliği C++'ta referans verilen attribute group'u içerir."
type: docs
weight: 1300
url: /tr/cpp/system.xml.schema/xmlschemaattributegroupref/
---
## XmlSchemaAttributeGroupRef class


XML [Schema](../) üzerinden **attributeGroup** öğesini **ref** özniteliğiyle temsil eder, [World Wide Web Consortium (W3C)](https://go.microsoft.com/fwlink/?LinkId=49454) tarafından belirtilmiştir. AttributesGroupRef bir attributeGroup için referanstır, name özelliği referans verilen attribute group'u içerir.

```cpp
class XmlSchemaAttributeGroupRef : public System::Xml::Schema::XmlSchemaAnnotated
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_RefName](./get_refname/)() | Referans verilen **attributeGroup** öğesinin adını döndürür. |
| [set_RefName](./set_refname/)(const SharedPtr\<XmlQualifiedName\>\&) | Referans verilen **attributeGroup** öğesinin adını ayarlar. |
| [XmlSchemaAttributeGroupRef](./xmlschemaattributegroupref/)() | Yeni bir [XmlSchemaAttributeGroupRef](./) sınıf örneği başlatır. |
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
