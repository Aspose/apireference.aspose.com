---
title: "System::Xml::Schema::XmlSchemaSequence sınıfı"
linktitle: "XmlSchemaSequence"
second_title: "Aspose.Page için C++"
description: "System::Xml::Schema::XmlSchemaSequence sınıfı. XML Şeması'ndan, Dünya Çapında Web Konsorsiyumu (W3C) tarafından belirtilen sıra öğesini (kompozitör) temsil eder. Sıra, gruptaki öğelerin, içinde bulunduran öğe içinde belirtilen sırada görünmesini gerektirir C++ içinde."
type: docs
weight: 5700
url: /tr/cpp/system.xml.schema/xmlschemasequence/
---
## XmlSchemaSequence class


XML [Schema](../) içindeki **sequence** öğesini (kompozitör) Dünya Çapında [Web](../../system.web/) Konsorsiyumu (W3C) tarafından belirtildiği gibi temsil eder. **sequence** öğesi, gruptaki öğelerin içinde bulunduran öğe içinde belirtilen sırada görünmesini gerektirir.

```cpp
class XmlSchemaSequence : public System::Xml::Schema::XmlSchemaGroupBase
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_Items](./get_items/)() override | Kompozitör içinde bulunan öğeler. [XmlSchemaElement](../xmlschemaelement/), [XmlSchemaGroupRef](../xmlschemagroupref/), [XmlSchemaChoice](../xmlschemachoice/), [XmlSchemaSequence](./) veya [XmlSchemaAny](../xmlschemaany/) koleksiyonu. |
| [XmlSchemaSequence](./xmlschemasequence/)() | [XmlSchemaSequence](./) sınıfının yeni bir örneğini başlatır. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [Ptr](./ptr/) | Bu sınıfın bir örneğine ortak gösterici için bir takma addır. |
## Açıklamalar



Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Yığını üzerinde veya new operatörüyle bu tipin örneklerini asla oluşturmayın, çünkü bu çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

## Ayrıca Bakınız

* Class [XmlSchemaGroupBase](../xmlschemagroupbase/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
