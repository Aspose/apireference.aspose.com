---
title: "System::Xml::Schema::XmlSchemaComplexContentRestriction sınıfı"
linktitle: "XmlSchemaComplexContentRestriction"
second_title: "Aspose.Font için C++"
description: "System::Xml::Schema::XmlSchemaComplexContentRestriction sınıfı. XML Şeması'ndan, Dünya Çapında Ağ Konsorsiyumu (W3C) tarafından belirtilen restriction öğesini temsil eder. Bu sınıf, kısıtlama yoluyla türetilen karmaşık içerik modeline sahip karmaşık tipler içindir. Karmaşık tipin içeriğini, kalıtılan karmaşık tipin bir alt kümesine C++'ta kısıtlar."
type: docs
weight: 2000
url: /tr/cpp/system.xml.schema/xmlschemacomplexcontentrestriction/
---
## XmlSchemaComplexContentRestriction class


XML [Schema](../) içinde **restriction** öğesini, Dünya Çapında [Web](../../system.web/) Konsorsiyumu (W3C) tarafından belirtilen şekilde temsil eder. Bu sınıf, kısıtlama yoluyla türetilen karmaşık içerik modeline sahip karmaşık tipler içindir. Karmaşık tipin içeriğini, kalıtılan karmaşık tipin bir alt kümesine kısıtlar.

```cpp
class XmlSchemaComplexContentRestriction : public System::Xml::Schema::XmlSchemaContent
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_AnyAttribute](./get_anyattribute/)() | Karmaşık içerik modelinin [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) bileşenini döndürür. |
| [get_Attributes](./get_attributes/)() | Karmaşık tip için öznitelik koleksiyonunu döndürür. [XmlSchemaAttribute](../xmlschemaattribute/) ve [XmlSchemaAttributeGroupRef](../xmlschemaattributegroupref/) öğelerini içerir. |
| [get_BaseTypeName](./get_basetypename/)() | Bu tipin kısıtlama yoluyla türetildiği karmaşık tipin adını döndürür. |
| [get_Particle](./get_particle/)() | Aşağıdaki sınıflardan birini döndürür: [XmlSchemaGroupRef](../xmlschemagroupref/), [XmlSchemaChoice](../xmlschemachoice/), [XmlSchemaAll](../xmlschemaall/), veya [XmlSchemaSequence](../xmlschemasequence/) sınıfları. |
| [set_AnyAttribute](./set_anyattribute/)(const SharedPtr\<XmlSchemaAnyAttribute\>\&) | Karmaşık içerik modelinin [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) bileşenini ayarlar. |
| [set_BaseTypeName](./set_basetypename/)(const SharedPtr\<XmlQualifiedName\>\&) | Bu tipin kısıtlama yoluyla türetildiği karmaşık tipin adını ayarlar. |
| [set_Particle](./set_particle/)(const SharedPtr\<XmlSchemaParticle\>\&) | Aşağıdaki sınıflardan birini ayarlar: [XmlSchemaGroupRef](../xmlschemagroupref/), [XmlSchemaChoice](../xmlschemachoice/), [XmlSchemaAll](../xmlschemaall/), veya [XmlSchemaSequence](../xmlschemasequence/) sınıfları. |
| [XmlSchemaComplexContentRestriction](./xmlschemacomplexcontentrestriction/)() | [XmlSchemaComplexContentRestriction](./) sınıfının yeni bir örneğini başlatır. |
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
