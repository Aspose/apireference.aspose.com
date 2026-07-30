---
title: "System::Xml::Schema::XmlSchemaExternal sınıfı"
linktitle: "XmlSchemaExternal"
second_title: "Aspose.Font için C++"
description: "System::Xml::Schema::XmlSchemaExternal sınıfı. C++'ta dahil edilen şema hakkında bilgi sağlar."
type: docs
weight: 2800
url: /tr/cpp/system.xml.schema/xmlschemaexternal/
---
## XmlSchemaExternal class


Eklenen şema hakkında bilgi sağlar.

```cpp
class XmlSchemaExternal : public System::Xml::Schema::XmlSchemaObject
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_Id](./get_id/)() | Dize kimliğini döndürür. |
| [get_Schema](./get_schema/)() | Referans verilen şema için [XmlSchema](../xmlschema/) döndürür. |
| [get_SchemaLocation](./get_schemalocation/)() | Şemanın Uniform Resource Identifier (URI) konumunu döndürür; bu, şema işlemcisine şemanın fiziksel olarak nerede bulunduğunu bildirir. |
| [get_UnhandledAttributes](./get_unhandledattributes/)() | Şema hedef ad alanına ait olmayan nitelikli öznitelikleri döndürür. |
| [set_Id](./set_id/)(const String\&) | Dize kimliğini ayarlar. |
| [set_Schema](./set_schema/)(const SharedPtr\<XmlSchema\>\&) | Referans verilen şema için [XmlSchema](../xmlschema/) ayarlar. |
| [set_SchemaLocation](./set_schemalocation/)(const String\&) | Şemanın Uniform Resource Identifier (URI) konumunu ayarlar; bu, şema işlemcisine şemanın fiziksel olarak nerede bulunduğunu bildirir. |
| [set_UnhandledAttributes](./set_unhandledattributes/)(const ArrayPtr\<SharedPtr\<XmlAttribute\>\>\&) | Şema hedef ad alanına ait olmayan nitelikli öznitelikleri ayarlar. |
| [XmlSchemaExternal](./xmlschemaexternal/)() | Yeni bir [XmlSchemaExternal](./) sınıfının örneğini başlatır. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [Ptr](./ptr/) | Bu sınıfın bir örneğine ortak gösterici için bir takma ad. |
## Açıklamalar



Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu türden örnekleri yığıt üzerinde veya new operatörüyle oluşturmayın, çünkü bu çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) göstericisine sarın ve bu göstericiyi fonksiyonlara argüman olarak geçirmek için kullanın.

## Ayrıca Bakınız

* Class [XmlSchemaObject](../xmlschemaobject/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
