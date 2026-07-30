---
title: "System::Collections::CollectionBase Klasse"
linktitle: "CollectionBase"
second_title: "Aspose.Font für C++"
description: "System::Collections::CollectionBase Klasse. Stellt eine abstrakte Basisklasse für eine stark typisierte Sammlung in C++ bereit."
type: docs
weight: 300
url: /de/cpp/system.collections/collectionbase/
---
## CollectionBase class


Stellt eine abstrakte Basisklasse für eine stark typisierte Sammlung bereit.

```cpp
template<typename T>class CollectionBase : public virtual System::Collections::Generic::IEnumerable<T>
```


| Parameter | Beschreibung |
| --- | --- |
| T | Typ der Elemente der Sammlung |
## Nested classes

* Class [ListImpl](./listimpl/)
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Clear](./clear/)() | Entfernt alle Objekte aus der Sammlungsinstanz. Diese Methode kann nicht überschrieben werden. |
| [get_Capacity](./get_capacity/)() | Gibt die Anzahl der Elemente zurück, die die Sammlung enthalten kann. |
| [get_Count](./get_count/)() | Gibt die Anzahl der in der Sammlungsinstanz enthaltenen Elemente zurück. Diese Methode kann nicht überschrieben werden. |
| [GetEnumerator](./getenumerator/)() override | Gibt einen Enumerator zurück, der durch die Sammlungsinstanz iteriert. |
| [RemoveAt](./removeat/)(int32_t) | Entfernt das Element am angegebenen Index der Sammlungsinstanz. Diese Methode ist nicht überschreibbar. |
| [set_Capacity](./set_capacity/)(int32_t) | Setzt die Anzahl der Elemente, die die Sammlung enthalten kann. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Setzt das n‑te Template-Argument auf einen schwachen Zeiger (statt eines geteilten). Ermöglicht das Umschalten von Zeigern in Containern in den Weak‑Modus. |
## Typedefs

| Typedef. | Beschreibung |
| --- | --- |
| [Ptr](./ptr/) | Ein Alias für einen Shared‑Pointer auf eine Instanz dieser Klasse. |

## Siehe auch

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Collections](../)
* Library [Aspose.Font for C++](../../)
