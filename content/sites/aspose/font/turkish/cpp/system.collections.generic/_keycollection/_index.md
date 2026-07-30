---
title: "System::Collections::Generic::_KeyCollection class"
linktitle: "_KeyCollection"
second_title: "Aspose.Font için C++"
description: "System::Collections::Generic::_KeyCollection sınıfı. Dictionary'nin anahtarlarının koleksiyonu. Koleksiyona referans verir, hiçbir şeyi kopyalamaz. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak tahsis edilmelidir. Bu türün bir örneğini yığına (stack) ya da operator new ile oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 100
url: /tr/cpp/system.collections.generic/_keycollection/
---
## _KeyCollection class


[Dictionary](../dictionary/)'nin anahtarlarının koleksiyonu. Koleksiyona referans verir, hiçbir şeyi kopyalamaz. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak tahsis edilmelidir. Bu türün bir örneğini yığına (stack) ya da operator new ile oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
template<typename Dict>class _KeyCollection : public System::Collections::Generic::BaseKVCollection<Dict, Dict::map_t::key_type>
```

## Nested classes

* Class [Enumerator](./enumerator/)
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [_KeyCollection](./_keycollection/)(const typename Dict::Ptr\&) | Belirtilen sözlüğe referans veren koleksiyonu başlatır. |
| [Contains](./contains/)(const TKey\&) const override | Öğenin kapsayıcıda bulunup bulunmadığını denetler. |
| [GetEnumerator](./getenumerator/)() override | Anahtarlar üzerinden yineleme yapan enumeratörü alır. |
| [idx_get](./idx_get/)(int) const override | Uygular [IList](../ilist/) metodunu. Desteklenmiyor. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Mevcut kapsayıcı için begin const yineleyicisinin uygulamasını alır. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Mevcut kapsayıcı için begin yineleyicisinin uygulamasını alır. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Mevcut kapsayıcı için end const yineleyicisinin uygulamasını alır. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Mevcut kapsayıcı için end yineleyicisinin uygulamasını alır. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [TKey](./tkey/) | Anahtar türü. |

## Ayrıca Bakınız

* Class [BaseKVCollection](../basekvcollection/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
