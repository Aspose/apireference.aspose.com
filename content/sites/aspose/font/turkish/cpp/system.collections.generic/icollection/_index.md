---
title: "System::Collections::Generic::ICollection sınıfı"
linktitle: "ICollection"
second_title: "Aspose.Font için C++"
description: "System::Collections::Generic::ICollection sınıfı. Elemanların koleksiyonunun arayüzü. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığına (stack) veya new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 1900
url: /tr/cpp/system.collections.generic/icollection/
---
## ICollection class


Eleman koleksiyonunun arabirimi. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığına (stack) veya operator new ile oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin.

```cpp
template<typename T>class ICollection : public virtual System::Collections::Generic::IEnumerable<T>
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| virtual [Add](./add/)(const T\&) | Koleksiyona bir öğe ekler. |
| virtual [Clear](./clear/)() | Koleksiyondaki tüm öğeleri siler. |
| virtual [Contains](./contains/)(const T\&) const | Öğenin koleksiyonda bulunup bulunmadığını kontrol eder. |
| virtual [CopyTo](./copyto/)(System::ArrayPtr\<T\>, int) | Tüm koleksiyon öğelerini mevcut dizi öğelerine kopyalar. |
| virtual [get_Count](./get_count/)() const | Koleksiyondaki eleman sayısını alır. |
| virtual [get_IsReadOnly](./get_isreadonly/)() const | Koleksiyonun yalnızca okunabilir olup olmadığını denetler. |
| [get_SyncRoot](./get_syncroot/)() const | Koleksiyonun senkronize edildiği nesneyi alır. |
| [ICollection](./icollection/)() | Varsayılan yapıcı. |
| [ICollection](./icollection/)(const ICollection\&) | Kopya yapıcı. |
| [ICollection](./icollection/)(ICollection\&&) | Taşıma kurucusu. |
| [operator=](./operator=/)(ICollection\&&) | Taşıma atama operatörü. |
| [operator=](./operator=/)(const ICollection\&) | Taşıma atama operatörü. |
| virtual [Remove](./remove/)(const T\&) | Koleksiyondan öğeyi siler. |
| virtual [~ICollection](./~icollection/)() | Yıkıcı. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [ThisType](./thistype/) | Koleksiyon türü adı. |
| [ValueType](./valuetype/) | RTTI bilgisi. |

## Ayrıca Bakınız

* Class [IEnumerable](../ienumerable/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
