---
title: "System::Xml::Schema::XmlSchemaAnnotated sınıfı"
linktitle: "XmlSchemaAnnotated"
second_title: "Aspose.Page için C++"
description: "System::Xml::Schema::XmlSchemaAnnotated sınıfı. C++'ta açıklama öğeleri içerebilen herhangi bir öğe için temel sınıf."
type: docs
weight: 600
url: /tr/cpp/system.xml.schema/xmlschemaannotated/
---
## XmlSchemaAnnotated class


Açıklama öğelerini içerebilen herhangi bir öğe için temel sınıf.

```cpp
class XmlSchemaAnnotated : public System::Xml::Schema::XmlSchemaObject
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_Annotation](./get_annotation/)() | **annotation** özelliğini döndürür. |
| [get_Id](./get_id/)() | Dize kimliğini döndürür. |
| [get_UnhandledAttributes](./get_unhandledattributes/)() | Mevcut şemanın hedef ad alanına ait olmayan nitelikli öznitelikleri döndürür. |
| [set_Annotation](./set_annotation/)(const SharedPtr\<XmlSchemaAnnotation\>\&) | **annotation** özelliğini ayarlar. |
| [set_Id](./set_id/)(const String\&) | Dizge kimliğini ayarlar. |
| [set_UnhandledAttributes](./set_unhandledattributes/)(const ArrayPtr\<SharedPtr\<XmlAttribute\>\>\&) | Mevcut şemanın hedef ad alanına ait olmayan nitelikli öznitelikleri ayarlar. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [Ptr](./ptr/) | Bu sınıfın bir örneğine ortak gösterici için bir takma addır. |
## Açıklamalar



Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Yığını üzerinde veya new operatörüyle bu tipin örneklerini asla oluşturmayın, çünkü bu çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

## Ayrıca Bakınız

* Class [XmlSchemaObject](../xmlschemaobject/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
