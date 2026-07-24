---
title: "System::Xml::Schema::XmlSchemaImport sınıfı"
linktitle: "XmlSchemaImport"
second_title: "Aspose.Page için C++"
description: "System::Xml::Schema::XmlSchemaImport sınıfı. Dünya Çapında Ağ Konsorsiyumu (W3C) tarafından belirlenen XML Şeması'ndan import öğesini temsil eder. Bu sınıf, C++'ta diğer şemalardan şema bileşenlerini içe aktarmak için kullanılır."
type: docs
weight: 3500
url: /tr/cpp/system.xml.schema/xmlschemaimport/
---
## XmlSchemaImport class


XML [Schema](../) tarafından Dünya Çapında [Web](../../system.web/) Konsorsiyumu (W3C) olarak belirlenen **import** öğesini temsil eder. Bu sınıf, diğer şemalardan şema bileşenlerini içe aktarmak için kullanılır.

```cpp
class XmlSchemaImport : public System::Xml::Schema::XmlSchemaExternal
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_Annotation](./get_annotation/)() | **annotation** değerini döndürür. |
| [get_Namespace](./get_namespace/)() | İçe aktarılan şema için hedef ad alanını Birleşik Kaynak Tanımlayıcısı (URI) referansı olarak döndürür. |
| [set_Annotation](./set_annotation/)(const SharedPtr\<XmlSchemaAnnotation\>\&) | **annotation** değerini ayarlar. |
| [set_Namespace](./set_namespace/)(const String\&) | İçe aktarılan şema için hedef ad alanını Birleşik Kaynak Tanımlayıcısı (URI) referansı olarak ayarlar. |
| [XmlSchemaImport](./xmlschemaimport/)() | [XmlSchemaImport](./) sınıfının yeni bir örneğini başlatır. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [Ptr](./ptr/) | Bu sınıfın bir örneğine ortak gösterici için bir takma addır. |
## Açıklamalar



Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Yığını üzerinde veya new operatörüyle bu tipin örneklerini asla oluşturmayın, çünkü bu çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

## Ayrıca Bakınız

* Class [XmlSchemaExternal](../xmlschemaexternal/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
