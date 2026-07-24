---
title: "System::Xml::Schema::XmlSchemaParticle sınıfı"
linktitle: "XmlSchemaParticle"
second_title: "Aspose.Page için C++"
description: "System::Xml::Schema::XmlSchemaParticle sınıfı. Bunun temel sınıfı, C++'deki tüm parçacık türleri (ör. XmlSchemaAny) için temel sınıftır."
type: docs
weight: 5400
url: /tr/cpp/system.xml.schema/xmlschemaparticle/
---
## XmlSchemaParticle class


Bunun temel sınıfı, tüm parçacık türleri (ör. [XmlSchemaAny](../xmlschemaany/)) için temel sınıftır.

```cpp
class XmlSchemaParticle : public System::Xml::Schema::XmlSchemaAnnotated
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_MaxOccurs](./get_maxoccurs/)() | Parçacığın gerçekleşebileceği maksimum sayıyı döndürür. |
| [get_MaxOccursString](./get_maxoccursstring/)() | Sayının string değerini döndürür. Parçacığın gerçekleşebileceği maksimum sayı. |
| [get_MinOccurs](./get_minoccurs/)() | Parçacığın gerçekleşebileceği minimum sayıyı döndürür. |
| [get_MinOccursString](./get_minoccursstring/)() | Sayının string değerini döndürür. Parçacığın gerçekleşebileceği minimum sayı. |
| [set_MaxOccurs](./set_maxoccurs/)(Decimal) | Parçacığın gerçekleşebileceği maksimum sayıyı ayarlar. |
| [set_MaxOccursString](./set_maxoccursstring/)(const String\&) | Sayının string değerini ayarlar. Parçacığın gerçekleşebileceği maksimum sayı. |
| [set_MinOccurs](./set_minoccurs/)(Decimal) | Parçacığın gerçekleşebileceği minimum sayıyı ayarlar. |
| [set_MinOccursString](./set_minoccursstring/)(const String\&) | Sayının string değerini ayarlar. Parçacığın gerçekleşebileceği minimum sayı. |
| [XmlSchemaParticle](./xmlschemaparticle/)() | [XmlSchemaParticle](./) sınıfının yeni bir örneğini başlatır. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [Ptr](./ptr/) | Bu sınıfın bir örneğine ortak gösterici için bir takma addır. |
## Açıklamalar



Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Yığını üzerinde veya new operatörüyle bu tipin örneklerini asla oluşturmayın, çünkü bu çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

## Ayrıca Bakınız

* Class [XmlSchemaAnnotated](../xmlschemaannotated/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
