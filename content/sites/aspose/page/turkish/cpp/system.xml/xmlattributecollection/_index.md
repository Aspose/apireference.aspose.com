---
title: "System::Xml::XmlAttributeCollection class"
linktitle: "XmlAttributeCollection"
second_title: "Aspose.Page için C++"
description: "System::Xml::XmlAttributeCollection sınıfı. C++'ta ad veya indeks ile erişilebilen bir öznitelik koleksiyonunu temsil eder."
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
| [idx_get](./idx_get/)(int32_t) | Belirtilen dizine sahip özniteliği döndürür. |
| [idx_get](./idx_get/)(const String\&) | Belirtilen ada sahip özniteliği döndürür. |
| [idx_get](./idx_get/)(const String\&, const String\&) | Belirtilen yerel ada ve ad alanı Evrensel Kaynak Tanımlayıcısı (URI) olan özniteliği döndürür. |
| [InsertAfter](./insertafter/)(const SharedPtr\<XmlAttribute\>\&, const SharedPtr\<XmlAttribute\>\&) | Belirtilen özniteliği, belirtilen referans özniteliğinin hemen sonrasına ekler. |
| [InsertBefore](./insertbefore/)(const SharedPtr\<XmlAttribute\>\&, const SharedPtr\<XmlAttribute\>\&) | Belirtilen özniteliği, belirtilen referans özniteliğinin hemen öncesine ekler. |
| [Prepend](./prepend/)(const SharedPtr\<XmlAttribute\>\&) | Belirtilen özniteliği, koleksiyondaki ilk düğüm olarak ekler. |
| [Remove](./remove/)(const SharedPtr\<XmlAttribute\>\&) | Belirtilen özniteliği koleksiyondan kaldırır. |
| [RemoveAll](./removeall/)() | Koleksiyondaki tüm öznitelikleri kaldırır. |
| [RemoveAt](./removeat/)(int32_t) | Belirtilen dizine karşılık gelen özniteliği koleksiyondan kaldırır. |
| [SetNamedItem](./setnameditem/)(SharedPtr\<XmlNode\>) override | Bir [XmlNode](../xmlnode/) ekler ve onun [XmlNode::get_Name](../xmlnode/get_name/) sonucunu kullanır. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [Ptr](./ptr/) | Bu sınıfın bir örneğine ortak gösterici için bir takma addır. |
## Açıklamalar



Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Yığını üzerinde veya new operatörüyle bu tipin örneklerini asla oluşturmayın, çünkü bu çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

## Ayrıca Bakınız

* Class [XmlNamedNodeMap](../xmlnamednodemap/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
