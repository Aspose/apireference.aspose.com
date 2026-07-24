---
title: "System::Xml::Schema::XmlSchemaObjectCollection sınıfı"
linktitle: "XmlSchemaObjectCollection"
second_title: "Aspose.Page için C++"
description: "System::Xml::Schema::XmlSchemaObjectCollection sınıfı. C++'ta XmlSchemaObject'lerin bir koleksiyonu."
type: docs
weight: 5100
url: /tr/cpp/system.xml.schema/xmlschemaobjectcollection/
---
## XmlSchemaObjectCollection class


XmlSchemaObjects koleksiyonu.

```cpp
class XmlSchemaObjectCollection : public System::Collections::CollectionBase<SharedPtr<System::Xml::Schema::XmlSchemaObject>>
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Add](./add/)(const SharedPtr\<XmlSchemaObject\>\&) | [XmlSchemaObject](../xmlschemaobject/) öğesini [XmlSchemaObjectCollection](./) koleksiyonuna ekler. |
| [Contains](./contains/)(const SharedPtr\<XmlSchemaObject\>\&) | Belirtilen [XmlSchemaObject](../xmlschemaobject/) öğesinin [XmlSchemaObjectCollection](./) içinde olup olmadığını gösterir. |
| [CopyTo](./copyto/)(const ArrayPtr\<SharedPtr\<XmlSchemaObject\>\>\&, int32_t) | Koleksiyondaki tüm XmlSchemaObject'leri verilen diziye, verilen indeksten başlayarak kopyalar. |
| [GetEnumerator](./getenumerator/)() override | [XmlSchemaObjectCollection](./) içinde bulunan XmlSchemaObject'ler üzerinde yineleme yapmak için bir enumeratör döndürür. |
| virtual [idx_get](./idx_get/)(int32_t) | Belirtilen indeksteki [XmlSchemaObject](../xmlschemaobject/) öğesini döndürür. |
| virtual [idx_set](./idx_set/)(int32_t, SharedPtr\<XmlSchemaObject\>) | Belirtilen indeksteki [XmlSchemaObject](../xmlschemaobject/) öğesini ayarlar. |
| [IndexOf](./indexof/)(const SharedPtr\<XmlSchemaObject\>\&) | Belirtilen [XmlSchemaObject](../xmlschemaobject/) öğesine karşılık gelen koleksiyon indeksini döndürür. |
| [Insert](./insert/)(int32_t, const SharedPtr\<XmlSchemaObject\>\&) | [XmlSchemaObject](../xmlschemaobject/) öğesini [XmlSchemaObjectCollection](./) koleksiyonuna ekler. |
| [Remove](./remove/)(const SharedPtr\<XmlSchemaObject\>\&) | [XmlSchemaObject](../xmlschemaobject/) öğesini [XmlSchemaObjectCollection](./) koleksiyonundan kaldırır. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | n'inci şablon argümanını zayıf bir işaretçi olarak ayarla (paylaşılan yerine). Kapsayıcılardaki işaretçilerin zayıf moda geçişine izin verir. |
| [XmlSchemaObjectCollection](./xmlschemaobjectcollection/)() | [XmlSchemaObjectCollection](./) sınıfının yeni bir örneğini başlatır. |
| [XmlSchemaObjectCollection](./xmlschemaobjectcollection/)(const SharedPtr\<XmlSchemaObject\>\&) | [XmlSchemaObject](../xmlschemaobject/) alan bir [XmlSchemaObjectCollection](./) sınıfının yeni bir örneğini başlatır. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [Ptr](./ptr/) | Bu sınıfın bir örneğine ortak gösterici için bir takma addır. |
## Açıklamalar



Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Yığını üzerinde veya new operatörüyle bu tipin örneklerini asla oluşturmayın, çünkü bu çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

## Ayrıca Bakınız

* Class [CollectionBase](../../system.collections/collectionbase/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
