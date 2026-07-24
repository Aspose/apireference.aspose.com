---
title: "System::Xml::Schema::XmlSchemaChoice class"
linktitle: "XmlSchemaChoice"
second_title: "Aspose.Page için C++"
description: "System::Xml::Schema::XmlSchemaChoice sınıfı. Dünya Çapında Ağ Konsorsiyumu (W3C) tarafından belirlenen XML Şemasından seçim öğesini (birleştirici) temsil eder. Seçim, C++ içinde bir örnekte yalnızca bir çocuğunun görünmesine izin verir."
type: docs
weight: 1400
url: /tr/cpp/system.xml.schema/xmlschemachoice/
---
## XmlSchemaChoice class


XML [Schema](../) öğesinden **choice** (birleştirici) öğesini Dünya Çapında [Web](../../system.web/) Konsorsiyumu (W3C) tarafından belirlenen şekilde temsil eder. **choice**, bir örnekte yalnızca bir çocuğunun görünmesine izin verir.

```cpp
class XmlSchemaChoice : public System::Xml::Schema::XmlSchemaGroupBase
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_Items](./get_items/)() override | Birleştirici (**choice**) ile içerilen öğelerin koleksiyonunu döndürür: [XmlSchemaElement](../xmlschemaelement/), [XmlSchemaGroupRef](../xmlschemagroupref/), [XmlSchemaChoice](./), [XmlSchemaSequence](../xmlschemasequence/), veya [XmlSchemaAny](../xmlschemaany/). |
| [XmlSchemaChoice](./xmlschemachoice/)() | [XmlSchemaChoice](./) sınıfının yeni bir örneğini başlatır. |
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
