---
title: "System::Xml::Schema::XmlSchemaGroup sınıfı"
linktitle: "XmlSchemaGroup"
second_title: "Aspose.Font için C++"
description: "System::Xml::Schema::XmlSchemaGroup sınıfı. Dünya Çapında Web Konsorsiyumu (W3C) tarafından belirlenen XML Schema'dan group öğesini temsil eder. Bu sınıf, karmaşık tiplerden referans verilen şema seviyesindeki grupları tanımlar. Bir dizi öğe bildirimini gruplar, böylece C++'ta karmaşık tip tanımlarına bir grup olarak dahil edilebilir."
type: docs
weight: 3100
url: /tr/cpp/system.xml.schema/xmlschemagroup/
---
## XmlSchemaGroup class


XML [Schema](../) tarafından belirlenen **group** öğesini temsil eder, Dünya Çapında Web [Web](../../system.web/) Konsorsiyumu (W3C) tarafından tanımlanmıştır. Bu sınıf, karmaşık tiplerden referans verilen **schema** seviyesindeki grupları tanımlar. Bir dizi öğe bildirimini gruplar, böylece karmaşık tip tanımlarına bir grup olarak dahil edilebilir.

```cpp
class XmlSchemaGroup : public System::Xml::Schema::XmlSchemaAnnotated
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_Name](./get_name/)() | Şema grubunun adını döndürür. |
| [get_Particle](./get_particle/)() | Aşağıdaki sınıflardan birini döndürür: [XmlSchemaChoice](../xmlschemachoice/), [XmlSchemaAll](../xmlschemaall/), veya [XmlSchemaSequence](../xmlschemasequence/) sınıfları. |
| [get_QualifiedName](./get_qualifiedname/)() | Şema grubunun nitelikli adını döndürür. |
| [set_Name](./set_name/)(const String\&) | Şema grubunun adını ayarlar. |
| [set_Particle](./set_particle/)(const SharedPtr\<XmlSchemaGroupBase\>\&) | Aşağıdaki sınıflardan birini ayarlar: [XmlSchemaChoice](../xmlschemachoice/), [XmlSchemaAll](../xmlschemaall/), veya [XmlSchemaSequence](../xmlschemasequence/) sınıfları. |
| [XmlSchemaGroup](./xmlschemagroup/)() | [XmlSchemaGroup](./) sınıfının yeni bir örneğini başlatır. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [Ptr](./ptr/) | Bu sınıfın bir örneğine ortak gösterici için bir takma ad. |
## Açıklamalar



Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu türden örnekleri yığıt üzerinde veya new operatörüyle oluşturmayın, çünkü bu çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) göstericisine sarın ve bu göstericiyi fonksiyonlara argüman olarak geçirmek için kullanın.

## Ayrıca Bakınız

* Class [XmlSchemaAnnotated](../xmlschemaannotated/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
