---
title: "System::Collections::Generic::IEnumerable class"
linktitle: "IEnumerable"
second_title: "Aspose.Page voor C++"
description: "System::Collections::Generic::IEnumerable class. Interface van een object dat een enumerator levert voor de aanwezige elementen in C++."
type: docs
weight: 2200
url: /nl/cpp/system.collections.generic/ienumerable/
---
## IEnumerable class


Interface van een object dat een enumerator op de ingesloten elementen biedt.

```cpp
template<typename T>class IEnumerable : public virtual System::Object
```


| Parameter | Beschrijving |
| --- | --- |
| T | Elementtype. |
## Methoden

| Methode | Beschrijving |
| --- | --- |
| [begin](./begin/)() | Geeft een iterator die wijst naar het eerste element (indien aanwezig) van de collectie. Deze iterator kan niet worden gebruikt om een verwezen object te wijzigen omdat [GetEnumerator()](./getenumerator/) een kopie‑object van T retourneert. |
| [begin](./begin/)() const | Haalt iterator op die naar het eerste element (indien aanwezig) van de const‑gekwalificeerde instantie van de collectie wijst. |
| [cbegin](./cbegin/)() const | Haalt iterator op die naar het eerste const‑gekwalificeerde element (indien aanwezig) van de collectie wijst. |
| [cend](./cend/)() const | Haalt iterator op die direct na het laatste const‑gekwalificeerde element (indien aanwezig) van de collectie wijst. |
| [end](./end/)() | Geeft een iterator die direct na het laatste element (indien aanwezig) van de collectie wijst. Deze iterator kan niet worden gebruikt om een verwezen object te wijzigen omdat [GetEnumerator()](./getenumerator/) een kopie‑object van T retourneert. |
| [end](./end/)() const | Haalt iterator op die direct na het laatste element (indien aanwezig) van de const‑gekwalificeerde instantie van de collectie wijst. |
| virtual [GetEnumerator](./getenumerator/)() | Haalt enumerator op. |
| [LINQ_Aggregate](./linq_aggregate/)(const Func\<T, T, T\>\&) | Past een accumulator‑functie toe op een reeks. |
| [LINQ_All](./linq_all/)(std::function\<bool(T)>) | Bepaalt of alle elementen van een reeks aan een voorwaarde voldoen. |
| [LINQ_Any](./linq_any/)() | Bepaalt of een reeks enige elementen bevat. |
| [LINQ_Any](./linq_any/)(std::function\<bool(T)>) | Bepaalt of een element van een reeks bestaat of aan een voorwaarde voldoet. |
| [LINQ_Cast](./linq_cast/)() | Converteert de elementen naar het opgegeven type. |
| [LINQ_Cast](./linq_cast/)() |  |
| [LINQ_Concat](./linq_concat/)(SharedPtr\<IEnumerable\<T\>\>) | Voegt twee reeksen samen. |
| [LINQ_Contains](./linq_contains/)(T) | Bepaalt of een reeks een opgegeven waarde bevat. |
| [LINQ_Count](./linq_count/)() | Retourneert het aantal elementen in de reeks (berekend via directe telling). |
| [LINQ_Count](./linq_count/)(const Func\<T, bool\>\&) | Retourneert het aantal elementen in de reeks dat voldoet aan de opgegeven voorwaarde. |
| [LINQ_ElementAt](./linq_elementat/)(int) | Retourneert het element op een opgegeven index in een reeks. |
| [LINQ_ElementAtOrDefault](./linq_elementatordefault/)(int) | Retourneert het element op een opgegeven index in een reeks. |
| [LINQ_First](./linq_first/)() | Retourneert het eerste element van een reeks. |
| [LINQ_First](./linq_first/)(const Func\<T, bool\>\&) | Retourneert het eerste element van een reeks dat voldoet aan de opgegeven voorwaarde. |
| [LINQ_FirstOrDefault](./linq_firstordefault/)() | Retourneert het eerste element van een reeks, of een standaardwaarde als de reeks leeg is. |
| [LINQ_FirstOrDefault](./linq_firstordefault/)(std::function\<bool(T)>) | Retourneert het eerste element van de reeks dat aan een voorwaarde voldoet, of een standaardwaarde als zo'n element niet wordt gevonden. |
| [LINQ_GroupBy](./linq_groupby/)(System::Func\<T, Key\>) | Groepeert de elementen van een reeks. |
| [LINQ_GroupBy](./linq_groupby/)(System::Func\<Source, Key\>) |  |
| [LINQ_Last](./linq_last/)() | Retourneert het laatste element van een reeks. |
| [LINQ_LastOrDefault](./linq_lastordefault/)() | Retourneert het laatste element van een reeks, of een standaardwaarde als de reeks leeg is. |
| [LINQ_Max](./linq_max/)(const Func\<T, ResultType\>\&) | Roept een transformatiefunctie aan op elk element van een generieke reeks en retourneert de maximale resulterende waarde. |
| [LINQ_Max](./linq_max/)(const Func\<Source, ResultType\>\&) |  |
| [LINQ_Min](./linq_min/)(const Func\<T, ResultType\>\&) | Roept een transformatiefunctie aan op elk element van een generieke reeks en retourneert de minimale resulterende waarde. |
| [LINQ_Min](./linq_min/)(const Func\<Source, ResultType\>\&) |  |
| [LINQ_OfType](./linq_oftype/)() | Filtert de elementen van de reeks op basis van het opgegeven type. |
| [LINQ_OfType](./linq_oftype/)() |  |
| [LINQ_OrderBy](./linq_orderby/)(const Func\<T, Key\>\&) | Sorteert de elementen van een reeks in oplopende volgorde op basis van de sleutelwaarden geselecteerd door keySelector. |
| [LINQ_OrderBy](./linq_orderby/)(const Func\<Source, Key\>\&) |  |
| [LINQ_OrderByDescending](./linq_orderbydescending/)(const Func\<T, Key\>\&) | Sorteert de elementen van een reeks in aflopende volgorde op basis van de sleutelwaarden geselecteerd door keySelector. |
| [LINQ_OrderByDescending](./linq_orderbydescending/)(const Func\<Source, Key\>\&) |  |
| [LINQ_Reverse](./linq_reverse/)() | Keert de volgorde van de elementen in een reeks om. |
| [LINQ_Select](./linq_select/)(const Func\<T, ResultType\>\&) | Transformeert elementen van een reeks. |
| [LINQ_Select](./linq_select/)(const Func\<T, int32_t, ResultType\>\&) | Transformeert elk element van een reeks naar een nieuwe vorm door de index van het element op te nemen. |
| [LINQ_Select](./linq_select/)(const Func\<Source, Result\>\&) |  |
| [LINQ_Select](./linq_select/)(const Func\<Source, int32_t, Result\>\&) |  |
| [LINQ_SelectMany](./linq_selectmany/)(const Func\<T, SharedPtr\<IEnumerable\<ResultType\>\>\>\&) | Projetteert elk element van een reeks en combineert de resulterende reeksen tot één reeks. |
| [LINQ_SelectMany](./linq_selectmany/)(const Func\<Source, SharedPtr\<IEnumerable\<Result\>\>\>\&) |  |
| [LINQ_Take](./linq_take/)(int32_t) | Retourneert een opgegeven aantal aaneengesloten elementen vanaf het begin van een reeks. |
| [LINQ_ToArray](./linq_toarray/)() | Maakt een array aan vanuit een reeks. |
| [LINQ_ToList](./linq_tolist/)() | Maakt een [List<T>](../list/) aan vanuit een reeks. |
| [LINQ_Where](./linq_where/)(std::function\<bool(T)>) | Filtert een reeks op basis van het opgegeven predicaat. |
| virtual [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const | Haalt de implementatie van begin const iterator voor de huidige container op. |
| virtual [virtualizeBeginIterator](./virtualizebeginiterator/)() | Haalt de implementatie van begin iterator voor de huidige container op. |
| virtual [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const | Haalt de implementatie van end const iterator voor de huidige container op. |
| virtual [virtualizeEndIterator](./virtualizeenditerator/)() | Haalt de implementatie van end iterator voor de huidige container op. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [const_iterator](./const_iterator/) | Const-iterator type. |
| [IEnumeratorType](./ienumeratortype/) | RTTI-informatie. |
| [iterator](./iterator/) | Iterator type. |
| [ValueType](./valuetype/) |  |
| [virtualized_iterator](./virtualized_iterator/) | Basistype van de binnenste iterator. |
| [virtualized_iterator_element](./virtualized_iterator_element/) | Elementtype van de binnenste iterator. |

## Zie ook

* Class [Object](../../system/object/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
