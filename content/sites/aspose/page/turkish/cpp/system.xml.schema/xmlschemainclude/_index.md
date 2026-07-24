---
title: "System::Xml::Schema::XmlSchemaInclude sınıfı"
linktitle: "XmlSchemaInclude"
second_title: "Aspose.Page için C++"
description: "System::Xml::Schema::XmlSchemaInclude sınıfı. Dünya Çapında Ağ Konsorsiyumu (W3C) tarafından belirlenen XML Şeması'ndan include öğesini temsil eder. Bu sınıf, dış bir şemadan bildirimleri ve tanımları dahil etmek için kullanılır. Dahil edilen bildirimler ve tanımlar, C++'ta içeren şemada işlenebilir hale gelir."
type: docs
weight: 3600
url: /tr/cpp/system.xml.schema/xmlschemainclude/
---
## XmlSchemaInclude class


XML [Schema](../) içinde World Wide [Web](../../system.web/) Consortium (W3C) tarafından belirtildiği gibi **include** öğesini temsil eder. Bu sınıf, dış bir şemadan bildirimleri ve tanımları dahil etmek için kullanılır. Dahil edilen bildirimler ve tanımlar, içeren şemada işleme için kullanılabilir.

```cpp
class XmlSchemaInclude : public System::Xml::Schema::XmlSchemaExternal
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_Annotation](./get_annotation/)() | **annotation** değerini döndürür. |
| [set_Annotation](./set_annotation/)(const SharedPtr\<XmlSchemaAnnotation\>\&) | **annotation** değerini ayarlar. |
| [XmlSchemaInclude](./xmlschemainclude/)() | Yeni bir [XmlSchemaInclude](./) sınıfı örneği başlatır. |
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
