---
title: "System::Collections::Generic::SortedList sınıfı"
linktitle: "SortedList"
second_title: "Aspose.Font için C++"
description: "System::Collections::Generic::SortedList sınıfı. FlatMap yapısını saran sıralı liste. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığına (stack) veya operator new ile oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirin."
type: docs
weight: 4200
url: /tr/cpp/system.collections.generic/sortedlist/
---
## SortedList class


FlatMap yapısını saran sıralı liste. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığına (stack) veya operator new ile oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin.

```cpp
template<typename TKey,typename TValue>class SortedList : public System::Collections::Generic::SortedListHelper<TKey, TValue>,
                                                          public System::Collections::Generic::BaseDictionary<Detail::FlatMap<TKey, TValue, ComparerAdapter<TKey>>>
```


| Parametre | Açıklama |
| --- | --- |
| TKey | Anahtar türü. |
| TValue | Değer türü. |
## Nested classes

* Class [Enumerator](./enumerator/)
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [crbegin](./crbegin/)() const | Koleksiyonun son const-nitelikli elemanına (ters sırada ilk) bir ters yineleyici alır. |
| [crend](./crend/)() const | Koleksiyonun başlangıcından önceki mevcut olmayan const-nitelikli bir eleman için ters yineleyici alır. |
| [get_Capacity](./get_capacity/)() const | Mevcut liste kapasitesini alır. |
| virtual [get_Keys](./get_keys/)() const | Anahtar koleksiyonuna erişir. |
| virtual [get_Values](./get_values/)() const | Değer koleksiyonuna erişir. |
| [GetEnumerator](./getenumerator/)() override | Mevcut listeden geçen yineleyiciyi alır. |
| [IndexOfKey](./indexofkey/)(TKey) const | Belirli bir anahtarı arar. |
| [IndexOfValue](./indexofvalue/)(TValue) const | Belirli bir değeri arar. |
| [rbegin](./rbegin/)() | Koleksiyonun son elemanına (ters sırada ilk) ters yineleyici alır. |
| [rbegin](./rbegin/)() const | Const-nitelikli koleksiyonun son elemanına (ters sırada ilk) ters yineleyici alır. |
| [RemoveAt](./removeat/)(int) | Belirtilen konumdaki öğeyi kaldırır. |
| [rend](./rend/)() | Koleksiyonun başlangıcından önceki mevcut olmayan bir eleman için ters yineleyici alır. |
| [rend](./rend/)() const | Const-nitelikli koleksiyonun başlangıcından önceki mevcut olmayan bir eleman için ters yineleyici alır. |
| [set_Capacity](./set_capacity/)(int) | Mevcut listenin kapasitesini ayarlar. |
| [SortedList](./sortedlist/)() | Boş bir liste oluşturur. |
| [SortedList](./sortedlist/)(const SharedPtr\<IComparer\<TKey\>\>\&) | Boş bir liste oluşturur. |
| [SortedList](./sortedlist/)(const SharedPtr\<IDictionary\<TKey, TValue\>\>\&) | Kopya yapıcı. |
| [SortedList](./sortedlist/)(const map_t\&) | Kopya yapıcı. |
| [SortedList](./sortedlist/)(int) | Boş bir liste oluşturur. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [const_iterator](./const_iterator/) | Const iterator türü. |
| [const_reverse_iterator](./const_reverse_iterator/) | Const reverse iterator türü. |
| [IEnumerablePtr](./ienumerableptr/) | Aynı çift türünden koleksiyon. |
| [IEnumeratorPtr](./ienumeratorptr/) | [Enumerator](./enumerator/) türü. |
| [iterator](./iterator/) | Iterator türü. |
| [KeyCollection](./keycollection/) | Anahtar koleksiyonu türü. |
| [KVPair](./kvpair/) | Anahtar-değer çifti tipi. |
| [map_t](./map_t/) | Temel veri tipi. |
| [Ptr](./ptr/) | İşaretçi türü. |
| [reverse_iterator](./reverse_iterator/) | Reverse iterator türü. |
| [this_t](./this_t/) | Bu tip. |
| [ValueCollection](./valuecollection/) | Değer koleksiyonu türü. |

## Ayrıca Bakınız

* Class [SortedListHelper](../sortedlisthelper/)
* Class [BaseDictionary](../basedictionary/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
