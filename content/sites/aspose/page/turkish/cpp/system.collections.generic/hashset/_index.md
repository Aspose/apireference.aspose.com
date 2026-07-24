---
title: "System::Collections::Generic::HashSet sınıfı"
linktitle: "HashSet"
second_title: "Aspose.Page için C++"
description: "System::Collections::Generic::HashSet sınıfı. C++'ta HashSet sınıfının ileri bildirimi."
type: docs
weight: 1700
url: /tr/cpp/system.collections.generic/hashset/
---
## HashSet class


İleri bildirim: [HashSet](./) sınıfı.

```cpp
template<typename T>class HashSet : public System::Collections::Generic::BaseSet<T, std::unordered_set<T, EqualityComparerHashAdapter<T>, EqualityComparerAdapter<T>, System::Details::CollectionHelpers::ContainerPointerMode<T>::allocator_type>>
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [HashSet](./hashset/)() | RTTI bilgisi. |
| [HashSet](./hashset/)(int) | Belirtilen kapasiteyle boş bir küme oluşturur. |
| [HashSet](./hashset/)(const SharedPtr\<IEqualityComparer\<T\>\>\&) | Belirtilen eşitlik karşılaştırıcısını kullanan boş bir küme oluşturur. |
| [HashSet](./hashset/)(const SharedPtr\<IEnumerable\<T\>\>\&) | Yineleyebilir değerler temelinde bir hashset oluşturur. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [BaseType](./basetype/) | Temel tip. |
| [ThisPtr](./thisptr/) | İşaretçi türü. |
| [ThisType](./thistype/) | Kendi tipi. |
## Açıklamalar


Karma temelli küme uygulaması. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığına (stack) ya da operator new ile asla oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin.

## Ayrıca Bakınız

* Class [BaseSet](../baseset/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
