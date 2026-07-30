---
title: "System::Collections::IList sınıfı"
linktitle: "IList"
second_title: "Aspose.Font için C++"
description: "System::Collections::IList sınıfı. IList, C++'da indeksle bireysel olarak erişilebilen nesnelerden oluşan jenerik olmayan bir koleksiyonu temsil eder."
type: docs
weight: 1000
url: /tr/cpp/system.collections/ilist/
---
## IList class


[IList](./) Represents a non-generic collection of objects that can be individually accessed by index.

```cpp
class IList : public virtual System::Collections::ICollection
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| virtual [Add](./add/)(SharedPtr\<System::Object\>) | Liste sonuna öğe ekler. |
| virtual [Clear](./clear/)() | Listedeki tüm öğeleri kaldırır. |
| virtual [Contains](./contains/)(SharedPtr\<System::Object\>) const | Öğenin listede olup olmadığını kontrol eder. |
| virtual [get_IsFixedSize](./get_isfixedsize/)() const | Listenin sabit bir boyuta sahip olup olmadığını gösteren bir değer alır. |
| virtual [idx_get](./idx_get/)(int, int) const | RTTI bilgisi. |
| virtual [IndexOf](./indexof/)(SharedPtr\<System::Object\>) const | Belirtilen öğenin ilk indeksini alır. |
| virtual [Insert](./insert/)(int, SharedPtr\<System::Object\>) | Öğeyi belirtilen indekste listeye ekler. |
| virtual [Remove](./remove/)(SharedPtr\<System::Object\>) | Belirtilen öğenin listedeki ilk örneğini kaldırır. |
| virtual [RemoveAt](./removeat/)(int) | Öğeyi belirtilen indekste listeden kaldırır. |
## Ayrıca Bakınız

* Class [ICollection](../icollection/)
* Namespace [System::Collections](../)
* Library [Aspose.Font for C++](../../)
