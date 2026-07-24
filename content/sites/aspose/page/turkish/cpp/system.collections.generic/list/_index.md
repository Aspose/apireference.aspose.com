---
title: "System::Collections::Generic::List sınıfı"
linktitle: "Liste"
second_title: "Aspose.Page için C++"
description: "System::Collections::Generic::List sınıfı. C++'ta List ileri bildirim (forward declaration)."
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


| Parameter | Açıklama |
| --- | --- |
| T | Öğe türü. |
## Nested classes

* Class [Enumerator](./enumerator/)
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [_add_range](./_add_range/)(std::initializer_list\<T\>) | C++'a özgü. |
| [Add](./add/)(const T\&) override | Liste sonuna bir öğe ekler. |
| [AddInitializer](./addinitializer/)(int, const T *) | Listeye eleman ekler; başlatıcıların çevrilmesinde kullanılır. |
| [AddRange](./addrange/)(IEnumerablePtr) | Koleksiyondan (veya kendisinden) tüm elemanları mevcut listenin sonuna ekler. |
| [AsReadOnly](./asreadonly/)() | Bu koleksiyona yalnızca okunabilir referans alır. |
| [begin](./begin/)() | Koleksiyonun ilk öğesine bir yineleyici alır. |
| [begin](./begin/)() const | Sabit nitelikli koleksiyonun ilk elemanına bir yineleyici (iterator) alır. |
| [BinarySearch](./binarysearch/)(const T\&) const | Sıralı bir listede öğeyi arar. |
| [BinarySearch](./binarysearch/)(const T\&, const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\&) const | Sıralı bir listede öğeyi arar. |
| [BinarySearch](./binarysearch/)(int, int, const T\&, const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\&) const | Sıralı bir listede öğeyi arar. |
| [cbegin](./cbegin/)() const | Koleksiyonun ilk const-nitelikli öğesine yineleyici alır. |
| [cend](./cend/)() const | Koleksiyonun sonundan sonraki mevcut olmayan const-nitelikli öğe için yineleyici alır. |
| [Clear](./clear/)() override | Tüm öğeleri siler. |
| [Contains](./contains/)(const T\&) const override | Öğenin listede bulunup bulunmadığını kontrol eder. |
| [ConvertAll](./convertall/)(Converter\<T, OutputType\>) | Farklı türe dönüştürülmüş öğelerden bir liste oluşturur. |
| [CopyTo](./copyto/)(System::ArrayPtr\<T\>, int) override | Liste öğelerini mevcut dizi öğelerine kopyalar. |
| [CopyTo](./copyto/)(const System::ArrayPtr\<T\>\&) | Tüm öğeleri mevcut dizi öğelerine kopyalar. |
| [CopyTo](./copyto/)(int, const System::ArrayPtr\<T\>\&, int, int) | Belirtilen indeksden başlayarak öğeleri mevcut dizi öğelerine kopyalar. |
| [crbegin](./crbegin/)() const | Koleksiyonun son const nitelikli öğesine (ters yönde ilk) ters bir yineleyici al. |
| [crend](./crend/)() const | Koleksiyonun başlangıcından önceki var olmayan const nitelikli öğe için ters bir yineleyici al. |
| [data](./data/)() | Altta yatan veri yapısı erişim işlevi. |
| [data](./data/)() const | Altta yatan veri yapısı erişim işlevi. |
| [end](./end/)() | Koleksiyonun sonundan sonraki mevcut olmayan öğe için yineleyici alır. |
| [end](./end/)() const | Const-nitelikli koleksiyonun sonundan sonraki mevcut olmayan öğe için yineleyici alır. |
| [Exists](./exists/)(System::Predicate\<T\>) | Listedeki belirli bir koşula uyan öğenin var olup olmadığını denetler. |
| [Find](./find/)(System::Predicate\<T\>) | Belirli bir koşula uyan öğeyi arar. |
| [FindAll](./findall/)(System::Predicate\<T\>) | Belirli bir koşula uyan öğeleri arar. |
| [FindIndex](./findindex/)(System::Predicate\<T\>) | Belirli bir koşula uyan öğeyi arar. |
| [FindIndex](./findindex/)(int, System::Predicate\<T\>) | Belirli bir koşula uyan öğeyi arar. |
| [FindIndex](./findindex/)(int, int, System::Predicate\<T\>) | Belirli bir koşula uyan öğeyi arar. |
| [FindLast](./findlast/)(System::Predicate\<T\>) | Belirli bir koşula uyan son öğeyi arar. |
| [ForEach](./foreach/)(System::Action\<T\>) | Listedeki tüm öğelere eylemi uygular. |
| [get_Capacity](./get_capacity/)() const | Geçerli listenin kapasitesini alır. |
| [get_Count](./get_count/)() const override | Geçerli listedeki öğe sayısını alır. |
| [GetEnumerator](./getenumerator/)() override | Liste öğeleri üzerinden yineleme yapmak için enumerator alır. |
| [GetRange](./getrange/)(int, int) | Listenin bir dilimini oluşturur. |
| [idx_get](./idx_get/)(int) const override | Belirli konumdaki öğeyi alır. |
| [idx_set](./idx_set/)(int, T) override | Elemanı belirli konuma ayarlar. |
| [IndexOf](./indexof/)(const T\&) const override | Belirli öğenin ilk indeksini alır. |
| [IndexOf](./indexof/)(const T\&, int) const | Listede belirli öğeyi arar. |
| [Insert](./insert/)(int, const T\&) override | Belirtilen konuma öğe ekler. |
| [InsertRange](./insertrange/)(int, IEnumerablePtr) | Belirli konuma veri aralığını ekler. |
| [LastIndexOf](./lastindexof/)(const T\&) const | Belirtilen nesneyi arar ve tüm liste içinde son oluşumun sıfır tabanlı indeksini döndürür. |
| [LastIndexOf](./lastindexof/)(const T\&, int32_t) const | Belirtilen nesneyi arar ve ilk öğeden belirtilen indekse kadar uzanan [List](./) içindeki öğeler aralığında son oluşumun sıfır tabanlı indeksini döndürür. |
| [LastIndexOf](./lastindexof/)(const T\&, int32_t, int32_t) const | Belirtilen nesneyi arar ve belirtilen sayıda öğe içeren ve belirtilen indekste sona eren [List](./) içindeki öğeler aralığında son oluşumun sıfır tabanlı indeksini döndürür. |
| [List](./list/)() | Boş bir liste oluşturur. |
| [List](./list/)(int) | Önceden tanımlı kapasiteye sahip bir liste oluşturur. |
| [List](./list/)(IEnumerablePtr) | Kopya yapıcı. |
| [operator[]](./operator[]/)(int) | Erişimci işlev. |
| [operator[]](./operator[]/)(int) const | Erişimci işlev. |
| [rbegin](./rbegin/)() | Koleksiyonun son öğesine (ters yönde ilk) bir ters yineleyici alır. |
| [rbegin](./rbegin/)() const | Const nitelikli koleksiyonun son öğesine (ters yönde ilk) bir ters yineleyici alır. |
| [Remove](./remove/)(const T\&) override | Belirli bir öğenin listeden ilk örneğini kaldırır. |
| [RemoveAll](./removeall/)(Predicate\<T\>) | Belirli bir koşulu sağlayan tüm öğeleri kaldırır. |
| [RemoveAt](./removeat/)(int) override | Belirtilen konumdaki öğeyi kaldırır. |
| [RemoveRange](./removerange/)(int, int) | Listenin bir dilimini kaldırır. |
| [rend](./rend/)() | Koleksiyonun başlangıcından önceki mevcut olmayan bir öğe için ters yineleyici alır. |
| [rend](./rend/)() const | Const nitelikli koleksiyonun başlangıcından önceki mevcut olmayan bir öğe için ters yineleyici alır. |
| [Reverse](./reverse/)() | Tüm listenin öğe sırasını tersine çevirir. |
| [Reverse](./reverse/)(int, int) | Listenin dilimindeki öğe sırasını tersine çevirir. |
| [set_Capacity](./set_capacity/)(int) | Listenin kapasitesini ayarlar. |
| [Sort](./sort/)(const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\&) | Listedeki öğeleri sıralar. |
| [Sort](./sort/)() | Listedeki öğeleri varsayılan karşılaştırıcıyı kullanarak sıralar. |
| [Sort](./sort/)(int, int, SharedPtr\<System::Collections::Generic::IComparer\<T\>\>) | Listenin dilimindeki öğeleri sıralar. |
| [Sort](./sort/)(Comparison\<T\>, bool) | Listedeki öğeleri sıralar. |
| [ToArray](./toarray/)() const | Listeyi diziye dönüştürür. |
| [TrimExcess](./trimexcess/)() | Listenin kapasitesini boyutuna uydurur. |
| [TrueForAll](./trueforall/)(System::Predicate\<T\>) | Koleksiyondaki her öğenin belirtilen koşul tarafından tanımlanan şartları karşılayıp karşılamadığını belirler. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Mevcut konteyner için begin const iterator'un uygulanmasını alır. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Mevcut konteyner için begin iterator'un uygulanmasını alır. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Mevcut konteyner için end const iterator'un uygulanmasını alır. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Mevcut konteyner için end iterator'un uygulanmasını alır. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [BaseType](./basetype/) | Arayüz türü. |
| [const_iterator](./const_iterator/) | Sabit yineleyici türü. |
| [const_reverse_iterator](./const_reverse_iterator/) | Sabit ters yineleyici türü. |
| [IEnumerablePtr](./ienumerableptr/) | Aynı türdeki öğeleri tutan kapsayıcı. |
| [IEnumeratorPtr](./ienumeratorptr/) | [Enumerator](./enumerator/) türü. |
| [iterator](./iterator/) | Yineleyici türü. |
| [reverse_iterator](./reverse_iterator/) | Ters yineleyici türü. |
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
  // İlk listenin öğeleri şu şekilde olacaktır: {-5, 1, 3, 8}
  list1->Sort();

  // 2. indeksteki öğeyi kaldır.
  // İlk listenin öğeleri şu şekilde olacaktır: {-5, 1, 8}
  list1->RemoveAt(2);

  // 1. indekse öğeyi ekle.
  // İlk listenin öğeleri şu şekilde olacaktır: {-5, 15, 1, 8}
  list1->Insert(1, 15);

  // İkinci listeyi oluştur.
  auto list2 = MakeObject<List<int>>();

  // İkinci listeyi doldurun.
  list2->Add(10);
  list2->Add(20);
  list2->Add(30);

  // İkinci listedeki öğeleri birinci listeye ekleyin.
  list1->AddRange(list2);

  // Birinci listedeki öğeleri yazdırın.
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
* Library [Aspose.Page for C++](../../)
