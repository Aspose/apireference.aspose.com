---
title: "System::Collections::Generic::SortedSet sınıfı"
linktitle: "SortedSet"
second_title: "Aspose.Font için C++"
description: "System::Collections::Generic::SortedSet sınıfı. C++'ta SortedSet sınıfının ileri bildirimi."
type: docs
weight: 4400
url: /tr/cpp/system.collections.generic/sortedset/
---
## SortedSet class


İleri bildirimi [SortedSet](./) sınıfı.

```cpp
template<typename T>class SortedSet : public System::Collections::Generic::BaseSet<T, std::set<T, ComparerAdapter<T>, System::Details::CollectionHelpers::ContainerPointerMode<T>::allocator_type>>
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_Max](./get_max/)() const | [SortedSet](./) içindeki maksimum değeri alır. |
| [SortedSet](./sortedset/)() | RTTI bilgisi. |
| [SortedSet](./sortedset/)(int) | Belirtilen kapasiteyle boş bir küme oluşturur. |
| [SortedSet](./sortedset/)(const SharedPtr\<IComparer\<T\>\>\&) | Belirtilen eşitlik karşılaştırıcısını kullanan boş bir küme oluşturur. |
| [SortedSet](./sortedset/)(const SharedPtr\<IEnumerable\<T\>\>\&) | Enumerable değerlerine dayanarak [SortedSet](./) oluşturur. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [BaseType](./basetype/) | Vazo türü. |
| [ThisPtr](./thisptr/) | İşaretçi türü. |
| [ThisType](./thistype/) | Kendi türü. |
## Açıklamalar


Sıralı nesneler kümesinin uygulanması. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak tahsis edilmelidir. Bu türün örneğini asla yığıt üzerinde veya new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin.

## Ayrıca Bakınız

* Class [BaseSet](../baseset/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
