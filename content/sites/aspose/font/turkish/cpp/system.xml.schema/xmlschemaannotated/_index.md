---
title: "System::Xml::Schema::XmlSchemaAnnotated sınıf"
linktitle: "XmlSchemaAnnotated"
second_title: "Aspose.Font için C++"
description: "System::Xml::Schema::XmlSchemaAnnotated sınıf. C++'ta açıklama öğeleri içerebilen herhangi bir öğe için temel sınıf."
type: docs
weight: 600
url: /tr/cpp/system.xml.schema/xmlschemaannotated/
---
## XmlSchemaAnnotated class


Ek açıklama öğeleri içerebilen herhangi bir öğe için temel sınıftır.

```cpp
class XmlSchemaAnnotated : public System::Xml::Schema::XmlSchemaObject
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_Annotation](./get_annotation/)() | **annotation** özelliğini döndürür. |
| [get_Id](./get_id/)() | Dize kimliğini döndürür. |
| [get_UnhandledAttributes](./get_unhandledattributes/)() | Geçerli şemanın hedef ad alanına ait olmayan nitelikli öznitelikleri döndürür. |
| [set_Annotation](./set_annotation/)(const SharedPtr\<XmlSchemaAnnotation\>\&) | **annotation** özelliğini ayarlar. |
| [set_Id](./set_id/)(const String\&) | Dize kimliğini ayarlar. |
| [set_UnhandledAttributes](./set_unhandledattributes/)(const ArrayPtr\<SharedPtr\<XmlAttribute\>\>\&) | Geçerli şemanın hedef ad alanına ait olmayan nitelikli öznitelikleri ayarlar. |
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
