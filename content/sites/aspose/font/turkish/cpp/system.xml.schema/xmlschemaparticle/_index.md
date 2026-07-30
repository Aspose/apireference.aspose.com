---
title: "System::Xml::Schema::XmlSchemaParticle sınıfı"
linktitle: "XmlSchemaParticle"
second_title: "Aspose.Font için C++"
description: "System::Xml::Schema::XmlSchemaParticle sınıfı. C++'da tüm parçacık türleri (ör. XmlSchemaAny) için temel sınıf olan bir temel sınıftır."
type: docs
weight: 5400
url: /tr/cpp/system.xml.schema/xmlschemaparticle/
---
## XmlSchemaParticle class


Bu, tüm parçacık türleri (ör. [XmlSchemaAny](../xmlschemaany/)) için temel sınıf olan bir temel sınıftır.

```cpp
class XmlSchemaParticle : public System::Xml::Schema::XmlSchemaAnnotated
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_MaxOccurs](./get_maxoccurs/)() | Parçacığın gerçekleşebileceği azami sayıyı döndürür. |
| [get_MaxOccursString](./get_maxoccursstring/)() | Sayının string değerini döndürür. Parçacığın gerçekleşebileceği azami sayı. |
| [get_MinOccurs](./get_minoccurs/)() | Parçacığın gerçekleşebileceği asgari sayıyı döndürür. |
| [get_MinOccursString](./get_minoccursstring/)() | Sayının string değerini döndürür. Parçacığın gerçekleşebileceği asgari sayı. |
| [set_MaxOccurs](./set_maxoccurs/)(Decimal) | Parçacığın gerçekleşebileceği azami sayıyı ayarlar. |
| [set_MaxOccursString](./set_maxoccursstring/)(const String\&) | Sayının string değerini ayarlar. Parçacığın gerçekleşebileceği azami sayı. |
| [set_MinOccurs](./set_minoccurs/)(Decimal) | Parçacığın gerçekleşebileceği minimum sayıyı ayarlar. |
| [set_MinOccursString](./set_minoccursstring/)(const String\&) | Sayiyi bir dize değeri olarak ayarlar. Parçacığın gerçekleşebileceği minimum sayıyı. |
| [XmlSchemaParticle](./xmlschemaparticle/)() | Yeni bir [XmlSchemaParticle](./) sınıfının örneğini başlatır. |
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
