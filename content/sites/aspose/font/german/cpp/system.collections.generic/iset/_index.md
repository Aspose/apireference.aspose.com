---
title: "System::Collections::Generic::ISet Klasse"
linktitle: "ISet"
second_title: "Aspose.Font für C++"
description: "System::Collections::Generic::ISet Klasse. Schnittstelle einer Sammlung, die eine Menge eindeutiger Elemente enthält. Objekte dieser Klasse sollten nur mit der Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 2700
url: /de/cpp/system.collections.generic/iset/
---
## ISet class


Schnittstelle einer Sammlung, die eine Menge eindeutiger Elemente enthält. Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
template<typename T>class ISet : public System::Collections::Generic::ICollection<T>
```


| Parameter | Beschreibung |
| --- | --- |
| T | Elementtyp. |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| virtual [ExceptWith](./exceptwith/)(IEnumerablePtr) | Entfernt eine Gruppe von Elementen. |
| virtual [IntersectWith](./intersectwith/)(IEnumerablePtr) | Entfernt Elemente, die im anderen Container nicht vorhanden sind. |
| virtual [IsProperSubsetOf](./ispropersubsetof/)(IEnumerablePtr) | Prüft, ob die aktuelle Menge eine strenge Teilmenge des anderen Containers ist. |
| virtual [IsProperSupersetOf](./ispropersupersetof/)(IEnumerablePtr) | Prüft, ob die aktuelle Menge eine strenge Obermenge des anderen Containers ist. |
| virtual [IsSubsetOf](./issubsetof/)(IEnumerablePtr) | Prüft, ob die aktuelle Menge eine Teilmenge des anderen Containers ist. |
| virtual [IsSupersetOf](./issupersetof/)(IEnumerablePtr) | Prüft, ob die aktuelle Menge eine Obermenge des anderen Containers ist. |
| virtual [Overlaps](./overlaps/)(IEnumerablePtr) | Prüft, ob sich die Menge mit dem anderen Container überschneidet. |
| virtual [SetEquals](./setequals/)(IEnumerablePtr) | Prüft, ob Menge und Container dieselben Elemente enthalten. |
| virtual [SymmetricExceptWith](./symmetricexceptwith/)(IEnumerablePtr) | Berechnet die symmetrische Differenz zweier Container. Entfernt alle Elemente, die in beiden Containern vorhanden sind, fügt jedoch gleichzeitig alle Elemente hinzu, die in **other** vorhanden sind, aber nicht in der aktuellen Menge. |
| virtual [UnionWith](./unionwith/)(IEnumerablePtr) | Fügt Elemente aus der angegebenen Sammlung hinzu, die noch nicht in der aktuellen Menge vorhanden sind. |
| virtual [~ISet](./~iset/)() | Destruktor. |
## Typedefs

| Typedef. | Beschreibung |
| --- | --- |
| [IEnumerablePtr](./ienumerableptr/) | RTTI-Informationen. |

## Siehe auch

* Class [ICollection](../icollection/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
