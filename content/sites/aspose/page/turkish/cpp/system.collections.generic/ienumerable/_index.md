---
title: "System::Collections::Generic::IEnumerable sınıfı"
linktitle: "IEnumerable"
second_title: "Aspose.Page için C++"
description: "System::Collections::Generic::IEnumerable sınıfı. C++'da içerilen elemanlar üzerinde enumerator sağlayan nesnenin arayüzü."
type: docs
weight: 2200
url: /tr/cpp/system.collections.generic/ienumerable/
---
## IEnumerable class


İçerdiği elemanlar üzerinde enumerator sağlayan nesnenin arayüzü.

```cpp
template<typename T>class IEnumerable : public virtual System::Object
```


| Parameter | Açıklama |
| --- | --- |
| T | Öğe türü. |
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [begin](./begin/)() | Koleksiyonun ilk elemanına (varsa) işaret eden iteratörü alır. Bu iteratör, [GetEnumerator()](./getenumerator/) T'nin bir kopya nesnesini döndürdüğü için referans verilen nesneyi değiştirmek için kullanılamaz. |
| [begin](./begin/)() const | Koleksiyonun const nitelikli örneğinin (varsa) ilk öğesine işaret eden yineleyiciyi alır. |
| [cbegin](./cbegin/)() const | Koleksiyonun (varsa) ilk const nitelikli öğesine işaret eden yineleyiciyi alır. |
| [cend](./cend/)() const | Koleksiyonun (varsa) son const nitelikli öğesinden hemen sonra işaret eden yineleyiciyi alır. |
| [end](./end/)() | Koleksiyonun son elemanından hemen sonrasına (varsa) işaret eden iteratörü alır. Bu iteratör, [GetEnumerator()](./getenumerator/) T'nin bir kopya nesnesini döndürdüğü için referans verilen nesneyi değiştirmek için kullanılamaz. |
| [end](./end/)() const | Koleksiyonun const nitelikli örneğinin (varsa) son öğesinden hemen sonrasını gösteren yineleyiciyi alır. |
| virtual [GetEnumerator](./getenumerator/)() | İteratörü alır. |
| [LINQ_Aggregate](./linq_aggregate/)(const Func\<T, T, T\>\&) | Bir dizi üzerinde bir biriktirici fonksiyon uygular. |
| [LINQ_All](./linq_all/)(std::function\<bool(T)>) | Bir dizinin tüm elemanlarının bir koşulu sağlayıp sağlamadığını belirler. |
| [LINQ_Any](./linq_any/)() | Bir dizinin herhangi bir eleman içerip içermediğini belirler. |
| [LINQ_Any](./linq_any/)(std::function\<bool(T)>) | Bir dizide herhangi bir elemanın var olup olmadığını veya bir koşulu sağlayıp sağlamadığını belirler. |
| [LINQ_Cast](./linq_cast/)() | Elemanları belirtilen tipe dönüştürür. |
| [LINQ_Cast](./linq_cast/)() |  |
| [LINQ_Concat](./linq_concat/)(SharedPtr\<IEnumerable\<T\>\>) | İki diziyi birleştirir. |
| [LINQ_Contains](./linq_contains/)(T) | Bir dizinin belirtilen bir değeri içerip içermediğini belirler. |
| [LINQ_Count](./linq_count/)() | Dizideki eleman sayısını döndürür (doğrudan sayma ile hesaplanır). |
| [LINQ_Count](./linq_count/)(const Func\<T, bool\>\&) | Dizide belirtilen koşulu sağlayan eleman sayısını döndürür. |
| [LINQ_ElementAt](./linq_elementat/)(int) | Bir dizide belirtilen indeksteki elemanı döndürür. |
| [LINQ_ElementAtOrDefault](./linq_elementatordefault/)(int) | Bir dizide belirtilen indeksteki elemanı döndürür. |
| [LINQ_First](./linq_first/)() | Bir dizinin ilk elemanını döndürür. |
| [LINQ_First](./linq_first/)(const Func\<T, bool\>\&) | Belirtilen koşulu sağlayan bir dizinin ilk elemanını döndürür. |
| [LINQ_FirstOrDefault](./linq_firstordefault/)() | Bir dizinin ilk elemanını döndürür; dizi boşsa varsayılan bir değer döndürür. |
| [LINQ_FirstOrDefault](./linq_firstordefault/)(std::function\<bool(T)>) | Bir koşulu sağlayan dizinin ilk elemanını döndürür; böyle bir eleman bulunamazsa varsayılan bir değer döndürür. |
| [LINQ_GroupBy](./linq_groupby/)(System::Func\<T, Key\>) | Bir dizinin elemanlarını gruplar. |
| [LINQ_GroupBy](./linq_groupby/)(System::Func\<Source, Key\>) |  |
| [LINQ_Last](./linq_last/)() | Bir dizinin son elemanını döndürür. |
| [LINQ_LastOrDefault](./linq_lastordefault/)() | Bir dizinin son elemanını döndürür, ya da dizi boşsa varsayılan bir değer döndürür. |
| [LINQ_Max](./linq_max/)(const Func\<T, ResultType\>\&) | Genel bir dizinin her elemanına bir dönüşüm işlevi uygular ve elde edilen maksimum değeri döndürür. |
| [LINQ_Max](./linq_max/)(const Func\<Source, ResultType\>\&) |  |
| [LINQ_Min](./linq_min/)(const Func\<T, ResultType\>\&) | Genel bir dizinin her elemanına bir dönüşüm işlevi uygular ve elde edilen minimum değeri döndürür. |
| [LINQ_Min](./linq_min/)(const Func\<Source, ResultType\>\&) |  |
| [LINQ_OfType](./linq_oftype/)() | Dizinin elemanlarını belirtilen türe göre filtreler. |
| [LINQ_OfType](./linq_oftype/)() |  |
| [LINQ_OrderBy](./linq_orderby/)(const Func\<T, Key\>\&) | Dizinin elemanlarını keySelector tarafından seçilen anahtar değerlerine göre artan sırada sıralar. |
| [LINQ_OrderBy](./linq_orderby/)(const Func\<Source, Key\>\&) |  |
| [LINQ_OrderByDescending](./linq_orderbydescending/)(const Func\<T, Key\>\&) | Dizinin elemanlarını keySelector tarafından seçilen anahtar değerlerine göre azalan sırada sıralar. |
| [LINQ_OrderByDescending](./linq_orderbydescending/)(const Func\<Source, Key\>\&) |  |
| [LINQ_Reverse](./linq_reverse/)() | Bir dizideki elemanların sırasını tersine çevirir. |
| [LINQ_Select](./linq_select/)(const Func\<T, ResultType\>\&) | Bir dizinin elemanlarını dönüştürür. |
| [LINQ_Select](./linq_select/)(const Func\<T, int32_t, ResultType\>\&) | Bir dizinin her elemanını, elemanın indeksini ekleyerek yeni bir forma dönüştürür. |
| [LINQ_Select](./linq_select/)(const Func\<Source, Result\>\&) |  |
| [LINQ_Select](./linq_select/)(const Func\<Source, int32_t, Result\>\&) |  |
| [LINQ_SelectMany](./linq_selectmany/)(const Func\<T, SharedPtr\<IEnumerable\<ResultType\>\>\>\&) | Bir dizinin her elemanını projekte eder ve ortaya çıkan dizileri tek bir diziye birleştirir. |
| [LINQ_SelectMany](./linq_selectmany/)(const Func\<Source, SharedPtr\<IEnumerable\<Result\>\>\>\&) |  |
| [LINQ_Take](./linq_take/)(int32_t) | Bir dizinin başlangıcından belirli sayıda ardışık elemanı döndürür. |
| [LINQ_ToArray](./linq_toarray/)() | Bir diziden bir dizi (array) oluşturur. |
| [LINQ_ToList](./linq_tolist/)() | Bir diziden bir [List<T>](../list/) oluşturur. |
| [LINQ_Where](./linq_where/)(std::function\<bool(T)>) | Bir diziyi belirtilen koşula göre filtreler. |
| virtual [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const | Mevcut konteyner için begin const iterator'un uygulanmasını alır. |
| virtual [virtualizeBeginIterator](./virtualizebeginiterator/)() | Mevcut konteyner için begin iterator'un uygulanmasını alır. |
| virtual [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const | Mevcut konteyner için end const iterator'un uygulanmasını alır. |
| virtual [virtualizeEndIterator](./virtualizeenditerator/)() | Mevcut konteyner için end iterator'un uygulanmasını alır. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [const_iterator](./const_iterator/) | Sabit yineleyici türü. |
| [IEnumeratorType](./ienumeratortype/) | RTTI bilgisi. |
| [iterator](./iterator/) | Yineleyici türü. |
| [ValueType](./valuetype/) |  |
| [virtualized_iterator](./virtualized_iterator/) | İç yineleyici temel türü. |
| [virtualized_iterator_element](./virtualized_iterator_element/) | İç yineleyici öğe türü. |

## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
