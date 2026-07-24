---
title: "System::Collections::ObjectModel::Collection sınıfı"
linktitle: "Koleksiyon"
second_title: "Aspose.Page için C++"
description: "System::Collections::ObjectModel::Collection sınıfı. Genel koleksiyon için temel tür. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek hiçbir zaman yığıt üzerinde veya new operatörüyle oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta işlevlere argüman olarak geçirmek için kullanın."
type: docs
weight: 100
url: /tr/cpp/system.collections.objectmodel/collection/
---
## Collection class


Genel koleksiyon için temel tür. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek hiçbir zaman yığıt üzerinde veya new operatörüyle oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi işlevlere argüman olarak geçirmek için kullanın.

```cpp
template<class T>class Collection : public System::Collections::Generic::IList<T>
```


| Parameter | Açıklama |
| --- | --- |
| T | Öğe türü. |
## Nested classes

* Class [reverse_iterator_prototype](./reverse_iterator_prototype/)
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Add](./add/)(const T\&) override | Değeri konteynere ekler. |
| [Clear](./clear/)() override | Tüm öğeleri siler. |
| [Collection](./collection/)() | Boş koleksiyon oluşturur. |
| [Collection](./collection/)(SharedPtr\<Generic::IList\<T\>\>) |  |
| [Contains](./contains/)(const T\&) const override | Öğenin koleksiyonda bulunup bulunmadığını denetler. |
| [CopyTo](./copyto/)(ArrayPtr\<T\>, int) override | Koleksiyon öğelerini mevcut dizi öğelerine kopyalar. |
| [crbegin](./crbegin/)() const | Koleksiyonun son const nitelikli öğesine (ters yönde ilk) ters bir yineleyici al. |
| [crend](./crend/)() const | Koleksiyonun başlangıcından önceki var olmayan const nitelikli öğe için ters bir yineleyici al. |
| [get_Count](./get_count/)() const override | Öğe sayısını al. |
| [get_Items](./get_items/)() | Dahili veri yapısı erişicisi. |
| [get_Items](./get_items/)() const | Dahili veri yapısı erişicisi. |
| [GetEnumerator](./getenumerator/)() override | Koleksiyon içinde yineleme yapmak için enumeratörü alır. |
| [idx_get](./idx_get/)(int) const override | Belirtilen indeksteki değeri alır. |
| [idx_set](./idx_set/)(int, T) override | Belirtilen indekste değeri ayarlar. |
| [IndexOf](./indexof/)(const T\&) const override | Koleksiyonda öğeyi arar. |
| [Insert](./insert/)(int, const T\&) override | Öğeyi belirtilen konuma ekler. |
| [operator[]](./operator[]/)(int) | Belirtilen indeksteki değeri alır. |
| [operator[]](./operator[]/)(int) const | Belirtilen indeksteki değeri alır. |
| [rbegin](./rbegin/)() | Koleksiyonun son öğesine (ters yönde ilk) bir ters yineleyici alır. |
| [rbegin](./rbegin/)() const | Const nitelikli koleksiyonun son öğesine (ters yönde ilk) bir ters yineleyici alır. |
| [Remove](./remove/)(const T\&) override | Belirli öğeyi kaldırır. |
| [RemoveAt](./removeat/)(int) override | Belirli konumdaki öğeyi kaldırır. |
| [rend](./rend/)() | Koleksiyonun başlangıcından önceki mevcut olmayan bir öğe için ters yineleyici alır. |
| [rend](./rend/)() const | Const nitelikli koleksiyonun başlangıcından önceki mevcut olmayan bir öğe için ters yineleyici alır. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Depolanan işaretçileri zayıf hâle getirir (uygunsa). |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Mevcut konteyner için begin const iterator'un uygulanmasını alır. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Mevcut konteyner için begin iterator'un uygulanmasını alır. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Mevcut konteyner için end const iterator'un uygulanmasını alır. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Mevcut konteyner için end iterator'un uygulanmasını alır. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [const_reverse_iterator](./const_reverse_iterator/) |  |
| [reverse_iterator](./reverse_iterator/) |  |

## Ayrıca Bakınız

* Class [IList](../../system.collections.generic/ilist/)
* Namespace [System::Collections::ObjectModel](../)
* Library [Aspose.Page for C++](../../)
