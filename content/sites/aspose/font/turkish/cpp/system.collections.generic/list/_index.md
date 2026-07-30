---
title: "System::Collections::Generic::List sınıfı"
linktitle: "List"
second_title: "Aspose.Font için C++"
description: "System::Collections::Generic::List sınıfı. C++'ta List ileri bildirim."
type: docs
weight: 3300
url: /tr/cpp/system.collections.generic/list/
---
## List class


[List](./) forward declaration.

```cpp
template<typename T>class List : public virtual System::Object,
                                 public System::Collections::Generic::IList<T>
```


| Parametre | Açıklama |
| --- | --- |
| T | Eleman tipi. |
## Nested classes

* Class [Enumerator](./enumerator/)
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [_add_range](./_add_range/)(std::initializer_list\<T\>) | C++'a özgü. |
| [Add](./add/)(const T\&) override | Liste sonuna bir öğe ekler. |
| [AddInitializer](./addinitializer/)(int, const T *) | Listeye öğeler ekler; başlatıcıların çevrilmesinde kullanılır. |
| [AddRange](./addrange/)(IEnumerablePtr) | Koleksiyondan (veya kendisinden) tüm öğeleri mevcut listenin sonuna ekler. |
| [AsReadOnly](./asreadonly/)() | Bu koleksiyona yalnızca okunabilir bir referans alır. |
| [begin](./begin/)() | Koleksiyonun ilk öğesine yineleyici alır. |
| [begin](./begin/)() const | const nitelikli koleksiyonun ilk öğesine bir yineleyici alır. |
| [BinarySearch](./binarysearch/)(const T\&) const | Sıralı bir listede öğeyi arar. |
| [BinarySearch](./binarysearch/)(const T\&, const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\&) const | Sıralı bir listede öğeyi arar. |
| [BinarySearch](./binarysearch/)(int, int, const T\&, const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\&) const | Sıralı bir listede öğeyi arar. |
| [cbegin](./cbegin/)() const | Koleksiyonun ilk const-nitelikli öğesine bir yineleyici alır. |
| [cend](./cend/)() const | Koleksiyonun sonundaki mevcut olmayan const-nitelikli bir öğe için yineleyici alır. |
| [Clear](./clear/)() override | Tüm öğeleri siler. |
| [Contains](./contains/)(const T\&) const override | Öğenin listede bulunup bulunmadığını kontrol eder. |
| [ConvertAll](./convertall/)(Converter\<T, OutputType\>) | Farklı bir türe dönüştürülmüş öğelerden bir liste oluşturur. |
| [CopyTo](./copyto/)(System::ArrayPtr\<T\>, int) override | Liste öğelerini mevcut dizi öğelerine kopyalar. |
| [CopyTo](./copyto/)(const System::ArrayPtr\<T\>\&) | Tüm öğeleri mevcut dizi öğelerine kopyalar. |
| [CopyTo](./copyto/)(int, const System::ArrayPtr\<T\>\&, int, int) | Belirtilen indeksten başlayarak öğeleri mevcut dizi öğelerine kopyalar. |
| [crbegin](./crbegin/)() const | Koleksiyonun son const-nitelikli elemanına (ters sırada ilk) bir ters yineleyici alır. |
| [crend](./crend/)() const | Koleksiyonun başlangıcından önceki mevcut olmayan const-nitelikli bir eleman için ters yineleyici alır. |
| [data](./data/)() | Alt veri yapısına erişim işlevi. |
| [data](./data/)() const | Alt veri yapısına erişim işlevi. |
| [end](./end/)() | Koleksiyonun sonundaki mevcut olmayan bir öğe için yineleyici alır. |
| [end](./end/)() const | Const-nitelikli koleksiyonun sonundaki mevcut olmayan bir öğe için yineleyici alır. |
| [Exists](./exists/)(System::Predicate\<T\>) | Listedeki belirli bir koşula uyan öğenin var olup olmadığını denetler. |
| [Find](./find/)(System::Predicate\<T\>) | Belirli bir koşula uyan öğeyi arar. |
| [FindAll](./findall/)(System::Predicate\<T\>) | Belirli bir koşula uyan öğeleri arar. |
| [FindIndex](./findindex/)(System::Predicate\<T\>) | Belirli bir koşula uyan öğeyi arar. |
| [FindIndex](./findindex/)(int, System::Predicate\<T\>) | Belirli bir koşula uyan öğeyi arar. |
| [FindIndex](./findindex/)(int, int, System::Predicate\<T\>) | Belirli bir koşula uyan öğeyi arar. |
| [FindLast](./findlast/)(System::Predicate\<T\>) | Belirli bir koşula uyan son öğeyi arar. |
| [ForEach](./foreach/)(System::Action\<T\>) | Listedeki tüm öğelere eylemi uygular. |
| [get_Capacity](./get_capacity/)() const | Mevcut liste kapasitesini alır. |
| [get_Count](./get_count/)() const override | Mevcut listedeki öğe sayısını alır. |
| [GetEnumerator](./getenumerator/)() override | Liste öğeleri arasında yineleme yapmak için enumeratörü alır. |
| [GetRange](./getrange/)(int, int) | Listenin bir dilimini oluşturur. |
| [idx_get](./idx_get/)(int) const override | Belirli konumdaki öğeyi alır. |
| [idx_set](./idx_set/)(int, T) override | Öğeyi belirli konumda ayarlar. |
| [IndexOf](./indexof/)(const T\&) const override | Belirli öğenin ilk dizinini alır. |
| [IndexOf](./indexof/)(const T\&, int) const | Listede belirli öğeyi arar. |
| [Insert](./insert/)(int, const T\&) override | Öğeyi belirtilen konuma ekler. |
| [InsertRange](./insertrange/)(int, IEnumerablePtr) | Veri aralığını belirli konuma ekler. |
| [LastIndexOf](./lastindexof/)(const T\&) const | Belirtilen nesneyi arar ve tüm liste içinde son oluşumun sıfır tabanlı dizinini döndürür. |
| [LastIndexOf](./lastindexof/)(const T\&, int32_t) const | Belirtilen nesneyi arar ve ilk öğeden belirtilen indekse kadar uzanan [List](./) içindeki öğe aralığında son oluşumun sıfır tabanlı dizinini döndürür. |
| [LastIndexOf](./lastindexof/)(const T\&, int32_t, int32_t) const | Belirtilen nesneyi arar ve belirtilen sayıda öğe içeren ve belirtilen indekste sona eren [List](./) içindeki öğe aralığında son oluşumun sıfır tabanlı dizinini döndürür. |
| [List](./list/)() | Boş bir liste oluşturur. |
| [List](./list/)(int) | Önceden tanımlı kapasiteye sahip bir liste oluşturur. |
| [List](./list/)(IEnumerablePtr) | Kopya yapıcı. |
| [operator[]](./operator[]/)(int) | Erişimci işlev. |
| [operator[]](./operator[]/)(int) const | Erişimci işlev. |
| [rbegin](./rbegin/)() | Koleksiyonun son elemanına (ters sırada ilk) ters yineleyici alır. |
| [rbegin](./rbegin/)() const | Const-nitelikli koleksiyonun son elemanına (ters sırada ilk) ters yineleyici alır. |
| [Remove](./remove/)(const T\&) override | Belirli bir öğenin listeden ilk örneğini kaldırır. |
| [RemoveAll](./removeall/)(Predicate\<T\>) | Belirli bir koşulu karşılayan tüm öğeleri kaldırır. |
| [RemoveAt](./removeat/)(int) override | Belirtilen konumdaki öğeyi kaldırır. |
| [RemoveRange](./removerange/)(int, int) | Listenin bir dilimini kaldırır. |
| [rend](./rend/)() | Koleksiyonun başlangıcından önceki mevcut olmayan bir eleman için ters yineleyici alır. |
| [rend](./rend/)() const | Const-nitelikli koleksiyonun başlangıcından önceki mevcut olmayan bir eleman için ters yineleyici alır. |
| [Reverse](./reverse/)() | Tüm listenin öğe sırasını tersine çevirir. |
| [Reverse](./reverse/)(int, int) | Liste diliminin öğe sırasını tersine çevirir. |
| [set_Capacity](./set_capacity/)(int) | Liste kapasitesini ayarlar. |
| [Sort](./sort/)(const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\&) | Listedeki öğeleri sıralar. |
| [Sort](./sort/)() | Listedeki öğeleri varsayılan karşılaştırıcıyı kullanarak sıralar. |
| [Sort](./sort/)(int, int, SharedPtr\<System::Collections::Generic::IComparer\<T\>\>) | Liste dilimindeki öğeleri sıralar. |
| [Sort](./sort/)(Comparison\<T\>, bool) | Listedeki öğeleri sıralar. |
| [ToArray](./toarray/)() const | Listeyi diziye dönüştürür. |
| [TrimExcess](./trimexcess/)() | Liste kapasitesini boyutuna göre ayarlar. |
| [TrueForAll](./trueforall/)(System::Predicate\<T\>) | Koleksiyondaki her öğenin, belirtilen koşul tarafından tanımlanan şartları karşılayıp karşılamadığını belirler. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Mevcut kapsayıcı için begin const yineleyicisinin uygulamasını alır. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Mevcut kapsayıcı için begin yineleyicisinin uygulamasını alır. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Mevcut kapsayıcı için end const yineleyicisinin uygulamasını alır. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Mevcut kapsayıcı için end yineleyicisinin uygulamasını alır. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [BaseType](./basetype/) | Arayüz türü. |
| [const_iterator](./const_iterator/) | Const iterator türü. |
| [const_reverse_iterator](./const_reverse_iterator/) | Const reverse iterator türü. |
| [IEnumerablePtr](./ienumerableptr/) | Aynı türdeki öğeleri tutan kapsayıcı. |
| [IEnumeratorPtr](./ienumeratorptr/) | [Enumerator](./enumerator/) türü. |
| [iterator](./iterator/) | Iterator türü. |
| [reverse_iterator](./reverse_iterator/) | Reverse iterator türü. |
| [ValueType](./valuetype/) | Bu tip. |
| [vector_t](./vector_t/) | RTTI bilgisi. |
## Açıklamalar


