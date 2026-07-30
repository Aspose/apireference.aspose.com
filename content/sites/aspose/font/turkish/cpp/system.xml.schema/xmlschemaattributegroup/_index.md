---
title: "System::Xml::Schema::XmlSchemaAttributeGroup sınıfı"
linktitle: "XmlSchemaAttributeGroup"
second_title: "Aspose.Font için C++"
description: "System::Xml::Schema::XmlSchemaAttributeGroup sınıfı. XML Şeması'ndaki attributeGroup öğesini, World Wide Web Consortium (W3C) tarafından belirtildiği gibi temsil eder. AttributesGroups, attribute bildirimlerinin bir kümesini grup olarak birleştirerek C++'da karmaşık tip tanımlarına dahil edilmesini sağlayan bir mekanizma sunar."
type: docs
weight: 1200
url: /tr/cpp/system.xml.schema/xmlschemaattributegroup/
---
## XmlSchemaAttributeGroup class


XML [Şema](../) içinde **attributeGroup** öğesini, World Wide [Web](../../system.web/) Consortium (W3C) tarafından belirtildiği gibi temsil eder. AttributesGroups, attribute bildirimlerinin bir kümesini grup olarak birleştirerek karmaşık tip tanımlarına dahil edilmesini sağlayan bir mekanizma sunar.

```cpp
class XmlSchemaAttributeGroup : public System::Xml::Schema::XmlSchemaAnnotated
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_AnyAttribute](./get_anyattribute/)() | Attribute group'un [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) bileşenini döndürür. |
| [get_Attributes](./get_attributes/)() | Attribute group için attribute koleksiyonunu döndürür. [XmlSchemaAttribute](../xmlschemaattribute/) ve [XmlSchemaAttributeGroupRef](../xmlschemaattributegroupref/) öğelerini içerir. |
| [get_Name](./get_name/)() | Attribute group'un adını döndürür. |
| [get_QualifiedName](./get_qualifiedname/)() | Attribute group'un nitelikli adını döndürür. |
| [get_RedefinedAttributeGroup](./get_redefinedattributegroup/)() | XML [Şema](../) içindeki yeniden tanımlanmış attribute group özelliğini döndürür. |
| [set_AnyAttribute](./set_anyattribute/)(const SharedPtr\<XmlSchemaAnyAttribute\>\&) | Attribute group'un [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) bileşenini ayarlar. |
| [set_Name](./set_name/)(const String\&) | Attribute group'un adını ayarlar. |
| [XmlSchemaAttributeGroup](./xmlschemaattributegroup/)() | [XmlSchemaAttributeGroup](./) sınıfının yeni bir örneğini başlatır. |
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
