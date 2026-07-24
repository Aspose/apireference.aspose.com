---
title: "System::Xml::Schema::XmlSchemaGroup sınıfı"
linktitle: "XmlSchemaGroup"
second_title: "Aspose.Page için C++"
description: "System::Xml::Schema::XmlSchemaGroup sınıfı. Dünya Çapında Ağ Konsorsiyumu (W3C) tarafından belirlenen XML Şeması'ndan grup öğesini temsil eder. Bu sınıf, karmaşık tiplerden referans verilen şema seviyesindeki grupları tanımlar. Eleman bildirimlerini bir grup halinde toplayarak, C++'ta karmaşık tip tanımlarına grup olarak dahil edilmesini sağlar."
type: docs
weight: 3100
url: /tr/cpp/system.xml.schema/xmlschemagroup/
---
## XmlSchemaGroup class


XML [Schema](../) üzerinden **group** öğesini temsil eder, Dünya Çapında [Web](../../system.web/) Konsorsiyumu (W3C) tarafından belirlenmiştir. Bu sınıf, karmaşık tiplerden referans verilen **schema** seviyesindeki grupları tanımlar. Eleman bildirimlerini bir grup halinde toplayarak, karmaşık tip tanımlarına grup olarak dahil edilmesini sağlar.

```cpp
class XmlSchemaGroup : public System::Xml::Schema::XmlSchemaAnnotated
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_Name](./get_name/)() | Şema grubunun adını döndürür. |
| [get_Particle](./get_particle/)() | [XmlSchemaChoice](../xmlschemachoice/), [XmlSchemaAll](../xmlschemaall/) veya [XmlSchemaSequence](../xmlschemasequence/) sınıflarından birini döndürür. |
| [get_QualifiedName](./get_qualifiedname/)() | Şema grubunun nitelikli adını döndürür. |
| [set_Name](./set_name/)(const String\&) | Şema grubunun adını ayarlar. |
| [set_Particle](./set_particle/)(const SharedPtr\<XmlSchemaGroupBase\>\&) | [XmlSchemaChoice](../xmlschemachoice/), [XmlSchemaAll](../xmlschemaall/) veya [XmlSchemaSequence](../xmlschemasequence/) sınıflarından birini ayarlar. |
| [XmlSchemaGroup](./xmlschemagroup/)() | Yeni bir [XmlSchemaGroup](./) sınıfının örneğini başlatır. |
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
