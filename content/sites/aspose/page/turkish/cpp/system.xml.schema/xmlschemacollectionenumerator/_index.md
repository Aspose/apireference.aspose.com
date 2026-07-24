---
title: "System::Xml::Schema::XmlSchemaCollectionEnumerator sınıfı"
linktitle: "XmlSchemaCollectionEnumerator"
second_title: "Aspose.Page için C++"
description: "System::Xml::Schema::XmlSchemaCollectionEnumerator sınıfı. Bir koleksiyon üzerinde basit yinelemeyi destekler. Bu sınıf C++'ta kalıtılamaz."
type: docs
weight: 1600
url: /tr/cpp/system.xml.schema/xmlschemacollectionenumerator/
---
## XmlSchemaCollectionEnumerator class


Bir koleksiyon üzerinde basit bir yinelemeyi destekler. Bu sınıf miras alınamaz.

```cpp
class XmlSchemaCollectionEnumerator : public System::Collections::Generic::IEnumerator<SharedPtr<System::Xml::Schema::XmlSchema>>
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [CloneIterator](./cloneiterator/)() const override | Mevcut yineleyiciyi kopyalar. |
| [Dispose](./dispose/)() override | Hiçbir şey yapmaz. |
| [get_Current](./get_current/)() const override | Koleksiyondaki mevcut [XmlSchema](../xmlschema/) döndürür. |
| [MoveNext](./movenext/)() override | Yineleyiciyi koleksiyondaki bir sonraki şemaya ilerletir. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [Ptr](./ptr/) | Bu sınıfın bir örneğine ortak gösterici için bir takma addır. |
## Açıklamalar



Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Yığını üzerinde veya new operatörüyle bu tipin örneklerini asla oluşturmayın, çünkü bu çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

## Ayrıca Bakınız

* Class [IEnumerator](../../system.collections.generic/ienumerator/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
