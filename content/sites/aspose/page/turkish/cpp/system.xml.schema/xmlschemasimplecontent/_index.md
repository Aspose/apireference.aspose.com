---
title: "System::Xml::Schema::XmlSchemaSimpleContent sınıfı"
linktitle: "XmlSchemaSimpleContent"
second_title: "Aspose.Page için C++"
description: "System::Xml::Schema::XmlSchemaSimpleContent sınıfı. World Wide Web Konsorsiyumu (W3C) tarafından belirlenen XML Şeması'ndan simpleContent öğesini temsil eder. Bu sınıf, C++'ta basit içerik modeline sahip basit ve karmaşık tipler içindir."
type: docs
weight: 5900
url: /tr/cpp/system.xml.schema/xmlschemasimplecontent/
---
## XmlSchemaSimpleContent class


XML [Schema](../) tarafından belirlenen **simpleContent** öğesini temsil eder, World Wide [Web](../../system.web/) Konsorsiyumu (W3C) tarafından. Bu sınıf, basit içerik modeline sahip basit ve karmaşık tipler içindir.

```cpp
class XmlSchemaSimpleContent : public System::Xml::Schema::XmlSchemaContentModel
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_Content](./get_content/)() override | Aşağıdakilerden birini döndürür: [XmlSchemaSimpleContentRestriction](../xmlschemasimplecontentrestriction/) veya [XmlSchemaSimpleContentExtension](../xmlschemasimplecontentextension/). |
| [set_Content](./set_content/)(SharedPtr\<XmlSchemaContent\>) override | Aşağıdakilerden birini döndürür: [XmlSchemaSimpleContentRestriction](../xmlschemasimplecontentrestriction/) veya [XmlSchemaSimpleContentExtension](../xmlschemasimplecontentextension/). |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [Ptr](./ptr/) | Bu sınıfın bir örneğine ortak gösterici için bir takma addır. |
## Açıklamalar



Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Yığını üzerinde veya new operatörüyle bu tipin örneklerini asla oluşturmayın, çünkü bu çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

## Ayrıca Bakınız

* Class [XmlSchemaContentModel](../xmlschemacontentmodel/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
