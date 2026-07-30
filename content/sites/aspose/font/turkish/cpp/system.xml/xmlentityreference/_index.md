---
title: "System::Xml::XmlEntityReference class"
linktitle: "XmlEntityReference"
second_title: "Aspose.Font için C++"
description: "System::Xml::XmlEntityReference sınıfı. C++'da bir varlık referans düğümünü temsil eder."
type: docs
weight: 1900
url: /tr/cpp/system.xml/xmlentityreference/
---
## XmlEntityReference class


Bir varlık referans düğümünü temsil eder.

```cpp
class XmlEntityReference : public System::Xml::XmlLinkedNode
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | Bu düğümün bir kopyasını oluşturur. |
| [get_BaseURI](./get_baseuri/)() override | Geçerli düğümün temel Uniform Resource Identifier (URI) değerini döndürür. |
| [get_IsReadOnly](./get_isreadonly/)() override | Düğümün yalnızca okunur olup olmadığını gösteren bir değer döndürür. |
| [get_LocalName](./get_localname/)() override | Düğümün yerel adını döndürür. |
| [get_Name](./get_name/)() override | Düğümün adını döndürür. |
| [get_NodeType](./get_nodetype/)() override | Düğümün tipini döndürür. |
| [get_Value](./get_value/)() override | Düğümün değerini döndürür. |
| [set_Value](./set_value/)(String) override | Düğümün değerini ayarlar. |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | Düğümün tüm alt öğelerini belirtilen [XmlWriter](../xmlwriter/) öğesine kaydeder. |
| [WriteTo](./writeto/)(const SharedPtr\<XmlWriter\>\&) override | Düğümü belirtilen [XmlWriter](../xmlwriter/) öğesine kaydeder. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [Ptr](./ptr/) | Bu sınıfın bir örneğine ortak gösterici için bir takma ad. |
## Açıklamalar



Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu türden örnekleri yığıt üzerinde veya new operatörüyle oluşturmayın, çünkü bu çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) göstericisine sarın ve bu göstericiyi fonksiyonlara argüman olarak geçirmek için kullanın.

## Ayrıca Bakınız

* Class [XmlLinkedNode](../xmllinkednode/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
