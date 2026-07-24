---
title: "System::Collections::Generic::LinkedList Klasse"
linktitle: "LinkedList"
second_title: "Aspose.Page für C++"
description: "System::Collections::Generic::LinkedList Klasse. Vorwärtsdeklaration von LinkedList in C++."
type: docs
weight: 3100
url: /de/cpp/system.collections.generic/linkedlist/
---
## LinkedList class


[LinkedList](./) forward declaration.

```cpp
template<typename T>class LinkedList : public virtual System::Object,
                                       public System::Collections::Generic::ICollection<T>,
                                       private System::Collections::Invalidatable
```


| Parameter | Beschreibung |
| --- | --- |
| T | Enthaltener Werttyp. |
## Nested classes

* Class [Enumerator](./enumerator/)
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Add](./add/)(const T\&) override | Fügt **element** am Ende der Liste hinzu. |
| [AddAfter](./addafter/)(const SharedPtr\<LinkedListNode\<T\>\>\&, const T\&) | Fügt **element** nach **node** der Liste hinzu. |
| [AddAfter](./addafter/)(const SharedPtr\<LinkedListNode\<T\>\>\&, const SharedPtr\<LinkedListNode\<T\>\>\&) | Fügt **newNode** nach **node** der Liste hinzu. |
| [AddBefore](./addbefore/)(const SharedPtr\<LinkedListNode\<T\>\>\&, const T\&) | Fügt **element** vor **node** der Liste hinzu. |
| [AddBefore](./addbefore/)(const SharedPtr\<LinkedListNode\<T\>\>\&, const SharedPtr\<LinkedListNode\<T\>\>\&) | Fügt **newNode** vor **node** der Liste hinzu. |
| [AddFirst](./addfirst/)(const T\&) | Fügt **element** am Anfang der Liste hinzu. |
| [AddFirst](./addfirst/)(const SharedPtr\<LinkedListNode\<T\>\>\&) | Fügt **newNode** am Anfang der Liste hinzu. |
| [AddLast](./addlast/)(const T\&) | Fügt **element** am Ende der Liste hinzu. |
| [AddLast](./addlast/)(const SharedPtr\<LinkedListNode\<T\>\>\&) | Fügt **newNode** am Ende der Liste hinzu. |
| [begin](./begin/)() | Gibt den Iterator zum ersten Element der Sammlung zurück. |
| [begin](./begin/)() const | Liefert einen Iterator auf das erste Element der const‑qualifizierten Sammlung. |
| [cbegin](./cbegin/)() const | Erhält den Iterator zum ersten const‑qualifizierten Element der Sammlung. |
| [cend](./cend/)() const | Erhält den Iterator für ein nicht existierendes const‑qualifiziertes Element hinter dem Ende der Sammlung. |
| [Clear](./clear/)() override | Löscht alle Elemente in der Liste. |
| [Contains](./contains/)(const T\&) const override | Prüft, ob **element** in der Liste vorhanden ist. |
| [CopyTo](./copyto/)(ArrayPtr\<T\>, int) override | Kopiert Containerdaten in vorhandene Array-Elemente. |
| [crbegin](./crbegin/)() const | Ruft einen Reverse-Iterator zum letzten const‑qualifizierten Element der Sammlung ab (erstes im Reverse). |
| [crend](./crend/)() const | Ruft einen Reverse-Iterator für ein nicht existierendes const‑qualifiziertes Element vor dem Beginn der Sammlung ab. |
| [end](./end/)() | Erhält den Iterator für ein nicht existierendes Element hinter dem Ende der Sammlung. |
| [end](./end/)() const | Erhält den Iterator für ein nicht existierendes Element hinter dem Ende der const‑qualifizierten Sammlung. |
| [Find](./find/)(const T\&) const | Führt eine Vorwärtssuche nach einem **element** in der Liste durch. |
| [FindLast](./findlast/)(const T\&) const | Führt eine Rückwärtssuche nach einem **element** in der Liste durch. |
| [get_Count](./get_count/)() const override | Ermittelt die Anzahl der Elemente in der Liste. |
| [get_First](./get_first/)() const | Gibt einen Zeiger auf das erste Element in der Liste zurück. |
| [get_Last](./get_last/)() const | Gibt einen Zeiger auf das letzte Element in der Liste zurück. |
| [GetEnumerator](./getenumerator/)() override | Erhält einen Enumerator, um durch die aktuelle [LinkedList](./) zu iterieren. |
| [LinkedList](./linkedlist/)() | Erstellt eine leere [LinkedList](./). |
| [LinkedList](./linkedlist/)(const SharedPtr\<IEnumerable\<T\>\>\&) | Kopierkonstruktor. |
| [rbegin](./rbegin/)() | Gibt einen Reverse-Iterator auf das letzte Element der Sammlung zurück (erstes im Reverse). |
| [rbegin](./rbegin/)() const | Gibt einen Reverse-Iterator auf das letzte Element der const‑qualifizierten Sammlung zurück (erstes im Reverse). |
| [Remove](./remove/)(const T\&) override | Entfernt das erste Vorkommen des angegebenen **element** aus der Liste. |
| [Remove](./remove/)(const SharedPtr\<LinkedListNode\<T\>\>\&) | Entfernt den Knoten aus der Liste. |
| [RemoveFirst](./removefirst/)() | Entfernt den ersten Knoten aus der Liste. |
| [RemoveLast](./removelast/)() | Entfernt den letzten Knoten aus der Liste. |
| [rend](./rend/)() | Gibt einen Reverse-Iterator für ein nicht existierendes Element vor dem Beginn der Sammlung zurück. |
| [rend](./rend/)() const | Gibt einen Reverse-Iterator für ein nicht existierendes Element vor dem Beginn der const‑qualifizierten Sammlung zurück. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Gibt die Implementierung des const begin-Iterators für den aktuellen Container zurück. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Gibt die Implementierung des begin-Iterators für den aktuellen Container zurück. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Gibt die Implementierung des const end-Iterators für den aktuellen Container zurück. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Gibt die Implementierung des end-Iterators für den aktuellen Container zurück. |
## Typedefs

| Typedef | Beschreibung |
| --- | --- |
| [const_iterator](./const_iterator/) | Konstanter Iterator-Typ. |
| [const_reverse_iterator](./const_reverse_iterator/) | Konstanter Reverse-Iterator-Typ. |
| [iterator](./iterator/) | Iterator-Typ. |
| [list_t](./list_t/) | Zugrunde liegender Datentyp. |
| [reverse_iterator](./reverse_iterator/) | Reverse-Iterator-Typ. |
## Hinweise


Linked-List-Container. Implementiert eine Wrapper-Klasse über std::list. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.


```cpp
#include <system/collections/linkedlist.h>
#include <system/smart_ptr.h>

using namespace System;
using namespace System::Collections::Generic;

int main()
{
  // Erstellen Sie eine Instanz der LinkedList-Klasse.
  auto list = MakeObject<LinkedList<int>>();

  // Füllen Sie die verkettete Liste.
  list->AddFirst(1);
  list->AddLast(30);
  list->AddAfter(list->get_First(), 15);
  list->AddBefore(list->get_Last(), 25);

  // Geben Sie die Elemente der verketteten Liste aus.
  for (const auto item: list)
  {
    std::cout << item << ' ';
  }

  return 0;
}
/*
This code example produces the following output:
1 15 25 30
*/
```

## Siehe auch

* Class [Object](../../system/object/)
* Class [ICollection](../icollection/)
* Class [Invalidatable](../../system.collections/invalidatable/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
