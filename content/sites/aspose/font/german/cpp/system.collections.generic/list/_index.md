---
title: "System::Collections::Generic::List Klasse"
linktitle: "List"
second_title: "Aspose.Font für C++"
description: "System::Collections::Generic::List Klasse. Vorwärtsdeklaration der Liste in C++."
type: docs
weight: 3300
url: /de/cpp/system.collections.generic/list/
---
## List class


[List](./) forward declaration.

```cpp
template<typename T>class List : public virtual System::Object,
                                 public System::Collections::Generic::IList<T>
```


| Parameter | Beschreibung |
| --- | --- |
| T | Elementtyp. |
## Nested classes

* Class [Enumerator](./enumerator/)
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [_add_range](./_add_range/)(std::initializer_list\<T\>) | C++-spezifisch. |
| [Add](./add/)(const T\&) override | Fügt ein Element am Ende der Liste hinzu. |
| [AddInitializer](./addinitializer/)(int, const T *) | Fügt Elemente zur Liste hinzu; wird beim Übersetzen von Initialisierern verwendet. |
| [AddRange](./addrange/)(IEnumerablePtr) | Fügt alle Elemente aus der Sammlung (oder sich selbst) am Ende der aktuellen Liste hinzu. |
| [AsReadOnly](./asreadonly/)() | Erhält eine schreibgeschützte Referenz auf diese Sammlung. |
| [begin](./begin/)() | Gibt einen Iterator auf das erste Element der Sammlung zurück. |
| [begin](./begin/)() const | Erhält einen Iterator zum ersten Element der const‑qualifizierten Sammlung. |
| [BinarySearch](./binarysearch/)(const T\&) const | Sucht nach einem Element in einer sortierten Liste. |
| [BinarySearch](./binarysearch/)(const T\&, const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\&) const | Sucht nach einem Element in einer sortierten Liste. |
| [BinarySearch](./binarysearch/)(int, int, const T\&, const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\&) const | Sucht nach einem Element in einer sortierten Liste. |
| [cbegin](./cbegin/)() const | Erhält einen Iterator zum ersten const‑qualifizierten Element der Sammlung. |
| [cend](./cend/)() const | Erhält einen Iterator für ein nicht existierendes const‑qualifiziertes Element hinter dem Ende der Sammlung. |
| [Clear](./clear/)() override | Löscht alle Elemente. |
| [Contains](./contains/)(const T\&) const override | Überprüft, ob das Element in der Liste vorhanden ist. |
| [ConvertAll](./convertall/)(Converter\<T, OutputType\>) | Erstellt eine Liste von Elementen, die in einen anderen Typ konvertiert wurden. |
| [CopyTo](./copyto/)(System::ArrayPtr\<T\>, int) override | Kopiert Listenelemente in vorhandene Array-Elemente. |
| [CopyTo](./copyto/)(const System::ArrayPtr\<T\>\&) | Kopiert alle Elemente in vorhandene Array-Elemente. |
| [CopyTo](./copyto/)(int, const System::ArrayPtr\<T\>\&, int, int) | Kopiert Elemente beginnend ab dem angegebenen Index in vorhandene Array-Elemente. |
| [crbegin](./crbegin/)() const | Gibt einen Reverse‑Iterator auf das letzte const‑qualifizierte Element der Sammlung zurück (erstes im Reverse). |
| [crend](./crend/)() const | Gibt einen Reverse‑Iterator für ein nicht vorhandenes const‑qualifiziertes Element vor dem Beginn der Sammlung zurück. |
| [data](./data/)() | Zugriffs‑Funktion der zugrunde liegenden Datenstruktur. |
| [data](./data/)() const | Zugriffs‑Funktion der zugrunde liegenden Datenstruktur. |
| [end](./end/)() | Erhält einen Iterator für ein nicht existierendes Element hinter dem Ende der Sammlung. |
| [end](./end/)() const | Erhält einen Iterator für ein nicht existierendes Element hinter dem Ende der const‑qualifizierten Sammlung. |
| [Exists](./exists/)(System::Predicate\<T\>) | Prüft, ob ein Element, das ein bestimmtes Prädikat erfüllt, in der Liste existiert. |
| [Find](./find/)(System::Predicate\<T\>) | Sucht nach einem Element, das ein bestimmtes Prädikat erfüllt. |
| [FindAll](./findall/)(System::Predicate\<T\>) | Sucht nach Elementen, die ein bestimmtes Prädikat erfüllen. |
| [FindIndex](./findindex/)(System::Predicate\<T\>) | Sucht nach einem Element, das ein bestimmtes Prädikat erfüllt. |
| [FindIndex](./findindex/)(int, System::Predicate\<T\>) | Sucht nach einem Element, das ein bestimmtes Prädikat erfüllt. |
| [FindIndex](./findindex/)(int, int, System::Predicate\<T\>) | Sucht nach einem Element, das ein bestimmtes Prädikat erfüllt. |
| [FindLast](./findlast/)(System::Predicate\<T\>) | Sucht nach dem letzten Element, das ein bestimmtes Prädikat erfüllt. |
| [ForEach](./foreach/)(System::Action\<T\>) | Wendet eine Aktion auf alle Elemente in der Liste an. |
| [get_Capacity](./get_capacity/)() const | Ermittelt die aktuelle Listenkapazität. |
| [get_Count](./get_count/)() const override | Ermittelt die Anzahl der Elemente in der aktuellen Liste. |
| [GetEnumerator](./getenumerator/)() override | Ermittelt den Enumerator, um durch Listenelemente zu iterieren. |
| [GetRange](./getrange/)(int, int) | Erstellt einen Ausschnitt der Liste. |
| [idx_get](./idx_get/)(int) const override | Ermittelt das Element an einer bestimmten Position. |
| [idx_set](./idx_set/)(int, T) override | Setzt das Element an einer bestimmten Position. |
| [IndexOf](./indexof/)(const T\&) const override | Ermittelt den ersten Index eines bestimmten Elements. |
| [IndexOf](./indexof/)(const T\&, int) const | Sucht nach einem bestimmten Element in der Liste. |
| [Insert](./insert/)(int, const T\&) override | Fügt ein Element an der angegebenen Position ein. |
| [InsertRange](./insertrange/)(int, IEnumerablePtr) | Fügt einen Datenbereich an einer bestimmten Position ein. |
| [LastIndexOf](./lastindexof/)(const T\&) const | Durchsucht das angegebene Objekt und gibt den nullbasierten Index des letzten Vorkommens in der gesamten Liste zurück. |
| [LastIndexOf](./lastindexof/)(const T\&, int32_t) const | Durchsucht das angegebene Objekt und gibt den nullbasierten Index des letzten Vorkommens im Bereich der Elemente in der [List](./) zurück, der vom ersten Element bis zum angegebenen Index reicht. |
| [LastIndexOf](./lastindexof/)(const T\&, int32_t, int32_t) const | Durchsucht das angegebene Objekt und gibt den nullbasierten Index des letzten Vorkommens im Bereich der Elemente in der [List](./) zurück, der die angegebene Anzahl von Elementen enthält und am angegebenen Index endet. |
| [List](./list/)() | Erstellt eine leere Liste. |
| [List](./list/)(int) | Erstellt eine Liste mit vordefinierter Kapazität. |
| [List](./list/)(IEnumerablePtr) | Kopierkonstruktor. |
| [operator[]](./operator[]/)(int) | Accessor‑Funktion. |
| [operator[]](./operator[]/)(int) const | Accessor‑Funktion. |
| [rbegin](./rbegin/)() | Gibt einen Reverse‑Iterator auf das letzte Element der Sammlung zurück (erstes im Reverse). |
| [rbegin](./rbegin/)() const | Gibt einen Reverse‑Iterator auf das letzte Element der const‑qualifizierten Sammlung zurück (erstes im Reverse). |
| [Remove](./remove/)(const T\&) override | Entfernt die erste Instanz des angegebenen Elements aus der Liste. |
| [RemoveAll](./removeall/)(Predicate\<T\>) | Entfernt alle Elemente, die einem bestimmten Prädikat entsprechen. |
| [RemoveAt](./removeat/)(int) override | Entfernt das Element an der angegebenen Position. |
| [RemoveRange](./removerange/)(int, int) | Entfernt einen Ausschnitt der Liste. |
| [rend](./rend/)() | Gibt einen Reverse‑Iterator für ein nicht vorhandenes Element vor dem Beginn der Sammlung zurück. |
| [rend](./rend/)() const | Gibt einen Reverse‑Iterator für ein nicht vorhandenes Element vor dem Beginn der const‑qualifizierten Sammlung zurück. |
| [Reverse](./reverse/)() | Kehrt die Reihenfolge der Elemente der gesamten Liste um. |
| [Reverse](./reverse/)(int, int) | Kehrt die Reihenfolge der Elemente des Listenausschnitts um. |
| [set_Capacity](./set_capacity/)(int) | Setzt die Listenkapazität. |
| [Sort](./sort/)(const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\&) | Sortiert die Elemente in der Liste. |
| [Sort](./sort/)() | Sortiert die Elemente in der Liste mit dem Standardvergleich. |
| [Sort](./sort/)(int, int, SharedPtr\<System::Collections::Generic::IComparer\<T\>\>) | Sortiert die Elemente im Listenausschnitt. |
| [Sort](./sort/)(Comparison\<T\>, bool) | Sortiert die Elemente in der Liste. |
| [ToArray](./toarray/)() const | Konvertiert die Liste in ein Array. |
| [TrimExcess](./trimexcess/)() | Passt die Listenkapazität an ihre Größe an. |
| [TrueForAll](./trueforall/)(System::Predicate\<T\>) | Bestimmt, ob jedes Element in der Sammlung den durch das angegebene Prädikat definierten Bedingungen entspricht. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Liefert die Implementierung des begin‑const‑Iterators für den aktuellen Container. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Liefert die Implementierung des begin‑Iterators für den aktuellen Container. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Liefert die Implementierung des end‑const‑Iterators für den aktuellen Container. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Liefert die Implementierung des end‑Iterators für den aktuellen Container. |
## Typedefs

