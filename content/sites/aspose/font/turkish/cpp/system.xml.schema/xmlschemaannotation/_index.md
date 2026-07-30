---
title: "System::Xml::Schema::XmlSchemaAnnotation sınıfı"
linktitle: "XmlSchemaAnnotation"
second_title: "Aspose.Font için C++"
description: "System::Xml::Schema::XmlSchemaAnnotation sınıfı. C++'da World Wide Web Consortium (W3C) **annotation** öğesini temsil eder."
type: docs
weight: 700
url: /tr/cpp/system.xml.schema/xmlschemaannotation/
---
## XmlSchemaAnnotation class


World Wide [Web](../../system.web/) Consortium (W3C) **annotation** öğesini temsil eder.

```cpp
class XmlSchemaAnnotation : public System::Xml::Schema::XmlSchemaObject
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_Id](./get_id/)() | Dize kimliğini döndürür. |
| [get_Items](./get_items/)() | **Items** koleksiyonunu döndürür; bu koleksiyon **appinfo** ve **documentation** alt öğelerini depolamak için kullanılır. |
| [get_UnhandledAttributes](./get_unhandledattributes/)() | Şemanın hedef ad alanına ait olmayan nitelikli öznitelikleri döndürür. |
| [set_Id](./set_id/)(const String\&) | Dize kimliğini ayarlar. |
| [set_UnhandledAttributes](./set_unhandledattributes/)(const ArrayPtr\<SharedPtr\<XmlAttribute\>\>\&) | Şemanın hedef ad alanına ait olmayan nitelikli öznitelikleri ayarlar. |
| [XmlSchemaAnnotation](./xmlschemaannotation/)() | [XmlSchemaAnnotation](./) sınıfının yeni bir örneğini başlatır. |
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
