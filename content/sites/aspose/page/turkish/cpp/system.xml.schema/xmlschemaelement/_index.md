---
title: "System::Xml::Schema::XmlSchemaElement sınıfı"
linktitle: "XmlSchemaElement"
second_title: "Aspose.Page için C++"
description: "System::Xml::Schema::XmlSchemaElement sınıfı. XML Şeması'ndan, Dünya Çapında Web Konsorsiyumu (W3C) tarafından belirlenen element öğesini temsil eder. Bu sınıf, tüm parçacık türleri için temel sınıftır ve C++'da bir XML belgesindeki öğeyi tanımlamak için kullanılır."
type: docs
weight: 2600
url: /tr/cpp/system.xml.schema/xmlschemaelement/
---
## XmlSchemaElement class


XML [Schema](../) üzerinden, Dünya Çapında [Web](../../system.web/) Konsorsiyumu (W3C) tarafından belirlenen **element** öğesini temsil eder. Bu sınıf, tüm parçacık türleri için temel sınıftır ve bir XML belgesindeki öğeyi tanımlamak için kullanılır.

```cpp
class XmlSchemaElement : public System::Xml::Schema::XmlSchemaParticle
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_Block](./get_block/)() | **Block** türevi döndürür. |
| [get_BlockResolved](./get_blockresolved/)() | **Block** değerinin derleme sonrası yorumunu döndürür. |
| [get_Constraints](./get_constraints/)() | Öğeye uygulanan kısıtlamaların koleksiyonunu döndürür. |
| [get_DefaultValue](./get_defaultvalue/)() | Öğenin içeriği bir basit tip ise veya öğenin içeriği **textOnly** ise, öğenin varsayılan değerini döndürür. |
| [get_ElementSchemaType](./get_elementschematype/)() | Öğenin [XmlSchemaElement::get_SchemaType](./get_schematype/) veya [XmlSchemaElement::get_SchemaTypeName](./get_schematypename/) değerlerine dayanarak öğenin tipini temsil eden bir [XmlSchemaType](../xmlschematype/) nesnesi döndürür. |
| [get_ElementType](./get_elementtype/)() | Öğenin [XmlSchemaElement](./) veya [XmlSchemaElement](./) nesnesine dayalı bir nesne döndürür; bu nesne **ElementType** değerinin derleme sonrası yorumunu tutar. |
| [get_Final](./get_final/)() | Daha fazla türevlemenin izin verilmediğini göstermek için **Final** değerini döndürür. |
| [get_FinalResolved](./get_finalresolved/)() | **Final** değerinin derleme sonrası yorumunu döndürür. |
| [get_FixedValue](./get_fixedvalue/)() | Sabit değeri döndürür. |
| [get_Form](./get_form/)() | Öğe için formu döndürür. |
| [get_IsAbstract](./get_isabstract/)() | Öğenin bir örnek belgede kullanılabilir olup olmadığını gösteren bilgiyi döndürür. |
| [get_IsNillable](./get_isnillable/)() | **xsi:nil**'in örnek veride ortaya çıkıp çıkmayacağını gösteren bilgiyi döndürür. Öğeye açık bir nil değeri atanıp atanamayacağını gösterir. |
| [get_Name](./get_name/)() | Öğenin adını döndürür. |
| [get_QualifiedName](./get_qualifiedname/)() | Verilen öğe için gerçek nitelikli adı döndürür. |
| [get_RefName](./get_refname/)() | Bu şemada (veya belirtilen ad alanı tarafından gösterilen başka bir şemada) bildirilen bir öğenin referans adını döndürür. |
| [get_SchemaType](./get_schematype/)() | Öğenin tipini döndürür. Bu, karmaşık bir tip ya da basit bir tip olabilir. |
| [get_SchemaTypeName](./get_schematypename/)() | Bu şemada (veya belirtilen ad alanı tarafından gösterilen başka bir şemada) tanımlı yerleşik bir veri tipinin adını döndürür. |
| [get_SubstitutionGroup](./get_substitutiongroup/)() | Bu öğe tarafından yerine geçen bir öğenin adını döndürür. |
| [set_Block](./set_block/)(XmlSchemaDerivationMethod) | Bir **Block** türetmesi ayarlar. |
| [set_DefaultValue](./set_defaultvalue/)(const String\&) | Öğenin içeriği basit bir tür ise veya öğenin içeriği **textOnly** ise, öğenin varsayılan değerini ayarlar. |
| [set_Final](./set_final/)(XmlSchemaDerivationMethod) | Daha fazla türetmeye izin verilmediğini göstermek için **Final** değerini ayarlar. |
| [set_FixedValue](./set_fixedvalue/)(const String\&) | Sabit değeri ayarlar. |
| [set_Form](./set_form/)(XmlSchemaForm) | Öğe için formu ayarlar. |
| [set_IsAbstract](./set_isabstract/)(bool) | Öğenin bir örnek belgede kullanılabilir olup olmadığını göstermek için bilgiyi ayarlar. |
| [set_IsNillable](./set_isnillable/)(bool) | **xsi:nil**'in örnek veride ortaya çıkıp çıkmayacağını gösteren bilgiyi ayarlar. Öğeye açık bir nil değeri atanıp atanamayacağını gösterir. |
| [set_Name](./set_name/)(const String\&) | Öğenin adını ayarlar. |
| [set_RefName](./set_refname/)(const SharedPtr\<XmlQualifiedName\>\&) | Bu şemada (veya belirtilen ad alanı tarafından gösterilen başka bir şemada) bildirilen bir öğenin referans adını ayarlar. |
| [set_SchemaType](./set_schematype/)(const SharedPtr\<XmlSchemaType\>\&) | Öğenin tipini ayarlar. Bu, karmaşık bir tip ya da basit bir tip olabilir. |
| [set_SchemaTypeName](./set_schematypename/)(const SharedPtr\<XmlQualifiedName\>\&) | Bu şemada veya belirtilen ad alanı tarafından gösterilen başka bir şemada tanımlı yerleşik bir veri tipinin adını ayarlar. |
| [set_SubstitutionGroup](./set_substitutiongroup/)(const SharedPtr\<XmlQualifiedName\>\&) | Bu öğe tarafından yerine geçen bir öğenin adını ayarlar. |
| [XmlSchemaElement](./xmlschemaelement/)() | [XmlSchemaElement](./) sınıfının yeni bir örneğini başlatır. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [Ptr](./ptr/) | Bu sınıfın bir örneğine ortak gösterici için bir takma addır. |
## Açıklamalar



Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Yığını üzerinde veya new operatörüyle bu tipin örneklerini asla oluşturmayın, çünkü bu çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

## Ayrıca Bakınız

* Class [XmlSchemaParticle](../xmlschemaparticle/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
