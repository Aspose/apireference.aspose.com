---
title: "System::Collections::Generic::IList sınıfı"
linktitle: "IList"
second_title: "Aspose.Font için C++"
description: "System::Collections::Generic::IList sınıfı. Öğelerin indeksli konteynerinin arayüzü. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek, yığıt (stack) üzerinde veya new operatörüyle oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarmalayın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 2600
url: /tr/cpp/system.collections.generic/ilist/
---
## IList class


Öğelerin indeksli konteynerinin arayüzü. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek, yığıt üzerinde veya new operatörüyle oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisiyle sarmalayın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
template<typename T>class IList : public System::Collections::Generic::ICollection<T>
```


| Parametre | Açıklama |
| --- | --- |
| T | Eleman tipi. |
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_IsFixedSize](./get_isfixedsize/)() | Koleksiyonun sabit boyutta olup olmadığını denetler. |
| virtual [idx_get](./idx_get/)(int) const | Belirtilen indeksteki öğeyi alır. |
| virtual [idx_set](./idx_set/)(int, T) | Belirtilen indeksteki öğeyi ayarlar. |
| virtual [IndexOf](./indexof/)(const T\&) const | Öğenin konteynerdeki ilk görünümünün indeksini alır. |
| virtual [Insert](./insert/)(int, const T\&) | Öğeyi belirtilen konuma ekler, diğer öğeleri kaydırır. |
| virtual [RemoveAt](./removeat/)(int) | Belirtilen indeksteki öğeyi kaldırır. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [BaseType](./basetype/) | RTTI bilgisi. |
| [ThisType](./thistype/) | Bu tip. |
| [ValueType](./valuetype/) | Değer türü. |

## Ayrıca Bakınız

* Class [ICollection](../icollection/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
