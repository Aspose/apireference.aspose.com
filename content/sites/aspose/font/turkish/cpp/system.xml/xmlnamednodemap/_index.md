---
title: "System::Xml::XmlNamedNodeMap sınıfı"
linktitle: "XmlNamedNodeMap"
second_title: "Aspose.Font için C++"
description: "System::Xml::XmlNamedNodeMap sınıfı. C++'ta isim veya indeks ile erişilebilen bir düğüm koleksiyonunu temsil eder."
type: docs
weight: 2200
url: /tr/cpp/system.xml/xmlnamednodemap/
---
## XmlNamedNodeMap class


İsim veya indeks ile erişilebilen bir düğüm koleksiyonunu temsil eder.

```cpp
class XmlNamedNodeMap : public System::Collections::Generic::IEnumerable<SharedPtr<System::Xml::XmlNode>>
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [begin](./begin/)() const | Koleksiyonun ilk öğesine yineleyici alır. |
| [cbegin](./cbegin/)() const | Koleksiyonun ilk öğesine yineleyici alır. |
| [cend](./cend/)() const | Koleksiyonun son öğesinin arkasındaki mevcut olmayan bir öğe için yineleyici alır. |
| [end](./end/)() const | Koleksiyonun son öğesinin arkasındaki mevcut olmayan bir öğe için yineleyici alır. |
| virtual [get_Count](./get_count/)() | Döndürür [XmlNamedNodeMap](./) içindeki düğüm sayısını. |
| [GetEnumerator](./getenumerator/)() override | [XmlNamedNodeMap](./) içindeki düğüm koleksiyonu üzerinde yineleme desteği sağlar. |
| virtual [GetNamedItem](./getnameditem/)(String) | İsimle belirtilen bir [XmlNode](../xmlnode/) alır. |
| virtual [GetNamedItem](./getnameditem/)(String, String) | Eşleşen [XmlNode::get_LocalName](../xmlnode/get_localname/) ve [XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/) değerlerine sahip bir düğüm alır. |
| virtual [Item](./item/)(int32_t) | [XmlNamedNodeMap](./) içinde belirtilen indeksdeki düğümü alır. |
| virtual [RemoveNamedItem](./removenameditem/)(String) | Düğümü [XmlNamedNodeMap](./) içinden kaldırır. |
| virtual [RemoveNamedItem](./removenameditem/)(String, String) | Eşleşen [XmlNode::get_LocalName](../xmlnode/get_localname/) ve [XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/) değerlerine sahip bir düğümü kaldırır. |
| virtual [SetNamedItem](./setnameditem/)(SharedPtr\<XmlNode\>) | Kendi [XmlNode::get_Name](../xmlnode/get_name/) değerini kullanarak bir [XmlNode](../xmlnode/) ekler. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [iterator](./iterator/) | Iterator türü. |
| [Ptr](./ptr/) | Bu sınıfın bir örneğine ortak gösterici için bir takma ad. |
## Açıklamalar



Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu türden örnekleri yığıt üzerinde veya new operatörüyle oluşturmayın, çünkü bu çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) göstericisine sarın ve bu göstericiyi fonksiyonlara argüman olarak geçirmek için kullanın.

## Ayrıca Bakınız

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
