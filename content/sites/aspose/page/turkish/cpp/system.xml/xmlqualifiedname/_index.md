---
title: "System::Xml::XmlQualifiedName sınıfı"
linktitle: "XmlQualifiedName"
second_title: "Aspose.Page için C++"
description: "System::Xml::XmlQualifiedName sınıfı. C++'ta bir XML nitelikli adını temsil eder."
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
| [get_Name](./get_name/)() const | [XmlQualifiedName](./) nitelikli adının dize temsili döndürülür. |
| [get_Namespace](./get_namespace/)() const | [XmlQualifiedName](./) ad alanının dize temsili döndürülür. |
| [GetHashCode](./gethashcode/)() const override | [XmlQualifiedName](./) için karma kodunu döndürür. |
| static [ToString](./tostring/)(const String\&, const String\&) | [XmlQualifiedName](./) nesnesinin dize değerini döndürür. |
| [ToString](./tostring/)() const override | [XmlQualifiedName](./) nesnesinin dize değerini döndürür. |
| [XmlQualifiedName](./xmlqualifiedname/)() | [XmlQualifiedName](./) sınıfının yeni bir örneğini başlatır. |
| [XmlQualifiedName](./xmlqualifiedname/)(const String\&) | Belirtilen adla [XmlQualifiedName](./) sınıfının yeni bir örneğini başlatır. |
| [XmlQualifiedName](./xmlqualifiedname/)(const String\&, const String\&) | Belirtilen ad ve ad alanıyla [XmlQualifiedName](./) sınıfının yeni bir örneğini başlatır. |
## Alanlar

| Alan | Açıklama |
| --- | --- |
| static [Empty](./empty/) | Boş bir [XmlQualifiedName](./) sağlar. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [Ptr](./ptr/) | Bu sınıfın bir örneğine ortak gösterici için bir takma addır. |
## Açıklamalar



Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Yığını üzerinde veya new operatörüyle bu tipin örneklerini asla oluşturmayın, çünkü bu çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
