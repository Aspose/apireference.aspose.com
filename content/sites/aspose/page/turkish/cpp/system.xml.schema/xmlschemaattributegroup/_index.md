---
title: "System::Xml::Schema::XmlSchemaAttributeGroup sınıfı"
linktitle: "XmlSchemaAttributeGroup"
second_title: "Aspose.Page için C++"
description: "System::Xml::Schema::XmlSchemaAttributeGroup sınıfı. XML Şeması'ndan attributeGroup öğesini, World Wide Web Consortium (W3C) tarafından belirtilen şekilde temsil eder. AttributesGroups, bir dizi attribute bildirimini bir grup halinde toplayarak, C++'ta karmaşık tip tanımlarına grup olarak dahil edilmesini sağlayan bir mekanizma sunar."
type: docs
weight: 1200
url: /tr/cpp/system.xml.schema/xmlschemaattributegroup/
---
## XmlSchemaAttributeGroup class


XML [Schema](../) içinde **attributeGroup** öğesini, Dünya Çapında [Web](../../system.web/) Konsorsiyumu (W3C) tarafından belirtildiği gibi temsil eder. AttributesGroups, bir dizi öznitelik bildiriminin bir grup olarak birleştirilip karmaşık tip tanımlarına dahil edilebilmesi için bir mekanizma sağlar.

```cpp
class XmlSchemaAttributeGroup : public System::Xml::Schema::XmlSchemaAnnotated
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_AnyAttribute](./get_anyattribute/)() | Öznitelik grubunun [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) bileşenini döndürür. |
| [get_Attributes](./get_attributes/)() | Öznitelik grubuna ait öznitelik koleksiyonunu döndürür. [XmlSchemaAttribute](../xmlschemaattribute/) ve [XmlSchemaAttributeGroupRef](../xmlschemaattributegroupref/) öğelerini içerir. |
| [get_Name](./get_name/)() | Öznitelik grubunun adını döndürür. |
| [get_QualifiedName](./get_qualifiedname/)() | Öznitelik grubunun nitelikli adını döndürür. |
| [get_RedefinedAttributeGroup](./get_redefinedattributegroup/)() | XML [Schema](../) içindeki yeniden tanımlanmış öznitelik grubu özelliğini döndürür. |
| [set_AnyAttribute](./set_anyattribute/)(const SharedPtr\<XmlSchemaAnyAttribute\>\&) | Öznitelik grubunun [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) bileşenini ayarlar. |
| [set_Name](./set_name/)(const String\&) | Öznitelik grubunun adını ayarlar. |
| [XmlSchemaAttributeGroup](./xmlschemaattributegroup/)() | [XmlSchemaAttributeGroup](./) sınıfının yeni bir örneğini başlatır. |
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
