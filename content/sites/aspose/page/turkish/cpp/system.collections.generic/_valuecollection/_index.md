---
title: "System::Collections::Generic::_ValueCollection sınıfı"
linktitle: "_ValueCollection"
second_title: "Aspose.Page için C++"
description: "System::Collections::Generic::_ValueCollection sınıfı. Dictionary'nin değerlerinin koleksiyonu. Koleksiyona referans verir, hiçbir şeyi kopyalamaz. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığıt üzerinde veya new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta işlevlere argüman olarak geçirmek için kullanın."
type: docs
weight: 300
url: /tr/cpp/system.collections.generic/_valuecollection/
---
## _ValueCollection class


Dictionary'nin [Dictionary](../dictionary/) değerlerinin koleksiyonu. Koleksiyona referans verir, hiçbir şeyi kopyalamaz. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığıt üzerinde veya new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi işlevlere argüman olarak geçirmek için kullanın.

```cpp
template<typename Dict>class _ValueCollection : public System::Collections::Generic::BaseKVCollection<Dict, Dict::map_t::mapped_type>
```

## Nested classes

* Class [Enumerator](./enumerator/)
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [_ValueCollection](./_valuecollection/)(const typename Dict::Ptr\&) | Belirtilen dictionary'ye referans veren koleksiyonu başlatır. |
| [Contains](./contains/)(const TValue\&) const override | Öğenin konteynerde bulunup bulunmadığını denetler. |
| [GetEnumerator](./getenumerator/)() override | Değerler üzerinden yineleme yapan yineleyiciyi alır. |
| [idx_get](./idx_get/)(int) const override | [IList](../ilist/) metodunu uygular. Desteklenmiyor. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Mevcut konteyner için begin const iterator'un uygulanmasını alır. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Mevcut konteyner için begin iterator'un uygulanmasını alır. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Mevcut konteyner için end const iterator'un uygulanmasını alır. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Mevcut konteyner için end iterator'un uygulanmasını alır. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [TValue](./tvalue/) | Değer türü. |

## Ayrıca Bakınız

* Class [BaseKVCollection](../basekvcollection/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
