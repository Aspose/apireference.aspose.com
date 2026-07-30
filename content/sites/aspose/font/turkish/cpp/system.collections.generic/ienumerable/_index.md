---
title: "System::Collections::Generic::IEnumerable sınıfı"
linktitle: "IEnumerable"
second_title: "Aspose.Font için C++"
description: "System::Collections::Generic::IEnumerable sınıfı. C++'da içerdiği öğeler üzerinde yineleyici sağlayan nesnenin arayüzü."
type: docs
weight: 2200
url: /tr/cpp/system.collections.generic/ienumerable/
---
## IEnumerable class


Interface of object providing enumerator on contained elements.

```cpp
template<typename T>class IEnumerable : public virtual System::Object
```


| Parametre | Açıklama |
| --- | --- |
| T | Eleman tipi. |
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [begin](./begin/)() | Koleksiyonun (varsa) ilk öğesine işaret eden yineleyiciyi alır. Bu yineleyici, [GetEnumerator()](./getenumerator/) bir T kopya-nesnesi döndürdüğü için referans verilen nesneyi değiştirmek amacıyla kullanılamaz. |
| [begin](./begin/)() const | Koleksiyonun const nitelikli örneğinin (varsa) ilk öğesine işaret eden yineleyiciyi alır. |
| [cbegin](./cbegin/)() const | Koleksiyonun (varsa) ilk const nitelikli öğesine işaret eden yineleyiciyi alır. |
| [cend](./cend/)() const | Koleksiyonun (varsa) son const nitelikli öğesinden hemen sonrasına işaret eden yineleyiciyi alır. |
| [end](./end/)() | Koleksiyonun (varsa) son öğesinden hemen sonrasına işaret eden yineleyiciyi alır. Bu yineleyici, [GetEnumerator()](./getenumerator/) bir T kopya-nesnesi döndürdüğü için referans verilen nesneyi değiştirmek amacıyla kullanılamaz. |
| [end](./end/)() const | Koleksiyonun const nitelikli örneğinin (varsa) son öğesinden hemen sonrasına işaret eden yineleyiciyi alır. |
| virtual [GetEnumerator](./getenumerator/)() | Yineleyiciyi alır. |
| [LINQ_Aggregate](./linq_aggregate/)(const Func\<T, T, T\>\&) | Bir dizi üzerinde bir biriktirici fonksiyon uygular. |
| [LINQ_All](./linq_all/)(std::function\<bool(T)>) | Bir dizinin tüm öğelerinin bir koşulu sağlayıp sağlamadığını belirler. |
| [LINQ_Any](./linq_any/)() | Bir dizinin herhangi bir öğe içerip içermediğini belirler. |
| [LINQ_Any](./linq_any/)(std::function\<bool(T)>) | Bir dizideki herhangi bir öğenin var olup olmadığını veya bir koşulu sağlayıp sağlamadığını belirler. |
| [LINQ_Cast](./linq_cast/)() | Öğeleri belirtilen türe dönüştürür. |
| [LINQ_Cast](./linq_cast/)() |  |
| [LINQ_Concat](./linq_concat/)(SharedPtr\<IEnumerable\<T\>\>) | İki diziyi birleştirir. |
| [LINQ_Contains](./linq_contains/)(T) | Bir dizinin belirtilen bir değeri içerip içermediğini belirler. |
| [LINQ_Count](./linq_count/)() | Dizideki öğe sayısını döndürür (doğrudan sayma yoluyla hesaplanır). |
| [LINQ_Count](./linq_count/)(const Func\<T, bool\>\&) | Belirtilen koşulu sağlayan dizideki öğe sayısını döndürür. |
| [LINQ_ElementAt](./linq_elementat/)(int) | Bir dizide belirtilen indeksteki öğeyi döndürür. |
| [LINQ_ElementAtOrDefault](./linq_elementatordefault/)(int) | Bir dizide belirtilen indeksteki öğeyi döndürür. |
| [LINQ_First](./linq_first/)() | Bir dizinin ilk öğesini döndürür. |
| [LINQ_First](./linq_first/)(const Func\<T, bool\>\&) | Belirtilen koşulu sağlayan bir dizinin ilk öğesini döndürür. |
| [LINQ_FirstOrDefault](./linq_firstordefault/)() | Bir dizinin ilk öğesini döndürür; dizi boşsa varsayılan bir değer döndürür. |
| [LINQ_FirstOrDefault](./linq_firstordefault/)(std::function\<bool(T)>) | Bir koşulu sağlayan dizinin ilk öğesini döndürür; böyle bir öğe bulunamazsa varsayılan bir değer döndürür. |
| [LINQ_GroupBy](./linq_groupby/)(System::Func\<T, Key\>) | Bir dizinin öğelerini gruplar. |
| [LINQ_GroupBy](./linq_groupby/)(System::Func\<T, Key\>, System::Func\<T, Element\>) | Bir dizinin öğelerini gruplar. |
| [LINQ_GroupBy](./linq_groupby/)(System::Func\<Source, Key\>) |  |
| [LINQ_GroupBy](./linq_groupby/)(System::Func\<Source, Key\>, System::Func\<Source, Element\>) |  |
| [LINQ_Last](./linq_last/)() | Bir dizinin son öğesini döndürür. |
| [LINQ_LastOrDefault](./linq_lastordefault/)() | Bir dizinin son öğesini döndürür; dizi boşsa varsayılan bir değer döndürür. |
| [LINQ_Max](./linq_max/)(const Func\<T, ResultType\>\&) | Genel bir dizinin her öğesine bir dönüşüm fonksiyonu uygular ve elde edilen en büyük değeri döndürür. |
| [LINQ_Max](./linq_max/)(const Func\<Source, ResultType\>\&) |  |
| [LINQ_Min](./linq_min/)(const Func\<T, ResultType\>\&) | Genel bir dizinin her öğesine bir dönüşüm fonksiyonu uygular ve elde edilen en küçük değeri döndürür. |
| [LINQ_Min](./linq_min/)(const Func\<Source, ResultType\>\&) |  |
| [LINQ_OfType](./linq_oftype/)() | Dizinin öğelerini belirtilen türe göre filtreler. |
| [LINQ_OfType](./linq_oftype/)() |  |
| [LINQ_OrderBy](./linq_orderby/)(const Func\<T, Key\>\&) | keySelector tarafından seçilen anahtar değerlerine göre bir dizinin öğelerini artan sırada sıralar. |
| [LINQ_OrderBy](./linq_orderby/)(const Func\<Source, Key\>\&) |  |
| [LINQ_OrderByDescending](./linq_orderbydescending/)(const Func\<T, Key\>\&) | keySelector tarafından seçilen anahtar değerlerine göre bir dizinin öğelerini azalan sırada sıralar. |
| [LINQ_OrderByDescending](./linq_orderbydescending/)(const Func\<Source, Key\>\&) |  |
| [LINQ_Reverse](./linq_reverse/)() | Bir dizinin öğelerinin sırasını tersine çevirir. |
| [LINQ_Select](./linq_select/)(const Func\<T, ResultType\>\&) | Bir dizinin öğelerini dönüştürür. |
| [LINQ_Select](./linq_select/)(const Func\<T, int32_t, ResultType\>\&) | Bir dizinin her öğesini, öğenin indeksini dahil ederek yeni bir forma dönüştürür. |
| [LINQ_Select](./linq_select/)(const Func\<Source, Result\>\&) |  |
| [LINQ_Select](./linq_select/)(const Func\<Source, int32_t, Result\>\&) |  |
| [LINQ_SelectMany](./linq_selectmany/)(const Func\<T, SharedPtr\<IEnumerable\<ResultType\>\>\>\&) | Bir dizinin her öğesini projeler ve ortaya çıkan dizileri tek bir diziye birleştirir. |
| [LINQ_SelectMany](./linq_selectmany/)(const Func\<Source, SharedPtr\<IEnumerable\<Result\>\>\>\&) |  |
| [LINQ_Take](./linq_take/)(int32_t) | Bir dizinin başlangıcından belirli sayıda ardışık öğeyi döndürür. |
| [LINQ_ToArray](./linq_toarray/)() | Bir diziden bir dizi oluşturur. |
| [LINQ_ToList](./linq_tolist/)() | Bir diziden bir [List<T>](../list/) oluşturur. |
| [LINQ_Where](./linq_where/)(std::function\<bool(T)>) | Belirtilen koşula göre bir diziyi filtreler. |
| virtual [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const | Mevcut kapsayıcı için begin const yineleyicisinin uygulamasını alır. |
| virtual [virtualizeBeginIterator](./virtualizebeginiterator/)() | Mevcut kapsayıcı için begin yineleyicisinin uygulamasını alır. |
| virtual [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const | Mevcut kapsayıcı için end const yineleyicisinin uygulamasını alır. |
| virtual [virtualizeEndIterator](./virtualizeenditerator/)() | Mevcut kapsayıcı için end yineleyicisinin uygulamasını alır. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [const_iterator](./const_iterator/) | Const iterator türü. |
| [IEnumeratorType](./ienumeratortype/) | RTTI bilgisi. |
| [iterator](./iterator/) | Iterator türü. |
| [ValueType](./valuetype/) |  |
| [virtualized_iterator](./virtualized_iterator/) | İç yineleyicinin temel türü. |
| [virtualized_iterator_element](./virtualized_iterator_element/) | İç yineleyicinin öğe türü. |

## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
