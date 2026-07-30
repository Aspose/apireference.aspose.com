---
title: "System::Xml::Schema::XmlSchemaElement sınıfı"
linktitle: "XmlSchemaElement"
second_title: "Aspose.Font için C++"
description: "System::Xml::Schema::XmlSchemaElement sınıfı. XML Schema tarafından World Wide Web Consortium (W3C) tarafından tanımlanan element öğesini temsil eder. Bu sınıf, tüm particle tipleri için temel sınıftır ve C++'da bir XML belgesindeki bir öğeyi tanımlamak için kullanılır."
type: docs
weight: 2600
url: /tr/cpp/system.xml.schema/xmlschemaelement/
---
## XmlSchemaElement class


XML [Schema](../) tarafından World Wide [Web](../../system.web/) Konsorsiyumu (W3C) tarafından tanımlanan **element** öğesini temsil eder. Bu sınıf, tüm particle tipleri için temel sınıftır ve bir XML belgesindeki bir öğeyi tanımlamak için kullanılır.

```cpp
class XmlSchemaElement : public System::Xml::Schema::XmlSchemaParticle
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_Block](./get_block/)() | Bir **Block** türevi döndürür. |
| [get_BlockResolved](./get_blockresolved/)() | Derleme sonrası **Block** değerinin yorumunu döndürür. |
| [get_Constraints](./get_constraints/)() | Öğenin üzerindeki kısıtlamaların koleksiyonunu döndürür. |
| [get_DefaultValue](./get_defaultvalue/)() | Öğenin içeriği basit bir tür ise veya öğenin içeriği **textOnly** ise, öğenin varsayılan değerini döndürür. |
| [get_ElementSchemaType](./get_elementschematype/)() | Öğenin türünü, öğenin [XmlSchemaElement::get_SchemaType](./get_schematype/) veya [XmlSchemaElement::get_SchemaTypeName](./get_schematypename/) değerlerine dayalı olarak temsil eden bir [XmlSchemaType](../xmlschematype/) nesnesini döndürür. |
| [get_ElementType](./get_elementtype/)() | Öğenin [XmlSchemaElement](./) veya [XmlSchemaElement](./) nesnesine dayalı bir nesneyi döndürür; bu nesne **ElementType** değerinin derleme sonrası yorumunu tutar. |
| [get_Final](./get_final/)() | Daha fazla türetmeye izin verilmediğini göstermek için **Final** değerini döndürür. |
| [get_FinalResolved](./get_finalresolved/)() | **Final** değerinin derleme sonrası yorumunu döndürür. |
| [get_FixedValue](./get_fixedvalue/)() | Sabit değeri döndürür. |
| [get_Form](./get_form/)() | Öğe için formu döndürür. |
| [get_IsAbstract](./get_isabstract/)() | Öğenin bir örnek belgede kullanılabilir olup olmadığını gösterecek bilgiyi döndürür. |
| [get_IsNillable](./get_isnillable/)() | Örnek veride **xsi:nil** oluşup oluşamayacağını gösteren bilgiyi döndürür. Öğeye açık bir nil değeri atanabileceğini gösterir. |
| [get_Name](./get_name/)() | Öğenin adını döndürür. |
| [get_QualifiedName](./get_qualifiedname/)() | Verilen öğe için gerçek nitelikli adı döndürür. |
| [get_RefName](./get_refname/)() | Bu şemada (veya belirtilen ad alanı tarafından gösterilen başka bir şemada) bildirilen bir öğenin referans adını döndürür. |
| [get_SchemaType](./get_schematype/)() | Öğenin tipini döndürür. Bu, karmaşık bir tip ya da basit bir tip olabilir. |
| [get_SchemaTypeName](./get_schematypename/)() | Bu şemada veya belirtilen ad alanı tarafından gösterilen başka bir şemada tanımlı yerleşik bir veri tipinin adını döndürür. |
| [get_SubstitutionGroup](./get_substitutiongroup/)() | Bu öğe tarafından ikame edilen bir öğenin adını döndürür. |
| [set_Block](./set_block/)(XmlSchemaDerivationMethod) | Bir **Block** türetmesi ayarlar. |
| [set_DefaultValue](./set_defaultvalue/)(const String\&) | Öğenin içeriği basit bir tür ise veya öğenin içeriği **textOnly** ise, öğenin varsayılan değerini ayarlar. |
| [set_Final](./set_final/)(XmlSchemaDerivationMethod) | Daha fazla türetmeye izin verilmediğini göstermek için **Final** değerini ayarlar. |
| [set_FixedValue](./set_fixedvalue/)(const String\&) | Sabit değeri ayarlar. |
| [set_Form](./set_form/)(XmlSchemaForm) | Öğe için formu ayarlar. |
| [set_IsAbstract](./set_isabstract/)(bool) | Öğenin bir örnek belgede kullanılabilir olup olmadığını gösterecek bilgiyi ayarlar. |
| [set_IsNillable](./set_isnillable/)(bool) | **xsi:nil**'in örnek veride oluşup oluşamayacağını gösteren bilgiyi ayarlar. Öğeye açık bir nil değeri atanabileceğini gösterir. |
| [set_Name](./set_name/)(const String\&) | Öğenin adını ayarlar. |
| [set_RefName](./set_refname/)(const SharedPtr\<XmlQualifiedName\>\&) | Bu şemada (veya belirtilen ad alanı tarafından gösterilen başka bir şemada) bildirilen bir öğenin referans adını ayarlar. |
| [set_SchemaType](./set_schematype/)(const SharedPtr\<XmlSchemaType\>\&) | Öğenin tipini ayarlar. Bu, karmaşık bir tip ya da basit bir tip olabilir. |
| [set_SchemaTypeName](./set_schematypename/)(const SharedPtr\<XmlQualifiedName\>\&) | Bu şemada veya belirtilen ad alanı tarafından gösterilen başka bir şemada tanımlanan yerleşik bir veri tipinin adını ayarlar. |
| [set_SubstitutionGroup](./set_substitutiongroup/)(const SharedPtr\<XmlQualifiedName\>\&) | Bu öğe tarafından yerine geçilen bir öğenin adını ayarlar. |
| [XmlSchemaElement](./xmlschemaelement/)() | [XmlSchemaElement](./) sınıfının yeni bir örneğini başlatır. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [Ptr](./ptr/) | Bu sınıfın bir örneğine ortak gösterici için bir takma ad. |
## Açıklamalar



Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu türden örnekleri yığıt üzerinde veya new operatörüyle oluşturmayın, çünkü bu çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) göstericisine sarın ve bu göstericiyi fonksiyonlara argüman olarak geçirmek için kullanın.

## Ayrıca Bakınız

* Class [XmlSchemaParticle](../xmlschemaparticle/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
