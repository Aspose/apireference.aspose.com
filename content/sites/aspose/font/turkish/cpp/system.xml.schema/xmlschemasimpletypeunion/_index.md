---
title: "System::Xml::Schema::XmlSchemaSimpleTypeUnion class"
linktitle: "XmlSchemaSimpleTypeUnion"
second_title: "Aspose.Font için C++"
description: "System::Xml::Schema::XmlSchemaSimpleTypeUnion sınıfı. Dünya Çapında Web Konsorsiyumu (W3C) tarafından belirlenen XML Şeması'ndan basit tipler için birleşim öğesini temsil eder. Bir birleşim veri tipi, bir simpleType'ın içeriğini belirtmek için kullanılabilir. simpleType öğesinin değeri, birleşimde belirtilen alternatif veri tiplerinden oluşan bir kümenin herhangi biri olmalıdır. Birleşim tipleri her zaman türetilmiş tiplerdir ve C++'ta en az iki alternatif veri tipini içermelidir."
type: docs
weight: 6600
url: /tr/cpp/system.xml.schema/xmlschemasimpletypeunion/
---
## XmlSchemaSimpleTypeUnion class


XML [Schema](../) üzerinden basit tipler için **union** öğesini Dünya Çapında [Web](../../system.web/) Konsorsiyumu (W3C) tarafından belirlenen şekilde temsil eder. Bir **union** veri tipi, bir **simpleType**'ın içeriğini belirtmek için kullanılabilir. **simpleType** öğesinin değeri, birleşimde belirtilen alternatif veri tiplerinden oluşan bir kümenin herhangi biri olmalıdır. Birleşim tipleri her zaman türetilmiş tiplerdir ve en az iki alternatif veri tipini içermelidir.

```cpp
class XmlSchemaSimpleTypeUnion : public System::Xml::Schema::XmlSchemaSimpleTypeContent
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_BaseMemberTypes](./get_basemembertypes/)() | **simpleType** öğesinin tipini temsil eden [XmlSchemaSimpleType](../xmlschemasimpletype/) nesnelerinden oluşan bir dizi döndürür; dizi, basit tipin [XmlSchemaSimpleTypeUnion::get_BaseTypes](./get_basetypes/) ve [XmlSchemaSimpleTypeUnion::get_MemberTypes](./get_membertypes/) değerlerine dayanır. |
| [get_BaseTypes](./get_basetypes/)() | Temel tiplerin koleksiyonunu döndürür. |
| [get_MemberTypes](./get_membertypes/)() | Bu şemada (veya belirtilen ad alanı tarafından gösterilen başka bir şemada) tanımlı yerleşik veri tiplerinin veya **simpleType** öğelerinin nitelikli üye adlarından oluşan bir dizi döndürür. |
| [set_MemberTypes](./set_membertypes/)(const ArrayPtr\<SharedPtr\<XmlQualifiedName\>\>\&) | Bu şemada (veya belirtilen ad alanı tarafından gösterilen başka bir şemada) tanımlı yerleşik veri tiplerinin veya **simpleType** öğelerinin nitelikli üye adlarından oluşan diziyi ayarlar. |
| [XmlSchemaSimpleTypeUnion](./xmlschemasimpletypeunion/)() | Yeni bir [XmlSchemaSimpleTypeUnion](./) sınıfı örneği başlatır. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [Ptr](./ptr/) | Bu sınıfın bir örneğine ortak gösterici için bir takma ad. |
## Açıklamalar



Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu türden örnekleri yığıt üzerinde veya new operatörüyle oluşturmayın, çünkü bu çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) göstericisine sarın ve bu göstericiyi fonksiyonlara argüman olarak geçirmek için kullanın.

## Ayrıca Bakınız

* Class [XmlSchemaSimpleTypeContent](../xmlschemasimpletypecontent/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
