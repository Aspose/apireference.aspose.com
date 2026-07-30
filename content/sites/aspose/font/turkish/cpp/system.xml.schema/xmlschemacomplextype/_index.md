---
title: "System::Xml::Schema::XmlSchemaComplexType class"
linktitle: "XmlSchemaComplexType"
second_title: "Aspose.Font için C++"
description: "System::Xml::Schema::XmlSchemaComplexType sınıfı. Dünya Çapında Ağ Konsorsiyumu (W3C) tarafından belirlenen XML Şeması'ndan complexType öğesini temsil eder. Bu sınıf, bir öğenin öznitelik ve içeriğini belirleyen bir karmaşık tip tanımlar C++'da."
type: docs
weight: 2100
url: /tr/cpp/system.xml.schema/xmlschemacomplextype/
---
## XmlSchemaComplexType class


XML [Schema](../) üzerinden Dünya Çapında [Web](../../system.web/) Konsorsiyumu (W3C) tarafından belirlenen **complexType** öğesini temsil eder. Bu sınıf, bir öğenin öznitelik ve içeriğini belirleyen bir karmaşık tip tanımlar.

```cpp
class XmlSchemaComplexType : public System::Xml::Schema::XmlSchemaType
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_AnyAttribute](./get_anyattribute/)() | Karmaşık tipin [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) bileşeni için değeri döndürür. |
| [get_Attributes](./get_attributes/)() | Karmaşık tip için öznitelik koleksiyonunu döndürür. |
| [get_AttributeUses](./get_attributeuses/)() | Bu karmaşık tipin ve temel tiplerinin tüm derlenmiş öznitelik koleksiyonunu döndürür. |
| [get_AttributeWildcard](./get_attributewildcard/)() | Bu karmaşık tip ve temel tip(ler)i için **anyAttribute**'un derleme sonrası değerini döndürür. |
| [get_Block](./get_block/)() | Döndürür **block** özniteliğini. |
| [get_BlockResolved](./get_blockresolved/)() | Tür, şema doğrulama sonrası bilgi kümesine (infoset) derlendikten sonra değeri döndürür. Bu değer, **xsi:type** örnek belge içinde kullanıldığında türün nasıl zorlandığını gösterir. |
| [get_ContentModel](./get_contentmodel/)() | Bu karmaşık tipin şema derlemesi sonrası [XmlSchemaContentModel](../xmlschemacontentmodel/) öğesini döndürür. |
| [get_ContentType](./get_contenttype/)() | Şema derlemesi sonrası değeri tutan karmaşık tipin içerik modelini döndürür. |
| [get_ContentTypeParticle](./get_contenttypeparticle/)() | [XmlSchemaComplexType::get_ContentType](./get_contenttype/) parçacığının şema derlemesi sonrası değerini tutan parçacığı döndürür. |
| [get_IsAbstract](./get_isabstract/)() | **complexType** öğesinin örnek belgede kullanılabilirliğini belirleyen bilgiyi döndürür. |
| [get_IsMixed](./get_ismixed/)() override | Karmaşık tipin karışık içerik modeline (içerik içinde işaretleme) sahip olup olmadığını belirleyen bilgiyi döndürür. |
| [get_Particle](./get_particle/)() | Kompozitör tipini, [XmlSchemaGroupRef](../xmlschemagroupref/), [XmlSchemaChoice](../xmlschemachoice/), [XmlSchemaAll](../xmlschemaall/) veya [XmlSchemaSequence](../xmlschemasequence/) sınıflarından biri olarak döndürür. |
| [set_AnyAttribute](./set_anyattribute/)(const SharedPtr\<XmlSchemaAnyAttribute\>\&) | Karmaşık tipin [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) bileşeni için değeri ayarlar. |
| [set_Block](./set_block/)(XmlSchemaDerivationMethod) | **block** özniteliğini ayarlar. |
| [set_ContentModel](./set_contentmodel/)(const SharedPtr\<XmlSchemaContentModel\>\&) | Bu karmaşık tipin şema derlemesi sonrası [XmlSchemaContentModel](../xmlschemacontentmodel/) öğesini ayarlar. |
| [set_IsAbstract](./set_isabstract/)(bool) | **complexType** öğesinin örnek belgede kullanılabilirliğini belirleyen bilgiyi ayarlar. |
| [set_IsMixed](./set_ismixed/)(bool) override | Karmaşık tipin karışık içerik modeline (içerik içinde işaretleme) sahip olup olmadığını belirleyen bilgiyi ayarlar. |
| [set_Particle](./set_particle/)(const SharedPtr\<XmlSchemaParticle\>\&) | Kompozitör tipini, [XmlSchemaGroupRef](../xmlschemagroupref/), [XmlSchemaChoice](../xmlschemachoice/), [XmlSchemaAll](../xmlschemaall/) veya [XmlSchemaSequence](../xmlschemasequence/) sınıflarından biri olarak ayarlar. |
| [XmlSchemaComplexType](./xmlschemacomplextype/)() | [XmlSchemaComplexType](./) sınıfının yeni bir örneğini başlatır. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [Ptr](./ptr/) | Bu sınıfın bir örneğine ortak gösterici için bir takma ad. |
## Açıklamalar



Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu türden örnekleri yığıt üzerinde veya new operatörüyle oluşturmayın, çünkü bu çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) göstericisine sarın ve bu göstericiyi fonksiyonlara argüman olarak geçirmek için kullanın.

## Ayrıca Bakınız

* Class [XmlSchemaType](../xmlschematype/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
