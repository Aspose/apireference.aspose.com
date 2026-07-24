---
title: "System::Xml::Schema::XmlSchemaSimpleType sınıfı"
linktitle: "XmlSchemaSimpleType"
second_title: "Aspose.Page için C++"
description: "System::Xml::Schema::XmlSchemaSimpleType sınıfı. Dünya Çapında Ağ Konsorsiyumu (W3C) tarafından belirlenen XML Şeması'ndan basit içerik için simpleType öğesini temsil eder. Bu sınıf basit bir tipi tanımlar. Basit tipler, C++'ta yalnızca metin içeren özniteliklerin veya öğelerin değerleri için bilgi ve kısıtlamalar belirtebilir."
type: docs
weight: 6200
url: /tr/cpp/system.xml.schema/xmlschemasimpletype/
---
## XmlSchemaSimpleType class


XML [Schema](../) tarafından Dünya Çapında [Web](../../system.web/) Konsorsiyumu (W3C) olarak belirlenen **simpleType** öğesini basit içerik için temsil eder. Bu sınıf basit bir tipi tanımlar. Basit tipler, yalnızca metin içeren özniteliklerin veya öğelerin değerleri için bilgi ve kısıtlamalar belirtebilir.

```cpp
class XmlSchemaSimpleType : public System::Xml::Schema::XmlSchemaType
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_Content](./get_content/)() | [XmlSchemaSimpleTypeUnion](../xmlschemasimpletypeunion/), [XmlSchemaSimpleTypeList](../xmlschemasimpletypelist/) veya [XmlSchemaSimpleTypeRestriction](../xmlschemasimpletyperestriction/) öğelerinden birini döndürür. |
| [set_Content](./set_content/)(const SharedPtr\<XmlSchemaSimpleTypeContent\>\&) | [XmlSchemaSimpleTypeUnion](../xmlschemasimpletypeunion/), [XmlSchemaSimpleTypeList](../xmlschemasimpletypelist/) veya [XmlSchemaSimpleTypeRestriction](../xmlschemasimpletyperestriction/) öğelerinden birini ayarlar. |
| [XmlSchemaSimpleType](./xmlschemasimpletype/)() | [XmlSchemaSimpleType](./) sınıfının yeni bir örneğini başlatır. |
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
