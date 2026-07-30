---
title: "System::Xml::XmlAttributeCollection class"
linktitle: "XmlAttributeCollection"
second_title: "Aspose.Font için C++"
description: "System::Xml::XmlAttributeCollection class. C++'da ad veya indeks ile erişilebilen bir öznitelik koleksiyonunu temsil eder."
type: docs
weight: 700
url: /tr/cpp/system.xml/xmlattributecollection/
---
## XmlAttributeCollection class


İsim veya indeks ile erişilebilen bir öznitelik koleksiyonunu temsil eder.

```cpp
class XmlAttributeCollection : public System::Xml::XmlNamedNodeMap
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Append](./append/)(const SharedPtr\<XmlAttribute\>\&) | Belirtilen özniteliği koleksiyonun son düğümü olarak ekler. |
| [CopyTo](./copyto/)(const ArrayPtr\<SharedPtr\<XmlAttribute\>\>\&, int32_t) | Bu koleksiyondaki tüm [XmlAttribute](../xmlattribute/) nesnelerini verilen diziye kopyalar. |
| [idx_get](./idx_get/)(int32_t) | Belirtilen indeksdeki özniteliği döndürür. |
| [idx_get](./idx_get/)(const String\&) | Belirtilen ada sahip özniteliği döndürür. |
| [idx_get](./idx_get/)(const String\&, const String\&) | Belirtilen yerel ad ve ad alanı Uniform Resource Identifier (URI) olan özniteliği döndürür. |
| [InsertAfter](./insertafter/)(const SharedPtr\<XmlAttribute\>\&, const SharedPtr\<XmlAttribute\>\&) | Belirtilen özniteliği, belirtilen referans özniteliğinden hemen sonra ekler. |
| [InsertBefore](./insertbefore/)(const SharedPtr\<XmlAttribute\>\&, const SharedPtr\<XmlAttribute\>\&) | Belirtilen özniteliği, belirtilen referans özniteliğinden hemen önce ekler. |
| [Prepend](./prepend/)(const SharedPtr\<XmlAttribute\>\&) | Belirtilen özniteliği koleksiyonun ilk düğümü olarak ekler. |
| [Remove](./remove/)(const SharedPtr\<XmlAttribute\>\&) | Belirtilen özniteliği koleksiyondan kaldırır. |
| [RemoveAll](./removeall/)() | Koleksiyondaki tüm öznitelikleri kaldırır. |
| [RemoveAt](./removeat/)(int32_t) | Belirtilen indekse karşılık gelen özniteliği koleksiyondan kaldırır. |
| [SetNamedItem](./setnameditem/)(SharedPtr\<XmlNode\>) override | [XmlNode](../xmlnode/) nesnesini, onun [XmlNode::get_Name](../xmlnode/get_name/) sonucunu kullanarak ekler. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [Ptr](./ptr/) | Bu sınıfın bir örneğine ortak gösterici için bir takma ad. |
## Açıklamalar



Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu türden örnekleri yığıt üzerinde veya new operatörüyle oluşturmayın, çünkü bu çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) göstericisine sarın ve bu göstericiyi fonksiyonlara argüman olarak geçirmek için kullanın.

## Ayrıca Bakınız

* Class [XmlNamedNodeMap](../xmlnamednodemap/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
