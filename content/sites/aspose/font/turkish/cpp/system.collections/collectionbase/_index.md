---
title: "System::Collections::CollectionBase sınıfı"
linktitle: "CollectionBase"
second_title: "Aspose.Font için C++"
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


| Parametre | Açıklama |
| --- | --- |
| T | Koleksiyonun elemanlarının türü |
## Nested classes

* Class [ListImpl](./listimpl/)
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Clear](./clear/)() | Koleksiyon örneğinden tüm nesneleri kaldırır. Bu metod geçersiz kılınamaz. |
| [get_Capacity](./get_capacity/)() | Koleksiyonun içerebileceği eleman sayısını döndürür. |
| [get_Count](./get_count/)() | Koleksiyon örneğinde bulunan eleman sayısını döndürür. Bu metod geçersiz kılınamaz. |
| [GetEnumerator](./getenumerator/)() override | Koleksiyon örneği üzerinde yineleme yapan bir enumerator döndürür. |
| [RemoveAt](./removeat/)(int32_t) | Koleksiyon örneğinin belirtilen indeksindeki elemanı kaldırır. Bu metod geçersiz kılınamaz. |
| [set_Capacity](./set_capacity/)(int32_t) | Koleksiyonun içerebileceği eleman sayısını ayarlar. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | n'inci şablon argümanını zayıf bir gösterici (paylaşılan yerine) olarak ayarlayın. Kapsayıcılardaki göstericileri zayıf moda geçiş yapmayı sağlar. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [Ptr](./ptr/) | Bu sınıfın bir örneğine ortak gösterici için bir takma ad. |

## Ayrıca Bakınız

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Collections](../)
* Library [Aspose.Font for C++](../../)
