---
title: "System::Collections::Generic::ICollection Klasse"
linktitle: "ICollection"
second_title: "Aspose.Page für C++"
description: "System::Collections::Generic::ICollection Klasse. Schnittstelle einer Sammlung von Elementen. Objekte dieser Klasse sollten nur mit der Funktion System::MakeObject() alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 1900
url: /de/cpp/system.collections.generic/icollection/
---
## ICollection class


Schnittstelle einer Sammlung von Elementen. Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
template<typename T>class ICollection : public virtual System::Collections::Generic::IEnumerable<T>
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| virtual [Add](./add/)(const T\&) | Fügt ein Element zur Sammlung hinzu. |
| virtual [Clear](./clear/)() | Löscht alle Elemente aus der Sammlung. |
| virtual [Contains](./contains/)(const T\&) const | Prüft, ob ein Element in der Sammlung vorhanden ist. |
| virtual [CopyTo](./copyto/)(System::ArrayPtr\<T\>, int) | Kopiert alle Sammlungs‑Elemente in bestehende Array‑Elemente. |
| virtual [get_Count](./get_count/)() const | Ermittelt die Anzahl der Elemente in der Sammlung. |
| virtual [get_IsReadOnly](./get_isreadonly/)() const | Prüft, ob die Sammlung schreibgeschützt ist. |
| [get_SyncRoot](./get_syncroot/)() const | Liefert das Objekt, über das die Sammlung synchronisiert wird. |
| [ICollection](./icollection/)() | Standardkonstruktor. |
| [ICollection](./icollection/)(const ICollection\&) | Kopierkonstruktor. |
| [ICollection](./icollection/)(ICollection\&&) | Move-Konstruktor. |
| [operator=](./operator=/)(ICollection\&&) | Move-Zuweisungsoperator. |
| [operator=](./operator=/)(const ICollection\&) | Move-Zuweisungsoperator. |
| virtual [Remove](./remove/)(const T\&) | Löscht ein Element aus der Sammlung. |
| virtual [~ICollection](./~icollection/)() | Destruktor. |
## Typedefs

| Typedef | Beschreibung |
| --- | --- |
| [ThisType](./thistype/) | Name des Sammlungstyps. |
| [ValueType](./valuetype/) | RTTI-Informationen. |

## Siehe auch

* Class [IEnumerable](../ienumerable/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
