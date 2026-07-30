---
title: "System::Xml::Schema::XmlSchemaInference class"
linktitle: "XmlSchemaInference"
second_title: "Aspose.Font için C++"
description: "System::Xml::Schema::XmlSchemaInference class. Bir XML belgesinden XML Şema Tanım Dili (XSD) şeması çıkarır. XmlSchemaInference sınıfı C++'ta kalıtılamaz."
type: docs
weight: 3700
url: /tr/cpp/system.xml.schema/xmlschemainference/
---
## XmlSchemaInference class


Bir XML belgesinden XML [Schema](../) Tanım Dili (XSD) şeması çıkarır. [XmlSchemaInference](./) sınıfı kalıtılamaz.

```cpp
class XmlSchemaInference : public System::Object
```

## Enums

| Enum | Açıklama |
| --- | --- |
| [InferenceOption](./inferenceoption/) | [XmlSchemaInference](./) sınıfı tarafından bir XML belgesindeki öğeler ve öznitelikler için çıkarılan oluş ve tip bilgilerini etkiler. |
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_Occurrence](./get_occurrence/)() | [XmlSchemaInference::InferenceOption](./inferenceoption/) değerini döndürür; bu değer XML belgesinden çıkarılan şema oluş bildirimlerini etkiler. |
| [get_TypeInference](./get_typeinference/)() | [XmlSchemaInference::InferenceOption](./inferenceoption/) değerini döndürür; bu değer XML belgesinden çıkarılan tipleri etkiler. |
| [InferSchema](./inferschema/)(const SharedPtr\<XmlReader\>\&) | Belirtilen [XmlReader](../../system.xml/xmlreader/) nesnesinde bulunan XML belgesinden XML [Schema](../) Tanım Dili (XSD) şeması çıkarır. |
| [InferSchema](./inferschema/)(const SharedPtr\<XmlReader\>\&, SharedPtr\<XmlSchemaSet\>) | Belirtilen [XmlReader](../../system.xml/xmlreader/) nesnesinde bulunan XML belgesinden XML [Schema](../) Tanım Dili (XSD) şeması çıkarır ve aynı hedef ad alanına sahip belirtilen [XmlSchemaSet](../xmlschemaset/) nesnesindeki mevcut şemayı kullanarak çıkarılan şemayı iyileştirir. |
| [set_Occurrence](./set_occurrence/)(XmlSchemaInference::InferenceOption) | [XmlSchemaInference::InferenceOption](./inferenceoption/) değerini ayarlar; bu değer XML belgesinden çıkarılan şema oluş bildirimlerini etkiler. |
| [set_TypeInference](./set_typeinference/)(XmlSchemaInference::InferenceOption) | [XmlSchemaInference::InferenceOption](./inferenceoption/) değerini ayarlar; bu değer XML belgesinden çıkarılan tipleri etkiler. |
| [XmlSchemaInference](./xmlschemainference/)() | [XmlSchemaInference](./) sınıfının yeni bir örneğini başlatır. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [Ptr](./ptr/) | Bu sınıfın bir örneğine ortak gösterici için bir takma ad. |
## Açıklamalar



Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu türden örnekleri yığıt üzerinde veya new operatörüyle oluşturmayın, çünkü bu çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) göstericisine sarın ve bu göstericiyi fonksiyonlara argüman olarak geçirmek için kullanın.

## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
