---
title: "System::Xml::Schema::XmlSchemaObjectEnumerator sınıfı"
linktitle: "XmlSchemaObjectEnumerator"
second_title: "Aspose.Font için C++"
description: "System::Xml::Schema::XmlSchemaObjectEnumerator sınıfı. C++'da XmlSchemaObjectCollection için yineleyiciyi temsil eder."
type: docs
weight: 5200
url: /tr/cpp/system.xml.schema/xmlschemaobjectenumerator/
---
## XmlSchemaObjectEnumerator class


[XmlSchemaObjectCollection](../xmlschemaobjectcollection/) için yineleyiciyi temsil eder.

```cpp
class XmlSchemaObjectEnumerator : public System::Collections::Generic::IEnumerator<SharedPtr<System::Xml::Schema::XmlSchemaObject>>
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [CloneIterator](./cloneiterator/)() const override | Mevcut yineleyiciyi klonlar. |
| [Dispose](./dispose/)() override | Hiçbir şey yapmaz. |
| [get_Current](./get_current/)() const override | Koleksiyondaki mevcut [XmlSchemaObject](../xmlschemaobject/) döndürür. |
| [MoveNext](./movenext/)() override | Koleksiyondaki bir sonraki öğeye geçer. |
| [Reset](./reset/)() override | Yineleyiciyi koleksiyonun başına sıfırlar. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [Ptr](./ptr/) | Bu sınıfın bir örneğine ortak gösterici için bir takma ad. |
## Açıklamalar



Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu türden örnekleri yığıt üzerinde veya new operatörüyle oluşturmayın, çünkü bu çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) göstericisine sarın ve bu göstericiyi fonksiyonlara argüman olarak geçirmek için kullanın.

## Ayrıca Bakınız

* Class [IEnumerator](../../system.collections.generic/ienumerator/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
