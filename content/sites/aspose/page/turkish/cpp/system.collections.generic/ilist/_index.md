---
title: "System::Collections::Generic::IList sınıfı"
linktitle: "IList"
second_title: "Aspose.Page için C++"
description: "System::Collections::Generic::IList sınıfı. Öğelerin indeksli konteynerinin arayüzü. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tipin bir örneğini yığına (stack) ya da new operatörüyle oluşturmamalısınız, çünkü bu çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Her zaman bu sınıfı System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirin."
type: docs
weight: 2600
url: /tr/cpp/system.collections.generic/ilist/
---
## IList class


Öğelerin indeksli konteynerinin arayüzü. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tipin bir örneğini yığına (stack) ya da new operatörüyle oluşturmayın, çünkü bu çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Her zaman bu sınıfı [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin.

```cpp
template<typename T>class IList : public System::Collections::Generic::ICollection<T>
```


| Parameter | Açıklama |
| --- | --- |
| T | Öğe türü. |
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_IsFixedSize](./get_isfixedsize/)() | Koleksiyonun sabit boyutta olup olmadığını kontrol eder. |
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
* Library [Aspose.Page for C++](../../)
