---
title: "System::Xml::XmlQualifiedName sınıfı"
linktitle: "XmlQualifiedName"
second_title: "Aspose.Font için C++"
description: "System::Xml::XmlQualifiedName sınıfı. C++'da bir XML nitelikli adını temsil eder."
type: docs
weight: 3200
url: /tr/cpp/system.xml/xmlqualifiedname/
---
## XmlQualifiedName class


XML nitelikli bir adı temsil eder.

```cpp
class XmlQualifiedName : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Equals](./equals/)(SharedPtr\<Object\>) override | Belirtilen [XmlQualifiedName](./) nesnesinin mevcut [XmlQualifiedName](./) nesnesine eşit olup olmadığını belirler. |
| [get_IsEmpty](./get_isempty/)() const | [XmlQualifiedName](./) nesnesinin boş olup olmadığını gösteren bir değer döndürür. |
| [get_Name](./get_name/)() const | [XmlQualifiedName](./) nesnesinin nitelikli adının dize temsili döndürülür. |
| [get_Namespace](./get_namespace/)() const | [XmlQualifiedName](./) nesnesinin ad alanının dize temsili döndürülür. |
| [GetHashCode](./gethashcode/)() const override | [XmlQualifiedName](./) nesnesi için hash kodunu döndürür. |
| static [ToString](./tostring/)(const String\&, const String\&) | Döndürür [XmlQualifiedName](./) öğesinin dize değerini. |
| [ToString](./tostring/)() const override | Döndürür [XmlQualifiedName](./) öğesinin dize değerini. |
| [XmlQualifiedName](./xmlqualifiedname/)() | Yeni bir [XmlQualifiedName](./) sınıfı örneği başlatır. |
| [XmlQualifiedName](./xmlqualifiedname/)(const String\&) | Belirtilen adla yeni bir [XmlQualifiedName](./) sınıfı örneği başlatır. |
| [XmlQualifiedName](./xmlqualifiedname/)(const String\&, const String\&) | Belirtilen ad ve ad alanı ile yeni bir [XmlQualifiedName](./) sınıfı örneği başlatır. |
## Alanlar

| Alan | Açıklama |
| --- | --- |
| static [Empty](./empty/) | Boş bir [XmlQualifiedName](./) sağlar. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [Ptr](./ptr/) | Bu sınıfın bir örneğine ortak gösterici için bir takma ad. |
## Açıklamalar



Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu türden örnekleri yığıt üzerinde veya new operatörüyle oluşturmayın, çünkü bu çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) göstericisine sarın ve bu göstericiyi fonksiyonlara argüman olarak geçirmek için kullanın.

## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
