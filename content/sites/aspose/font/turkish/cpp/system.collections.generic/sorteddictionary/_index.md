---
title: "System::Collections::Generic::SortedDictionary sınıfı"
linktitle: "SortedDictionary"
second_title: "Aspose.Font için C++"
description: "System::Collections::Generic::SortedDictionary sınıfı. C++'ta sıralı sözlük tipi ileri bildirimidir."
type: docs
weight: 4000
url: /tr/cpp/system.collections.generic/sorteddictionary/
---
## SortedDictionary class


Sıralı sözlük tipinin ileri bildirimi.

```cpp
template<typename TKey,typename TValue>class SortedDictionary : public System::Collections::Generic::BaseDictionary<std::map<TKey, TValue, ComparerAdapter<BasePointerType<TKey>::type>, ASPOSE_MAP_ALLOCATOR_TYPE(TKey, TValue)>>
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
| [get_Comparer](./get_comparer/)() const | SortedDictionary<TKey,TValue> öğelerinin sıralanmasında kullanılan [IComparer<TKey>](../icomparer/) alır. |
| static [GetDefaultKeyComparer](./getdefaultkeycomparer/)() | Singleton erişimci işlevi. |
| [GetEnumerator](./getenumerator/)() override | Mevcut sözlüğü yinelemek için bir yineleyici alır. |
| [rbegin](./rbegin/)() | Koleksiyonun son elemanına (ters sırada ilk) ters yineleyici alır. |
| [rbegin](./rbegin/)() const | Const-nitelikli koleksiyonun son elemanına (ters sırada ilk) ters yineleyici alır. |
| [rend](./rend/)() | Koleksiyonun başlangıcından önceki mevcut olmayan bir eleman için ters yineleyici alır. |
| [rend](./rend/)() const | Const-nitelikli koleksiyonun başlangıcından önceki mevcut olmayan bir eleman için ters yineleyici alır. |
| [SortedDictionary](./sorteddictionary/)() | Boş sözlük oluşturur. |
| [SortedDictionary](./sorteddictionary/)(const SharedPtr\<IComparer\<typename BasePointerType\<TKey\>::type\>\>\&) | Boş sözlük oluşturur. |
| [SortedDictionary](./sorteddictionary/)(const SharedPtr\<IDictionary\<TKey, TValue\>\>\&) | Kopya yapıcı. |
| [SortedDictionary](./sorteddictionary/)(const SharedPtr\<IDictionary\<TKey, TValue\>\>\&, const SharedPtr\<IComparer\<typename BasePointerType\<TKey\>::type\>\>\&) | Kopya yapıcı. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [const_iterator](./const_iterator/) | Const iterator türü. |
| [const_reverse_iterator](./const_reverse_iterator/) | Const reverse iterator türü. |
| [IEnumerablePtr](./ienumerableptr/) | Aynı öğelerden oluşan koleksiyon. |
| [IEnumeratorPtr](./ienumeratorptr/) | [Enumerator](./enumerator/) türü. |
| [iterator](./iterator/) | Iterator türü. |
| [KeyCollection](./keycollection/) | Anahtar koleksiyonu türü. |
| [KVPair](./kvpair/) | Anahtar-değer çifti türü. |
| [map_t](./map_t/) | Temel veri tipi. |
| [Ptr](./ptr/) | İşaretçi türü. |
| [reverse_iterator](./reverse_iterator/) | Reverse iterator türü. |
| [this_t](./this_t/) | Kendi türü. |
| [ValueCollection](./valuecollection/) | Değer koleksiyonu türü. |
## Açıklamalar


STL haritasını saran sıralı sözlük sınıfı. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak tahsis edilmelidir. Bu türün bir örneğini yığına (stack) ya da operator new ile oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

## Ayrıca Bakınız

* Class [BaseDictionary](../basedictionary/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
