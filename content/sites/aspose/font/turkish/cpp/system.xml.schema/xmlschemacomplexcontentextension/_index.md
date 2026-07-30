---
title: "System::Xml::Schema::XmlSchemaComplexContentExtension sınıfı"
linktitle: "XmlSchemaComplexContentExtension"
second_title: "Aspose.Font için C++"
description: "System::Xml::Schema::XmlSchemaComplexContentExtension sınıfı. Dünya Çapında Web Konsorsiyumu (W3C) tarafından belirlenen XML Şeması'ndan extension öğesini temsil eder. Bu sınıf, uzantı yoluyla türetilen karmaşık içerik modeline sahip karmaşık tipler içindir. C++'ta karmaşık tipi, öznitelikler veya öğeler ekleyerek genişletir."
type: docs
weight: 1900
url: /tr/cpp/system.xml.schema/xmlschemacomplexcontentextension/
---
## XmlSchemaComplexContentExtension class


XML [Schema](../) tarafından World Wide [Web](../../system.web/) Konsorsiyumu (W3C) tarafından tanımlanan **extension** öğesini temsil eder. Bu sınıf, uzantı yoluyla türetilen karmaşık içerik modeline sahip karmaşık tipler içindir. Karmaşık tipi, öznitelikler veya öğeler ekleyerek genişletir.

```cpp
class XmlSchemaComplexContentExtension : public System::Xml::Schema::XmlSchemaContent
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_AnyAttribute](./get_anyattribute/)() | Karmaşık içerik modelinin [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) bileşenini döndürür. |
| [get_Attributes](./get_attributes/)() | Karmaşık içerik için öznitelik koleksiyonunu döndürür. [XmlSchemaAttribute](../xmlschemaattribute/) ve [XmlSchemaAttributeGroupRef](../xmlschemaattributegroupref/) öğelerini içerir. |
| [get_BaseTypeName](./get_basetypename/)() | Bu tipin uzantı yoluyla türetildiği karmaşık tipin adını döndürür. |
| [get_Particle](./get_particle/)() | Aşağıdaki sınıflardan birini döndürür: [XmlSchemaGroupRef](../xmlschemagroupref/), [XmlSchemaChoice](../xmlschemachoice/), [XmlSchemaAll](../xmlschemaall/), veya [XmlSchemaSequence](../xmlschemasequence/) sınıfları. |
| [set_AnyAttribute](./set_anyattribute/)(const SharedPtr\<XmlSchemaAnyAttribute\>\&) | Karmaşık içerik modelinin [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) bileşenini ayarlar. |
| [set_BaseTypeName](./set_basetypename/)(const SharedPtr\<XmlQualifiedName\>\&) | Bu tipin uzantı yoluyla türetildiği karmaşık tipin adını ayarlar. |
| [set_Particle](./set_particle/)(const SharedPtr\<XmlSchemaParticle\>\&) | Aşağıdaki sınıflardan birini ayarlar: [XmlSchemaGroupRef](../xmlschemagroupref/), [XmlSchemaChoice](../xmlschemachoice/), [XmlSchemaAll](../xmlschemaall/), veya [XmlSchemaSequence](../xmlschemasequence/) sınıfları. |
| [XmlSchemaComplexContentExtension](./xmlschemacomplexcontentextension/)() | [XmlSchemaComplexContentExtension](./) sınıfının yeni bir örneğini başlatır. |
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
