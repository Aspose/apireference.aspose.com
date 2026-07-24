---
title: "System::Xml::Schema::XmlSchemaComplexType sınıfı"
linktitle: "XmlSchemaComplexType"
second_title: "Aspose.Page için C++"
description: "System::Xml::Schema::XmlSchemaComplexType sınıfı. XML Şeması'ndan complexType öğesini World Wide Web Consortium (W3C) tarafından belirtildiği gibi temsil eder. Bu sınıf, bir öğenin C++'daki öznitelik ve içerik kümesini belirleyen bir karmaşık tip tanımlar."
type: docs
weight: 2100
url: /tr/cpp/system.xml.schema/xmlschemacomplextype/
---
## XmlSchemaComplexType class


XML [Schema](../) üzerinden World Wide [Web](../../system.web/) Consortium (W3C) tarafından belirtildiği gibi **complexType** öğesini temsil eder. Bu sınıf, bir öğenin öznitelik ve içerik kümesini belirleyen bir karmaşık tip tanımlar.

```cpp
class XmlSchemaComplexType : public System::Xml::Schema::XmlSchemaType
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_AnyAttribute](./get_anyattribute/)() | Karmaşık tipin [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) bileşeni için değeri döndürür. |
| [get_Attributes](./get_attributes/)() | Karmaşık tip için öznitelik koleksiyonunu döndürür. |
| [get_AttributeUses](./get_attributeuses/)() | Bu karmaşık tipin ve temel tiplerinin tüm uyumlu (derlenmiş) öznitelik koleksiyonunu döndürür. |
| [get_AttributeWildcard](./get_attributewildcard/)() | Bu karmaşık tip ve temel tip(ler) için **anyAttribute**'un derleme sonrası değerini döndürür. |
| [get_Block](./get_block/)() | **block** özniteliğini döndürür. |
| [get_BlockResolved](./get_blockresolved/)() | Tip, şema doğrulama sonrası bilgi kümesine (infoset) derlendikten sonraki değeri döndürür. Bu değer, örnek belge içinde **xsi:type** kullanıldığında tipin nasıl zorlandığını gösterir. |
| [get_ContentModel](./get_contentmodel/)() | Bu karmaşık tipin derleme sonrası [XmlSchemaContentModel](../xmlschemacontentmodel/) değerini döndürür. |
| [get_ContentType](./get_contenttype/)() | Derleme sonrası değeri tutan karmaşık tipin içerik modelini döndürür. |
| [get_ContentTypeParticle](./get_contenttypeparticle/)() | [XmlSchemaComplexType::get_ContentType](./get_contenttype/) parçacığının derleme sonrası değerini tutan parçacığı döndürür. |
| [get_IsAbstract](./get_isabstract/)() | **complexType** öğesinin örnek belgede kullanılabilir olup olmadığını belirleyen bilgiyi döndürür. |
| [get_IsMixed](./get_ismixed/)() override | Karmaşık tipin karışık bir içerik modeline (içerik içinde işaretleme) sahip olup olmadığını belirleyen bilgiyi döndürür. |
| [get_Particle](./get_particle/)() | Kompozitör tipini, [XmlSchemaGroupRef](../xmlschemagroupref/), [XmlSchemaChoice](../xmlschemachoice/), [XmlSchemaAll](../xmlschemaall/) veya [XmlSchemaSequence](../xmlschemasequence/) sınıflarından biri olarak döndürür. |
| [set_AnyAttribute](./set_anyattribute/)(const SharedPtr\<XmlSchemaAnyAttribute\>\&) | Karmaşık tipin [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) bileşeni için değeri ayarlar. |
| [set_Block](./set_block/)(XmlSchemaDerivationMethod) | **block** özniteliğini ayarlar. |
| [set_ContentModel](./set_contentmodel/)(const SharedPtr\<XmlSchemaContentModel\>\&) | Bu karmaşık tipin derleme sonrası [XmlSchemaContentModel](../xmlschemacontentmodel/) değerini ayarlar. |
| [set_IsAbstract](./set_isabstract/)(bool) | **complexType** öğesinin örnek belgede kullanılabilir olup olmadığını belirleyen bilgiyi ayarlar. |
| [set_IsMixed](./set_ismixed/)(bool) override | Karmaşık tipin karışık bir içerik modeline (içerik içinde işaretleme) sahip olup olmadığını belirleyen bilgiyi ayarlar. |
| [set_Particle](./set_particle/)(const SharedPtr\<XmlSchemaParticle\>\&) | Kompozitör tipini, [XmlSchemaGroupRef](../xmlschemagroupref/), [XmlSchemaChoice](../xmlschemachoice/), [XmlSchemaAll](../xmlschemaall/) veya [XmlSchemaSequence](../xmlschemasequence/) sınıflarından biri olarak ayarlar. |
| [XmlSchemaComplexType](./xmlschemacomplextype/)() | [XmlSchemaComplexType](./) sınıfının yeni bir örneğini başlatır. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [Ptr](./ptr/) | Bu sınıfın bir örneğine ortak gösterici için bir takma addır. |
## Açıklamalar



Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Yığını üzerinde veya new operatörüyle bu tipin örneklerini asla oluşturmayın, çünkü bu çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

## Ayrıca Bakınız

* Class [XmlSchemaType](../xmlschematype/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
