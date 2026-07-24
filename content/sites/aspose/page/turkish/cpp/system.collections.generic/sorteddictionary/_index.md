---
title: "System::Collections::Generic::SortedDictionary sınıfı"
linktitle: "SortedDictionary"
second_title: "Aspose.Page için C++"
description: "System::Collections::Generic::SortedDictionary sınıfı. C++'ta sıralı sözlük tipi ileri bildirim."
type: docs
weight: 4000
url: /tr/cpp/system.collections.generic/sorteddictionary/
---
## SortedDictionary class


Sıralı sözlük tipi ileri bildirimi.

```cpp
template<typename TKey,typename TValue>class SortedDictionary : public System::Collections::Generic::BaseDictionary<std::map<TKey, TValue, ComparerAdapter<BasePointerType<TKey>::type>, ASPOSE_MAP_ALLOCATOR_TYPE(TKey, TValue)>>
```


| Parameter | Açıklama |
| --- | --- |
| TKey | Anahtar türü. |
| TValue | Değer türü. |
## Nested classes

* Class [Enumerator](./enumerator/)
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [crbegin](./crbegin/)() const | Koleksiyonun son const nitelikli öğesine (ters yönde ilk) ters bir yineleyici al. |
| [crend](./crend/)() const | Koleksiyonun başlangıcından önceki var olmayan const nitelikli öğe için ters bir yineleyici al. |
| [get_Comparer](./get_comparer/)() const | SortedDictionary<TKey,TValue> öğelerinin sıralanmasında kullanılan [IComparer<TKey>](../icomparer/) alır. |
| static [GetDefaultKeyComparer](./getdefaultkeycomparer/)() | Singleton erişimci işlevi. |
| [GetEnumerator](./getenumerator/)() override | Mevcut sözlüğü yinelemek için bir enumerator alır. |
| [rbegin](./rbegin/)() | Koleksiyonun son öğesine (ters yönde ilk) bir ters yineleyici alır. |
| [rbegin](./rbegin/)() const | Const nitelikli koleksiyonun son öğesine (ters yönde ilk) bir ters yineleyici alır. |
| [rend](./rend/)() | Koleksiyonun başlangıcından önceki mevcut olmayan bir öğe için ters yineleyici alır. |
| [rend](./rend/)() const | Const nitelikli koleksiyonun başlangıcından önceki mevcut olmayan bir öğe için ters yineleyici alır. |
| [SortedDictionary](./sorteddictionary/)() | Boş bir sözlük oluşturur. |
| [SortedDictionary](./sorteddictionary/)(const SharedPtr\<IComparer\<typename BasePointerType\<TKey\>::type\>\>\&) | Boş bir sözlük oluşturur. |
| [SortedDictionary](./sorteddictionary/)(const SharedPtr\<IDictionary\<TKey, TValue\>\>\&) | Kopya yapıcı. |
| [SortedDictionary](./sorteddictionary/)(const SharedPtr\<IDictionary\<TKey, TValue\>\>\&, const SharedPtr\<IComparer\<typename BasePointerType\<TKey\>::type\>\>\&) | Kopya yapıcı. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [const_iterator](./const_iterator/) | Sabit yineleyici türü. |
| [const_reverse_iterator](./const_reverse_iterator/) | Sabit ters yineleyici türü. |
| [IEnumerablePtr](./ienumerableptr/) | Aynı öğelerden oluşan koleksiyon. |
| [IEnumeratorPtr](./ienumeratorptr/) | [Enumerator](./enumerator/) türü. |
| [iterator](./iterator/) | Yineleyici türü. |
| [KeyCollection](./keycollection/) | Anahtar koleksiyonu tipi. |
| [KVPair](./kvpair/) | Anahtar-değer çifti tipi. |
| [map_t](./map_t/) | Temel veri tipi. |
| [Ptr](./ptr/) | İşaretçi türü. |
| [reverse_iterator](./reverse_iterator/) | Ters yineleyici türü. |
| [this_t](./this_t/) | Kendi tipi. |
| [ValueCollection](./valuecollection/) | Değer koleksiyonu tipi. |
## Açıklamalar


STL map'i saran sıralı sözlük sınıfı. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığına (stack) ya da operator new kullanarak oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

## Ayrıca Bakınız

* Class [BaseDictionary](../basedictionary/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
