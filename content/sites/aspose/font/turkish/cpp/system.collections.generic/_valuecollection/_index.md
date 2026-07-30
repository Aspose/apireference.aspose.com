---
title: "System::Collections::Generic::_ValueCollection sınıfı"
linktitle: "_ValueCollection"
second_title: "Aspose.Font için C++"
description: "System::Collections::Generic::_ValueCollection sınıfı. Dictionary'nin değerlerinin koleksiyonu. Koleksiyona referans verir, hiçbir şey kopyalamaz. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığına (stack) veya new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 300
url: /tr/cpp/system.collections.generic/_valuecollection/
---
## _ValueCollection class


Dictionary'nin [Dictionary](../dictionary/) değerlerinin koleksiyonu. Koleksiyona referans verir, hiçbir şey kopyalamaz. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığına (stack) veya new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
template<typename Dict>class _ValueCollection : public System::Collections::Generic::BaseKVCollection<Dict, Dict::map_t::mapped_type>
```

## Nested classes

* Class [Enumerator](./enumerator/)
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [_ValueCollection](./_valuecollection/)(const typename Dict::Ptr\&) | Belirtilen sözlüğe referans veren koleksiyonu başlatır. |
| [Contains](./contains/)(const TValue\&) const override | Öğenin kapsayıcıda bulunup bulunmadığını denetler. |
| [GetEnumerator](./getenumerator/)() override | Değerler üzerinde yineleme yapan enumeratörü alır. |
| [idx_get](./idx_get/)(int) const override | Uygular [IList](../ilist/) metodunu. Desteklenmiyor. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Mevcut kapsayıcı için begin const yineleyicisinin uygulamasını alır. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Mevcut kapsayıcı için begin yineleyicisinin uygulamasını alır. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Mevcut kapsayıcı için end const yineleyicisinin uygulamasını alır. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Mevcut kapsayıcı için end yineleyicisinin uygulamasını alır. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [TValue](./tvalue/) | Değer türü. |

## Ayrıca Bakınız

* Class [BaseKVCollection](../basekvcollection/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
