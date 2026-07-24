---
title: "System::Collections::Generic::_KeyCollection sınıfı"
linktitle: "_KeyCollection"
second_title: "Aspose.Page için C++"
description: "System::Collections::Generic::_KeyCollection sınıfı. Dictionary'nin anahtarlarının koleksiyonu. Koleksiyona referans verir, hiçbir şeyi kopyalamaz. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığına (stack) veya new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirin."
type: docs
weight: 100
url: /tr/cpp/system.collections.generic/_keycollection/
---
## _KeyCollection class


[Dictionary](../dictionary/) anahtarlarının koleksiyonu. Koleksiyona referans verir, hiçbir şeyi kopyalamaz. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığına (stack) veya new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin.

```cpp
template<typename Dict>class _KeyCollection : public System::Collections::Generic::BaseKVCollection<Dict, Dict::map_t::key_type>
```

## Nested classes

* Class [Enumerator](./enumerator/)
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [_KeyCollection](./_keycollection/)(const typename Dict::Ptr\&) | Belirtilen dictionary'ye referans veren koleksiyonu başlatır. |
| [Contains](./contains/)(const TKey\&) const override | Öğenin konteynerde bulunup bulunmadığını denetler. |
| [GetEnumerator](./getenumerator/)() override | Anahtarlar üzerinden yineleme yapan enumeratörü alır. |
| [idx_get](./idx_get/)(int) const override | [IList](../ilist/) metodunu uygular. Desteklenmiyor. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Mevcut konteyner için begin const iterator'un uygulanmasını alır. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Mevcut konteyner için begin iterator'un uygulanmasını alır. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Mevcut konteyner için end const iterator'un uygulanmasını alır. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Mevcut konteyner için end iterator'un uygulanmasını alır. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [TKey](./tkey/) | Anahtar türü. |

## Ayrıca Bakınız

* Class [BaseKVCollection](../basekvcollection/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
