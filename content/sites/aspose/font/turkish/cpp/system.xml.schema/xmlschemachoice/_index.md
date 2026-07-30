---
title: "System::Xml::Schema::XmlSchemaChoice sınıfı"
linktitle: "XmlSchemaChoice"
second_title: "Aspose.Font için C++"
description: "System::Xml::Schema::XmlSchemaChoice sınıfı. XML Şeması'ndan, Dünya Çapında Ağ Konsorsiyumu (W3C) tarafından belirtilen seçim öğesini (birleştirici) temsil eder. Seçim, C++ içinde bir örnekte yalnızca bir çocuğunun görünmesine izin verir."
type: docs
weight: 1400
url: /tr/cpp/system.xml.schema/xmlschemachoice/
---
## XmlSchemaChoice class


XML [Schema](../) öğesinden **choice** öğesini (birleştirici) Dünya Çapında [Web](../../system.web/) Konsorsiyumu (W3C) tarafından belirtilen şekilde temsil eder. **choice** yalnızca bir çocuğunun bir örnekte görünmesine izin verir.

```cpp
class XmlSchemaChoice : public System::Xml::Schema::XmlSchemaGroupBase
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_Items](./get_items/)() override | Kompozitör (**choice**) ile içerilen öğelerin koleksiyonunu döndürür: [XmlSchemaElement](../xmlschemaelement/), [XmlSchemaGroupRef](../xmlschemagroupref/), [XmlSchemaChoice](./), [XmlSchemaSequence](../xmlschemasequence/), veya [XmlSchemaAny](../xmlschemaany/). |
| [XmlSchemaChoice](./xmlschemachoice/)() | [XmlSchemaChoice](./) sınıfının yeni bir örneğini başlatır. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [Ptr](./ptr/) | Bu sınıfın bir örneğine ortak gösterici için bir takma ad. |
## Açıklamalar



Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu türden örnekleri yığıt üzerinde veya new operatörüyle oluşturmayın, çünkü bu çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) göstericisine sarın ve bu göstericiyi fonksiyonlara argüman olarak geçirmek için kullanın.

## Ayrıca Bakınız

* Class [XmlSchemaGroupBase](../xmlschemagroupbase/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
