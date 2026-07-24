---
title: "System::Xml::Schema::XmlSchemaSimpleTypeUnion sınıfı"
linktitle: "XmlSchemaSimpleTypeUnion"
second_title: "Aspose.Page için C++"
description: "System::Xml::Schema::XmlSchemaSimpleTypeUnion sınıfı. XML Şema'dan basit tipler için union öğesini, World Wide Web Consortium (W3C) tarafından belirtildiği gibi temsil eder. Bir union veri tipi, bir simpleType'ın içeriğini belirtmek için kullanılabilir. simpleType öğesinin değeri, union içinde belirtilen alternatif veri tiplerinden oluşan bir kümeden herhangi biri olmalıdır. Union tipleri her zaman türetilmiş tiplerdir ve C++'ta en az iki alternatif veri tipinden oluşmalıdır."
type: docs
weight: 6600
url: /tr/cpp/system.xml.schema/xmlschemasimpletypeunion/
---
## XmlSchemaSimpleTypeUnion class


XML [Schema](../) üzerinden basit tipler için **union** öğesini, World Wide [Web](../../system.web/) Consortium (W3C) tarafından belirtildiği gibi temsil eder. Bir **union** veri tipi, bir **simpleType**'ın içeriğini belirtmek için kullanılabilir. **simpleType** öğesinin değeri, union içinde belirtilen alternatif veri tiplerinden oluşan bir kümeden herhangi biri olmalıdır. Union tipleri her zaman türetilmiş tiplerdir ve en az iki alternatif veri tipinden oluşmalıdır.

```cpp
class XmlSchemaSimpleTypeUnion : public System::Xml::Schema::XmlSchemaSimpleTypeContent
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_BaseMemberTypes](./get_basemembertypes/)() | Basit tipin [XmlSchemaSimpleTypeUnion::get_BaseTypes](./get_basetypes/) ve [XmlSchemaSimpleTypeUnion::get_MemberTypes](./get_membertypes/) değerlerine dayanarak **simpleType** öğesinin türünü temsil eden [XmlSchemaSimpleType](../xmlschemasimpletype/) nesnelerinden oluşan bir dizi döndürür. |
| [get_BaseTypes](./get_basetypes/)() | Temel tiplerin koleksiyonunu döndürür. |
| [get_MemberTypes](./get_membertypes/)() | Bu şemada (veya belirtilen ad alanı tarafından gösterilen başka bir şemada) tanımlanan yerleşik veri tiplerinin veya **simpleType** öğelerinin nitelikli üye adlarının dizisini döndürür. |
| [set_MemberTypes](./set_membertypes/)(const ArrayPtr\<SharedPtr\<XmlQualifiedName\>\>\&) | Bu şemada (veya belirtilen ad alanı tarafından gösterilen başka bir şemada) tanımlanan yerleşik veri tiplerinin veya **simpleType** öğelerinin nitelikli üye adlarının dizisini ayarlar. |
| [XmlSchemaSimpleTypeUnion](./xmlschemasimpletypeunion/)() | [XmlSchemaSimpleTypeUnion](./) sınıfının yeni bir örneğini başlatır. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [Ptr](./ptr/) | Bu sınıfın bir örneğine ortak gösterici için bir takma addır. |
## Açıklamalar



Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Yığını üzerinde veya new operatörüyle bu tipin örneklerini asla oluşturmayın, çünkü bu çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

## Ayrıca Bakınız

* Class [XmlSchemaSimpleTypeContent](../xmlschemasimpletypecontent/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
