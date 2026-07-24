---
title: "System::Collections::CollectionBase sınıfı"
linktitle: "CollectionBase"
second_title: "Aspose.Page için C++"
description: "System::Collections::CollectionBase sınıfı. C++'ta güçlü tipli bir koleksiyon için soyut bir temel sınıf sağlar."
type: docs
weight: 300
url: /tr/cpp/system.collections/collectionbase/
---
## CollectionBase class


Güçlü tiplenmiş bir koleksiyon için soyut bir temel sınıf sağlar.

```cpp
template<typename T>class CollectionBase : public virtual System::Collections::Generic::IEnumerable<T>
```


| Parameter | Açıklama |
| --- | --- |
| T | Koleksiyonun öğelerinin türü |
## Nested classes

* Class [ListImpl](./listimpl/)
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Clear](./clear/)() | Koleksiyon örneğinden tüm nesneleri kaldırır. Bu metodun üzerine yazılamaz. |
| [get_Capacity](./get_capacity/)() | Koleksiyonun içerebileceği öğe sayısını döndürür. |
| [get_Count](./get_count/)() | Koleksiyon örneğinde bulunan öğe sayısını döndürür. Bu metodun üzerine yazılamaz. |
| [GetEnumerator](./getenumerator/)() override | Koleksiyon örneği üzerinde yineleme yapan bir enumerator döndürür. |
| [RemoveAt](./removeat/)(int32_t) | Koleksiyon örneğinin belirtilen indeksindeki öğeyi kaldırır. Bu metodun üzerine yazılamaz. |
| [set_Capacity](./set_capacity/)(int32_t) | Koleksiyonun içerebileceği öğe sayısını ayarlar. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | n'inci şablon argümanını zayıf bir işaretçi olarak ayarla (paylaşılan yerine). Kapsayıcılardaki işaretçilerin zayıf moda geçişine izin verir. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [Ptr](./ptr/) | Bu sınıfın bir örneğine ortak gösterici için bir takma addır. |

## Ayrıca Bakınız

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Collections](../)
* Library [Aspose.Page for C++](../../)