| Typedef. | Beschreibung |
| --- | --- |
| [BaseType](./basetype/) | Schnittstellentyp. |
| [const_iterator](./const_iterator/) | Typ des konstanten Iterators. |
| [const_reverse_iterator](./const_reverse_iterator/) | Typ des konstanten Reverse-Iterators. |
| [IEnumerablePtr](./ienumerableptr/) | Container, der Elemente desselben Typs hält. |
| [IEnumeratorPtr](./ienumeratorptr/) | [Enumerator](./enumerator/) Typ. |
| [iterator](./iterator/) | Iteratortyp. |
| [reverse_iterator](./reverse_iterator/) | Reverse-Iteratortyp. |
| [ValueType](./valuetype/) | Dieser Typ. |
| [vector_t](./vector_t/) | RTTI-Informationen. |
## Hinweise


[List](./) - wrapper around std::vector to be used in translated code. Requires operator == to be impemented for element type. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.


```cpp
#include <system/collections/list.h>
#include <system/smart_ptr.h>

using namespace System;
using namespace System::Collections::Generic;

int main()
{
  // Erstelle die erste Liste.
  auto list1 = MakeObject<List<int>>();

  // Fülle die erste Liste.
  list1->Add(3);
  list1->Add(1);
  list1->Add(-5);
  list1->Add(8);

  // Sortiere die erste Liste.
  // Die Elemente der ersten Liste werden sein: {-5, 1, 3, 8}
  list1->Sort();

  // Entferne das Element an Index 2.
  // Die Elemente der ersten Liste werden sein: {-5, 1, 8}
  list1->RemoveAt(2);

  // Füge das Element an Index 1 ein.
  // Die Elemente der ersten Liste werden sein: {-5, 15, 1, 8}
  list1->Insert(1, 15);

  // Erstelle die zweite Liste.
  auto list2 = MakeObject<List<int>>();

  // Fülle die zweite Liste.
  list2->Add(10);
  list2->Add(20);
  list2->Add(30);

  // Hänge Elemente der zweiten Liste an die erste an.
  list1->AddRange(list2);

  // Gib die Elemente der ersten Liste aus.
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

## Siehe auch

* Class [Object](../../system/object/)
* Class [IList](../ilist/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
