---
title: "System::Xml::Schema::XmlSchemaComplexContent sınıfı"
linktitle: "XmlSchemaComplexContent"
second_title: "Aspose.Page için C++"
description: "System::Xml::Schema::XmlSchemaComplexContent sınıfı. World Wide Web Consortium (W3C) tarafından belirlenen XML Schema'dan complexContent öğesini temsil eder. Bu sınıf, karmaşık tipler için karmaşık içerik modelini temsil eder. C++'da yalnızca öğeler veya karışık içerik içeren bir karmaşık tip üzerinde uzantılar veya kısıtlamalar içerir."
type: docs
weight: 1800
url: /tr/cpp/system.xml.schema/xmlschemacomplexcontent/
---
## XmlSchemaComplexContent class


World Wide [Web](../../system.web/) Consortium (W3C) tarafından belirlenen XML [Schema](../) içindeki **complexContent** öğesini temsil eder. Bu sınıf, karmaşık tipler için karmaşık içerik modelini temsil eder. Yalnızca öğeler veya karışık içerik içeren bir karmaşık tip üzerinde uzantılar veya kısıtlamalar içerir.

```cpp
class XmlSchemaComplexContent : public System::Xml::Schema::XmlSchemaContentModel
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_Content](./get_content/)() override | İçeriği döndürür. |
| [get_IsMixed](./get_ismixed/)() | Tipin karışık içerik modeline sahip olup olmadığını belirleyen bilgiyi döndürür. |
| [set_Content](./set_content/)(SharedPtr\<XmlSchemaContent\>) override | İçeriği ayarlar. |
| [set_IsMixed](./set_ismixed/)(bool) | Tipin karışık içerik modeline sahip olup olmadığını belirleyen bilgiyi ayarlar. |
| [XmlSchemaComplexContent](./xmlschemacomplexcontent/)() | Yeni bir [XmlSchemaComplexContent](./) sınıfının örneğini başlatır. |
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