[List](./) - wrapper around std::vector to be used in translated code. Requires operator == to be impemented for element type. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.


```cpp
#include <system/collections/list.h>
#include <system/smart_ptr.h>

using namespace System;
using namespace System::Collections::Generic;

int main()
{
  // İlk listeyi oluştur.
  auto list1 = MakeObject<List<int>>();

  // İlk listeyi doldur.
  list1->Add(3);
  list1->Add(1);
  list1->Add(-5);
  list1->Add(8);

  // İlk listeyi sırala.
  // İlk liste öğeleri şu şekilde olacak: {-5, 1, 3, 8}
  list1->Sort();

  // 2. indeksteki öğeyi kaldır.
  // İlk liste öğeleri şu şekilde olacak: {-5, 1, 8}
  list1->RemoveAt(2);

  // Öğeyi 1. indekse ekle.
  // İlk liste öğeleri şu şekilde olacak: {-5, 15, 1, 8}
  list1->Insert(1, 15);

  // İkinci listeyi oluştur.
  auto list2 = MakeObject<List<int>>();

  // İkinci listeyi doldur.
  list2->Add(10);
  list2->Add(20);
  list2->Add(30);

  // İkinci listedeki öğeleri birincisine ekle.
  list1->AddRange(list2);

  // İlk liste öğelerini yazdır.
  for (const auto item: list1)
  {
    std::cout << item << ' ';
  }

  return 0;
}
/*
This code example produces the following output:
-5 15 1 8 10 20 30
*/
```

## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Class [IList](../ilist/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
