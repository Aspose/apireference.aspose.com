---
title: "System::Xml::Schema::XmlSchemaType sınıfı"
linktitle: "XmlSchemaType"
second_title: "Aspose.Page için C++"
description: "System::Xml::Schema::XmlSchemaType sınıfı. C++'ta tüm basit tipler ve karmaşık tipler için temel sınıf."
type: docs
weight: 6800
url: /tr/cpp/system.xml.schema/xmlschematype/
---
## XmlSchemaType class


Tüm basit tipler ve karmaşık tipler için temel sınıf.

```cpp
class XmlSchemaType : public System::Xml::Schema::XmlSchemaAnnotated
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_BaseSchemaType](./get_baseschematype/)() | Derleme sonrası nesne tipini veya yerleşik XML [Schema](../) Tanım Dili (XSD) veri tipini, simpleType öğesini veya complexType öğesini döndürür. Bu, şema derlemesi sonrası bir infoset değeridir. |
| [get_BaseXmlSchemaType](./get_basexmlschematype/)() | Bu şema tipinin temel tipi için derleme sonrası değeri döndürür. |
| [get_Datatype](./get_datatype/)() | Karmaşık tipin veri tipi için derleme sonrası değeri döndürür. |
| [get_DerivedBy](./get_derivedby/)() | Bu öğenin temel tipinden nasıl türetildiğine dair derleme sonrası bilgiyi döndürür. |
| [get_Final](./get_final/)() | Daha fazla türetmeye izin verilip verilmediğini gösteren tip türetmesinin final niteliğini döndürür. |
| [get_FinalResolved](./get_finalresolved/)() | [XmlSchemaType::get_Final](./get_final/) değerinin derleme sonrası yorumunu döndürür. |
| virtual [get_IsMixed](./get_ismixed/)() | Bu tipin karışık içerik modeline sahip olup olmadığını gösteren bir değeri döndürür. Bu çağrı yalnızca karmaşık bir tipte geçerlidir. |
| [get_Name](./get_name/)() | Tipin adını döndürür. |
| [get_QualifiedName](./get_qualifiedname/)() | Bu tipin **Name** özniteliğinden oluşturulan tip için nitelikli adı döndürür. Bu, şema derlemesi sonrası bir değerdir. |
| [get_TypeCode](./get_typecode/)() | Tipin [XmlTypeCode](../xmltypecode/) değerini döndürür. |
| static [GetBuiltInComplexType](./getbuiltincomplextype/)(XmlTypeCode) | Belirtilen karmaşık tipin yerleşik karmaşık tipini temsil eden bir [XmlSchemaComplexType](../xmlschemacomplextype/) döndürür. |
| static [GetBuiltInComplexType](./getbuiltincomplextype/)(const SharedPtr\<XmlQualifiedName\>\&) | Nitelikli adla belirtilen karmaşık tipin yerleşik karmaşık tipini temsil eden bir [XmlSchemaComplexType](../xmlschemacomplextype/) döndürür. |
| static [GetBuiltInSimpleType](./getbuiltinsimpletype/)(const SharedPtr\<XmlQualifiedName\>\&) | Nitelikli adla belirtilen basit tipin yerleşik basit tipini temsil eden bir [XmlSchemaSimpleType](../xmlschemasimpletype/) döndürür. |
| static [GetBuiltInSimpleType](./getbuiltinsimpletype/)(XmlTypeCode) | Belirtilen basit tipin yerleşik basit tipini temsil eden bir [XmlSchemaSimpleType](../xmlschemasimpletype/) döndürür. |
| static [IsDerivedFrom](./isderivedfrom/)(SharedPtr\<XmlSchemaType\>, const SharedPtr\<XmlSchemaType\>\&, XmlSchemaDerivationMethod) | Belirtilen türetilmiş şema tipinin, belirtilen temel şema tipinden türetilip türetilmediğini gösteren bir değer döndürür. |
| [set_Final](./set_final/)(XmlSchemaDerivationMethod) | Daha fazla türetmeye izin verilip verilmediğini gösteren tip türetmesinin final özniteliğini ayarlar. |
| virtual [set_IsMixed](./set_ismixed/)(bool) | Bu tipin karışık içerik modeline sahip olup olmadığını gösteren bir değer ayarlar. Bu çağrı yalnızca bir karmaşık tipte geçerlidir. |
| [set_Name](./set_name/)(const String\&) | Tipin adını ayarlar. |
| [XmlSchemaType](./xmlschematype/)() | [XmlSchemaType](./) sınıfının yeni bir örneğini başlatır. |
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
