---
title: "System::Xml::Schema::XmlSchemaSequence sınıfı"
linktitle: "XmlSchemaSequence"
second_title: "Aspose.Font için C++"
description: "System::Xml::Schema::XmlSchemaSequence sınıf. Dünya Çapında Ağ Konsorsiyumu (W3C) tarafından belirlenen XML Şemasından sıralama öğesini (bileşen) temsil eder. Sıralama, gruptaki öğelerin içeren öğe içinde belirtilen sırada ortaya çıkmasını gerektirir C++'de."
type: docs
weight: 5700
url: /tr/cpp/system.xml.schema/xmlschemasequence/
---
## XmlSchemaSequence class


XML [Schema](../) üzerinden Dünya Çapında [Web](../../system.web/) Konsorsiyumu (W3C) tarafından belirlenen **sequence** öğesini (bileşen) temsil eder. **sequence**, gruptaki öğelerin içeren öğe içinde belirtilen sırada ortaya çıkmasını gerektirir.

```cpp
class XmlSchemaSequence : public System::Xml::Schema::XmlSchemaGroupBase
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_Items](./get_items/)() override | Bileşen içinde bulunan öğeler. [XmlSchemaElement](../xmlschemaelement/), [XmlSchemaGroupRef](../xmlschemagroupref/), [XmlSchemaChoice](../xmlschemachoice/), [XmlSchemaSequence](./) veya [XmlSchemaAny](../xmlschemaany/) koleksiyonu. |
| [XmlSchemaSequence](./xmlschemasequence/)() | [XmlSchemaSequence](./) sınıfının yeni bir örneğini başlatır. |
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
